package com.example.a2018091_restapi.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.a2018091_restapi.api.ApiClient;
import com.example.a2018091_restapi.model.FaskesList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FaskesViewModel {
  private static final String TAG = "FaskesViewModel";
  MutableLiveData<FaskesList> foodList;

  public MutableLiveData<FaskesList> getFaskesList() {
    if (foodList == null) {
      foodList = new MutableLiveData<>();
      setFaskesList();
    }
    return foodList;
  }

  private void setFaskesList() {
    ApiClient.getInstance().getApi().getFaskesList("jawa")
            .enqueue(new Callback<FaskesList>() {
              @Override
              public void onResponse(Call<FaskesList> call, Response<FaskesList> response) {
                if (response.isSuccessful()) {
                  foodList.postValue(response.body());
                }
              }

              @Override
              public void onFailure(Call<FaskesList> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
              }
            });
  }
}
