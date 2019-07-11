package com.udaan.vit.housekeeping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.udaan.vit.housekeeping.Modal.Asset;
import com.udaan.vit.housekeeping.Modal.Worker;
import com.udaan.vit.housekeeping.remote.Api;
import com.udaan.vit.housekeeping.remote.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkerAddActivity extends AppCompatActivity {
    TextView textView1,textview2,textview3;
    Button button1,button2;
    Api api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_add);

        textView1=findViewById(R.id.workername);
        textview2=findViewById(R.id.workerid);
        textview3=findViewById(R.id.workerpassword);
        button1=findViewById(R.id.workerAdd);
        button2=findViewById(R.id.goHome);
        api = ApiUtils.getUserService ();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addWorker(textView1.getText().toString(),textview2.getText().toString(),textview3.getText().toString());
            }
        });



    }
    public void addWorker(String name,String id,String password) {


            Call<Worker> call = api.addWorker(name, id, password);
            call.enqueue(new Callback<Worker>() {
                @Override
                public void onResponse(Call<Worker> call, Response<Worker> response) {
                    Worker asset = response.body();
                }

                @Override
                public void onFailure(Call<Worker> call, Throwable t) {
                    Log.d("ipactt", t.getMessage());
                    Toast.makeText(WorkerAddActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

                }
            });
        }


    }
