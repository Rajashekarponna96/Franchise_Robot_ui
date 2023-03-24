package com.example.incomingcallsexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.incomingcallsexample.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    Button id_ask;
    ActivityHomeBinding databinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databinding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());


        databinding.idAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
