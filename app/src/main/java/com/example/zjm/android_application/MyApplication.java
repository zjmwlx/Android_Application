package com.example.zjm.android_application;

import android.app.Application;

/**
 * Created by zjm on 2017/6/3.
 */

public class MyApplication extends Application {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setName("张三");
    }
}
