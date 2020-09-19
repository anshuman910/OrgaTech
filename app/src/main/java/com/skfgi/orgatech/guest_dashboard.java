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

public class guest_dashboard extends AppCompatActivity {

    Button mb, bb, rb, orderstatus, log, ex,pro,noti,about,share,feed;
    TextView tv1;
    ImageView logo;
    Animation a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_dashboard);


        tv1 = (TextView) findViewById(R.id.gudashheader);
        mb = (Button) findViewById(R.id.gudashmb);
        bb = (Button) findViewById(R.id.gudashbb);
        rb = (Button) findViewById(R.id.gudashrb);
        orderstatus = (Button) findViewById(R.id.gudashos);
        pro = (Button) findViewById(R.id.gudashpro);
        ex = (Button) findViewById(R.id.gudashexit);
        log=(Button) findViewById(R.id.gudashlog);
        noti=(Button) findViewById(R.id.gudashnoti);
        about=(Button) findViewById(R.id.gudashabout);
        share=(Button) findViewById(R.id.gudashshare);
        feed=(Button) findViewById(R.id.gudashfeed);
        logo=(ImageView)findViewById(R.id.gudashlogo);

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
                Intent i= new Intent(guest_dashboard.this,GuestMyBooks.class);
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
                Intent i= new Intent(guest_dashboard.this,guest_profile.class);
                startActivity(i);

            }
        });

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bb.startAnimation(a);
                Intent i= new Intent(guest_dashboard.this,GuestBuyBooks.class);
                startActivity(i);

            }
        });

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb.startAnimation(a);
                Intent i= new Intent(guest_dashboard.this,GuestMyBooks.class);
                startActivity(i);

            }
        });


        orderstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderstatus.startAnimation(a);
                Intent i= new Intent(guest_dashboard.this,GuestOrderStatus.class);
                startActivity(i);

            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log.startAnimation(a);
                Intent i= new Intent(guest_dashboard.this,Login.class);
                startActivity(i);
                finish();
            }
        });


        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noti.startAnimation(a);
                Intent i= new Intent(guest_dashboard.this,GuestNotification.class);
                startActivity(i);

            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                about.startAnimation(a);
                Intent i= new Intent(guest_dashboard.this,AboutUs.class);
                startActivity(i);

            }
        });

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feed.startAnimation(a);
                Intent i= new Intent(guest_dashboard.this,Feedback.class);
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
