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
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    Button btn1;
    TextView tv1;
    TextView tv2,tv3,tv4;
    Spinner spinner;
    int pos;
    Animation a;
    ImageView logo;
    ProgressBar pog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed1=(EditText)findViewById(R.id.loginid);
        ed2=(EditText)findViewById(R.id.loginpass);
        tv1=(TextView)findViewById(R.id.addashheader);
        tv2=(TextView)findViewById(R.id.loginforgot);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.loginreg);
        spinner=(Spinner)findViewById(R.id.loginsp1);
        btn1=(Button)findViewById(R.id.loginbtn);
        logo=(ImageView) findViewById(R.id.loginiv);
        pog=(ProgressBar) findViewById(R.id.loginpog);

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



        String [] list={"SELECT","ADMIN","USER"};
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Login.this, "You have selected"+position, Toast.LENGTH_SHORT).show();
                pos=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Login.this, "Please Select one option.", Toast.LENGTH_SHORT).show();

            }
        });

       /* spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               *//* Intent i=new Intent(getApplicationContext(),.class);
                startActivity(i);*//*
            }
        } );
*/


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.startAnimation(a);



                if(pos==1)
                {
                    pog.setVisibility(View.VISIBLE);
                    Intent i=new Intent(getApplicationContext(),AdminDashboard.class);
                    startActivity(i);


                }
               else if(pos==2)
                {
                    pog.setVisibility(View.VISIBLE);
                    Intent i=new Intent(getApplicationContext(),guest_dashboard.class);
                    startActivity(i);

                }
               else{
                    Toast.makeText(Login.this, "Please Select one option.", Toast.LENGTH_SHORT).show();
                }
               /* Intent i=new Intent(getApplicationContext(),.class);
                startActivity(i);*/
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent i=new Intent(getApplicationContext(),Register.class);
                startActivity(i);*/
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv4.startAnimation(a);
                pog.setVisibility(View.VISIBLE);
                Intent i=new Intent(getApplicationContext(),Register.class);
                startActivity(i);

            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.startAnimation(a);
                pog.setVisibility(View.VISIBLE);
              Intent i=new Intent(getApplicationContext(),forgot.class);
                startActivity(i);
            }
        });
        /*List<String> list=new ArrayList();
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);*/

       /* String [] list={"SELECT","ADMIN","USER"};
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);*/



    }
}
