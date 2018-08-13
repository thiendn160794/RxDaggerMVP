package com.thiendn.cleancodearchitecture.screens.main.dagger;

import com.thiendn.cleancodearchitecture.screens.main.MainActivity;
import com.thiendn.cleancodearchitecture.screens.main.core.MainModel;
import com.thiendn.cleancodearchitecture.screens.main.core.MainPresenter;
import com.thiendn.cleancodearchitecture.screens.main.core.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by thiendn on 19:17 8/13/18
 */
@Module
public class MainModule {

    @MainScope
    @Provides
    MainView provideView(MainActivity mainActivity) {
        return new MainView(mainActivity);
    }

    @MainScope
    @Provides
    MainPresenter providePresenter() {
        return new MainPresenter();
    }

    @MainScope
    @Provides
    MainModel provideModel() {
        return new MainModel();
    }
}
