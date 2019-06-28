package com.kamhawk.testmoshiretrofit.repository.remote.model;
import com.squareup.moshi.Json;

public class FakeAppelResponse {

    @Json(name = "userId")
    public int userId;
    @Json(name = "id")
    public int id;
    @Json(name = "title")
    public String title;
    @Json(name = "body")
    public String body;

    /**
     * No args constructor for use in serialization
     *
     */
    public FakeAppelResponse() {
    }

    /**
     *
     * @param id
     * @param body
     * @param title
     * @param userId
     */
    public FakeAppelResponse(int userId, int id, String title, String body) {
        super();
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

}