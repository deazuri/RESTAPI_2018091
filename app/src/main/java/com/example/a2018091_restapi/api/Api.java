package com.example.a2018091_restapi.api;

import com.example.a2018091_restapi.model.FaskesList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
  @GET("get-faskes-vaksinasi")
  Call<FaskesList> getFaskesList(@Query("province") String province);
}
