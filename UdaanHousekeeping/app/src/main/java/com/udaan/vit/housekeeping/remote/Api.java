package com.udaan.vit.housekeeping.remote;


import com.udaan.vit.housekeeping.Modal.Allocatedtask;
import com.udaan.vit.housekeeping.Modal.Asset;
import com.udaan.vit.housekeeping.Modal.Task;
import com.udaan.vit.housekeeping.Modal.Worker;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
    @FormUrlEncoded
    @POST("assets")
    Call<Asset> store(
            @Field("name") String name,
            @Field("quantity") int n,
            @Field("task")String task
    );

    @FormUrlEncoded
    @POST("workers")
    Call<Worker> addWorker(
            @Field("name") String name,
            @Field("userid") String userid,
            @Field("password")String password
    );

    @FormUrlEncoded
    @POST("tasks")
    Call<Task> addTask(
            @Field("name") String name,
            @Field("asset") String asset,
            @Field("frequency")String frequency
    );

    @POST("allocatedtasks")
    Call<Allocatedtask[]> alltasks();




}
