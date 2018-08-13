package com.thiendn.cleancodearchitecture.application.builder.modules;

import com.thiendn.cleancodearchitecture.application.builder.APIService;
import com.thiendn.cleancodearchitecture.application.builder.AppScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class APIServiceModule {

    private final static String BASE_URL = "google.com";

    @Provides
    @AppScope
    APIService getAPIService(OkHttpClient okHttpClient, GsonConverterFactory gsonConverterFactory, RxJavaCallAdapterFactory rxJavaCallAdapterFactory) {
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .addCallAdapterFactory(rxJavaCallAdapterFactory)
                .build()
                .create(APIService.class);
    }
}
