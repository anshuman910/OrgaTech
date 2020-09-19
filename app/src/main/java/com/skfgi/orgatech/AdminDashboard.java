package com.skfgi.orgatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminDashboard extends AppCompatActivity {
    Button mb, ab, rb, update, log, ex,pro,noti,about,share,feed;
    TextView tv1;
ImageView logo;
    Animation a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        tv1 = (TextView) findViewById(R.id.addashheader);
        mb = (Button) findViewById(R.id.addashmb);
        ab = (Button) findViewById(R.id.addashab);
        rb = (Button) findViewById(R.id.addashrb);
        update = (Button) findViewById(R.id.addashup);
        pro = (Button) findViewById(R.id.addashpro);
        ex = (Button) findViewById(R.id.addashexit);
        log=(Button) findViewById(R.id.addashlog);
        noti=(Button) findViewById(R.id.addashnoti);
        about=(Button) findViewById(R.id.addashabout);
        share=(Button) findViewById(R.id.addashshare);
        feed=(Button) findViewById(R.id.addashfeed);
        logo=(ImageView)findViewById(R.id.addashlogo);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo.startAnimation(a);
            }
        });

        tv1.setText("WELCOME  " + "insert variable here" + "!!");

        a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        a.setInterpolator(interpolator);

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,AdminMyBooks.class);
                startActivity(i);

            }
        });
        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();               //To exit directly from the current page
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,AdminProfile.class);
                startActivity(i);

            }
        });

        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ab.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,AdminAddBoks.class);
                startActivity(i);

            }
        });

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,AdminMyBooks.class);
                startActivity(i);

            }
        });


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,AdminProfile.class);
                startActivity(i);

            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,Login.class);
                startActivity(i);
                finish();
            }
        });


        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noti.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,AdminNotification.class);
                startActivity(i);

            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                about.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,AboutUs.class);
                startActivity(i);

            }
        });

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feed.startAnimation(a);
                Intent i= new Intent(AdminDashboard.this,Feedback.class);
                startActivity(i);

            }
        });


        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                share.startAnimation(a);
                Intent i= new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String sharebody="Hey there!\n Try the new OrgaTech app.";
                String sharesub="OrgaTech invitation";
                i.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                i.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(i,"Share using:"));

            }
        });



    }
}