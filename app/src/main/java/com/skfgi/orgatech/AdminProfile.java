package com.skfgi.orgatech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class AdminProfile extends AppCompatActivity {
ImageView logo;
Button dob,back,update;
EditText name,mail,ph,ad,pas,repas,seqans;
Spinner gen,cour,st,sequ;
int pos;
String seq;
Animation a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_profile);

        logo=(ImageView) findViewById(R.id.adprologo);
        dob=(Button) findViewById(R.id.adprodobbtn);
        back=(Button) findViewById(R.id.adproback);
        update=(Button) findViewById(R.id.adproupdate);
        name=(EditText) findViewById(R.id.adproname);
        mail=(EditText) findViewById(R.id.adproemail);
        ph=(EditText) findViewById(R.id.adproph);
        ad=(EditText) findViewById(R.id.adproadd);
        pas=(EditText) findViewById(R.id.adpropass);
        repas=(EditText) findViewById(R.id.adprorepass);
        seqans=(EditText) findViewById(R.id.adproseq);
        gen=(Spinner) findViewById(R.id.adprogenspn);
        cour=(Spinner) findViewById(R.id.adprocour);
        st=(Spinner) findViewById(R.id.adprostr);
        sequ=(Spinner) findViewById(R.id.adproseqsp);


        a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        a.setInterpolator(interpolator);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo.startAnimation(a);
            }
        });



        String [] list={"SELECT","WHAT IS YOUR NICK NAME?","WHAT IS YOUR SCHOOL NAME?",
                "WHAT IS YOUR PET'S NAME?","WHICH WAS YOUR FIRST MOBILE?","WHAT IS YOUR MOTHER'S NAME?",
                "WHAT IS YOUR FATHER'S NAME?","WHAT IS YOUR BEST FRIEND'S NAME?","WHAT IS YOUR ALTERNATE MOBILE NO?"};
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sequ.setAdapter(arrayAdapter);

        sequ.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                seq=sequ.getSelectedItem().toString();
                Toast.makeText(AdminProfile.this, "You have selected: "+seq, Toast.LENGTH_SHORT).show();
                pos=sequ.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(AdminProfile.this, "Please select an item to continue..", Toast.LENGTH_SHORT).show();

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.startAnimation(a);
                finish();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update.startAnimation(a);
                Toast.makeText(AdminProfile.this, "This part is under construction", Toast.LENGTH_SHORT).show();
            }
        });






    }
}
