package com.example.android.common.service;

import retrofit2.Call;
import retrofit2.http.GET;

// TODO Add proper API parameters
public interface VerificationApi {
    String BASE_URL = "";

    @GET
    Call<String> verify();
}
