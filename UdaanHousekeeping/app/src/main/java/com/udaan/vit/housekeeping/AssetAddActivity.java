package com.udaan.vit.housekeeping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.udaan.vit.housekeeping.Modal.Asset;
import com.udaan.vit.housekeeping.remote.Api;
import com.udaan.vit.housekeeping.remote.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AssetAddActivity extends AppCompatActivity {
    TextView textView1,textview2,textview3;
    Button button1,button2;
    Api api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_add);

        textView1=findViewById(R.id.assetname);
        textview2=findViewById(R.id.assetquantity);
        textview3=findViewById(R.id.assetTask);
        button1=findViewById(R.id.assetAdd);
        button2=findViewById(R.id.goHome);
        api = ApiUtils.getUserService ();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addasset(textView1.getText().toString(),textview2.getText().toString(),textview3.getText().toString());
            }
        });



    }
    public void addasset(String name,String quantity,String task) {
        int n = Integer.parseInt(quantity);
        if (n > 0) {
            Call<Asset> call = api.store(name, n, task);
            call.enqueue(new Callback<Asset>() {
                @Override
                public void onResponse(Call<Asset> call, Response<Asset> response) {
                    Asset asset = response.body();
                }

                @Override
                public void onFailure(Call<Asset> call, Throwable t) {
                    Log.d("ipactt", t.getMessage());
                    Toast.makeText(AssetAddActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

                }
            });
        }


    }}
