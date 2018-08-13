package com.thiendn.cleancodearchitecture.screens.main.dagger;

import com.thiendn.cleancodearchitecture.screens.main.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by thiendn on 19:15 8/13/18
 */
@Module
public class MainContextModule {

    MainActivity mainContext;

    public MainContextModule(MainActivity mainContext) {
        this.mainContext = mainContext;
    }

    @MainScope
    @Provides
    MainActivity provideMainContext() {
        return mainContext;
    }
}
