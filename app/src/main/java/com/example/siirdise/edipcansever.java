package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class edipcansever extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edipcansever);
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
                        .setMessage("Dönelim\n" +
                                "Döndürsün bizi\n" +
                                "Kalbin akıp giden bulutlara benzeyen sesi\n" +
                                "Yağmursuz bir yağmura açılmış kapılardan\n" +
                                "Ve akılda kalan bir yokuştan\n" +
                                "Ve yalnız çocuklara özgü o sonsuz sinema koltuklarından\n" +
                                "Ve çocukluktan\n" +
                                "Dönelim\n" +
                                "Dönelim mi biz\n" +
                                "Gençlikten, oralardan\n" +
                                "Mutluluğu bir kabuk gibi saran mutsuzluklardan\n" +
                                "Dönelim mi acıya\n" +
                                "Acıya, büyük acıya\n" +
                                "Ve soralım mı acaba\n" +
                                "Ey büyük yalnızlık insansan eğer\n" +
                                "Bir kaya\n" +
                                "Dalgalar yalarken onu\n" +
                                "O bakarken kaskatı kalabalıklara\n" +
                                "Ah, kalbin bulut bulut akan sesi.\n" +
                                "\n" +
                                "Bütünüyle bir semte benziyor Ruhi Bey\n" +
                                "Binlerce, on binlerce kedinin hep birden kımıldadığı\n" +
                                "Kedilerden örülmüş bir semtte\n" +
                                "Ve soğuk bir tuvalde yerini bulamamış renkler gibi\n" +
                                "Soğuk ve ayakta tutan çelişkileri\n" +
                                "Bir görünümden bir başka görünüme kolayca sıçranan\n" +
                                "Her şeyin, ama her şeyin çok dıştan farkedildiği\n" +
                                "Eh belki de bir satır fazlalığı ya da bir satır eksikliği\n" +
                                "Belki de genç bir şairden ödünç alınan.\n" +
                                "\n" +
                                "Yürüyor mu, yürümeyi mi düşünüyor Ruhi Bey\n" +
                                "Düşünmesi daha mı sonra koyuluyor yola\n" +
                                "Nereye gidecek ama, nereye varacak sanki\n" +
                                "Yoksa bir oyun tadı mı buluyor bunda\n" +
                                "Oyundan atılmaktan korkmayan bir oyuncu gibi\n" +
                                "Boşvermiş de sanki oyunun kurallarına\n" +
                                "Üstelik son bölümde, perdenin kapanmasına\n" +
                                "Azıcık vakit kalmış\n" +
                                "Ya da vakit var daha. Ama ne çıkar\n" +
                                "Gövdenin yazgıya başkaldırması mı\n" +
                                "Ruhi Beyin\n" +
                                "Başkaldırması mı yoksa?\n" +
                                "\n" +
                                "Vaktinden önce anlamanın şaşkınlığı mı\n" +
                                "Vaktinde anlamanın sevinci mi\n" +
                                "Ya da biraz geç kalmanın\n" +
                                "O gereksiz tedirginliği mi\n" +
                                "Hangisi?\n" +
                                "\n" +
                                "Ama belli ki sonundayız her şeyin\n" +
                                "En sonunda.");
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
                alertDialogBuilder.setTitle("Adını Funda Oteli Koy");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Adını funda oteli koy\n" +
                                "Aklından gelip geçen bir yazın\n" +
                                "Ve akşam güneşlerinde orda burda\n" +
                                "Bir deniz kıyısında, eski bir yıkıntıda\n" +
                                "İnce ince gezinen turuncu adamların.\n" +
                                "\n" +
                                "Adını funda oteli koy\n" +
                                "Sevdamızın da adını\n" +
                                "Ayakları dibinde gün batımının.\n" +
                                "Ve ağzında binlerce güneşin tadı\n" +
                                "Dilinin ucunda yalnızca kendi adın.\n" +
                                "\n" +
                                "Çünkü sevdikçe beni sen, kendini tanıdın.");

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
                alertDialogBuilder.setTitle("Anısındayım");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Hafifçe ısırılmış bir elmanın dilimindeyim\n" +
                                "Elmanın kokusundayım\n" +
                                "Anısındayım -kimbilir kimin-\n" +
                                "\n" +
                                "Anılarda görünür, düşlerde görünmez insan\n" +
                                "Düşlerde görünen anlamlardır\n" +
                                "Özelliklerdir bir de belli belirsiz.\n" +
                                "\n" +
                                "Ve\n" +
                                "İnsansız anı yoktur. Var mıdır?");

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
                alertDialogBuilder.setTitle("Başlangıç");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Doğanın bana verdiği bu ödülden\n" +
                                "Çıldırıp yitmemek için\n" +
                                "İki insan gibi kaldım\n" +
                                "Birbiriyle konuşan iki insan.");

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
                alertDialogBuilder.setTitle("Bir Genel Ev Kadını Ve...");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Girdi\n" +
                                "Sırtında eski bir ceket vardı\n" +
                                "Bir yerlerden sızmıştı sanki, gün ışığı gibiydi\n" +
                                "Sarışındı\n" +
                                "Önce bir süre kapının önünde durdu durdu\n" +
                                "Gölgelendi, inceldi, beni gördü\n" +
                                "Pek önemsemedim\n" +
                                "Baktı, hiç konuşmadı\n" +
                                "Oysa bir İsa tasviri gibi uçumluydu, güzeldi\n" +
                                "Yer gösterdim, oturmadı\n" +
                                "Bir sigara yaktım, ona da verdim\n" +
                                "Aldı\n" +
                                "Sigarasını ben yaktım\n" +
                                "Kısa bir gülümseme yürüdü dudaklarından\n" +
                                "Benim dudaklarıma da geçti\n" +
                                "Çocuklar gibi kızardım\n" +
                                "Öteki kızlar gülüştüler\n" +
                                "Ben kendimi sevdim, güvendim\n" +
                                "Saçlarımı düzelttim, göğsümü biraz kapadım\n" +
                                "Bana elini uzattı, ellerimiz birbirine değdi\n" +
                                "Sıcaktı, inceydi, kıskanırım anlatmaya bu eli\n" +
                                "Ağır ağır odama çıktık.\n" +
                                "\n" +
                                "Girdi\n" +
                                "Açık pencereyi kapadım\n" +
                                "Perdeyi çektim\n" +
                                "Arkamı döndüm, yavaş yavaş soyundum\n" +
                                "Bileğimdeki saati çıkardım\n" +
                                "Sigaramı söndürdüm\n" +
                                "Tam o zaman..\n" +
                                "Zaman da değildi belki\n" +
                                "Önce korkunç bir gözyaşı seli\n" +
                                "Sonra alabildiğine bir kayalık\n" +
                                "Kayaların üstünde bir kertenkele\n" +
                                "Ardından bir ormanın uğultusu\n" +
                                "Binlerce kanat sesi\n" +
                                "Sağ elinde bir bıçak\n" +
                                "Yok, hayır, bıçak da değildi\n" +
                                "Vuran, ezen, öldüren bir el\n" +
                                "Ve eller\n" +
                                "Ve dişler\n" +
                                "Kendimden geçtim.\n" +
                                "\n" +
                                "Bir daha gelmedi, hayır, bir daha hiç gelmedi\n" +
                                "Ama onunla ben\n" +
                                "Ne zaman istedimse o zaman yattım.\n");

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
                alertDialogBuilder.setTitle("Buğday");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Düzüldü uçsuz bucaksız alay,\n" +
                                "Çıngıraklar çalar kapılarda.\n" +
                                "Düzüldü uçsuz bucaksız alay,\n" +
                                "Bak, son hasad başladı rüzgarda.\n" +
                                "\n" +
                                "Okundan atılmak üzere yay,\n" +
                                "Kuyuların ağzı genişledi.\n" +
                                "Okundan ayrılmak üzere yay,\n" +
                                "Korku ta kemiğime işledi.\n" +
                                "\n" +
                                "Savruluyor gökyüzünde buğday,\n" +
                                "Gölgeler uzaklaşıyor yerde.\n" +
                                "Savruluyor gökyüzünde buğday,\n" +
                                "Tanrım! tanrım! Bir deva bu derde.\n" +
                                "\n" +
                                "Düzüldü uçsuz bucaksız alay,\n" +
                                "Çıngıraklar çalar kapılarda.\n" +
                                "Düzüldü uçsuz bucaksız alay,\n" +
                                "Bak, son hasad başladı rüzgarda.\n" +
                                "\n" +
                                "Undan bize de pay, bize de pay,\n" +
                                "Koşun, buğday dağıtıyor Yusuf.\n" +
                                "Undan bize de pay, bize de pay,\n" +
                                "Çökmeden sonu gelmiyen küsuf.\n" +
                                "\n" +
                                "Eriyecek tencerede kalay,\n" +
                                "Çocuklar ağlaşmasınlar dağda.\n" +
                                "Eriyecek tencerede kalay,\n" +
                                "Yetişmiyecek Ömer imdada.\n" +
                                "\n" +
                                "Altında aynı eyer, aynı tay;\n" +
                                "Arayıcısı herkes bir sesin.\n" +
                                "Altında aynı eğer, aynı tay;\n" +
                                "Seferi aynı köye herkesin.\n" +
                                "\n" +
                                "Artık kuruldu bu kervansaray,\n" +
                                "Boşuna düşünür ihtiyarlık.\n" +
                                "Artık kuruldu bu kervansaray,\n" +
                                "Şimdi seslerle dolu mezarlık.\n");

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
                alertDialogBuilder.setTitle("Eylülün Sesiyle");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Baylar!\n" +
                                "Bin dokuz yüz seksen birdeyiz\n" +
                                "Karşınızda eylülün sesi\n" +
                                "Ağustosa çekildi, eylülün sesi\n" +
                                "Birazdan konuşacak\n" +
                                "\"Bu dünyada yaşamak can sıkıcı bir şeydir baylar.\"\n" +
                                "\n" +
                                "Tepelerde bulamaçların kahverengi eridiği\n" +
                                "Eriyip sarı sarı aktığı bir mevsim\n" +
                                "Bir saat gibi işlerken avucumdaki güz çiçeği\n" +
                                "Yosunların kapılara usulca\n" +
                                "Tırmanıp yerleştiği\n" +
                                "Yani eylülün sesi, buysa çok iyi baylar.\n" +
                                "\n" +
                                "Yaz geçti, sözgelimi midyelerden yorulduk\n" +
                                "Eni boyu belirsiz bir ıslaklıktan\n" +
                                "Upuzun gündüzlerden, sevimsiz otellerden\n" +
                                "Eylül ki, sorabilir mi\n" +
                                "Hüzünler iç kamaştırıyor, aşklarsa niye yoksul\n" +
                                "Bir asfaltın kuru sıcak soğuğundayız\n" +
                                "Oysa bir deniz feneri mevsimsiz ölür baylar.\n" +
                                "\n" +
                                "Dahası\n" +
                                "Bu düğmesiz giysileri şöylece giymek\n" +
                                "Bir boşluuğu giyinmek mi olur\n" +
                                "Olsun\n" +
                                "İşte karşınızda ekimin sesi\n" +
                                "Kasımın sesi sonra\n" +
                                "Yağmurun eşliğinde -çocuğunu emziriyor yaz-\n" +
                                "Bundan böyle günlerimiz nasıl geçecek baylar.\n" +
                                "\n" +
                                "Her şey o kadar dokunaklı ki\n" +
                                "Eylülsem, istemeden kırılıyorsam bazen\n" +
                                "Dağınık, renksiz bir mozayık gibiysem\n" +
                                "Üstelik yalnızsam bir de -telefonda kuş sesleri-\n" +
                                "Aynalardan duvarlara bir üzünç akıntısı\n" +
                                "Bu dünyada çekingen olmak çok iyi bir şeydir baylar.\n" +
                                "\n" +
                                "Sonra bir kır kahvesi kendini okurken\n" +
                                "Masaları toplanmış, bardakları toplanmış\n" +
                                "Tam kendini okurken\n" +
                                "Derim ki bir semti iyi tanımak kadar\n" +
                                "İyi tanımal dünyayı\n" +
                                "Açın radyolarınızı: eylülün sesi\n" +
                                "Bu dünyada can sıkıntısının bir başka anlamı var baylar.\n" +
                                "\n" +
                                "Elmalar silik silik kırmızı artık -olsun-\n" +
                                "Gözlerimiz tozlanmış, kirli\n" +
                                "Gizlisi yok, bu dünyada böyle sıkılmak iyi\n" +
                                "Sıkılmak iyi baylar\n" +
                                "Biz hazır tuttukça böyle\n" +
                                "İçi yangından alev alev\n" +
                                "Dışı buz tutmuş kalplerimizi.");

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
                alertDialogBuilder.setTitle("Kaktüs");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sonunu istemiyorum sessizliğin\n" +
                                "Yokluğu istemiyorum bu akşamüstü çınlamasında\n" +
                                "Yüzümü dizlerime dayıyorum, bitiştiriyorum\n" +
                                "Kollarımı da\n" +
                                "Bir kaktüs olmalıyım ben, dışıma yağan bir sağnak\n" +
                                "Olmalıyım\n" +
                                "Uçsuz bucaksız dünyada\n" +
                                "Güneşin doğuşunu bekleyen.\n" +
                                "\n" +
                                "Ufukta ansızın bir ışık çizgisi\n" +
                                "Avuçlarımdayım belki.\n");

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
                alertDialogBuilder.setTitle("O Yalnız");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("O kadar ki, o yalnız\n" +
                                "Ona ilk rastladığım bir şeydir aklım\n" +
                                "Bir el sürer mavisini uzağa\n" +
                                "Uzaktan daha uzağa. Ardından\n" +
                                "Yetişir sayısızlığım.\n" +
                                "\n" +
                                "Kuzeyde, ince bir kar dağıtımında\n" +
                                "Çocukların oyun oynamadığı yerlerde\n" +
                                "Bulunmaya hazır ve\n" +
                                "Eski çağlara ait bir parayım.\n" +
                                "\n" +
                                "Aksam, soyulmuş gün ışıkları\n" +
                                "Bölüşülmüş insan yüzü gar\n" +
                                "Sayısız beni toplar bakışlarım\n" +
                                "Dört güneşten biri o. Kendimi tarif edemem\n" +
                                "Güneşler ıslak, soluğum kalın.\n");

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
                alertDialogBuilder.setTitle("Muleta");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Geçtikti bir gün hani\n" +
                                "Ormandan ve aydınlıkların fısıltısından\n" +
                                "Kenti görmeye gittikti yağmurda\n" +
                                "Yürüdüktü dar sokaklarda saatlerce\n" +
                                "Girdikte sonunda yanık yağ kokulu\n" +
                                "Çinko tezgahlı bir meyhaneye\n" +
                                "Göz göze geldikti sevimsiz bir papağanla\n" +
                                "Demiştin o gün bana, anımsıyorum\n" +
                                "Ah, acısız boğulabilir insan.\n" +
                                "\n" +
                                "Eylüldü, mavi donemiydi sanki Picasso'nun\n" +
                                "-Denize inen atlılar-\n" +
                                "Sonra Guernica ve\n" +
                                "'Chat et oiseau'\n" +
                                "Yıl bin dokuz yüz otuz dokuz\n" +
                                "Yas içinde bütün dünya\n" +
                                "Şehirler yanmış yıkılmış\n" +
                                "Gördüktü ne kadar yorgun\n" +
                                "Ne kadar çaresizdi Isa\n" +
                                "Ve demiştin bir gün, anımsıyorum\n" +
                                "Mutsuzluk da boğabilirmiş insani\n" +
                                "Bir gün, akşama doğru, alacakaranlıkta.\n" +
                                "\n" +
                                "Başını menekşeye koydu, uyudu\n" +
                                "Bir güvercin çalılığın orada\n" +
                                "Hani\n" +
                                "Görmeye gittikti güneşli günde\n" +
                                "Parkı ve ördekleri\n" +
                                "Yıllarca sonra. Savaştan\n" +
                                "Ekmek kırıntıları attıktı havuza\n" +
                                "Bir elim omzunda seyrettikti uzun uzun\n" +
                                "Dünyayı ve çiçekleri\n" +
                                "Nedense durgunlaşıverdindi bir ara\n" +
                                "Çok değil, en fazla bir kaç dakika\n" +
                                "Ve dedindi, mutluyken de boğulabilir insan.\n" +
                                "\n" +
                                "İlkyazları sevmiyoruz artık, yaşlandık da ondan mı\n" +
                                "Aşkımızı seyrediyoruz sanki uzaktan\n" +
                                "Oysa yok biten bir şey aramızda, yok da\n" +
                                "Hep aynı kalmıyor ki yakın duygular\n" +
                                "Demiştin bunları bir bir, anımsıyorum\n" +
                                "Mutlu da olsa insan mutsuz da\n" +
                                "Her an yeniden yaratabilirmiş kendini\n" +
                                "Demiştin, bir sabah, bir başka aşkla.\n" +
                                "\n" +
                                "Sen ölüm !\n" +
                                "Seni hiç düşünmeden yaşadık\n" +
                                "Seni hiç düşünmeden yaşayacağız bundan sonra.");

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
                alertDialogBuilder2.setTitle("Saplantı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Sözlerim kendim üstüne\n" +
                                "Gölgem beni istedi\n" +
                                "O ki istedi\n" +
                                "Suyum beni istedi\n" +
                                "O ki istedi\n" +
                                "Cemile beni istedi\n" +
                                "Ne oldu? hiç! alışamadım\n" +
                                "Kartalın bir kayaya çarpısı idi\n" +
                                "\n" +
                                "Soyundum, giyindim, tekrar soyundum\n" +
                                "Arada olacağın düşünü kurdum\n" +
                                "Zevk duydum bundan\n" +
                                "Cemile anlamadı, Cemal hiç anlamadı\n" +
                                "Safiha görmedi ki\n" +
                                "Ve göstermedim\n" +
                                "\n" +
                                "Sözlerim kendim üstüne\n" +
                                "Bir uzak yerlere gitmek üstüne\n" +
                                "Sanki gunler tek bir gune birikti\n" +
                                "Bense çıkmazda kaldim, usandim\n" +
                                "Çıkamazlar da üst üste\n" +
                                "Birikmiş ufuklar kadar derindim\n" +
                                "\n" +
                                "Ve dedim: elbette deneyeceğim.");

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
                alertDialogBuilder.setTitle("Ona Bir Kolye Vermiştim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ona bir kolye vermiştim kendi sözlerinden\n" +
                                "Sürekli bir gülümseyişle yüzümdeki\n" +
                                "Görülmemiş bir ustalıkla acıyı ters yüz eden.\n" +
                                "\n" +
                                "Elbette bir ustalıktır bizim sevgimiz\n" +
                                "Mutlu bir yolcu gibi yol kenarlarındakilere el eden.\n" +
                                "\n" +
                                "Bu kentin her yanını unuttuk\n" +
                                "Kim bilir nerde daha bir postacı olurken.");

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
                alertDialogBuilder.setTitle("Öyledir");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Her sevda başlangıçtır bir yenisine\n" +
                                "Öyledir, her yoğun günün sonu\n" +
                                "Ezip geçer yalnızlığın burukluğunu.\n" +
                                "\n" +
                                "Sen ki kendinden uzak binlerce tepedesin\n" +
                                "Bir kentin alınışını seyreden, onurlu\n" +
                                "Eski bir askerle içicesin.\n" +
                                "\n" +
                                "Kent alındı, gece, şehrayin\n" +
                                "Uzandın bitkin yatağına\n" +
                                "Şurup dursa da dışarıda\n" +
                                "Bıkkınsın, içindeki şenliği itersin.\n" +
                                "\n" +
                                "Sürekli utkulardır mutluluk\n" +
                                "Sustukça duruldukça yitersin.\n" +
                                "\n" +
                                "Sabahtır sümbüller açmış çadırında\n" +
                                "Ellerin bir başka kentin varışlarında.\n");

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
                alertDialogBuilder.setTitle("Yüzümü Size Çeviriyorum");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yüzümü size çeviriyorum, siz misiniz?\n" +
                                "Elimi suya uzatıyorum, siz misiniz?\n" +
                                "Siz misiniz, belki de hiç konuşmuyorum.\n" +
                                "Belki de kim diye sorsalar beni\n" +
                                "Güneşe, çarşıya, kadehe uzatacağım ellerimi\n" +
                                "Belki de alıp başımı gideceğim\n" +
                                "Biliyorsunuz ya bir ağrısı vardır gitmenin\n" +
                                "Nereye, ama nereye olursa gitmenin\n" +
                                "Hüzünle karışık bir ağrısı.");

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
                alertDialogBuilder.setTitle("Cüceler");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Geceler geçmiyor ki, ağır ağır kalıyor\n" +
                                "Hırçın! sızıyor camlardan deli\n" +
                                "Cücelerse şarkı söylüyorlar mutfakta\n" +
                                "Dillerini çatallarıyla yırtarak\n" +
                                "Kandan ve sinirden ürpertilmiş şarkılar.\n" +
                                "\n" +
                                "Yüzümü içime kırbaçlıyorum, korkunç yüzümü\n" +
                                "Gülüyorum orda acıya\n" +
                                "Gülmüyorum bile acıya\n" +
                                "Çok kollu bir deniz hayvanı gibi\n" +
                                "çıldırtıyorum onu şehvetten\n" +
                                "Cüceler şarkı söylüyorlar mutfakta.\n" +
                                "\n" +
                                "İçelim ey cüceler, içelim\n" +
                                "Vaktimiz var nasıl olsa\n" +
                                "Doğacak yeni acılar için.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}