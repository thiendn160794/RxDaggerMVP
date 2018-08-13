package com.thiendn.cleancodearchitecture.application.builder;

import com.thiendn.cleancodearchitecture.application.builder.modules.APIServiceModule;
import com.thiendn.cleancodearchitecture.application.builder.modules.AppContextModule;
import com.thiendn.cleancodearchitecture.application.builder.modules.NetworkModule;
import com.thiendn.cleancodearchitecture.utils.rx.RxSchedulers;

import dagger.Component;

/**
 * Created by thiendn on 17:16 8/11/18
 */
@AppScope
@Component(modules = {AppContextModule.class, APIServiceModule.class, NetworkModule.class, RxModule.class})
public interface AppComponent {

    RxSchedulers rxSchedulers();
    APIService getApiService();

}
