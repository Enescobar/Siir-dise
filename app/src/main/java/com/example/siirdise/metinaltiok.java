package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class metinaltiok extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metinaltiok);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn66= (Button) findViewById(R.id.btn66);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Acılarla Sorularla");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Neden kedi seven\n" +
                                "Bir insan\n" +
                                "Olduğumu\n" +
                                "Biliyorum da\n" +
                                "Kedisiz ve sevgisiz\n" +
                                "Getiriyorum\n" +
                                "Yaşadığım günlerin\n" +
                                "Yaprak döken sonunu?");
                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();
                // alerti gösteriyoruz
                alertDialog.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Ben Şimdi Biraz");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ben şimdi biraz da\n" +
                                "Senin için görüyorum;\n" +
                                "Gökyüzünün parlak,\n" +
                                "Bakış seken mavisini.\n" +
                                "Ben şimdi biraz da\n" +
                                "Senin için duyuyorum;\n" +
                                "Gecenin o sarsak,\n" +
                                "Yokuş çıkan ezgisini.\n" +
                                "Ben şimdi kanayarak\n" +
                                "Senin için yaşıyorum;\n" +
                                "Sazan derisi gibi\n" +
                                "Günlerimi külle soyarak");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Bir Yalnızlık İşareti");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ben şimdi biraz da\n" +
                                "Senin için görüyorum;\n" +
                                "Gökyüzünün parlak,\n" +
                                "Bakış seken mavisini.\n" +
                                "Ben şimdi biraz da\n" +
                                "Senin için duyuyorum;\n" +
                                "Gecenin o sarsak,\n" +
                                "Yokuş çıkan ezgisini.\n" +
                                "Ben şimdi kanayarak\n" +
                                "Senin için yaşıyorum;\n" +
                                "Sazan derisi gibi\n" +
                                "Günlerimi külle soyarak");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Olsa Olsa");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ben alıştım elin\n" +
                                "Alkış tutmasına,\n" +
                                "Küfüne emeğin,\n" +
                                "Akarsuyun pasına;\n" +
                                "Yüreğime ısırgan\n" +
                                "Bir hüzün de dolsa\n" +
                                "\n" +
                                "Benim sevdamın\n" +
                                "Burgaçlanan yarası,\n" +
                                "Bu yetim güzle,\n" +
                                "Öksüz kış arası;\n" +
                                "Güldürür ancak\n" +
                                "Bir piçi olsa olsa");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Şimdi Gel");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ben alıştım elin\n" +
                                "Alkış tutmasına,\n" +
                                "Küfüne emeğin,\n" +
                                "Akarsuyun pasına;\n" +
                                "Yüreğime ısırgan\n" +
                                "Bir hüzün de dolsa\n" +
                                "\n" +
                                "Benim sevdamın\n" +
                                "Burgaçlanan yarası,\n" +
                                "Bu yetim güzle,\n" +
                                "Öksüz kış arası;\n" +
                                "Güldürür ancak\n" +
                                "Bir piçi olsa olsa");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Sevmiyorum Seni");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ben alıştım elin\n" +
                                "Alkış tutmasına,\n" +
                                "Küfüne emeğin,\n" +
                                "Akarsuyun pasına;\n" +
                                "Yüreğime ısırgan\n" +
                                "Bir hüzün de dolsa\n" +
                                "\n" +
                                "Benim sevdamın\n" +
                                "Burgaçlanan yarası,\n" +
                                "Bu yetim güzle,\n" +
                                "Öksüz kış arası;\n" +
                                "Güldürür ancak\n" +
                                "Bir piçi olsa olsa");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("İkilem");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir kabuk içinde\n" +
                                "Birbirinden ayrılmaz\n" +
                                "( :)\n" +
                                "Aşk ve acı yüreğimde\n" +
                                "İkiz badem içidir.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Sevmeye Başlayınca Birini");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("sevmeye başlayınca birini\n" +
                                "kendimi yıkıp yeniden kurarım\n" +
                                "çünkü;\n" +
                                "bu yeni bir aşktır\n" +
                                "ve temeldeki yerini mutlaka alacaktır.\n" +
                                "dikkat! ..\n" +
                                "yabancıların inşaat alanına girmesi tehlikeli ve yasaktır...");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}