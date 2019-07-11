package com.udaan.vit.housekeeping;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.udaan.vit.housekeeping.Modal.Allocatedtask;
import com.udaan.vit.housekeeping.remote.Api;
import com.udaan.vit.housekeeping.remote.ApiUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewAllocatedTask extends AppCompatActivity {
    private TaskAdapter mtaskadapter;
    private ListView mListView;
    Api api;
    Context context;

    View mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_allocated_task);
        api = ApiUtils.getUserService ();
       context = this;
        mListView=mView.findViewById (R.id.tasklistview);

        prepareTaskDetails();

    }
    private void prepareTaskDetails(){
        Call<Allocatedtask[]> call=api.alltasks ();
        call.enqueue (new Callback<Allocatedtask[]>() {
            @Override
            public void onResponse(Call<Allocatedtask[]> call, Response<Allocatedtask[]> response) {
                List<Allocatedtask> allocatedtask = response.body ();
                Log.d ("ipactt",response.body ().toString ());


                    populate(allocatedtask);

            }

            @Override
            public void onFailure(Call<Allocatedtask[]> call, Throwable t) {
                Toast.makeText (ViewAllocatedTask.this, "User Not Found", Toast.LENGTH_SHORT).show ();

            }
        });
    }

    private void populate(List<Allocatedtask> allocatedtask) {
        Log.d ("ipactt",allocatedtask.toString ());
        if(allocatedtask!=null){


            //List<Allocatedtask> paperDetailsList= (List<Allocatedtask[]>) new ArrayList<>(Arrays.asList (allocatedtask));
            mtaskadapter=new TaskAdapter (context,R.layout.tasks_list_row,allocatedtask);
            mListView.setAdapter (mtaskadapter);
        }
    }
}
