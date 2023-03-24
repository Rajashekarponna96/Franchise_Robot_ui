package com.example.incomingcallsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.incomingcallsexample.databinding.ActivityFiveBinding;
import com.example.incomingcallsexample.databinding.ActivityThankYouBinding;

public class ThankYouActivity extends AppCompatActivity {


    ActivityThankYouBinding databinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        databinding = ActivityThankYouBinding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());

        databinding.idNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ThankYouActivity.this, HomeActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}