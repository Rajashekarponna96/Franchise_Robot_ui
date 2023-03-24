package com.example.incomingcallsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.incomingcallsexample.databinding.ActivityFiveBinding;
import com.example.incomingcallsexample.databinding.ActivitySixBinding;

public class SixActivity extends AppCompatActivity {

    ActivitySixBinding databinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        databinding = ActivitySixBinding.inflate(getLayoutInflater());
        setContentView(databinding.getRoot());




        databinding.idRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Restaurant");


            }
        });

        databinding.idHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Hotel");

            }
        });

        databinding.idCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Cafe");

            }
        });

        databinding.idHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Hospital");
            }
        });


        databinding.idHealthcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Health Care");

            }
        });

        databinding.idRetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Retail");


            }
        });

        databinding.idShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Shopping Mall");
            }
        });

        databinding.idEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Education");
            }
        });

        databinding.idCatering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                nextActivity("Catering Bussiness");
            }
        });

        databinding.idConvention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("Convention Hall");

            }
        });

        databinding.idCorporate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                nextActivity("Corporate Office");
            }
        });

        databinding.idItsolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.GONE);
                databinding.idNext.setVisibility(View.GONE);

                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));

                nextActivity("IT Solutions");

            }
        });


        databinding.idOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databinding.idBussinescater.setVisibility(View.VISIBLE);
                databinding.idNext.setVisibility(View.VISIBLE);
                databinding.idOthers.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect_boxfilled));
                databinding.idCafe.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRest.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHotel.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idRetail.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idShopping.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idEducation.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCatering.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idConvention.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idCorporate.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idItsolution.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));
                databinding.idHealthcare.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebox));


            }
        });


        databinding.idBussinescater.addTextChangedListener(new TextWatcher() {
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
                String data=databinding.idBussinescater.getText().toString();
                if(data.isEmpty() ){
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
                String data=databinding.idBussinescater.getText().toString();
                if(!data.isEmpty()){

                    nextActivity(data);


                }else{
                    Toast.makeText(SixActivity.this, "Please enter your response", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void nextActivity(String data) {
        String name=getIntent().getStringExtra("NAME");
        String phone=getIntent().getStringExtra("PHONE");
        String mail=getIntent().getStringExtra("MAIL");
        String city=getIntent().getStringExtra("CITY");
        String userrobotss=getIntent().getStringExtra("USERROBOTS");
        Intent intent = new Intent(SixActivity.this, SevenActivity.class);
        intent.putExtra("NAME",name);
        intent.putExtra("MAIL",mail);
        intent.putExtra("PHONE",phone);
        intent.putExtra("CITY",city);
        intent.putExtra("USERROBOTS",userrobotss);
        intent.putExtra("BUSSINESSCATEGORY",data);
        startActivity(intent);


    }
}