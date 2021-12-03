package com.example.android.common.service;


import com.grapesnberries.curllogger.CurlLoggerInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    private static RetrofitClient instance = null;
    private VerificationApi verificationApi;

    private RetrofitClient() {
        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .addInterceptor(new CurlLoggerInterceptor());
        Retrofit retrofit = new Retrofit.Builder().baseUrl(verificationApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .client(client.build())
                .build();
        verificationApi = retrofit.create(VerificationApi.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public VerificationApi verificationApi() {
        return verificationApi;
    }
}