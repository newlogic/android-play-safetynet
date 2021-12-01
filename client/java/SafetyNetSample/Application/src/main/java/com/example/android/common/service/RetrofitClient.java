package com.example.android.common.service;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient instance = null;
    private VerificationApi verificationApi;


    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(verificationApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        verificationApi = retrofit.create(VerificationApi.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public VerificationApi getVerificationApi() {
        return verificationApi;
    }
}