package com.example.incomingcallsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.incomingcallsexample.databinding.ActivityFiveBinding;
import com.example.incomingcallsexample.databinding.ActivitySevenBinding;

public class SevenActivity extends AppCompatActivity {

    ActivitySevenBinding databinding;
    String robotIntereset="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databinding = ActivitySevenBinding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());

        databinding.idSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              nextActivity("");
            }
        });

        databinding.idHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isSelected=databinding.idHotel.getTag().toString();
                if(isSelected.equalsIgnoreCase("0")){
                    databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                    databinding.idHotel.setTag("1");

                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }else{
                    databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                    databinding.idHotel.setTag("0");
               /*     databinding.idNext.setEnabled(false);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));*/
                    setNextEnable();
                }

            }
        });

        databinding.idDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isSelected=databinding.idDelivery.getTag().toString();
                if(isSelected.equalsIgnoreCase("0")){
                    databinding.idDelivery.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                    databinding.idDelivery.setTag("1");

                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }else{
                    databinding.idDelivery.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                    databinding.idDelivery.setTag("0");
              /*      databinding.idNext.setEnabled(false);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));*/
                    setNextEnable();
                }

            }
        });



        databinding.idSmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isSelected=databinding.idSmart.getTag().toString();
                if(isSelected.equalsIgnoreCase("0")){
                    databinding.idSmart.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                    databinding.idSmart.setTag("1");

                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }else{
                    databinding.idSmart.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                    databinding.idSmart.setTag("0");
                   /* databinding.idNext.setEnabled(false);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));*/
                    setNextEnable();
                }

            }
        });

        databinding.idSmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isSelected=databinding.idSmart.getTag().toString();
                if(isSelected.equalsIgnoreCase("0")){
                    databinding.idSmart.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                    databinding.idSmart.setTag("1");

                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }else{
                    databinding.idSmart.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                    databinding.idSmart.setTag("0");
                /*    databinding.idNext.setEnabled(false);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));*/

                    setNextEnable();
                }

            }
        });

        databinding.idTele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isSelected=databinding.idTele.getTag().toString();
                if(isSelected.equalsIgnoreCase("0")){
                    databinding.idTele.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                    databinding.idTele.setTag("1");

                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }else{
                    databinding.idTele.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                    databinding.idTele.setTag("0");
             /*       databinding.idNext.setEnabled(false);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));*/
                    setNextEnable();
                }

            }
        });

        databinding.idTele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isSelected=databinding.idTele.getTag().toString();
                if(isSelected.equalsIgnoreCase("0")){
                    databinding.idTele.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                    databinding.idTele.setTag("1");

                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }else{
                    databinding.idTele.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                    databinding.idTele.setTag("0");
                    setNextEnable();

                    /*          databinding.idNext.setEnabled(false);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));
          */      }

            }
        });


        databinding.idCleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isSelected=databinding.idCleaning.getTag().toString();
                if(isSelected.equalsIgnoreCase("0")){
                    databinding.idCleaning.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                    databinding.idCleaning.setTag("1");

                    databinding.idNext.setEnabled(true);
                    databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
                    databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_select)));
                }else{
                    databinding.idCleaning.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                    databinding.idCleaning.setTag("0");
                    setNextEnable();
                }

            }
        });


        databinding.idNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String aaaa=databinding.idDelivery.getTag().toString();
                String bbbb=databinding.idHotel.getTag().toString();
                String cccc=databinding.idSmart.getTag().toString();
                String dddd=databinding.idTele.getTag().toString();
                String eeee=databinding.idCleaning.getTag().toString();
                String nextdata="";
                if(aaaa.equalsIgnoreCase("1")){
                    nextdata=nextdata+"Delivery Robot";
                }

                if(bbbb.equalsIgnoreCase("1")){
                    nextdata=nextdata+",Hotel Robot";
                }


                if(cccc.equalsIgnoreCase("1")){
                    nextdata=nextdata+",Smart Assistant Robot";
                }

                if(dddd.equalsIgnoreCase("1")){
                    nextdata=nextdata+",Telepresence Robot";
                }

                if(eeee.equalsIgnoreCase("1")){
                    nextdata=nextdata+",Cleaning Robot";
                }

                nextActivity(nextdata);
}
        });




    }

    private void nextActivity(String data) {
        String name=getIntent().getStringExtra("NAME");
        String phone=getIntent().getStringExtra("PHONE");
        String mail=getIntent().getStringExtra("MAIL");
        String city=getIntent().getStringExtra("CITY");
        String userrobotss=getIntent().getStringExtra("USERROBOTS");
        String bussinessdatery=getIntent().getStringExtra("BUSSINESSCATEGORY");
        Intent intent = new Intent(SevenActivity.this, EightActivtity.class);
        intent.putExtra("NAME",name);
        intent.putExtra("MAIL",mail);
        intent.putExtra("PHONE",phone);
        intent.putExtra("CITY",city);
        intent.putExtra("USERROBOTS",userrobotss);
        intent.putExtra("BUSSINESSCATEGORY",bussinessdatery);
        intent.putExtra("INTEREST",data);
        startActivity(intent);


    }

    void setNextEnable(){
        String aaaa=databinding.idDelivery.getTag().toString();
        String bbbb=databinding.idHotel.getTag().toString();
        String cccc=databinding.idSmart.getTag().toString();
        String dddd=databinding.idTele.getTag().toString();
        String eeee=databinding.idCleaning.getTag().toString();

        if(aaaa.equalsIgnoreCase("0") && bbbb.equalsIgnoreCase("0") && cccc.equalsIgnoreCase("0")
        && dddd.equalsIgnoreCase("0") && eeee.equalsIgnoreCase("0")){
            databinding.idNext.setEnabled(false);
            databinding.idNext.setTextColor(ColorStateList.valueOf(getResources().getColor(R.color.btntext_unselect)));
            databinding.idNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btn_unselect)));
        }

        else{

        }
    }

}