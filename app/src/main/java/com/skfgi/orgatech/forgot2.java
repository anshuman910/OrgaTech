package com.skfgi.orgatech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class forgot2 extends AppCompatActivity {
    Button submit;
    ProgressBar pog;
    ImageView logo;
    Animation a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot2);

        submit=(Button)findViewById(R.id.f2submit);
        logo=(ImageView)findViewById(R.id.f2logo);
        pog=(ProgressBar)findViewById(R.id.f2pog);


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

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               submit.startAnimation(a);
               pog.setVisibility(View.VISIBLE);
               Toast.makeText(forgot2.this, "This part is under construction", Toast.LENGTH_SHORT).show();
           }
       });



    }
}
