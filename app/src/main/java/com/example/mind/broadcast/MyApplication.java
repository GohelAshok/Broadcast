package com.example.mind.broadcast;

import android.app.Application;

/**
 * Created by mind on 22/6/17.
 */

public class MyApplication extends Application{

    private static MyApplication mInstance;



    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static MyApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }


}
