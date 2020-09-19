package com.skfgi.orgatech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
    ImageView logo;
    Button back,send;
    Animation a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        logo=(ImageView)findViewById(R.id.fdlogo);
        back=(Button) findViewById(R.id.fdbback);
        send=(Button) findViewById(R.id.fdbsend);


        a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        a.setInterpolator(interpolator);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo.startAnimation(a);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.startAnimation(a);
                finish();
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send.startAnimation(a);
                Toast.makeText(Feedback.this, "This part is under construction", Toast.LENGTH_SHORT).show();
            }
        });





    }
}
