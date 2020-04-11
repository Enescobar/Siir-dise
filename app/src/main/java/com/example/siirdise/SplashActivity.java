package com.example.siirdise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    Button sub;
    ImageView book;
    Animation frombottom,fromtop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

sub = (Button) findViewById(R.id.siir);
book = (ImageView) findViewById(R.id.book);
frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
sub.setAnimation(frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        book.setAnimation(fromtop);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(gecisYap);
            }
        });

    }

}
