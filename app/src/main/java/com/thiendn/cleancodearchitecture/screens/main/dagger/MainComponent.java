package com.thiendn.cleancodearchitecture.screens.main.dagger;

import com.thiendn.cleancodearchitecture.application.builder.AppComponent;
import com.thiendn.cleancodearchitecture.screens.main.MainActivity;

import dagger.Component;

/**
 * Created by thiendn on 19:55 8/13/18
 */
@MainScope
@Component(modules = {MainModule.class, MainContextModule.class}, dependencies = {AppComponent.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
