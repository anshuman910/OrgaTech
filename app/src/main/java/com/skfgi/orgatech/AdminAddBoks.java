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

public class AdminAddBoks extends AppCompatActivity {
ImageView logo;
Button upload;
Animation a;
ProgressBar pog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_boks);
        upload=(Button)findViewById(R.id.adabupload);
        logo=(ImageView)findViewById(R.id.adablogo);
        pog=(ProgressBar)findViewById(R.id.adabpog);

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

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upload.startAnimation(a);
                pog.setVisibility(View.VISIBLE);
                Toast.makeText(AdminAddBoks.this, "This part is under construction", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
