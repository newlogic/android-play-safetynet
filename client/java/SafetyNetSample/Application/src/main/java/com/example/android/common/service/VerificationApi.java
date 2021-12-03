package com.example.android.common.service;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface VerificationApi {
    // Setup Attestation backend via https://github.com/typelogic/safetynetserver#readme
    String BASE_URL = "http://192.168.199.48:8080/";

    @Headers("Content-Type: text/plain")
    @POST("process/")
    Call<Attestation> verify(@Body RequestBody body);
}
