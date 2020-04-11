package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orhanvelikanik extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orhanvelikanik);
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
                alertDialogBuilder.setTitle("Açsam Rüzgara");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ne hoş, ey güzel Tanrım, ne hoş\n" +
                                "Mavilerde sefer etmek!\n" +
                                "Bir sahilden çözülüp gitmek\n" +
                                "Düşünceler gibi başıboş.\n" +
                                "Açsam rüzgara yelkenimi;\n" +
                                "Dolaşsam ben de deniz deniz\n" +
                                "Ve bir sabah vakti, kimsesiz\n" +
                                "Bir limanda bulsam kendimi.\n" +
                                "Bir limanda, büyük ve beyaz...\n" +
                                "Mercan adalarda bir liman..\n" +
                                "Beyaz bulutların ardından\n" +
                                "Gelse altın ışıklı bir yaz.\n" +
                                "Doldursa içimi orada\n" +
                                "Baygın kokusu iğdelerin.\n" +
                                "Bilmese tadını kederin\n" +
                                "Bu her alemden uzak ada.\n" +
                                "Konsa rüya dolu köşkümün\n" +
                                "Çiçekli dalına serçeler.\n" +
                                "Renklerle çözülse geceler,\n" +
                                "Nar bahçelerinde geçse gün.\n" +
                                "Her gün aheste mavnaların\n" +
                                "Görsem açıktan geçişini\n" +
                                "Ve her akşam dizilişini\n" +
                                "Ufukta mermer adaların.\n" +
                                "Ne hoş. ey Tanrım, ne hoş,\n" +
                                "İller, göller, kıtalar aşmak.\n" +
                                "Ne hoş deniz deniz dolaşmak\n" +
                                "Düşünceler gibi başıboş.\n" +
                                "Versem kendimi bütün bütün\n" +
                                "Bir yelkenli olup engine;\n" +
                                "Kansam bir an güzelliğine\n" +
                                "Kuşlar gibi serseri ömrün.");
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
                alertDialogBuilder.setTitle("Anlatamıyorum");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ağlasam sesimi duyar mısınız,\n" +
                                "Mısralarımda;\n" +
                                "Dokunabilir misiniz,\n" +
                                "Göz yaşlarıma, ellerinizle?\n" +
                                "\n" +
                                "Bilmezdim şarkıların bu kadar güzel,\n" +
                                "Kelimelerinse kifayetsiz olduğunu\n" +
                                "Bu derde düşmeden önce.\n" +
                                "\n" +
                                "Bir yer var, biliyorum;\n" +
                                "Her şeyi söylemek mümkün;\n" +
                                "Epeyce yaklaşmışım, duyuyorum;\n" +
                                "Anlatamıyorum\n");

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
                alertDialogBuilder.setTitle("Ayrılış");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bakakalırım giden geminin ardından;\n" +
                                "Atamam kendimi denize, dünya güzel;\n" +
                                "Serde erkeklik var, ağlayamam");

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
                alertDialogBuilder.setTitle("Baş Ağrısı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("I\n" +
                                "Yollar ne kadar güzel olsa,\n" +
                                "Gece ne kadar serin olsa,\n" +
                                "Beden yorulur,\n" +
                                "Baş ağrısı yorulmaz.\n" +
                                "II\n" +
                                "Şimdi evime girsem bile\n" +
                                "Biraz sonra çıkabilirim\n" +
                                "Mademki bu esvaplarla ayakkaplar benim\n" +
                                "Ve madem ki sokaklar kimsenin değil.\n");

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
                alertDialogBuilder.setTitle("Bekliyorum");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bekliyorum\n" +
                                "Öyle bir havada gel ki,\n" +
                                "vazgeçmek mümkün olmasın!");

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
                alertDialogBuilder.setTitle("Beni Bu Havalar Mahvetti");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Beni bu güzel havalar mahvetti,\n" +
                                "Böyle havada istifa ettim\n" +
                                "Evkaftaki memuriyetimden.\n" +
                                "Tütüne böyle havada alıştım,\n" +
                                "Böyle havada aşık oldum;\n" +
                                "Eve ekmekle tuz götürmeyi\n" +
                                "Böyle havalarda unuttum;\n" +
                                "Şiir yazma hastalığım\n" +
                                "Hep böyle havalarda nüksetti;\n" +
                                "Beni bu güzel havalar mahvetti.");

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
                alertDialogBuilder.setTitle("Bir Şehri Bırakmak");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bu şehirde yağmur altında dolaşılır\n" +
                                "Limandaki mavnalara bakıp\n" +
                                "Şarkılar mırıldanılır geceleri.\n" +
                                "Bu şehrin sokakları çoktur,\n" +
                                "Binlerce insan gelir gider sokaklarında..\n" +
                                "Her akşam çayımı getiren\n" +
                                "Ve bir Beyaz Rus olmasına rağmen\n" +
                                "Hoşuma giden garson kadın bu şehirdedir.\n" +
                                "\n" +
                                "Bu şehirdedir\n" +
                                "Valsler, foksrotlar altında\n" +
                                "Şuman'dan, Bramsdan\n" +
                                "Parcalar çaldığı zaman dönüp\n" +
                                "Bana bakan ihtiyar piyanist.\n" +
                                "\n" +
                                "Doğduğum köye müşteri taşıyan\n" +
                                "Şirket vapurları bu şehirdedir.\n" +
                                "Hatıralarım bu şehirdedir.\n" +
                                "Sevdiklerim,\n" +
                                "Ölmüşlerimin mezarları.\n" +
                                "\n" +
                                "Bu şehirdedir işim gücüm,\n" +
                                "Ekmek param.\n" +
                                "Fakat bütün bunlara mukabil\n" +
                                "Yine budur başka bir şehirdeki\n" +
                                "Bir kadın yüzünden\n" +
                                "Bıraktığım şehir.");

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
                alertDialogBuilder.setTitle("Ebabil");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Alıp içinde sesler uçuşan bu akşamdan\n" +
                                "Hafızamı bir deniz kıyısına çeken yol,\n" +
                                "Aydınlık rüyaların peşine düşen gondol\n" +
                                "Mavi bir denizde yüzer gibi yanan şamdan.\n" +
                                "\n" +
                                "Tuşların üstünde karanlığın heyulası\n" +
                                "Ve birden kalbe çırpınışlar veren hatıra.\n" +
                                "Çekmede beni saadet dolu dünyalara\n" +
                                "Mine parmaklarında sedalaşan hülyası.\n" +
                                "\n" +
                                "Sıyrılmada gözlerimden yıllarca geceler\n" +
                                "Ve yalnız kalmada bir yaza ram olan sahil,\n" +
                                "Uçuşmada gökyüzünde bir sürü ebabil:\n" +
                                "Sevgimi ve hasretimi ebedi kılan yer.\n" +
                                "\n" +
                                "Açık pancurlarından seslerin dokulusu..\n" +
                                "Bir göl mü ürpermede ruhun uzaklarında?\n" +
                                "En yakın sevgiyi duymayan dudaklarında\n" +
                                "Her yaşayıştan daha güzel olan gülüşü.\n" +
                                "\n" +
                                "Ilık gölgelerde uyutup düşünceleri\n" +
                                "Beyaz etekler ile bana göründüğün an\n" +
                                "Ve kapıları yeşil sabahlara açılan\n" +
                                "Sıcak tahayyüllerle dolu yaz geceleri.\n" +
                                "\n" +
                                "Renkli fanusların altında doğan dünyası,\n" +
                                "Omuzlarında ay ışığından örgülerle\n" +
                                "Eklenmede içime hasret kaldığım yerle\n" +
                                "Mine parmaklarında sadalaşan hülyası.\n");

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
                alertDialogBuilder.setTitle("Galata Kulesi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Alıp içinde sesler uçuşan bu akşamdan\n" +
                                "Hafızamı bir deniz kıyısına çeken yol,\n" +
                                "Aydınlık rüyaların peşine düşen gondol\n" +
                                "Mavi bir denizde yüzer gibi yanan şamdan.\n" +
                                "\n" +
                                "Tuşların üstünde karanlığın heyulası\n" +
                                "Ve birden kalbe çırpınışlar veren hatıra.\n" +
                                "Çekmede beni saadet dolu dünyalara\n" +
                                "Mine parmaklarında sedalaşan hülyası.\n" +
                                "\n" +
                                "Sıyrılmada gözlerimden yıllarca geceler\n" +
                                "Ve yalnız kalmada bir yaza ram olan sahil,\n" +
                                "Uçuşmada gökyüzünde bir sürü ebabil:\n" +
                                "Sevgimi ve hasretimi ebedi kılan yer.\n" +
                                "\n" +
                                "Açık pancurlarından seslerin dokulusu..\n" +
                                "Bir göl mü ürpermede ruhun uzaklarında?\n" +
                                "En yakın sevgiyi duymayan dudaklarında\n" +
                                "Her yaşayıştan daha güzel olan gülüşü.\n" +
                                "\n" +
                                "Ilık gölgelerde uyutup düşünceleri\n" +
                                "Beyaz etekler ile bana göründüğün an\n" +
                                "Ve kapıları yeşil sabahlara açılan\n" +
                                "Sıcak tahayyüllerle dolu yaz geceleri.\n" +
                                "\n" +
                                "Renkli fanusların altında doğan dünyası,\n" +
                                "Omuzlarında ay ışığından örgülerle\n" +
                                "Eklenmede içime hasret kaldığım yerle\n" +
                                "Mine parmaklarında sadalaşan hülyası.\n");

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
                alertDialogBuilder.setTitle("Gelirli Şiir");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İstanbul’dan ayva da gelir, nar gelir\n" +
                                "Döndüm baktım, bir edalı yar gelir,\n" +
                                "Gelir desen dar gelir;\n" +
                                "Gün aşırı alacaklılar gelir.\n" +
                                "Anam\n" +
                                "Dayanamam,\n" +
                                "Bu iş bana zor gelir.");

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
                alertDialogBuilder2.setTitle("Gemilerim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Elifbamın yapraklarında\n" +
                                "Gemilerim, yelkenli gemilerim.\n" +
                                "Giderler yamyamların memleketlerine\n" +
                                "Gemilerim, yan yata yata;\n" +
                                "Gemilerim, kurşunkalemiyle çizilmiş;\n" +
                                "Gemilerim, kırmızı bayraklı.\n" +
                                "Elifbamın yapraklarında\n" +
                                "Kız Kulesi,\n" +
                                "Gemilerim.");

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
                alertDialogBuilder.setTitle("Gülümsüyorum");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("sokakta giderken,kendi kendime\n" +
                                "gülümsediğimin farkına vardığım anlarda\n" +
                                "insanların beni deli zannedeceğini düşünüp\n" +
                                "gülümsüyorum...");

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
                alertDialogBuilder.setTitle("Gün Olur");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Gün olur, alır başımı giderim,\n" +
                                "Denizden yeni çıkmış ağların kokusunda.\n" +
                                "Şu ada senin, bu ada benim,\n" +
                                "Yelkovan kuşlarının peşi sıra.\n" +
                                "Dünyalar vardır, düşünemezsiniz;\n" +
                                "Çiçekler gürültüyle açar;\n" +
                                "Gürültüyle çıkar duman topraktan.\n" +
                                "Hele martılar, hele martılar,\n" +
                                "Her bir tüylerinde ayrı telaş!...\n" +
                                "Gün olur, başıma kadar mavi;\n" +
                                "Gün olur başıma kadar güneş;\n" +
                                "Gün olur, deli gibi...\n");

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
                alertDialogBuilder.setTitle("İstanbulu Dinliyorum");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İstanbul'u dinliyorum, gözlerim kapalı\n" +
                                "Önce hafiften bir rüzgar esiyor;\n" +
                                "Yavaş yavaş sallanıyor\n" +
                                "Yapraklar ağaçlarda;\n" +
                                "Uzaklarda, çok uzaklarda,\n" +
                                "Sucuların hiç durmayan çıngırakları\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı.\n" +
                                "\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı;\n" +
                                "Kuşlar geçiyor, derken;\n" +
                                "Yükseklerden, sürü sürü, çığlık çığlık.\n" +
                                "Ağlar çekiliyor dalyanlarda;\n" +
                                "Bir kadının suya değiyor ayakları;\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı.\n" +
                                "\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı;\n" +
                                "Serin serin Kapalıçarşı\n" +
                                "Cıvıl cıvıl Mahmutpaşa\n" +
                                "Güvercin dolu avlular\n" +
                                "Çekiç sesleri geliyor doklardan\n" +
                                "Güzelim bahar rüzgarında ter kokuları;\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı.\n" +
                                "\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı;\n" +
                                "Başımda eski alemlerin sarhoşluğu\n" +
                                "Loş kayıkhaneleriyle bir yalı;\n" +
                                "Dinmiş lodosların uğultusu içinde\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı.\n" +
                                "\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı;\n" +
                                "Bir yosma geçiyor kaldırımdan;\n" +
                                "Küfürler, şarkılar, türküler, laf atmalar.\n" +
                                "Bir şey düşüyor elinden yere;\n" +
                                "Bir gül olmalı;\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı.\n" +
                                "\n" +
                                "İstanbul'u dinliyorum, gözlerim kapalı;\n" +
                                "Bir kuş çırpınıyor eteklerinde;\n" +
                                "Alnın sıcak mı, değil mi, biliyorum;\n" +
                                "Dudakların ıslak mı, değil mi, biliyorum;\n" +
                                "Beyaz bir ay doğuyor fıstıkların arkasından\n" +
                                "Kalbinin vuruşundan anlıyorum;\n" +
                                "İstanbul'u dinliyorum.");

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
                alertDialogBuilder.setTitle("İnsanlar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Her zaman, fakat, bilhassa\n" +
                                "Beni sevmediğini\n" +
                                "Anladığım zamanlarda\n" +
                                "Görmek isterim seni de\n" +
                                "Annemin kucağından\n" +
                                "Seyrettiğim insanlar gibi,\n" +
                                "Küçüklüğümde...");

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
                alertDialogBuilder.setTitle("Yaşamak");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("I\n" +
                                "\n" +
                                "Biliyorum, kolay değil yaşamak,\n" +
                                "Gönül verip türkü söylemek yar üstüne;\n" +
                                "Yıldız ışığında dolaşıp geceleri,\n" +
                                "Gündüzleri gün ışığında ısınmak;\n" +
                                "Şöyle bir fırsat bulup yarım gün,\n" +
                                "Yan gelebilmek Çamlıca tepesine...\n" +
                                "-Bin türlü mavi akar Boğaz'dan-\n" +
                                "Her şeyi unutabilmek maviler içinde.\n" +
                                "\n" +
                                "II\n" +
                                "\n" +
                                "Biliyorum, kolay değil yaşamak;\n" +
                                "Ama işte\n" +
                                "Bir ölünün hala yatağı sıcak,\n" +
                                "Birinin saati işliyor kolunda.\n" +
                                "Yaşamak kolay değil ya kardeşler,\n" +
                                "Ölmek de değil;\n" +
                                "Kolay değil bu dünyadan ayrılmak.");

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
                alertDialogBuilder.setTitle("Rüya");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Annemi ölmüş gördüm rüyamda.\n" +
                                "Ağlayarak uyanışım\n" +
                                "Hatırlattı bana, bir bayram sabahı\n" +
                                "Gökyüzüne kaçırdığım balonuma bakıp\n" +
                                "Ağlayışımı.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}