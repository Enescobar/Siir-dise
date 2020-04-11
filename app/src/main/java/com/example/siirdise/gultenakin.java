package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gultenakin extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gultenakin);
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
                alertDialogBuilder.setTitle("Ağıt");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İlk bu sabah\n" +
                                "İlk bu sabah göğü görmedim\n" +
                                "İlk bu sabah kayısı çiçeklerini\n" +
                                "Hüzün ilk kez konuk gibi gelmedi\n" +
                                "Efendim, ev sahabım\n" +
                                "Karacamı suya indiremedim\n" +
                                "Şahanım uçurdum döndüremedim\n" +
                                "Dağlar\n" +
                                "Enikli kapılar kitlendi\n" +
                                "Taş avlular sustu\n" +
                                "İlk kez bekledim ölümü\n" +
                                "Dostu bekler gibi bekledim\n" +
                                "Dağlar\n" +
                                "\n" +
                                "Benim acım acıların beyidir\n" +
                                "Canıma bir doru kısrakla gelir\n" +
                                "Öfkeyi sabırda eritir\n" +
                                "Umut yer\n" +
                                "Suyunu gözümden içer bir zaman\n" +
                                "Dağlar of dağlar");
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
                alertDialogBuilder.setTitle("Ayrılanlar Gemisi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bunlar en mutlu günleri ayrılığımızın\n" +
                                "Yanaşmadan özleminin limanlarına\n" +
                                "Bir uzun hava içinde kendimiz kendimizin\n" +
                                "Uzasın dönmenin saçları, çagırma uzasın\n");

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
                alertDialogBuilder.setTitle("Çağrı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Evler büyük dedikçe büyük\n" +
                                "Ben insanların en garibi\n" +
                                "Uzağı ilk defa kavradım\n" +
                                "Görür yahut dokunur gibi\n" +
                                "Eski bir saçakta kuşlarla\n" +
                                "Yele yağmura karşı oturdum\n" +
                                "İç içe daireler çiziyor\n" +
                                "İçine adımı yazıyorum\n" +
                                "Gün uzun türküsünü bitirdi\n" +
                                "Karlı dallara yürüdü karanlık\n" +
                                "Yalnızlık çekilmez bu vakit\n" +
                                "Delirdi denizde yosun çayda balık\n" +
                                "Gel artık");

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
                alertDialogBuilder.setTitle("Deli Kızın Türküsü");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sana büyük caddelerin birinde rastlasam\n" +
                                "Elimi uzatsan tutsam götürsem\n" +
                                "Gözlerine baksam gözlerine, konuşmasak\n" +
                                "Anlasan\n" +
                                "\n" +
                                "Elimi uzatsam tutamasam\n" +
                                "Olanca sevgimi yalnızlığımı düşünsem-hayır düşünmesem\n" +
                                "Senin hiç haberin olmasa\n" +
                                "Senin hiç haberin olmaz ki\n" +
                                "Başlar biter kendi kendine o türkü\n" +
                                "\n" +
                                "Yağmur yağar akasyalar ıslanır\n" +
                                "Bulutlar uçuşur geceleyin\n" +
                                "Ben yağmura deli buluta deli\n" +
                                "Bir büyük oyun yaşamak dediğin\n" +
                                "Beni ya sevmeli ya öldürmeli\n" +
                                "\n" +
                                "Yitirmeli büyük yolların birinde ne varsa\n" +
                                "Böcekler gibi başlamalı yeniden\n" +
                                "Bu Allahsız bu yağmur işlemez karanlıkta\n" +
                                "Yan garipliğine yürek yan\n" +
                                "Gitti giden");

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
                alertDialogBuilder.setTitle("Kıyamet");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Elyazını yaktım, dürüsttü ve aşınmamış\n" +
                                "Sevgi sözcüklerini yaktım, hoyrattır onlar\n" +
                                "Sıcaklığı saklı akarsuyu anlamazlar\n" +
                                "Sorular, kurutur incitir sorarlar\n" +
                                "Elyazını yaktım\n" +
                                "\n" +
                                "Adresini yaktım\n" +
                                "Yakmak gibiydi biraz da dünyayı herşeyi\n" +
                                "Bastığımız düşümüzde gördüğümüz\n" +
                                "Özlediğimiz yaklaştığımız\n" +
                                "Hayatım özlemdi ansımaydı düştü\n" +
                                "Yaktım adresini şimdi özlem oldu hayatım\n" +
                                "\n" +
                                "Resimleri yaktım birini saklasam dedim\n" +
                                "En çok onu yaktım onu yaktım\n" +
                                "Kış göğünü yaktım, bir kavak büyüttüm balkonumdan\n" +
                                "Akşam desem değil, yangın desem değil\n" +
                                "Dışarda apansız bir kıyameti yaktım\n" +
                                "\n" +
                                "Sevgidir kendimi bildiğim, onunla başladım\n" +
                                "Elyazın mı, adresin mi, resimlerin mi\n" +
                                "Sen mi ömrün mü\n" +
                                "Çıkardım onları şimdi sakladığım yerden\n" +
                                "Kıyameti göğü kışı akşam sözlerini\n" +
                                "Sevgiyi yaktım");

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
                alertDialogBuilder.setTitle("Orda Kaldım");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Giden gitti (yiten zaman)\n" +
                                "açtığın kapıdan girdim, adımı söyledim\n" +
                                "işte orda kaldım\n" +
                                "\n" +
                                "herkes nerde? (gibi yanlarında durdum)\n" +
                                "yiten zaman (onlar öyle sandı)\n" +
                                "hiç ayrılmadım ki (aklım)\n" +
                                "ben orda kaldım\n" +
                                "\n" +
                                "senden bana hiç durmadan akan neyse\n" +
                                "olsan olmasan\n" +
                                "yansıladım (yüreğim, ben)\n" +
                                "sen yoksan da iki olduk\n" +
                                "gidenlerle gittim (gibi)\n" +
                                "dünya (zaman)\n" +
                                "ben orda kaldım");

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
                alertDialogBuilder.setTitle("Seni Sevdim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Seni sevdim,\n" +
                                "Seni birdenbire değil usul usul sevdim.\n" +
                                "'Uyandım bir sabah' gibi değil,\n" +
                                "Öyle değil nasıl yürür özsu dal uçlarına\n" +
                                "Ve gün ışığı sislerden düşsel ovalara...\n" +
                                "Seni sevdim...\n" +
                                "Artık tek mümkünüm sensin.");

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
                alertDialogBuilder.setTitle("Yeniden");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Karanlık bastı mı gelirsin\n" +
                                "Pencerem dibinde durursun\n" +
                                "Oyuncaklar kabartma harfler gibi\n" +
                                "Elle tutulur garipliğin\n" +
                                "\n" +
                                "Elişi kağıtlardan çicekler yaparsın\n" +
                                "Yeni şekiller görülmedik renkler ışıklar yaparsın\n" +
                                "Dünya güzelse daha güzel olur\n" +
                                "Bir şarkı sıcak yayılır ansızın\n" +
                                "Uzanır ellerin gözlerimi örter\n" +
                                "Bütün düzenim bozulur\n" +
                                "\n" +
                                "Karanlık bastımı seninle gelir\n" +
                                "Nasıl döner durur ortalarda\n" +
                                "Çağrışımlardan kopmuş bir sürü\n" +
                                "Tedirgin kuşlar gibi kelime\n" +
                                "\n" +
                                "Elinde aynaların binbir yanlısı\n" +
                                "Ne yandan baksan ölüm\n" +
                                "Kurtul dersin kurtul kendinden\n" +
                                "Unut yitiklerini\n" +
                                "Seni yargılayacak kim\n" +
                                "\n" +
                                "Karanlık bastı mı gelirsin\n" +
                                "Penceremin dibinde durursun\n" +
                                "Oyuncaklar kabartma harfler gibi\n" +
                                "Elle tutulur garipliğin");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });



    }
}