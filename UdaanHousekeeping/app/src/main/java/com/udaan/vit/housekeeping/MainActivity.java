package com.udaan.vit.housekeeping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mid,mpassword;
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mid=findViewById(R.id.adminId);
        mpassword=findViewById(R.id.adminpw);

        mbutton=findViewById(R.id.login);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mid.getText().toString().equals(111)&&mpassword.getText().toString().equals("password")){
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
                else
                    Toast.makeText(MainActivity.this, "UserId or Password Wrong !", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
