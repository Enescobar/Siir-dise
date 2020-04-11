package com.example.siirdise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView nazimbaba,asafbaba,ilhanbaba,cemalbaba,ahmetbaba,canbaba,orhanbaba,edipbaba,yahyababa
            ,cahitbaba,turgutbaba,sezaibaba,zarifoglubaba,sabahattinbaba,ecebaba,azizbaba,gultenbaba,metinbaba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cemalbaba=(ImageView) findViewById(R.id.img_cemalbaba);
        nazimbaba=(ImageView) findViewById(R.id.img_nazimbaba);
        asafbaba=(ImageView) findViewById(R.id.img_asafbaba);
        ilhanbaba=(ImageView) findViewById(R.id.img_ilhanbaba);
        ahmetbaba=(ImageView) findViewById(R.id.img_ahmedbaba);
        canbaba=(ImageView) findViewById(R.id.img_canbaba);
        orhanbaba=(ImageView) findViewById(R.id.img_orhanbaba);
        edipbaba=(ImageView) findViewById(R.id.img_edipbaba);
        yahyababa=(ImageView) findViewById(R.id.img_yahyababa);
        cahitbaba =(ImageView) findViewById(R.id.img_cahitbaba);
        turgutbaba = (ImageView) findViewById(R.id.img_turgutbaba);
        sezaibaba = (ImageView) findViewById(R.id.img_sezaibaba);
        zarifoglubaba=(ImageView) findViewById(R.id.img_zarifoglubaba);
        sabahattinbaba=(ImageView) findViewById(R.id.img_sabahattinbaba);
        ecebaba = (ImageView) findViewById(R.id.img_ecebaba);
        azizbaba=(ImageView) findViewById(R.id.img_azizbaba);
        gultenbaba=(ImageView) findViewById(R.id.img_gültenbaba);

        metinbaba=(ImageView) findViewById(R.id.img_metinbaba);

        nazimbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, nazimhikmet.class);
                startActivity(gecisYap);
            }
        });
        asafbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, ozdemirasaf.class);
                startActivity(gecisYap);
            }
        });
        ilhanbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, atillailhan.class);
                startActivity(gecisYap);
            }
        });
        cemalbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, cemalsureya.class);
                startActivity(gecisYap);
            }
        });
        ahmetbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, ahmedarif.class);
                startActivity(gecisYap);
            }
        });
        canbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, canyucel.class);
                startActivity(gecisYap);
            }
        });
        orhanbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, orhanvelikanik.class);
                startActivity(gecisYap);
            }
        });
        edipbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, edipcansever.class);
                startActivity(gecisYap);
            }
        });

        yahyababa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, yahyakemal.class);
                startActivity(gecisYap);
            }
        });
        cahitbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, cahitsitki.class);
                startActivity(gecisYap);
            }
        });
        turgutbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, turgutuyar.class);
                startActivity(gecisYap);
            }
        });
        sezaibaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, sezaikarakoc.class);
                startActivity(gecisYap);
            }
        });
        zarifoglubaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, cahitzarifoglu.class);
                startActivity(gecisYap);
            }
        });
        sabahattinbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, sabahattinali.class);
                startActivity(gecisYap);
            }
        });
        ecebaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, eceayhan.class);
                startActivity(gecisYap);
            }
        });
        azizbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, aziznesin.class);
                startActivity(gecisYap);
            }
        });
        gultenbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, gultenakin.class);
                startActivity(gecisYap);
            }
        });
        metinbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, metinaltiok.class);
                startActivity(gecisYap);
            }
        });


    }

}
