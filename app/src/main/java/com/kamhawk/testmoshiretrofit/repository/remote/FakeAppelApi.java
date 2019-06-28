package com.kamhawk.testmoshiretrofit.repository.remote;

import com.kamhawk.testmoshiretrofit.repository.remote.model.FakeAppelResponse;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface FakeAppelApi {
    @GET("posts")
    Single<List<FakeAppelResponse>> getFakeAppelResponse();
}
