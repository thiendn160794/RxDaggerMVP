package com.thiendn.cleancodearchitecture.application.builder;

import com.thiendn.cleancodearchitecture.utils.rx.AppRxSchedulers;
import com.thiendn.cleancodearchitecture.utils.rx.RxSchedulers;

import dagger.Module;
import dagger.Provides;

@Module
@AppScope
public class RxModule {

    @Provides
    RxSchedulers provideRxSchedulers() {
        return new AppRxSchedulers();
    }
}
