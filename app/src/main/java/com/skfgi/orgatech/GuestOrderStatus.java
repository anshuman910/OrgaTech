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

public class GuestOrderStatus extends AppCompatActivity {

    Animation a;
    ImageView logo;
    Button back,find;
    ProgressBar pog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_order_status);

        logo=(ImageView)findViewById(R.id.goslogo);
        back=(Button) findViewById(R.id.gosback);
        find=(Button) findViewById(R.id.gosfind);
        pog=(ProgressBar) findViewById(R.id.gospog);

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
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                find.startAnimation(a);
                pog.setVisibility(View.VISIBLE);
                Toast.makeText(GuestOrderStatus.this, "This part is under construction", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.startAnimation(a);
                finish();
            }
        });




    }
}
