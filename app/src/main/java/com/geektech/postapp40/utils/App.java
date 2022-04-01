package com.geektech.postapp40.utils;

import android.app.Application;

import com.geektech.postapp40.data.models.remote.PostApi;
import com.geektech.postapp40.data.models.remote.RetrofitClient;

public class App extends Application {
    private RetrofitClient retrofitClient;
    public static PostApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        api = retrofitClient.createApi();
    }
}