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

import com.example.incomingcallsexample.databinding.ActivityHomeBinding;
import com.example.incomingcallsexample.databinding.ActivityTwo2Binding;

public class TwoActivity2 extends AppCompatActivity {

    ActivityTwo2Binding databinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databinding=ActivityTwo2Binding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());

        databinding.idNext.setOnEditorActionListener(new TextView.OnEditorActionListener() {
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

        databinding.idEnterPhone.addTextChangedListener(new TextWatcher() {
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
                String data=databinding.idEnterPhone.getText().toString();
                String code=databinding.idEnterSTDCode.getText().toString();
                if(data.isEmpty() && code.isEmpty()){
                    databinding.idNext.setEnabled(false);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));
                }else{
                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }

            }
        });

        databinding.idEnterSTDCode.addTextChangedListener(new TextWatcher() {
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
                String data=databinding.idEnterPhone.getText().toString();
                String code=databinding.idEnterSTDCode.getText().toString();
                if(data.isEmpty() && code.isEmpty()){
                    databinding.idNext.setEnabled(false);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
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
                String phone=databinding.idEnterPhone.getText().toString().toString();
                String code=databinding.idEnterSTDCode.getText().toString().toString();
                if(phone.length()!=10){
                    Toast.makeText(TwoActivity2.this, "Enter Phone number", Toast.LENGTH_SHORT).show();
                }else if(code.isEmpty()){
                    Toast.makeText(TwoActivity2.this, "Enter Phone number", Toast.LENGTH_SHORT).show();
                }else {
                    String name=getIntent().getStringExtra("NAME");

                    Intent intent=new Intent(TwoActivity2.this,ThreeActivity.class);
                    intent.putExtra("NAME",name);
                    intent.putExtra("PHONE",code+phone);
                    startActivity(intent);
                } }
        });




    }
}