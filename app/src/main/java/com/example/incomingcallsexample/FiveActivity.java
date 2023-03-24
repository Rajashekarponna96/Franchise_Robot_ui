package com.example.incomingcallsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;

import com.example.incomingcallsexample.databinding.ActivityFiveBinding;
import com.example.incomingcallsexample.databinding.ActivityFourBinding;

public class FiveActivity extends AppCompatActivity {

    ActivityFiveBinding databinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        databinding = ActivityFiveBinding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());

        String name=getIntent().getStringExtra("NAME");
        String phone=getIntent().getStringExtra("PHONE");
        String mail=getIntent().getStringExtra("MAIL");
        String city=getIntent().getStringExtra("CITY");

        databinding.idNextone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idNextone.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idPers.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                databinding.idNextwo.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idPers2.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_select)));
                Intent intent = new Intent(FiveActivity.this, SixActivity.class);
                intent.putExtra("NAME",name);
                intent.putExtra("MAIL",mail);
                intent.putExtra("PHONE",phone);
                intent.putExtra("CITY",city);
                intent.putExtra("USERROBOTS","Personal Use");
                startActivity(intent);
            }
        });

        databinding.idNextwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idNextwo.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idPers2.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_select)));
                databinding.idNextone.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idPers.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.white)));

                Intent intent = new Intent(FiveActivity.this, SixActivity.class);
                intent.putExtra("NAME",name);
                intent.putExtra("MAIL",mail);
                intent.putExtra("PHONE",phone);
                intent.putExtra("CITY",city);
                intent.putExtra("USERROBOTS","Resale &amp; Franchise");
                startActivity(intent);
            }
        });


    }
}