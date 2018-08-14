package com.thiendn.cleancodearchitecture.screens.main.core;

/**
 * Created by thiendn on 19:13 8/13/18
 */
public class MainPresenter {
    MainModel mModel;
    MainView mView;

    public MainPresenter(MainView mView, MainModel mModel) {
        this.mModel = mModel;
        this.mView = mView;
    }
}
