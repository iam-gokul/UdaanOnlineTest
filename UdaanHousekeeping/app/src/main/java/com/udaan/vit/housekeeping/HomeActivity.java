package com.udaan.vit.housekeeping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.assetAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,AssetAddActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.taskadd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,TaskAddActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.workerAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,WorkerAddActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.allocatetask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ViewAllocatedTask.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.assetshow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ViewAllocatedTask.class);
                startActivity(intent);
            }
        });

    }
}
