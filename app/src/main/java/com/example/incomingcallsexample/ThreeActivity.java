package com.example.incomingcallsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.incomingcallsexample.databinding.ActivityThreeBinding;
import com.example.incomingcallsexample.databinding.ActivityTwo2Binding;

import java.util.regex.Pattern;

public class ThreeActivity extends AppCompatActivity {


    ActivityThreeBinding databinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databinding=ActivityThreeBinding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());

        databinding.idEntermail.setOnEditorActionListener(new TextView.OnEditorActionListener() {
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

        databinding.idEntermail.addTextChangedListener(new TextWatcher() {
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
                String data=databinding.idEntermail.getText().toString();
                if(data.isEmpty()){
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
                String mail=databinding.idEntermail.getText().toString().trim();
                if(!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
                    Toast.makeText(ThreeActivity.this, "Please enter valid email", Toast.LENGTH_SHORT).show();
                }else{
                    String name=getIntent().getStringExtra("NAME");
                    String phone=getIntent().getStringExtra("PHONE");
                    Intent intent=new Intent(ThreeActivity.this,FourActivity.class);
                    intent.putExtra("NAME",name);
                    intent.putExtra("MAIL",mail);
                    intent.putExtra("PHONE",phone);
                    startActivity(intent);
                }
            }
        });


    }
}