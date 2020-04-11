package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cemalsureya extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cemalsureya);
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
                alertDialogBuilder.setTitle("18 Aralık");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("18 Aralık 1985'te o salonda\n" +
                                "Kişi nasıl kestirebilirdi ileriyi?\n" +
                                "Siz, kazıbilimler, alınyazısıbilimler,\n" +
                                "Geçsin yıllar geçsin, seneler gibi.\n" +
                                "\n" +
                                "Olur mu anımsamamak Onaltıncı Louis'yi\n" +
                                "14 Temmuz 1789 akşamı, Louis,\n" +
                                "Şöyle yazmamış mıydı defterine:\n" +
                                "'Bugün kayda değer bir şey yok..'\n" +
                                "\n" +
                                "'Kehanet' adlı kısacık bir şiir buldum\n" +
                                "Keşke yalnız bunun için sevseydim seni.");
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
                alertDialogBuilder.setTitle("8:10 Vapuru");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sesinde ne var biliyor musun\n" +
                                "Bir bahçenin ortası var\n" +
                                "Mavi ipek kış çiçeği\n" +
                                "Sigara içmek için\n" +
                                "Üst kata çıkıyorsun\n" +
                                "\n" +
                                "Sesinde ne var biliyor musun\n" +
                                "Uykusuz Türkçe var\n" +
                                "İşinden memnun değilsin\n" +
                                "Bu kenti sevmiyorsun\n" +
                                "Bir adam gazetesini katlar\n" +
                                "\n" +
                                "Sesinde ne var biliyor musun\n" +
                                "Eski öpüşler var\n" +
                                "Banyonun buzlu camı\n" +
                                "Birkaç gün görünmedin\n" +
                                "Okul şarkıları var\n" +
                                "\n" +
                                "Sesinde ne var biliyor musun\n" +
                                "Ev dağınıklığı var\n" +
                                "İkide bir elini başına götürüp\n" +
                                "Rüzgarda dağılan yalnızlığını\n" +
                                "Düzeltiyorsun.\n" +
                                "\n" +
                                "Sesinde ne var biliyor musun\n" +
                                "Söyleyemediğin sözcükler var\n" +
                                "Küçücük şeyler belki\n" +
                                "Ama günün bu saatinde\n" +
                                "Anıt gibi dururlar\n" +
                                "\n" +
                                "Sesinde ne var biliyor musun\n" +
                                "Söylenmemiş sözcükler var");

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
                alertDialogBuilder.setTitle("Açılmamış Kapılar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sevdiğin kentlerin selamı sanki\n" +
                                "Sülüs kamyon şoförleri\n" +
                                "Kufi hamallar\n" +
                                "\n" +
                                "Anılar hep sonbaharda gibidir\n" +
                                "astrakan gecede\n" +
                                "süt yıldızlar\n" +
                                "\n" +
                                "Belleğinin yerini tutar kadehindeki\n" +
                                "Taşlar taş kemerler\n" +
                                "İvedi sarmaşıklar\n" +
                                "\n" +
                                "Hayatını sarsan binbir andan\n" +
                                "adlarını yıllara\n" +
                                "veren yargıç krallar\n" +
                                "\n" +
                                "Ne varsa yarım kalmış, geleceğindir\n" +
                                "Bir kez girilmiş sokaklar\n" +
                                "Açılmamış kapılar\n" +
                                "\n" +
                                "Bilir misin iki kökeni var hüznüniyetinin:\n" +
                                "çiçek durumu aşklar,\n" +
                                "yaprak düzeni siyasalar.");

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
                alertDialogBuilder.setTitle("Az Yaşadıksa da");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ben kibriti çaktığım zaman\n" +
                                "Her şey kırmızıydı yüzün olarak\n" +
                                "Ben kibriti çaktığım zaman\n" +
                                "Çünkü her yüz bir memlekettir\n" +
                                "\n" +
                                "Ben sigaramı yaktığım zaman\n" +
                                "Çünkü her sigara bir kelimedir\n" +
                                "Ben sigaramı yaktığım zaman\n" +
                                "Güz günleriydi bir şarkı olarak\n" +
                                "\n" +
                                "Bir güvercin ben öldüğüm zaman\n" +
                                "Nice hüzünlerden yaprak yaprak\n" +
                                "Bir güvercin ben öldüğüm zaman");

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
                alertDialogBuilder.setTitle("Biliyorum Sana Giden");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Biliyorum sana giden yollar kapalı\n" +
                                "Üstelik sen de hiç bir zaman sevmedin beni\n" +
                                "\n" +
                                "Ne kadar yakından ve arada uçurum;\n" +
                                "İnsanlar, evler, aramızda duvarlar gibi\n" +
                                "\n" +
                                "Uyandım uyandım, hep seni düşündüm\n" +
                                "Yalnız seni, yalnız senin gözlerini\n" +
                                "\n" +
                                "Sen Bayan Nihayet, sen ölümüm kalımım\n" +
                                "Ben artık adam olmam bu derde düşeli\n" +
                                "\n" +
                                "Şimdilerde bir köpek gibi koşuyorum ordan oraya\n" +
                                "Yoksa gururlu bir kişiyim aslında, inan ki\n" +
                                "\n" +
                                "Anımsamıyorum yarı dolu bir bardaktan su içtiğimi\n" +
                                "Ve içim götürmez kenarından kesilmiş ekmeği\n" +
                                "\n" +
                                "Kaç kez sana uzaktan baktım 5.45 vapurunda;\n" +
                                "Hangi şarkıyı duysam, bizimçin söylenmiş sanki\n" +
                                "\n" +
                                "Tek yanlı aşk kişiyi nasıl aptallaştırıyor\n" +
                                "Nasıl unutmuşum senin bir başkasını sevdiğini\n" +
                                "\n" +
                                "Çocukça ve seni üzen girişimlerim oldu;\n" +
                                "Bağışla bir daha tekrarlanmaz hiçbiri\n" +
                                "\n" +
                                "Rastlaşmamak için elimden geleni yaparım\n" +
                                "Bu böyle pek de kolay değil gerçi...\n" +
                                "\n" +
                                "Alışırım seni yalnız düşlerde okşamaya;\n" +
                                "Bunun verdiği mutluluk da az değil ki\n" +
                                "\n" +
                                "Çıkar giderim bu kentten daha olmazsa,\n" +
                                "Sensizliğin bir adı olur, bir anlamı olur belki\n" +
                                "\n" +
                                "İnan belli etmem, seni hiç rahatsız etmem,\n" +
                                "Son isteğimi de söyleyebilirim şimdi:\n" +
                                "\n" +
                                "Bir geceyarısı yazıyorum bu mektubu\n" +
                                "Yalvarırım onu okuma çarşamba günleri");

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
                alertDialogBuilder.setTitle("Bir Gün");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir gün seni bırakırım ya\n" +
                                "tütünü bırakmak gibi bir şey olur bu\n" +
                                "Evet, gün geliyor, bıkıyorum senden,\n" +
                                "ama İstanbul'dan bıkmak gibi bir şey olur bu.");

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
                alertDialogBuilder.setTitle("Cigarayı Attım Denize");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Şimdi bir güvercinin uçuşunu bölüyoruz\n" +
                                "Gökyüzünün o meşhur maviliğinde\n" +
                                "Uzun saçlı iri memeli kadınlarıyla\n" +
                                "Bir akdeniz şehri çıkabilir içinde\n" +
                                "Alıp yaracak olsa yüreğini\n" +
                                "Şimdi bir güvercinin\n" +
                                "\n" +
                                "Şimdi sen tam çağındasın yanına varılacak\n" +
                                "Önünde durulacak tam elinden tutulacak\n" +
                                "Hangi bir elinden güzelim hangi bir\n" +
                                "Bir elinde kızlığın duruyor garip huysuz\n" +
                                "Öbür elinde yetişkin bir günışığı\n" +
                                "Daha öbür elinde de kilometrelerce hürlük\n" +
                                "Çalışan insanlar için akşamlara kadar\n" +
                                "Toz duman içinde\n" +
                                "Bir elinde de boyuna ekmek kesiyorsun\n" +
                                "\n" +
                                "Biz eskiden de en aşağı böyleydik senlen\n" +
                                "Bir bulut geçiyorsa onu görürdük\n" +
                                "Bir minarenin keyfine diyecek yoksa onu\n" +
                                "Bir adam boyuna yoksulluk ediyorsa onu\n" +
                                "Ne zaman hürlüğün barışın sevginin aşkına\n" +
                                "Bir cıgara atmışsak denize\n" +
                                "Sabaha kadar yandı durdu");

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
                alertDialogBuilder.setTitle("Eski Kadınlar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Baktık çıldırmak işten değil\n" +
                                "Söndürüp attık cigaramızı\n" +
                                "Baktık olacak gibi değil\n" +
                                "Bir adam düşündük camların arkasında\n" +
                                "Baktık beyaz pardesülü burunlu\n" +
                                "Bir adam birdenbire peydahlandı\n" +
                                "Kaptığımız gibi şapkamızı eski\n" +
                                "O eski kadınları bilirsiniz\n" +
                                "Keder basınca bilhassa hatırlanan\n" +
                                "Sokaklarda yaşanmış veya evde\n" +
                                "Karanlığın ortalık yerinde beyaz\n" +
                                "Ve sevgili olan enine boyuna\n" +
                                "\n" +
                                "Baktık olacak gibi değil\n" +
                                "Kaptık şapkamızı dışarı çıktık\n" +
                                "Ama gel ki kazın ayağı öyle değil\n" +
                                "Baktık değişen bir şey yok ortalıkta\n" +
                                "İki kişi bezik oynuyordu veya tavla\n" +
                                "Birinin zavallı olduğunu gördük\n" +
                                "O zavallı kadınları bilirsiniz\n" +
                                "Sevildimi pekalâ sevilebilen\n" +
                                "Geceyken yağmurluyken hava\n" +
                                "İyice inceltip ufak yüzlerini\n" +
                                "Birebir gelirler yağmura karanlığa\n" +
                                "O eski kadınlar o zavallı");

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
                alertDialogBuilder.setTitle("Lavanta");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Odanız kızkardeşinizdir,\n" +
                                "Büyük Ş'lerle iner giysiniz;\n" +
                                "Bir kez onarılmış anıt mihrap;\n" +
                                "Hemen pencereye geçersiniz.\n" +
                                "\n" +
                                "Bütün şarkıları düşünün,\n" +
                                "Sizin yüzünüz çıkar ortaya,\n" +
                                "Konsolun üstünde yelpaze,\n" +
                                "Yan yana yan yana düşünün ama.\n" +
                                "\n" +
                                "En derin çizgiler, güzelim,\n" +
                                "En tatlı anlardan kalma...\n" +
                                "Değme acı baş edemez\n" +
                                "Hazların lal oyuklarıyla.\n" +
                                "\n" +
                                "Çıkarken yığılan basamaklar\n" +
                                "Kaçıkaçıverirler inerken,\n" +
                                "Beyaz sunağıyla gotik tapınak,\n" +
                                "Eliniz sanki hep tırabzanda.\n" +
                                "\n" +
                                "Bir şeyiniz olayım sizin,\n" +
                                "Hani nasıl isterseniz,\n" +
                                "Oğlunuz, kiracınız, sevgiliniz;\n" +
                                "Dünyanın bir ucuna\n" +
                                "Birlikte gider miyiz?\n" +
                                "\n" +
                                "Bekletilmiş ipeklinizden\n" +
                                "Kopmaya can atar bir düğme;\n" +
                                "Boş verin, o düğme hayın,\n" +
                                "Gider miyiz?\n" +
                                "\n" +
                                "Şimdiye dek düşünmediyseniz\n" +
                                "Bakmayın içinde ne var,\n" +
                                "Küçük bir kitaptır yaşamak\n" +
                                "Elinde tutmaya yarar.");

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
                alertDialogBuilder.setTitle("Mutsuzluk Gülümseyerek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Mutsuzluk gülümseyerek gelir, adıyla süslenmiştir;\n" +
                                "Banliyo treninde rastladığımız\n" +
                                "Sınav saatini kaçırmış liseli kız,\n" +
                                "Hep kazanırsın ey çözümsüzlük!\n" +
                                "\n" +
                                "Ey otobüssever ey Troya yolcusu!\n" +
                                "Anımsarsın günlerce konuşup durmuştuk\n" +
                                "O İB(ipekböceği) sesli kadını;\n" +
                                "Birinin Grönland'ı olmaya hazırlanıyordu.\n" +
                                "\n" +
                                "İki çay söylemiştik orda, biri açık,\n" +
                                "Keşke yalnız bunun için sevseydim seni.");

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
                alertDialogBuilder2.setTitle("Piyale");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Sıra hep son kadehe geliyordu\n" +
                                "Dudakların başkalarının masasında lâle\n" +
                                "Ben boynumdaki ipe bir düğüm daha atıyordum\n" +
                                "Peşinden başka gidecek yer yoktu\n" +
                                "Seni artık hiç sevmediğim halde\n" +
                                "\n" +
                                "Senin o eskisi olmamana imkân yoktu\n" +
                                "Ama inadından yapıyordun bunu Cemile\n" +
                                "İnattandı hep o içip içip gitmeler\n" +
                                "Bense boşalttığın kadehleri satın alıyordum\n" +
                                "Enayilik ettiğimi bile bile\n" +
                                "\n" +
                                "Hele o çıkışın yok mu kapıdan\n" +
                                "O Allahın belâsı herifle\n" +
                                "Başkasının olmayı bir türlü beceremiyordun\n" +
                                "Millet arkandan gülüyordu\n" +
                                "Düştüğün hale...");

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
                alertDialogBuilder.setTitle("Sevgilim Ben Şimdi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sevgilim ben şimdi büyük bir kentte seni düşünmekteyim\n" +
                                "Elimde uçuk mavi bir kalem cebimde iki paket sigara\n" +
                                "Hayatımız geçiyor gözlerimin önünden\n" +
                                "Çıkıp gitmelerimiz, su içmelerimiz, öpüştüklerimiz\n" +
                                "\"Ağlarım aklıma geldikçe gülüştüklerimiz\".\n" +
                                "Çiçekler, çiçekler, su verdim bu sabah çiçeklere\n" +
                                "O gülün yüzü gülmüyor sensiz\n" +
                                "O köklensin diye pencerede suya koyduğun devetabanı\n" +
                                "Hepten hüzünlü bu günlerde\n" +
                                "Gür ve çoşkun bir günışığı dadanmış pencereye\n" +
                                "Masada tabaklar neşesiz\n" +
                                "Koridor ıssız\n" +
                                "Banyoda havlular yalnız\n" +
                                "Mutfak dersen - derbeder ve pis\n" +
                                "Çiti orda duruyor, ekmek kutusu boş\n" +
                                "Vantilatör soluksuz\n" +
                                "Halılar tozlu\n" +
                                "Giysilerim gardropda ve şurda burda\n" +
                                "Memo'nun oyuncak sepeti uykularda\n" +
                                "Mavi gece lambası hevessiz\n" +
                                "Kapı diyor ki açın beni kapayın beni\n" +
                                "Perdeler gömlek değiştiren yılanlar gibi\n" +
                                "Radyo desen sessiz\n" +
                                "Tabure sandalyalardan çekiniyor\n" +
                                "Küçük oda karanlık ve ıssız\n" +
                                "Her şey seni bekliyor her şey gelmeni\n" +
                                "İçeri girmeni\n" +
                                "Senin elinin değmesini\n" +
                                "Gözünün dokunmasını\n" +
                                "Ve her şey tekrarlıyor\n" +
                                "Seni nice sevdiğimi");

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
                alertDialogBuilder.setTitle("Şarap");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Saat onikiden sonra,\n" +
                                "Bütün içkiler\n" +
                                "Şaraptır");

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
                alertDialogBuilder.setTitle("Turgut Uyar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ak odada oturur\n" +
                                "Kapısı penceresinden çok\n" +
                                "\n" +
                                "Gözlerinde yıldızlar\n" +
                                "Serin yerde durur\n" +
                                "\n" +
                                "Bir elinde kadeh\n" +
                                "Öbürünü yarasına bastırır\n" +
                                "\n" +
                                "İnşaattan ses gelir\n" +
                                "Bir şeyi okşar gibidir\n" +
                                "\n" +
                                "Uzanıp durmuş mahcup\n" +
                                "Işığagöçerin şarkısı\n" +
                                "\n" +
                                "Dönülmez dizeler içinde\n" +
                                "Onunkiler gülaçılır\n" +
                                "\n" +
                                "Öldüğü gün\n" +
                                "Hepimizi işten attılar");

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
                alertDialogBuilder.setTitle("Güzelleme");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bak bunlar ellerin senin bunlar ayakların\n" +
                                "Bunlar o kadar güzel ki artık o kadar olur\n" +
                                "Bunlar da saçların işte akşamdan çözülü\n" +
                                "Bak bu sensin çocuğum enine boyuna\n" +
                                "Bu da yatak olduğuna göre altımızdaki\n" +
                                "Sabaha kadar koynumda yatmışsın\n" +
                                "Bak bende yalan yok vallahi billahi\n" +
                                "Sen o kadar güzelsin ki artık o kadar olur\n" +
                                "\n" +
                                "İşe bak sen gözlerinde burda\n" +
                                "Gözlerinin ucu da burda yaşamaya alışık\n" +
                                "İyi ki burda yoksa ben ne yapardım\n" +
                                "Bak çocuğum kolların işte çıplak işte\n" +
                                "Bak gizlisi saklısı kalmadı günümüzün\n" +
                                "Gözlerin sabahın sekizinde bana açık\n" +
                                "Ne günah işlediysek yarı yarıya\n" +
                                "\n" +
                                "Sen asıl bunlara bak bunlar dudakların\n" +
                                "Bunların konuşması olur öpmesi olur\n" +
                                "Seni usulca öpmüştüm ilk öptüğümde\n" +
                                "Vapurdaydık vapur kıyıdan gidiyordu\n" +
                                "Üç kulaç öteden İstanbul gidiyordu\n" +
                                "Uzanmış seni usulca öpmüştüm\n" +
                                "Hemen yanımızda balıklar gidiyordu");

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
                alertDialogBuilder.setTitle("Eski Kadınlar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Baktık çıldırmak işten değil\n" +
                                "Söndürüp attık cigaramızı\n" +
                                "Baktık olacak gibi değil\n" +
                                "Bir adam düşündük camların arkasında\n" +
                                "Baktık beyaz pardesülü burunlu\n" +
                                "Bir adam birdenbire peydahlandı\n" +
                                "Kaptığımız gibi şapkamızı eski\n" +
                                "O eski kadınları bilirsiniz\n" +
                                "Keder basınca bilhassa hatırlanan\n" +
                                "Sokaklarda yaşanmış veya evde\n" +
                                "Karanlığın ortalık yerinde beyaz\n" +
                                "Ve sevgili olan enine boyuna\n" +
                                "\n" +
                                "Baktık olacak gibi değil\n" +
                                "Kaptık şapkamızı dışarı çıktık\n" +
                                "Ama gel ki kazın ayağı öyle değil\n" +
                                "Baktık değişen bir şey yok ortalıkta\n" +
                                "İki kişi bezik oynuyordu veya tavla\n" +
                                "Birinin zavallı olduğunu gördük\n" +
                                "O zavallı kadınları bilirsiniz\n" +
                                "Sevildimi pekalâ sevilebilen\n" +
                                "Geceyken yağmurluyken hava\n" +
                                "İyice inceltip ufak yüzlerini\n" +
                                "Birebir gelirler yağmura karanlığa\n" +
                                "O eski kadınlar o zavallı\n");

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
                alertDialogBuilder.setTitle("İki Kalp");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İki kalp arasında en kısa yol:\n" +
                                "Birbirine uzanmış ve zaman zaman\n" +
                                "Ancak parmak uçlarıyla değebilen\n" +
                                "İki kol.\n" +
                                "\n" +
                                "Merdivenlerin oraya koşuyorum,\n" +
                                "Beklemek gövde gösterisi zamanın;\n" +
                                "Çok erken gelmişim seni bulamıyorum,\n" +
                                "Bir şeyin provası yapılıyor sanki.\n" +
                                "\n" +
                                "Kuşlar toplanmışlar göçüyorlar\n" +
                                "Keşke yalnız bunun için sevseydim seni.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}