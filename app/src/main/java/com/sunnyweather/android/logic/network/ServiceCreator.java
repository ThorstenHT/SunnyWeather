package com.sunnyweather.android.logic.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public  class ServiceCreator {
    private static final String BASE_URL = "https://api.caiyunapp.com/";
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    static public <T> T create(Class<T> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
