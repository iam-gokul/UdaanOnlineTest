package com.udaan.vit.housekeeping.remote;

import com.udaan.vit.housekeeping.remote.Api;

public class ApiUtils {
    public static final String BASE_URL = "https://localhost:8080/";

    public static Api getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(Api.class);
    }







}
