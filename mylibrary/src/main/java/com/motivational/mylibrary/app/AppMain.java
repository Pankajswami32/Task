package com.motivational.mylibrary.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.motivational.mylibrary.utils.LocaleHelper;

public class AppMain extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }
}
