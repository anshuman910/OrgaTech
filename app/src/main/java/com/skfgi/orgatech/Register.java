package com.skfgi.orgatech;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    ImageView logo;
    Button submit;
    Animation a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        logo=(ImageView)findViewById(R.id.reglogo);
        submit=(Button) findViewById(R.id.regsubmit);



        a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        a.setInterpolator(interpolator);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo.startAnimation(a);
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit.startAnimation(a);
                Toast.makeText(Register.this, "This part is under construction", Toast.LENGTH_SHORT).show();
            }
        });


    }
}


//delete the above code











/*package com.skfgi.orgatech;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Register extends AppCompatActivity {
    TextView course;
    TextView textView2;
    TextView textView8;
    TextView textView5;
    TextView stream;
    EditText editText3;
    EditText editText;
    EditText editText2;
    EditText editText6;
    EditText ed2;
    Spinner str;
    Spinner cour;
    Spinner spinner2;
    Button button2, button4;
    DatePickerDialog datepicker;
    int year, month, dayofmonth;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        course = (TextView) findViewById(R.id.course);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView5 = (TextView) findViewById(R.id.textView5);
        stream = (TextView) findViewById(R.id.stream);
        editText3 = (EditText) findViewById(R.id.editText3);  //to store the contact number
        editText = (EditText) findViewById(R.id.editText);  //to store the full name
        editText2 = (EditText) findViewById(R.id.editText2);  //to store the address
        editText6 = (EditText) findViewById(R.id.editText6);   //to store the password
        ed2 = (EditText) findViewById(R.id.ed2);   //to recheck the password
        str = (Spinner) findViewById(R.id.str);  //to store the stream
        spinner2 = (Spinner) findViewById(R.id.spinner2);  //to store the gender
        cour = (Spinner) findViewById(R.id.cour);//to store the course
        button2 = (Button) findViewById(R.id.button2);      //to be used in the date of birth
        button4 = (Button) findViewById(R.id.button4);   //to submit the current page

        button4.setEnabled(false);
        //cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

        //@Override
        //public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        //  if(cb1.isChecked())
        //{
        //  button4.setEnabled(true);
        //}else
        //{
        //  button4.setEnabled(false);              //Button disable when not checked
        //}
        //}
        //});
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                if (editText6.getText().toString().equals("")) {
                    editText6.setError("PASSWORD CANT BE EMPTY");
                } else if (ed2.getText().toString().equals("")) {
                    ed2.setError("PASSWORD CANT BE EMPTY");
                } else if (!editText6.getText().toString().equals(ed2.getText().toString())) {
                    ed2.setError("PASSWORD NOT MATCHED");
                } else {
                    registration rg = new registration();
                    new Thread(rg).start();
                }

            }
        });


        // For calendar
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayofmonth = calendar.get(Calendar.DAY_OF_MONTH);
                datepicker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        button4.setText(i2 + "/" + (i1 + 1) + "/" + i);

                    }
                }, year, month, dayofmonth);
                datepicker.show();


            }
        });     //End calendar

        class registration implements Runnable          //alt+enter then create methods
        {

            @Override
            public void run() {
                final String
                        full_name, address, dob, gender, ph_no, pass;     //the names of the feilds sholud match with the database feild names
                full_name = editText.getText().toString().trim();
                address = editText2.getText().toString().trim();
                dob = ed4.getText().toString().trim();
                gender = spinner2.trim();
                ph_no = editText3.getText().toString().trim();
                pass = editText6.getText().toString().trim();
                StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(final String response) {             //if the data is submitted properly to the database then it will give a response
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(Register.this, response, Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getApplicationContext(), guest_dashboard.class);
                            }
                        });
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(Register.this, "Error", Toast.LENGTH_SHORT).show();
                            }
                        });
                        error.printStackTrace();
                    }
                }) {


                };
            }
        }
    }
}
*/