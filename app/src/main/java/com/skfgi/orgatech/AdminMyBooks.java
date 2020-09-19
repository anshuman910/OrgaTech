package com.skfgi.orgatech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class AdminMyBooks extends AppCompatActivity {
    ImageView logo;
    Animation a;
    Spinner books;
    Button back,delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_my_books);
        logo=(ImageView)findViewById(R.id.admblogo);
        back=(Button) findViewById(R.id.admbback);
        delete=(Button) findViewById(R.id.admbdel);



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

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete.startAnimation(a);
                Toast.makeText(AdminMyBooks.this, "This part is under construction", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
