package com.thiendn.cleancodearchitecture.application.builder.modules;

import android.content.Context;

import com.thiendn.cleancodearchitecture.application.builder.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by thiendn on 17:01 8/11/18
 */
@Module
public class AppContextModule {

    private final Context context;

    public AppContextModule(Context context) {
        this.context = context;
    }

    @AppScope
    @Provides
    Context provideAppContext() {
        return context;
    }
}
