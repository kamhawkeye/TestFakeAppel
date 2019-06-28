package com.kamhawk.testmoshiretrofit.utils;

import io.reactivex.Single;
import retrofit2.Retrofit;

public class ApiInteractor {

    public ApiInteractor() {
    }


    public Single<ApiInteractor> getSingleApi(){

        return null;
    }



    public Retrofit getRetrofitService (){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();

        return retrofit;
    }

}
