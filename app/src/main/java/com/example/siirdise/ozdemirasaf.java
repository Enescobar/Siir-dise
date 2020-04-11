package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ozdemirasaf extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ozdemirasaf);
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
                alertDialogBuilder.setTitle("Lavinia");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sana gitme demeyeceğim.\n" +
                                "Üşüyorsun ceketimi al.\n" +
                                "Günün en güzel saatleri bunlar.\n" +
                                "Yanımda kal.\n" +
                                "\n" +
                                "Sana gitme demeyeceğim.\n" +
                                "Gene de sen bilirsin.\n" +
                                "Yalanlar istiyorsan yalanlar söyleyeyim,\n" +
                                "İncinirsin.\n" +
                                "\n" +
                                "Sana gitme demeyeceğim.\n" +
                                "Ama gitme Lavinia.\n" +
                                "Adını gizleyeceğim,\n" +
                                "Sen de bilme Lavinia");
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
                alertDialogBuilder.setTitle("Adalet");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İnsansız adalet olmaz\n" +
                                "Adaletsiz insan olur mu?\n" +
                                "Olur, olmaz olur mu!\n" +
                                "Ama, olmaz olsun");

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
                alertDialogBuilder.setTitle("Bekle Dedi gitti");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bekle dedi gitti\n" +
                                "Ben beklemedim, o da gelmedi...\n" +
                                "Ölüm gibi bir şey oldu\n" +
                                "Ama kimse ölmedi...");

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
                alertDialogBuilder.setTitle("Tutkular");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Tutkuların evinde savaş kırıkları var;\n" +
                                "Kül olmuş bir bütün'ün yonga yanıkları var.\n" +
                                "Eski özlemlilerin yeni bahçelerinde,\n" +
                                "Anı kuyularının suskun çığlıkları var.\n");

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
                alertDialogBuilder.setTitle("Bilseydi Eğer");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir şiir bir geceye değer,\n" +
                                "Bir şiir bir uykuya değer,\n" +
                                "Bir şiir bir uyanmaya değer,\n" +
                                "Bir şiir bir sigaraya değer,\n" +
                                "Bir şiir bir rakıya değer,\n" +
                                "Bir şiir bir şarkıya değer,\n" +
                                "Bir şiir bir türküye değer,\n" +
                                "Bir şiir bir ağrıya değer,\n" +
                                "Diye-diye..\n" +
                                "Meğer.");

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
                alertDialogBuilder.setTitle("Bir Adam");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Korku dağlarının yürekçisi,\n" +
                                "Olum denizlerinin kürekçisi;\n" +
                                "Öyle suskun oturuyor şişesinin basında,\n" +
                                "İçtiğinin hem hırsızı, hem bekçisi,\n" +
                                "\n" +
                                "Onu kirmiş olmalı yaşamında birisi.\n" +
                                "Dinledikçe susması, düşündükçe susması...\n" +
                                "Tek başına iki kişi olmuş kendisiyle gölgesi,\n" +
                                "Heykelini yontuyor yalnızlığın ustası.");

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
                alertDialogBuilder.setTitle("İstiyorum");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Rüzgar mı dedim...\n" +
                                "İsterim ki saçların dağılsın.\n" +
                                "Gece mi dedim.\n" +
                                "Hemen düşüncelere dalmalısın.\n" +
                                "\n" +
                                "Aşk der demez\n" +
                                "Kalbin hızlı çarpmalı.\n" +
                                "Sabah, dememe kalmadan\n" +
                                "Uyanmalısın.\n");

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
                alertDialogBuilder.setTitle("Yaşayan Ölüm");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Gözlerini kaçıramazsın, geçmiş ola\n" +
                                "Artık derebeyindir senin o görmüşlüğün\n" +
                                "Köleliğin sana işitir yaşlandıkça o ve sen\n" +
                                "Onun yaşamışlığındadır senin ölmüşlüğün\n" +
                                "Artık o sende hep yaşayan bir ölüm\n" +
                                "\n" +
                                "Başka görüntülerle gelir öbür açılarıyla\n" +
                                "Seni yerinden eder, gider,\n" +
                                "Gelir yerinden eder...\n" +
                                "Pasını siler, kimse anlamaz sen anlarsın\n" +
                                "Sen anladıkça o sende hep yaşayan bir ölüm");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Yalnızlığın Adı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Derin bir uyku...\n" +
                                "Düşümde\n" +
                                "Düşündüm ister istemez\n" +
                                "Aklıma takıldı\n" +
                                "Yalnızlığın adı\n" +
                                "\n" +
                                "Tam o sırada\n" +
                                "Bir sinek\n" +
                                "Beni uyandırdı\n" +
                                "Gerçek bir sinek\n" +
                                "Yalnızlığın adı\n" +
                                "Düşümde kaldı");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Yaşam");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sanırım görmediniz;\n" +
                                "Şimdi şuradan geçti.\n" +
                                "Yazık görmediyseniz,\n" +
                                "Böcek gibi güzeldi.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder2 = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder2.setTitle("Uykusuzluk");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Uykusuzluk ve pencerede bir kedi\n" +
                                "gece boyu hiç konuşmadan durdu\n" +
                                "yağmurlar yağdı, dindi\n" +
                                "pencerede hep kedi\n" +
                                "ne geceye girdi, ne uyudu\n" +
                                "baktı, baktı, baktı\n" +
                                "belli değildi doğmadığı, doğduğu\n" +
                                "\n" +
                                "sanki ona bir zaman\n" +
                                "hadi şimdi, yola çıkıp bir duygudan\n" +
                                "pencerenin dışında duran\n" +
                                "bir geceden indi, odaya girdi\n" +
                                "dedi\n" +
                                "hadi şimdi sende in uykudan\n" +
                                "\n" +
                                "sevdi mi, sevmedi mi, belli etmedi\n" +
                                "sürdürüp suskunluğunu\n" +
                                "yeni huysuzluğu besledi\n" +
                                "aaaa\n" +
                                "kedi bu uykunun içindeydi\n" +
                                "\n" +
                                "ankara yolundaydı bir gece\n" +
                                "bir gün marmaris yolundaydı kedi\n" +
                                "bütün uyku kapılarının önündeydi\n" +
                                "mırmırları, tırmalamalarıyla\n" +
                                "bir kadının düşlerindeydi\n" +
                                "ve bütün hırçınlığıyla\n" +
                                "anılarının önündeydi.\n");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog1 = alertDialogBuilder2.create();

                // alerti gösteriyoruz
                alertDialog1.show();
            }


        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Olmayacak");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("O gider buralardan, sen döndüğün bir günde...\n" +
                                "Aranırken onu sen başkaları yüzünde.\n" +
                                "Işık olur tararsın karanlıkları bir-bir...\n" +
                                "O güneş gibi parlar, sen söndüğün bir günde.\n" +
                                "\n" +
                                "Yaşamın aramakla olgunlaşıp yitmiştir;\n" +
                                "Kocaman bir ağacın tek bir yemişi gibi...\n" +
                                "Karamsar bir öyküdür, bir sence değerlidir;\n" +
                                "Yalnız masal ulu'su bir dağ erimiş gibi.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Pekiyi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ne sordularsa söyledim.\n" +
                                "Ellerim değdi dedim,\n" +
                                "Gözlerim değdi dedim.\n" +
                                "Ne sordularsa söyledim.\n");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Seni Seyrederdim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Saçların uçuşurdu rüzgardan.\n" +
                                "Yanından seni seyrederdim.\n" +
                                "Güneş yakardı,deniz yanardı..\n" +
                                "Sen konuşurdun,dinlerdim.\n" +
                                "\n" +
                                "Gülerdin..\n" +
                                "Susardın,düşünürdün.\n" +
                                "Benimle el-ele yürüdün..\n" +
                                "Yol biterdi.\n" +
                                "\n" +
                                "Görmezdim seni..\n" +
                                "Zaman yıl yıl geçerdi.\n" +
                                "Uzaktan,çok uzaklardan\n" +
                                "Seni seyrederdim.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Birikir İnsanın Şarkısı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yapışa yapışa görüyorum.\n" +
                                "Evler sürtüne sürtüne geçiyor yanlarımdan.\n" +
                                "Duvarlar derilerimi kanatıyor.\n" +
                                "Kümelenip sırtıma biniyor bulutlar.\n" +
                                "Ben dimdik duruyorum, yürümekli.\n" +
                                "Yol ayaklarımın altından kayıp geri gidiyor.\n" +
                                "\n" +
                                "Bütün taşlar, topraklar, ağaçlar doluyor sonsuz gözlerime.\n" +
                                "Hepsinde sayısız gözlerimden biri kalıyor.\n" +
                                "Dönüp\n" +
                                "Bütün bunları ben yaptım diyorum, inanıyorlar da...\n" +
                                "Durup,\n" +
                                "Şu kendimi bu gördüğümüz gibi ben yaptım,\n" +
                                "Diyorum.\n" +
                                "İnanmıyorlar.\n" +
                                "\n" +
                                "Gözümden düşüyoruz.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Kalmak Türküsü");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Daha gidilecek yerlerimiz var\n" +
                                "Şu sohbetini dinler gideriz\n" +
                                "Coştukça şarkılar, türküler, sazlar\n" +
                                "Rakı mı, şarap mı, içer gideriz\n" +
                                "\n" +
                                "Geçse de umudun baharı yazı\n" +
                                "Gözlerde kalıyor yaşanmış izi\n" +
                                "Kimseler kınamaz burada bizi\n" +
                                "Ne varsa hesabı öder gideriz\n" +
                                "\n" +
                                "Söyleyecek sözü olan anlatsın\n" +
                                "İsterse içine yalan da katsın\n" +
                                "Yeter ki kendinden, bizden söz etsin\n" +
                                "Yalanı doğruyu sezer gideriz\n" +
                                "\n" +
                                "Neler gördük neler bu güne kadar\n" +
                                "Daha gidilecek yerlerimiz var\n" +
                                "Bizi buralarda unutamazlar\n" +
                                "Kalacak bir türkü söyler gideriz\n" +
                                "\n" +
                                "Sevgiye var olduk sevdik sevildik\n" +
                                "Kavgalara girdik olduk dirildik\n" +
                                "Bir anlam fırını içinde pistik\n" +
                                "Anlamlı güzeli sever gideriz.\n");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Sabaha Kadar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Dünya o kadar büyük ki;\n" +
                                "Bir noktayım ortasında, ne yapsam.\n" +
                                "Bazan da o kadar küçülüyor ki dünya,\n" +
                                "Devrilecek sanıyorum, kımıldarsam.\n" +
                                "\n" +
                                "Hayat o kadar uzun ki,\n" +
                                "Öyle bitmez geliyor ki bir an..\n" +
                                "Bir de bakıyorum, o kadar kısalıyor ki;\n" +
                                "Ne çıkar, diyorum, bir hayattan\n" +
                                "\n" +
                                "Saadet o kadar lazım ki yaşayana;\n" +
                                "Billahi can verir uğrunda insan.\n" +
                                "Hem o kadar boş ki mesud olmak,\n" +
                                "Gün yüzü görmeden ölenlerin arkasından.\n" +
                                "\n" +
                                "Ben o kadar önemli kişiyim ki,\n" +
                                "O kadar iyiyim ki aklım ve düşüncelerimle.\n" +
                                "O kadar fenayım ki ben\n" +
                                "Delice niyetlerimle.\n" +
                                "\n" +
                                "Gece; ne kadar karanlık ve sessizsin..\n" +
                                "Öyle kaplayorsun ki evleri, denizleri.\n" +
                                "H em o kadar aydınlık ve seslisin ki;\n" +
                                "Çılgınca coşturuyorsun bizleri.\n" +
                                "\n" +
                                "Sabah; bir yeni dünya gibi geliyorsun;\n" +
                                "Öylesine süslü, öylesine saadesin ki..\n" +
                                "Sen o kadar güzelsin ki sabah,\n" +
                                "O kadar güzelsin ki.\n");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}