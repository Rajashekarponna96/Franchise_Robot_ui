package com.example.incomingcallsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.incomingcallsexample.databinding.ActivityFourBinding;
import com.example.incomingcallsexample.databinding.ActivityThreeBinding;

public class FourActivity extends AppCompatActivity {

    ActivityFourBinding databinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        databinding=ActivityFourBinding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());


        databinding.idEnterCity.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // do something, e.g. set your TextView here via .setText()
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                    return true;
                }
                return false;
            }
        });

        databinding.idEnterCity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("","");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("","");

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String data=databinding.idEnterCity.getText().toString();
                if(data.isEmpty()){
                    databinding.idNext.setEnabled(false);
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));
                }else{
                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }

            }
        });

        databinding.idNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String city=databinding.idEnterCity.getText().toString().trim();

                if(city.isEmpty()){
                    Toast.makeText(FourActivity.this, "Please enter your city", Toast.LENGTH_SHORT).show();

                }else{
                    String name=getIntent().getStringExtra("NAME");
                    String phone=getIntent().getStringExtra("PHONE");
                    String mail=getIntent().getStringExtra("MAIL");
                    Intent intent=new Intent(FourActivity.this,FiveActivity.class);
                    intent.putExtra("NAME",name);
                    intent.putExtra("MAIL",mail);
                    intent.putExtra("PHONE",phone);
                    intent.putExtra("CITY",city);
                    startActivity(intent);
                }

            }
        });


    }
}