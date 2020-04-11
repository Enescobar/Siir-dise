package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sabahattinali extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sabahattinali);
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
                alertDialogBuilder.setTitle("Acaba");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ela gözünden akan\n" +
                                "Ateşli nazarların\n" +
                                "Acaba acımadan\n" +
                                "Kimi yakacak yarın?\n" +
                                "\n" +
                                "Dudakların acaba\n" +
                                "Kimlerle öpüşecek?\n" +
                                "Kimler yarın acaba,\n" +
                                "Tuzağına düşecek?\n" +
                                "\n" +
                                "Anlıyorum, bizlerden\n" +
                                "İntikam alıyorsun.\n" +
                                "Lakin ey kadın bilsen,\n" +
                                "Nasıl alçalıyorsun.");
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
                alertDialogBuilder.setTitle("Aldırma Gönül Aldırma");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Başın öne eğilmesin\n" +
                                "Aldırma gönül aldırma\n" +
                                "Ağladığın duyulmasın\n" +
                                "Aldırma gönül, aldırma\n" +
                                "\n" +
                                "Dışarda deli dalgalar\n" +
                                "Gelip duvarları yalar\n" +
                                "Seni bu sesler oyalar\n" +
                                "Aldırma gönül, aldırma\n" +
                                "\n" +
                                "Görmesen bile denizi\n" +
                                "Yukarıya çevir gözü\n" +
                                "Deniz dibidir gökyüzü\n" +
                                "Aldırma gönül, aldırma\n" +
                                "\n" +
                                "Dertlerin kalkınca şaha\n" +
                                "Bir sitem yolla Allah'a\n" +
                                "Görecek günler var daha\n" +
                                "Aldırma gönül, aldırma\n" +
                                "\n" +
                                "Kurşun ata ata biter\n" +
                                "Yollar gide gide biter\n" +
                                "Ceza yata yata biter\n" +
                                "Aldırma gönül, aldırma");

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
                alertDialogBuilder.setTitle("Bir Doğum Günü İçin");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Başın öne eğilmesin\n" +
                                "Aldırma gönül aldırma\n" +
                                "Ağladığın duyulmasın\n" +
                                "Aldırma gönül, aldırma\n" +
                                "\n" +
                                "Dışarda deli dalgalar\n" +
                                "Gelip duvarları yalar\n" +
                                "Seni bu sesler oyalar\n" +
                                "Aldırma gönül, aldırma\n" +
                                "\n" +
                                "Görmesen bile denizi\n" +
                                "Yukarıya çevir gözü\n" +
                                "Deniz dibidir gökyüzü\n" +
                                "Aldırma gönül, aldırma\n" +
                                "\n" +
                                "Dertlerin kalkınca şaha\n" +
                                "Bir sitem yolla Allah'a\n" +
                                "Görecek günler var daha\n" +
                                "Aldırma gönül, aldırma\n" +
                                "\n" +
                                "Kurşun ata ata biter\n" +
                                "Yollar gide gide biter\n" +
                                "Ceza yata yata biter\n" +
                                "Aldırma gönül, aldırma");

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
                alertDialogBuilder.setTitle("Bütün İnsanlara");
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
                alertDialogBuilder.setTitle("Çakır");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Altın saçlarını sıkıca tarar,\n" +
                                "Sonra iki örgü yana bırakır;\n" +
                                "Ayağında pembe dallı mor şalvar,\n" +
                                "Taze gelin gibi süzülür Çakır...\n" +
                                "\n" +
                                "Beyaz ellerine kına yaraşır,\n" +
                                "Mavi gözleriyle bir içim sudur.\n" +
                                "Efeler onu el üstünde taşır;\n" +
                                "Köyün bir tanecik orospusudur.\n" +
                                "\n" +
                                "Çakır'sız olamaz hiç bir eğlence\n" +
                                "Herkesingönlünü kaplar çünkü sis...\n" +
                                "Bazan mal olsa da iki üç gence,\n" +
                                "Yine Çakır'ını ister her meclis...\n" +
                                "\n" +
                                "Geniş meydanlarda yakılır çıra,\n" +
                                "Çakır nazlı nazlı dokunur 'def'e...\n" +
                                "Süt gibi rakıyı sunar Çakır'a\n" +
                                "Gür bıyıklı, ateş gözlü bir efe...\n" +
                                "\n" +
                                "gitgide açılır sırma cepkenler;\n" +
                                "Kıllı göğüslerinden süzülür rakı.\n" +
                                "Bazan birisinin bağrına girer,\n" +
                                "Elma soymak için alınan çakı...\n" +
                                "\n" +
                                "Çakır yılan gibi döner, kıvrılır\n" +
                                "-Sırma saçlarında fildişi tarak-\n" +
                                "Tabanca çekilir, bıçak sıyrılır,\n" +
                                "O döner elini şıkırdatarak...\n" +
                                "\n" +
                                "Yalnız bazı kere taze gelinler,\n" +
                                "'Bize kocamızı ver! ...diye inler...\n" +
                                "O zaman Çakır'ın gözü doludur...\n" +
                                "\n" +
                                "O zaman gözünün önüne gelen\n" +
                                "Cepheden şehitlik alıp yükselen\n" +
                                "İncecik bıyıklı bir yavukludur...");

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
                alertDialogBuilder.setTitle("Eskisi Gibi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Seneler sürer her günüm,\n" +
                                "Yalnız gitmekten yorgunum;\n" +
                                "Zannetme sana dargınım,\n" +
                                "Ben gene sana vurgunum.\n" +
                                "\n" +
                                "Başkalarına gülsem de,\n" +
                                "Senden uzakta kalsam da,\n" +
                                "Sevmediğini bilsem de\n" +
                                "Ben gene sanavurgunum.\n" +
                                "\n" +
                                "Dağları aşınca başım,\n" +
                                "Geri kaldı her yoldaşım,\n" +
                                "Gerl sevgilim, gel kardaşım,\n" +
                                "Ben gene sana vurgunum.\n" +
                                "\n" +
                                "Gönlüm seninkine yardı,\n" +
                                "Aynı şeyleri duyardı;\n" +
                                "Ayaklarımız uyardı...\n" +
                                "Ben gene sana vurgunum");

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
                alertDialogBuilder.setTitle("Geçmiyor Günler");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Burda çiçekler açmıyor\n" +
                                "kuşlar süzülüp uçmuyor\n" +
                                "yıldızlar ışık saçmıyor\n" +
                                "geçmiyor günler geçmiyor.\n" +
                                "\n" +
                                "avluda volta vururum\n" +
                                "kah düşünür otururum\n" +
                                "türlü hayaller görürüm\n" +
                                "geçmiyor günler geçmiyor.\n" +
                                "\n" +
                                "dışarıda mevsim baharmış\n" +
                                "gezip dolaşanlar varmış\n" +
                                "günler su gibi akarmış\n" +
                                "geçmiyor günler geçmiyor.\n" +
                                "\n" +
                                "gönülde eski sevdalar\n" +
                                "gözümde dereler bağlar\n" +
                                "aynadan hayalin ağlar\n" +
                                "geçmiyor günler geçmiyor.\n" +
                                "\n" +
                                "yanımda yatan yabancı\n" +
                                "her söz zehir gibi acı\n" +
                                "bütün dertlerin en gücü\n" +
                                "geçmiyor günler geçmiyor");

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
                alertDialogBuilder.setTitle("Kara Yazı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Geçmedi yare sözümüz\n" +
                                "yollarda kaldı gözümüz\n" +
                                "yere sürüldü yüzümüz\n" +
                                "böyleymiş karayazımız.\n" +
                                "\n" +
                                "çiçekler açılmaz oldu\n" +
                                "pınarlar içilmez oldu\n" +
                                "yar bize gülmez oldu\n" +
                                "böyleymiş kara yazımız.\n" +
                                "\n" +
                                "yalnız ona yar demiştik\n" +
                                "onda bir şey var demiştik\n" +
                                "o bizi anlar demiştik\n" +
                                "böyleymiş kara yazımız.\n" +
                                "\n" +
                                "hey gönül gene bu gece\n" +
                                "kederim geceden yüce\n" +
                                "gel susalım beraberce\n" +
                                "böyleymiş kara yazımız.");

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
                alertDialogBuilder.setTitle("Kıyamadığım");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Hey bir zaman bakıp bakıp\n" +
                                "Seyrine doyamadığım!\n" +
                                "Şimdi gurbette bırakıp\n" +
                                "Sesini duyamadığım!\n" +
                                "\n" +
                                "Evde kapanıp kaldın mı?\n" +
                                "Seyrana çıkıp güldün mü?\n" +
                                "Başkalarının oldun mu?\n" +
                                "'Benimsin!' diyemediğim!\n" +
                                "\n" +
                                "Akıtıp gözüm yaşını\n" +
                                "Hatırlarım gülüşünü;\n" +
                                "Kıvırcık saçlı başını\n" +
                                "Göğsüme koyamadiğım!\n" +
                                "\n" +
                                "Dik yamaçların selisin,\n" +
                                "Sen benden daha delisin,\n" +
                                "Şimdi kimlerin kulusun?\n" +
                                "Başını eğemediğim!\n" +
                                "\n" +
                                "Nasıl vurgunum bilirdin,\n" +
                                "Niçin benden yüz çevirdin?\n" +
                                "Kimlerin koynuna girdin?\n" +
                                "Öpmeğe kıyamadığım!");

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
                alertDialogBuilder.setTitle("Mayıs");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Mayıs, ayların gülüdür,\n" +
                                "taze bir çiçek dalıdır,\n" +
                                "İçerim ateş doludur;\n" +
                                "Mayıs‘ta gönlüm delidir.\n" +
                                "\n" +
                                "Yeşil dağlara göçülür,\n" +
                                "Kırmızı şaraplar içilir;\n" +
                                "Yarim dökülüp saçılır,\n" +
                                "Mayıs‘ta gönlüm delidir.\n" +
                                "\n" +
                                "Göklere karşı yatılır,\n" +
                                "Dertlerimiz unutulur;\n" +
                                "Eski sevgiler atılır;\n" +
                                "Mayıs‘ta gönlüm delidir.\n" +
                                "\n" +
                                "Uzakta kuşlar seslenir;\n" +
                                "Gönlüm genişler beslenir;\n" +
                                "Yaşamağa heveslenir,\n" +
                                "Mayıs‘ta gönlüm delidir.\n" +
                                "\n" +
                                "Yumuşak rüzgarlar eser;\n" +
                                "Çimenlerde yarim gezer,\n" +
                                "Yanılır, bana gülümser;\n" +
                                "Mayıs‘ta gönlüm delidir.");

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
                alertDialogBuilder2.setTitle("Ruhumun Dalgaları");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Ruhumun dalgaları, koşup kabarmayınız.\n" +
                                "Her damlanız tutuşan göğsüme birer bıçak.\n" +
                                "Kalbim bir kayadır ki, nerdeyse yıkılacak,\n" +
                                "Hayalden köpüklerle kalbimi sarmayınız.\n" +
                                "\n" +
                                "Dümdüz olsam diyorum, ve kumlu bir sahili\n" +
                                "Yalayan sular gibi siz de yavaşlasanız.\n" +
                                "Bilmediğim yeni bir masala başlasanız,\n" +
                                "Çekilse kulağımdan hatıraların dili.\n" +
                                "\n" +
                                "Ey eski günler artık bana yaklaşmayınız,\n" +
                                "Ey hayaller, vurmayın kalbimin sert taşına.\n" +
                                "Bütün bir hayat bile değmez bir göz yaşına,\n" +
                                "Ruhumun dalgaları, köpürüp taşmayınız.");

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
                alertDialogBuilder.setTitle("Rüzgar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Arzularım muayyen bir haddi aşınca\n" +
                                "Ve kulaklar sözlerime sağırlaşınca\n" +
                                "Bir ihtiras duyup vahşi maceralara\n" +
                                "Çıkıyorum bulutları aşan dağlara.\n" +
                                "Tanrıların başı gibi başları diktir,\n" +
                                "Bu dağları saran sonsuz bir genişliktir,\n" +
                                "Ben de katıp vücudumu bu genişliğe,\n" +
                                "Bakıyorum aşağılarda kalan hiçliğe.\n" +
                                "\n" +
                                "Bu dağların bir rakibi varsa rüzgardır.\n" +
                                "Rüzgar burda tek başına bir hükümdardır.\n" +
                                "Burda insan duman gibi genişler, büyür.\n" +
                                "Bu dağlarda ıstıraplar, sevinçler büyür.\n" +
                                "Buralarda her düşünce sona yakındır,\n" +
                                "Burda her şey bizden uzak, ‘O’ na yakındır.\n" +
                                "Burda yoktur insanların düşündükleri,\n" +
                                "Rüzgar siler kafalardan küçüklükleri.\n" +
                                "Yanağıma çarpar geniş kanatlarını,\n" +
                                "Ve anlatır mabutların hayatlarını.\n" +
                                "Arasıra kulağını bana verdi mi,\n" +
                                "Ben de ona anlatırım kendi derdimi.\n" +
                                "\n" +
                                "‘Ey dağların dertlerini dinleyen rüzgar!\n" +
                                "Benim artık yalnız sana itimadım var.\n" +
                                "Gelmiş gibi uzaktaki bir seyyareden\n" +
                                "Yabancıyım bu gürültü dünyasına ben.\n" +
                                "Etrafımın sözlerine aklım ermedi,\n" +
                                "Etrafım da bana asla kulak vermedi.\n" +
                                "Senelerden beri hala anlaşamadık,\n" +
                                "Ben de kestim anlaşmaktan ümidi artık.\n" +
                                "Gözlerimde hakikati sezen bir nurla\n" +
                                "Etrafımı süzüyorum biraz gururla.\n" +
                                "\n" +
                                "Bir dürbünün ters tarafı gibi bu dünya\n" +
                                "En büyük şey, en asil şey küçülür burda.\n" +
                                "Burda yalan para eden biricik iştir,\n" +
                                "Burda her şey bir yapmacık, bir gösteriştir.\n" +
                                "Kimi coşar din uğruna geberir, yalan!\n" +
                                "Kimi gider vatan için can verir, yalan!\n" +
                                "Bir filozof yetmiş eser yazar, yalandır;\n" +
                                "Bir kahraman istibdadı ezer, yalandır.\n" +
                                "Şairlerin büyük aşkı fani bir kızdır,\n" +
                                "Bu dünyada herkes sinsi, herkes cılızdır.\n" +
                                "Ne hakiki aşktan burda bir çakan vardır,\n" +
                                "Ne de onu görse dönüp bir bakan vardır,\n" +
                                "Her büyüklük cüzzam gibi dökülür burda,\n" +
                                "En muazzam ölüm bile küçülür burda.\n" +
                                "\n" +
                                "Benim kafam acayip bir dimağ taşıyor,\n" +
                                "Her dakika insanlardan uzaklaşıyor.\n" +
                                "Zaman zaman mağlup olsam bile etime,\n" +
                                "İnsan olmak dokunuyor haysiyetime.\n" +
                                "Büyük, temiz bir arkadaş arıyor ruhum,\n" +
                                "İşte rüzgar, şimdi sana sığınıyorum!\n" +
                                "Asaletin yeri yoktur gerçi hayatta,\n" +
                                "En asil şey seni buldum kainatta,\n" +
                                "Güneş gibi ne bin türlü ışığın vardır,\n" +
                                "Ne de süse, gösterişe baktığın vardır.\n" +
                                "Deniz gibi muamma yok derinliğinde,\n" +
                                "Bir ferahlık, bir saflık var serinliğinde.\n" +
                                "Bir dev gibi küçük, mızmız sesleri yersin,\n" +
                                "Allah gibi görünmeden hüküm sürersin.\n" +
                                "\n" +
                                "Düşmanıyım ben de cılız güzelliklerin,\n" +
                                "Rüzgar! Bu dağ başlarında çırpınan serin\n" +
                                "Kanatların gökyüzünde akan bir seldir,\n" +
                                "Bana kudret ve cesaret veren bir eldir.\n" +
                                "Beşerlikten uzaktayım senin ülkende,\n" +
                                "Senin gibi azamete aşıkım ben de.\n" +
                                "İşte Rüzgar! Senin gibi ben de deliyim.\n" +
                                "Islıklarım senin gibi inlemelidir,\n" +
                                "Herkes beni ürpererek dinlemelidir.\n" +
                                "Rüzgar! Sana, yalnız sana benzemeliyim.'\n");

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
                alertDialogBuilder.setTitle("Yat ve Uyu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bu karanlık, bu uzun kış gecelerinde...\n" +
                                "Soğuk, buzdan bir perdeyle süslerken camı,\n" +
                                "Dolaşırken birçok siyah gölge odamı,\n" +
                                "Damarımda kurşunlaşıp donarken kanım;\n" +
                                "Yine seni düşünmekle geçer zamanım...\n" +
                                "Bu kimsesiz... Bu mahzun kış gecelerinde...\n" +
                                "\n" +
                                "Serpilirken pencereme avuç avuç kar...\n" +
                                "İçerimde hicranlardan bir nehir akar...\n" +
                                "Karların da lambam gibi rengi sarıdır...\n" +
                                "Onlar yırtık bir mektubun parçalarıdır:\n" +
                                "Rüzgar, sana yazdığımı geri getirdi...\n" +
                                "Pencereden dondurucu bir nefes girdi...\n" +
                                "\n" +
                                "Rüzgar yaptı her çatıda ayrı bir makam...\n" +
                                "Yine senin hayalini gördüm bu akşam...\n" +
                                "Hançeremden alev gibi çıktı bu çığlık:\n" +
                                "-Git istemem! .. Git istemem! .. Çık odamdan çık! ..\n" +
                                "Ah! .. Ne dedim? . Hayır gitme.. Hayır gitme... Gel! ..\n" +
                                "Ben git dedim, dedim ama sen işitme... Gel! ..\n" +
                                "\n" +
                                "Sensin beni en onulmaz yerimden vuran,\n" +
                                "Fakat sensin yine boş ömrü dolduran...\n" +
                                "Bu çılgının senden başka muini var mı? ..\n" +
                                "Gitme... Beni senden başka kimse anlar mı? ..\n" +
                                "Gözlerimi sen ki başka bir ufka açtın...\n" +
                                "Nerdesin ya? .. Nerdesin ya? .. Ah neden kaçtın? ..\n" +
                                "\n" +
                                "Yapyalnızım... Etrafımda yok senden bir iz...\n" +
                                "Odam sessiz... Dışarda yağan kar sessiz...\n" +
                                "Bu geceler dayanılır gibi değil ki...\n" +
                                "Ey şimdi bu satırları okuyan bil ki:\n" +
                                "Istıraplar yüz katlı kış gecelerinde...\n" +
                                "\n" +
                                "Fakat kızgın yanardağlar çıksa bağrımda,\n" +
                                "Senin için ben her derde katlanırım da\n" +
                                "Derim ki: 'Bu gecelerin ızdırabiyle,\n" +
                                "Ben ağlasam, harap olsam, çıldırsam bile;\n" +
                                "Sen ateşli vücudunla ısınan rahat,\n" +
                                "Yatağında bir rahibe saffetiyle yat...\n" +
                                "Yat ve uyu! .. Bu tatlı kış gecelerinde...'");

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
                alertDialogBuilder.setTitle("Öyle Günler Gördüm ki");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Öyle günler gördüm ki, aydın gökler kararıp\n" +
                                "Bahtım bir bulut gibi üstüme çöker oldu,\n" +
                                "Her gözümü yumunca tanıdık yüzler görüp,\n" +
                                "Hayaller alev alev beynimi yakar oldu.\n" +
                                "Ümitsizlik, gariplik dört tarafımı sarıp\n" +
                                "Yüzüm sırıtsa bile, içim yaş döker oldu.\n" +
                                "\n" +
                                "Her sabah ilk ışiklar gözlerimi oyardı,\n" +
                                "Uyanan taş duvarlar iniltimi duyardı.\n" +
                                "\n" +
                                "Öyle günler gördum ki, duvarlar gelir dile,\n" +
                                "Gözumde canlanırdı eşkiya masalları.\n" +
                                "Varlığımı sarardı, hain bir isteyişle\n" +
                                "Görmediğim yumuşak bir düşmanın elleri\n" +
                                "Kafada çelik gibi fikirler dursa bile\n" +
                                "Kalplerin eksik olmaz böyle zayıf halleri:\n" +
                                "\n" +
                                "Bazen kendi kendimin elinden kurtulurdum,\n" +
                                "Kalbimi bir çamurda çırpınırken bulurdum.\n" +
                                "\n" +
                                "Öyle günler gördüm ki, dost dediğim insanlar\n" +
                                "Ben yanına varınca dudağını kıvırdı.\n" +
                                "Bir zamanlar yanımda ağız açmayanlar\n" +
                                "Sırtımı sıvazladı, bana oğüt savurdu.\n" +
                                "Silahsız gördüğüne saldıran kahramanlar\n" +
                                "En alçak tekmelerle beni yere devirdi.\n" +
                                "\n" +
                                "Ruhum bir heykel gibi düşüp parcalanırdı.\n" +
                                "Bu sesleri duyanlar gülüyorum sanırdı.\n" +
                                "\n" +
                                "Öyle günler gördüm ki, tabanca sakağımda\n" +
                                "Tasarladım aydınlık dünyayı bırakmayı\n" +
                                "Gönlüm acıklı buldu, en ateşli çağımda\n" +
                                "Sönük bir yıldız gibi boşluklara akmayı\n" +
                                "Tabancanın namlusu ısındı yanagımda,\n" +
                                "Parmagım istemedi tetiğini çekmeyi\n" +
                                "\n" +
                                "Bir sonbahar yağmuru gibi içim ağlardı\n" +
                                "Bir şeyler fakat beni yaşamağa bağlardı.\n" +
                                "\n" +
                                "Ey bir tane sevgilim, ben bugün yaşıyorsam\n" +
                                "Sanma ki hayat tatlı, insanlar hoş olmustur,\n" +
                                "Dağ başında bir kaya gibiyim şöyle dursam\n" +
                                "Etrafım eskisinden daha bomboş olmuştur\n" +
                                "Yalnız sana borçluyum bugün dünyada varsam:\n" +
                                "Seni her andığımda gözlerim yaş olmuştur\n" +
                                "\n" +
                                "Yaşlar ki bir ırmaktır, dertleri sürür gider,\n" +
                                "Gözyaşları içinde seneler yürür gider.\n" +
                                "\n" +
                                "Yok olmak isteğiyle kalbim attığı zaman,\n" +
                                "Bana: Yaşa der gibi gülen senin yüzündü.\n" +
                                "Dizlerim bir batakta yor");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}