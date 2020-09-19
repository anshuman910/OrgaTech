package com.skfgi.orgatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

public class forgot extends AppCompatActivity {

EditText ed1,ed2,ed3;
Spinner spn;
Button btn1;
String seq;
int pos;
ProgressBar pog;
ImageView logo;
Animation a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        ed1=(EditText)findViewById(R.id.loginid);
        spn=(Spinner)findViewById(R.id.sp1);
        btn1=(Button)findViewById(R.id.f1next);
        logo=(ImageView)findViewById(R.id.f1logo);
        pog=(ProgressBar)findViewById(R.id.f1pog);

        pog.setVisibility(View.INVISIBLE);


        a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        a.setInterpolator(interpolator);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logo.startAnimation(a);
            }
        });



btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getApplicationContext(),forgot2.class);
        btn1.startAnimation(a);
        pog.setVisibility(View.VISIBLE);
        startActivity(i);

    }
});



        String [] list={"SELECT","WHAT IS YOUR NICK NAME?","WHAT IS YOUR SCHOOL NAME?",
                "WHAT IS YOUR PET'S NAME?","WHICH WAS YOUR FIRST MOBILE?","WHAT IS YOUR MOTHER'S NAME?",
        "WHAT IS YOUR FATHER'S NAME?","WHAT IS YOUR BEST FRIEND'S NAME?","WHAT IS YOUR ALTERNATE MOBILE NO?"};
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(arrayAdapter);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                seq=spn.getSelectedItem().toString();
                Toast.makeText(forgot.this, "You have selected: "+seq, Toast.LENGTH_SHORT).show();
                pos=spn.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(forgot.this, "Please select an item to continue..", Toast.LENGTH_SHORT).show();

            }
        });



    }






}
