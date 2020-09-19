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

public class guest_profile extends AppCompatActivity {

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
        setContentView(R.layout.activity_guest_profile);

        logo=(ImageView) findViewById(R.id.guprologo);
        dob=(Button) findViewById(R.id.guprodobbtn);
        back=(Button) findViewById(R.id.guproback);
        update=(Button) findViewById(R.id.guproupdate);
        name=(EditText) findViewById(R.id.guproname);
        mail=(EditText) findViewById(R.id.guproemail);
        ph=(EditText) findViewById(R.id.guproph);
        ad=(EditText) findViewById(R.id.guproadd);
        pas=(EditText) findViewById(R.id.gupropass);
        repas=(EditText) findViewById(R.id.guprorepass);
        seqans=(EditText) findViewById(R.id.guproseq);
        gen=(Spinner) findViewById(R.id.guprogenspn);
        cour=(Spinner) findViewById(R.id.guprocour);
        st=(Spinner) findViewById(R.id.guprostr);
        sequ=(Spinner) findViewById(R.id.guproseqsp);


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
                Toast.makeText(guest_profile.this, "You have selected: "+seq, Toast.LENGTH_SHORT).show();
                pos=sequ.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(guest_profile.this, "Please select an item to continue..", Toast.LENGTH_SHORT).show();

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
                Toast.makeText(guest_profile.this, "This part is under construction", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
