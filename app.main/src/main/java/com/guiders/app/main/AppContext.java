package com.guiders.app.main;

import android.app.Application;
import android.util.Log;


/**
 * The host application for Small
 */
public class AppContext extends Application {

    private static final String TAG = "Main Plugin";

    public AppContext() {
        Log.d(TAG, "AppContext()");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate()");

        // Test shared data
        Log.d(TAG, this.getSharedPreferences("small.app-versions", 0).getAll().toString());

        // Test resources
        String s = "setting";
        Log.d(TAG, s);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}