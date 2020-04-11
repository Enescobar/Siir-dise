package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yahyakemal extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yahyakemal);
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
                alertDialogBuilder.setTitle("Akıncılar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bin atlı akınlarda çocuklar gibi şendik\n" +
                                "Bin atlı o gün dev gibi bir orduyu yendik\n" +
                                "\n" +
                                "Haykırdı ak tolgalı beylerbeyi \"ilerle\"\n" +
                                "Bir yaz günü geçtik tunadan kafilelerle\n" +
                                "\n" +
                                "Şimşek gibi atıldık bir semte yedi koldan\n" +
                                "Şimşek gibi Türk atlarının geçtiği yoldan\n" +
                                "\n" +
                                "Bir gün yine doludizgin atlarımızla\n" +
                                "Yerden yedi kat arşa kanatlandık o hızla\n" +
                                "\n" +
                                "Cennette bu gün gülleri açmış görürüzde\n" +
                                "Hala o kızıl hatıra gitmez gözümüzde\n" +
                                "\n" +
                                "Bin atlı akınlarda çocuklar gibi şendik\n" +
                                "Bin atlı o gün dev gibi bir orduyu yendik");
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
                alertDialogBuilder.setTitle("Bir Başka Tepeden");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sana dün bir tepeden baktım aziz İstanbul!\n" +
                                "Görmedim gezmediğim, sevmediğim hiçbir yer.\n" +
                                "Ömrüm oldukça gönül tahtına keyfince kurul!\n" +
                                "Sade bir semtini sevmek bile bir ömre değer.\n" +
                                "\n" +
                                "Nice revnaklı şehirler görünür dünyada,\n" +
                                "Lakin efsunlu güzellikleri sensin yaratan.\n" +
                                "Yaşamıştır derim en hoş ve uzun rüyada\n" +
                                "Sende çok yıl yaşayan, sende ölen, sende yatan.");

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
                alertDialogBuilder.setTitle("Eylül Sonu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Günler kısaldı. Kanlıca'nın ihtiyarları\n" +
                                "Bir bir hatırlamakta geçen sonbalarları.\n" +
                                "\n" +
                                "Yalnız bu semti sevmek için ömrümüz kısa...\n" +
                                "Yazlar yavaşça bitmese, günler kısalmasa...\n" +
                                "\n" +
                                "İçtik bu nadir içki'yi yıllarca kanmadık...\n" +
                                "Bir böyle zevke tek bir ömür yetmiyor, yazık!\n" +
                                "\n" +
                                "Ölmek kaderde var, bize ürküntü vermiyor;\n" +
                                "Lakin vatandan ayrılışın ıztırabı zor.\n" +
                                "\n" +
                                "Hiç dönmemek ölüm gecesinden bu sahile,\n" +
                                "Bitmez bir özleyiştir, ölümden beter bile.");

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
                alertDialogBuilder.setTitle("Hatırlatan");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Hicran, gün ortasında öten bir horoz gibi,\n" +
                                "Seslendi pek vakitsiz... İçim yandı ansızın.\n" +
                                "\n" +
                                "Mazi yosunla örtülü bir göl ki yok gibi,\n" +
                                "Mevsim serin ve bahçede yaprak yığın yığın.\n" +
                                "\n" +
                                "Hicran gün ortasında neden böyle seslenir,\n" +
                                "Birden hatırlatır unutan kalbe sevgiyi?\n" +
                                "\n" +
                                "Keskin bir özleyişle hayal ettiren nedir.\n" +
                                "Bir devre varsa insanın ömründe en iyi?\n" +
                                "\n" +
                                "Ey sevgi anladım bu uzakta seda ile,\n" +
                                "Ömrün yegâne lezzetidir hatıran bile.");

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
                alertDialogBuilder.setTitle("Mehlika Sultan");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Mehlika Sultan'a aşık yedi genç\n" +
                                "Gece şehrin kapısından çıktı:\n" +
                                "Mehlika Sultan'a aşık yedi genç\n" +
                                "Kara sevdalı birer aşıktı.\n" +
                                "\n" +
                                "Bir hayalet gibi dünya güzeli\n" +
                                "Girdiğinden beri rü'yalarına;\n" +
                                "Hepsi meşhur, o muamma güzeli\n" +
                                "Gittiler görmeye Kaf dağlarına.\n" +
                                "\n" +
                                "Hepsi, sırtında aba, günlerce\n" +
                                "Gittiler içleri hicranla dolu;\n" +
                                "Her günün ufkunu sardıkça gece\n" +
                                "Dediler: ''Belki bu son akşamdır''\n" +
                                "\n" +
                                "Bu emel gurbetinin yoktur ucu;\n" +
                                "Daima yollar uzar, kalp üzülür:\n" +
                                "Ömrü oldukça yürür her yolcu,\n" +
                                "Varmadan menzile bir yerde ölür.\n" +
                                "\n" +
                                "Mehlika'nın kara sevdalıları\n" +
                                "Vardılar cikrigi yok bir kuyuya,\n" +
                                "Mehlika'nın kara sevdalıları\n" +
                                "Baktılar korkulu gözlerle suya.\n" +
                                "\n" +
                                "Gördüler: ''Aynada bir gizli cihan..\n" +
                                "Ufku çepçevre ölüm servileri.....''\n" +
                                "Sandılar doğdu içinden bir an\n" +
                                "O, uzun gözlu, uzun saçlı peri.\n" +
                                "\n" +
                                "Bu hazin yolcuların en küçüğü\n" +
                                "Bir zaman baktı o viran kuyuya.\n" +
                                "Ve neden sonra gümüş bir yüzüğü\n" +
                                "Parmağından sıyırıp attı suya.\n" +
                                "\n" +
                                "Su çekilmiş gibi rü'ya oldu!..\n" +
                                "Erdiler yolculuğun son demine;\n" +
                                "Bir hayal alemi peyda oldu\n" +
                                "Göçtüler hep o hayal alemine.\n" +
                                "\n" +
                                "Mehlika Sultan'a aşık yedi genç\n" +
                                "Seneler geçti, henüz gelmediler;\n" +
                                "Mehlika Sultan'a aşık yedi genç\n" +
                                "Oradan gelmeyecekmiş dediler!..\n");

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
                alertDialogBuilder.setTitle("Rindlerin Akşamı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Dönülmez akşamın ufkundayız.Vakit çok geç;\n" +
                                "Bu son fasıldır ey ömrüm nasıl geçersen geç!\n" +
                                "Cihana bir daha gelmek hayal edilse bile,\n" +
                                "Avunmak istemeyiz öyle bir teselliyle.\n" +
                                "Geniş kanatları boşlukta simsiyah açılan\n" +
                                "Ve arkasında güneş doğmayan büyük kapıdan\n" +
                                "Geçince başlayacak bitmeyen sükunlu gece.\n" +
                                "Guruba karşı bu son bahçelerde, keyfince,\n" +
                                "Ya şevk içinde harab ol, ya aşk içinde gönül!\n" +
                                "Ya lale açmalıdır göğsümüzde yahud gül.");

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
                alertDialogBuilder.setTitle("Rindlerin Ölümü");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Hafız'ın kabri olan bahçede bir gül varmış;\n" +
                                "Yeniden her gün açarmış kanayan rengiyle.\n" +
                                "Gece; bülbül ağaran vakte kadar ağlarmış\n" +
                                "Eski Şiraz'ı hayal ettiren ahengiyle.\n" +
                                "\n" +
                                "Ölüm asude bahar ülkesidir bir rinde;\n" +
                                "Gönlü her yerde buhurdan gibi yıllarca tüter.\n" +
                                "Ve serin serviler altında kalan kabrinde\n" +
                                "Her seher bir gül açar;her gece bir bülbül öter.");

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
                alertDialogBuilder.setTitle("Sessiz Gemi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Artık demir almak günü gelmişse zamandan,\n" +
                                "Meçhule giden bir gemi kalkar bu limandan.\n" +
                                "\n" +
                                "Hiç yolcusu yokmuş gibi sessizce alır yol;\n" +
                                "Sallanmaz o kalkışta ne mendil ne de bir kol.\n" +
                                "\n" +
                                "Rıhtımda kalanlar bu seyahatten elemli,\n" +
                                "Günlerce siyah ufka bakar gözleri nemli.\n" +
                                "\n" +
                                "Biçare gönüller. Ne giden son gemidir bu.\n" +
                                "Hicranlı hayatın ne de son matemidir bu.\n" +
                                "\n" +
                                "Dünyada sevilmiş ve seven nafile bekler;\n" +
                                "Bilmez ki, giden sevgililer dönmeyecekler.\n" +
                                "\n" +
                                "Bir çok gidenin her biri memnun ki yerinden.\n" +
                                "Bir çok seneler geçti; dönen yok seferinden");

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
                alertDialogBuilder.setTitle("Tercih");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Dünyada ne ikbal ne servet dileriz\n" +
                                "Hattâ ne de ukbâda saadet dileriz\n" +
                                "Aşkın gül açan bülbül öten vaktinde\n" +
                                "Yaranla tarab yâr ile vuslat dileriz.\n");

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
                alertDialogBuilder.setTitle("Vuslat");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir uykuyu cananla beraber uyuyanlar,\n" +
                                "Ömrün bütün ikbalini vuslatta duyanlar,\n" +
                                "Bir hazzı tükenmez gece sanmakla zamanı,\n" +
                                "Görmezler ufuklarda, şafak söktüğü anı...\n" +
                                "\n" +
                                "Gördükleri ru'ya ezeli bahçedir aşka;\n" +
                                "Her mevsimi bir yaz ve esen ruzgarı başka.\n" +
                                "Bülbülden o eğlencede feryad işitilmez;\n" +
                                "Gül solmayı; mehtab, azalıp gitmeyi bilmez...\n" +
                                "\n" +
                                "Gök kubbesi her lahza, bütün gözlere mavi...\n" +
                                "Zenginler o cennette fakirlerle müsavi;\n" +
                                "Sevdaları hülyalı havuzlarda serinler,\n" +
                                "Sonsuz gibi, bir fiskiye ahengini dinler.\n" +
                                "\n" +
                                "Bir ruh, o derin bahçede bir defa yaşarsa\n" +
                                "Boynunda O'nun kolları, koynunda O varsa,\n" +
                                "Dalmışsa O'nun saçlarının rayihasiyle,\n" +
                                "Sevmekteki efsunu duyar her nefesiyle.\n" +
                                "\n" +
                                "Yıldızları, boydan boya doğmuş gibi, varlık\n" +
                                "Bir mucize halinde o gözlerdendir artık.\n" +
                                "Kanmaz, en uzun buseye, öptükçe susuzdur\n" +
                                "Zira, susatan zevk, o dudaklardakı tuzdur.\n" +
                                "\n" +
                                "İnsan ne yaratmışsa yaratmıştır o tuzdan...\n" +
                                "Bir sır gibidir azçok ilah olduğumuzdan.\n" +
                                "Onlar ki bu güller tutuşan bahçededirler.\n" +
                                "Bir gün nereden hangi tesadüfle gelirler?\n" +
                                "\n" +
                                "Aşk, onları sevkettiği günlerde, kaderden\n" +
                                "Rüzgar gibi bir sevk alır, oldukları yerden.\n" +
                                "Geldikleri yol, ömrün ışıktan yoludur o!\n" +
                                "Alemde bir akşam ne semavi koşudur o!\n" +
                                "\n" +
                                "Dört atlı o gerdune, gelirken dolu dizgin,\n" +
                                "Sevmiş iki ruh ufku görürler daha engin,\n" +
                                "Simaları her lahza parıldar bu zeferle;\n" +
                                "Gök, her tarafından, donanır meş'alerle!\n" +
                                "\n" +
                                "Bir uykuyu cananla beraber uyuyanlar,\n" +
                                "Varlıkta bütün zevki o cennette duyanlar\n" +
                                "Dunyayı unutmuş bulunurken o sularda,\n" +
                                "-Zalim saat ihmal edilen vakti çalar da-\n" +
                                "\n" +
                                "Bir an uyanırlarsa leziz uykulardan,\n" +
                                "Baştanbaşa, heryer kesilir kapkara, zindan...\n" +
                                "Bir faciadır böyle bir alemde uyanmak...\n" +
                                "Günden güne, hicranla bunalmış gibi, yanmak...\n" +
                                "\n" +
                                "Ey tali! Ölümden ne beterdir bu karanlık!\n" +
                                "Ey aşk! O gönüller sana maloldular artık!\n" +
                                "Ey vuslat! O aşıkları efsuna ramet!\n" +
                                "Ey tatlı ve ulvi gece! Yıllarca devam et!");

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
                alertDialogBuilder2.setTitle("Özleyen");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Gönlümle oturdum da hüzünlendim o yerde,\n" +
                                "Sen nerdesin, ey sevgili, yaz günleri nerde!\n" +
                                "Dağlar ağarırken konuşmuştuk tepelerde,\n" +
                                "Sen nerde o fecrin ağaran dağları nerde!\n" +
                                "\n" +
                                "Akşam, güneş artık deniz ufkunda silindi,\n" +
                                "Hulya gibi yalnız gezinenler köye indi\n" +
                                "Ben kaldım, uzaklarda günün sesleri dindi,\n" +
                                "Gönlümle, hayalet gibi, ben kaldım o yerde.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog1 = alertDialogBuilder2.create();

                // alerti gösteriyoruz
                alertDialog1.show();
            }


        });

    }
}