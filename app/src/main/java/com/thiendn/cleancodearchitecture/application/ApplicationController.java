package com.thiendn.cleancodearchitecture.application;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.thiendn.cleancodearchitecture.BuildConfig;
import com.thiendn.cleancodearchitecture.application.builder.AppComponent;
import com.thiendn.cleancodearchitecture.application.builder.AppContextModule;
import com.thiendn.cleancodearchitecture.application.builder.DaggerAppComponent;

import timber.log.Timber;

/**
 * Created by thiendn on 8/11/18.
 */

public class ApplicationController extends Application{

    private static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
        initAppComponent();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }

    private void initLogger() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new Timber.Tree() {
                @Override
                protected void log(int priority, String tag, String message, Throwable t) {
                    //TODO Handle which should be logged in release build
                }
            });
        }
    }

    private void initAppComponent() {
        mAppComponent = DaggerAppComponent
                .builder()
                .appContextModule(new AppContextModule(this))
                .build();
    }

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }
}
