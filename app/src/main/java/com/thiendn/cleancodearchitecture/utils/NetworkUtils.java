package com.thiendn.cleancodearchitecture.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import rx.Observable;

/**
 * Created by thiendn on 8/11/18.
 */

public class NetworkUtils {

    private static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    public static Observable<Boolean> isNetworkAvailableObservable(Context context) {
        return Observable.just(NetworkUtils.isNetworkAvailable(context));
    }
}
