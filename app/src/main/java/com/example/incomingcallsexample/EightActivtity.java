package com.example.incomingcallsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.incomingcallsexample.databinding.ActivityEightActivtityBinding;
import com.example.incomingcallsexample.databinding.ActivityTwo2Binding;

public class EightActivtity extends AppCompatActivity {

    ActivityEightActivtityBinding databinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        databinding=ActivityEightActivtityBinding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());

        databinding.idNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=getIntent().getStringExtra("NAME");
                String phone=getIntent().getStringExtra("PHONE");
                String mail=getIntent().getStringExtra("MAIL");
                String city=getIntent().getStringExtra("CITY");
                String userrobotss=getIntent().getStringExtra("USERROBOTS");
                String bussinessdatery=getIntent().getStringExtra("BUSSINESSCATEGORY");
                String interest=getIntent().getStringExtra("INTEREST");

                // apicall

                Intent intent=new Intent(EightActivtity.this,ThankYouActivity.class);

                startActivity(intent);

            }
        });

    }
}