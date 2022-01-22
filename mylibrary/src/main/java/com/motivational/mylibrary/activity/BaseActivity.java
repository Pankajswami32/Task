package com.motivational.mylibrary.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.motivational.mylibrary.utils.LocaleHelper;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base));
    }
    protected abstract int getLayoutResourceId();

    protected abstract void setData(Bundle bun);
}


