package com.skfgi.orgatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ImageView imageview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview1=(ImageView)findViewById(R.id.iv1);
        Animation a;
        a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        imageview1.startAnimation(a);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                /*Intent i= new Intent(getApplicationContext(),Login.class);
                startActivity(i);
                finish();*/
                Intent i= new Intent(MainActivity.this,Login.class);
                startActivity(i);
                finish();


            }
        },2700);

    }
}
