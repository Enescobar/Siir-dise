package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ahmedarif extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ahmedarif);
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
                alertDialogBuilder.setTitle("Hasretinden Prangalar Eskittim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Seni anlatabilmek seni.\n" +
                                "İyi çocuklara, kahramanlara.\n" +
                                "Seni anlatabilmek seni,\n" +
                                "Namussuza, halden bilmeze,\n" +
                                "Kahpe yalana.\n" +
                                "Ard- arda kaç zemheri,\n" +
                                "Kurt uyur, kuş uyur, zindan uyurdu\n" +
                                "Dışarda gürül- gürül akan bir dünya...\n" +
                                "Bir ben uyumadım,\n" +
                                "Kaç leylim bahar,\n" +
                                "Hasretinden prangalar eskittim.\n" +
                                "Saçlarına kan gülleri takayım,\n" +
                                "Bir o yana\n" +
                                "Bir bu yana...\n" +
                                "Seni bağırabilsem seni,\n" +
                                "Dipsiz kuyulara.\n" +
                                "Akan yıldıza.\n" +
                                "Bir kibrit çöpüne varana.\n" +
                                "Okyanusun en ıssız dalgasına\n" +
                                "Düşmüş bir kibrit çöpüne.\n" +
                                "Yitirmiş tılsımını ilk sevmelerin,\n" +
                                "Yitirmiş öpücükleri,\n" +
                                "Payı yok, apansız inen akşamdan,\n" +
                                "Bir kadeh, bir cigara, dalıp gidene,\n" +
                                "Seni anlatabilsem seni...\n" +
                                "Yokluğun, Cehennemin öbür adıdır\n" +
                                "Üşüyorum, kapama gözlerini...\n");
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
                alertDialogBuilder.setTitle("Akşam Erken İner");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Akşam erken iner mahpusaneye.\n" +
                                "Ejderha olsan kar etmez.\n" +
                                "Ne kavgada ustalığın,\n" +
                                "Ne de çatal yürek civan oluşun.\n" +
                                "Kar etmez, inceden içine dolan,\n" +
                                "Alıp götüren hasrete.\n" +
                                "\n" +
                                "Akşam erken iner mahpusaneye.\n" +
                                "İner, yedi kol demiri,\n" +
                                "Yedi kapıya.\n" +
                                "Birden, ağlamaklı olur bahçe.\n" +
                                "Karşıda, duvar dibinde,\n" +
                                "Üç dal gece sefası,\n" +
                                "Üç kök hercai menekşe...\n" +
                                "\n" +
                                "Aynı korkunç sevdadadır\n" +
                                "Gökte bulut, dalda kaysı.\n" +
                                "Başlar koymağa hapislik.\n" +
                                "Karanlık can sıkıntısı...\n" +
                                "\"Kürdün Gelini\"ni söyler maltada biri,\n" +
                                "Bense volta'dayım ranza dibinde\n" +
                                "Ve hep olmayacak şeyler kurarım,\n" +
                                "Gülünç, acemi, çocuksu...\n" +
                                "\n" +
                                "Vurulsam kaybolsam derim,\n" +
                                "Çırılçıplak, bir kavgada,\n" +
                                "Erkekçe olsun isterim,\n" +
                                "Dostluk da, düşmanlık da.\n" +
                                "Hiçbiri olmaz halbuki,\n" +
                                "Geçer süngüler namluya.\n" +
                                "Başlar gece devriyesi jandarmaların...\n" +
                                "\n" +
                                "Hırsla çakarım kibriti,\n" +
                                "İlk nefeste yarılanır cıgaram,\n" +
                                "Bir duman, kendimi öldüresiye.\n" +
                                "Biliyorum, \"sen de mi?\" diyeceksin,\n" +
                                "Ama akşam erken iniyor mahpusaneye.\n" +
                                "Ve dışarda delikanlı bir bahar,\n" +
                                "Seviyorum seni,\n" +
                                "Çıldırasıya");

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
                alertDialogBuilder.setTitle("Anadolu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Beşikler vermişim Nuh'a\n" +
                                "Salıncaklar, hamaklar,\n" +
                                "Havva Ana'n dünkü çocuk sayılır,\n" +
                                "Anadoluyum ben,\n" +
                                "Tanıyor musun ?\n" +
                                "\n" +
                                "Utanırım,\n" +
                                "Utanırım fukaralıktan,\n" +
                                "Ele, güne karşı çıplak...\n" +
                                "Üşür fidelerim,\n" +
                                "Harmanım kesat.\n" +
                                "Kardeşliğin, çalışmanın,\n" +
                                "Beraberliğin,\n" +
                                "Atom güllerinin katmer açtığı,\n" +
                                "Şairlerin, bilginlerin dünyalarında,\n" +
                                "Kalmışım bir başıma,\n" +
                                "Bir başıma ve uzak.\n" +
                                "Biliyor musun ?\n" +
                                "\n" +
                                "Binlerce yıl sağılmışım,\n" +
                                "Korkunç atlılarıyla parçalamışlar\n" +
                                "Nazlı, seher-sabah uykularımı\n" +
                                "Hükümdarlar, saldırganlar, haydutlar,\n" +
                                "Haraç salmışlar üstüme.\n" +
                                "Ne İskender takmışım,\n" +
                                "Ne şah ne sultan\n" +
                                "Göçüp gitmişler, gölgesiz!\n" +
                                "Selam etmişim dostuma\n" +
                                "Ve dayatmışım...\n" +
                                "Görüyor musun ?\n" +
                                "\n" +
                                "Nasıl severim bir bilsen.\n" +
                                "Köroğlu'yu,\n" +
                                "Karayılanı,\n" +
                                "Meçhul Askeri...\n" +
                                "Sonra Pir Sultanı ve Bedrettini.\n" +
                                "Sonra kalem yazmaz,\n" +
                                "Bir nice sevda...\n" +
                                "Bir bilsen,\n" +
                                "Onlar beni nasıl severdi.\n" +
                                "Bir bilsen, Urfa'da kurşun atanı\n" +
                                "Minareden, barikattan,\n" +
                                "Selvi dalından,\n" +
                                "Ölüme nasıl gülerdi.\n" +
                                "Bilmeni mutlak isterim,\n" +
                                "Duyuyor musun ?\n" +
                                "\n" +
                                "Öyle yıkma kendini,\n" +
                                "Öyle mahzun, öyle garip...\n" +
                                "Nerede olursan ol,\n" +
                                "İçerde, dışarda, derste, sırada,\n" +
                                "Yürü üstüne - üstüne,\n" +
                                "Tükür yüzüne celladın,\n" +
                                "Fırsatçının, fesatçının, hayının...\n" +
                                "Dayan kitap ile\n" +
                                "Dayan iş ile.\n" +
                                "Tırnak ile, diş ile,\n" +
                                "Umut ile, sevda ile, düş ile\n" +
                                "Dayan rüsva etme beni.\n" +
                                "\n" +
                                "Gör, nasıl yeniden yaratılırım,\n" +
                                "Namuslu, genç ellerinle.\n" +
                                "Kızlarım,\n" +
                                "Oğullarım var gelecekte,\n" +
                                "Herbiri vazgeçilmez cihan parçası.\n" +
                                "Kaç bin yıllık hasretimin koncası,\n" +
                                "Gözlerinden,\n" +
                                "Gözlerinden öperim,\n" +
                                "Bir umudum sende,\n" +
                                "Anlıyor musun ?\n");

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
                alertDialogBuilder.setTitle("Ay Karanlık");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Maviye/Maviye çalar gözlerin,\n" +
                                "Yangın mavisine/Rüzgarda asi,\n" +
                                "Körsem/Senden gayrısına yoksam\n" +
                                "Bozuksam/Can benim, düş benim,\n" +
                                "Ellere nesi?\n" +
                                "Hadi gel,\n" +
                                "Ay karanlık...\n" +
                                "İtten aç/Yılandan çıplak,\n" +
                                "Vurgun ve bela\n" +
                                "Gelip durmuşsam kapına\n" +
                                "Var mı ki doymazlığım?\n" +
                                "İlle de ille/Sevmelerim,\n" +
                                "Sevmelerim gibisi?\n" +
                                "Oturmuş yazıcılar\n" +
                                "Fermanım yazar\n" +
                                "N'olur gel,\n" +
                                "Ay karanlık...\n" +
                                "Dört yanım puşt zulası,\n" +
                                "Dost yüzlü,\n" +
                                "Dost gülücüklü\n" +
                                "Cıgaramdan yanar.\n" +
                                "Alnım öperler,\n" +
                                "Suskun, hayın, çıyansı.\n" +
                                "Dört yanım puşt zulası,\n" +
                                "Dönerim dönerim çıkmaz.\n" +
                                "En leylim gecede ölesim tutmuş\n" +
                                "Etme gel,\n" +
                                "Ay karanlık...\n");

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
                alertDialogBuilder.setTitle("Bir Akşamüstüdür");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir akşamüstüdür şarabî\n" +
                                "Bahçeler ve dağlar üzre hükümran;\n" +
                                "Tam dünyayı dolaşmak saatindesin.\n" +
                                "Ay ışığı su içer birazdan.\n" +
                                "Kızarmış kalçalarını çanlar\n" +
                                "Alabildiğine vurur.\n" +
                                "Sen çocuk tulumunda\n" +
                                "Matbaa mürekkebi\n" +
                                "Rüsva olmuş ellerinin emeği,\n" +
                                "Manşetlerde kilometre kilometre yalan\n" +
                                "Sallanır durur.\n" +
                                "\n" +
                                "Bir akşamüstüdür katil, muhteşem\n" +
                                "Alıp götürmüşler dost dediğini\n" +
                                "Almış rüzgârlar içini,\n" +
                                "Ümide benzer, sevdaya benzer...\n" +
                                "Soğuk bir namludur kör ve pusuda\n" +
                                "Ense kökünde zulüm,\n" +
                                "Ve sermiş cânım sofrasını dört başı mâmur\n" +
                                "Burnun dibine hürriyet.\n" +
                                "Seviyorum mümkün değil;\n" +
                                "Aranızda kurşun, yasak bölge var\n" +
                                "Sen genç, sevdan ölünecek kadar güzel\n" +
                                "Kanunu yapanlar ihtiyar.");

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
                alertDialogBuilder.setTitle("Haberin Var Mı Taş Duvar ?");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Haberin var mı taş duvar?\n" +
                                "Demir kapı, kör pencere,\n" +
                                "Yastığım, ranzam, zincirim,\n" +
                                "Uğrunda ölümlere gidip geldiğim\n" +
                                "Zulamdaki mahzun resim.\n" +
                                "Görüşmecim yeşil soğan göndermiş\n" +
                                "Karanfil kokuyor cigaram\n" +
                                "Dağlarına bahar gelmiş memleketimin..\n");

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
                alertDialogBuilder.setTitle("Kalbim Dinamit Kuyusu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Beni, gözlerin götürür\n" +
                                "Gözlerin\n" +
                                "Aşkla, acıyla...\n" +
                                "Kuşatmışlar\n" +
                                "Sesimi, soluğumu\n" +
                                "Kesilmiş\n" +
                                "Tuz-ekmek payım\n" +
                                "Vurgunum\n" +
                                "Ve darda,\n" +
                                "Gözaltındayım.\n" +
                                "Dal, kor keser\n" +
                                "Penceremde açarsa\n" +
                                "Kuş, vurulur\n" +
                                "Üzerimden uçarsa.\n" +
                                "Ve hal böyle böyle,\n" +
                                "Yol bu yöndeyken\n" +
                                "Gelir,\n" +
                                "Ki her gelişinde\n" +
                                "Daha da içten\n" +
                                "Gelir,\n" +
                                "Soluk soluğa\n" +
                                "Benim olursun.\n" +
                                "Amansız sarmasında\n" +
                                "Kollarımın\n" +
                                "Esrik,\n" +
                                "Çığlık çığlığa\n" +
                                "Erir, kar gibi vücudun...\n" +
                                "Nicedir,\n" +
                                "Kahpe ağzında\n" +
                                "Bir salgın,\n" +
                                "Bir deprem gibi künyemiz.\n" +
                                "Nicedir,\n" +
                                "Başımıza zindan dünyamız.\n" +
                                "Biz ki\n" +
                                "Yarınıyız halkın,\n" +
                                "Umudu, yüzakıyız,\n" +
                                "Hıncı, namusu...\n" +
                                "Şafakları,\n" +
                                "Taa şafakları\n" +
                                "Hey canım,\n" +
                                "Kalbim\n" +
                                "Dinamit kuyusu...");

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
                alertDialogBuilder.setTitle("Merhaba");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Gün açar,\n" +
                                "Karın verir yağmurlu toprak.\n" +
                                "İncesu Deresi, merhaba.\n" +
                                "Saçakta serçeler daha çılgındır,\n" +
                                "Bulutlarda kartal,\n" +
                                "Daha çalımlı.\n" +
                                "Koparır göğsünden bir düğme daha,\n" +
                                "Tezkere bekliyen biri.\n" +
                                "İncesu Deresi, merhaba.\n" +
                                "\n" +
                                "Genç bayraklar vardır,\n" +
                                "Barış düşünür,\n" +
                                "Kuyularda işçi mavilikleri.\n" +
                                "Ben hepsini düşünürüm,\n" +
                                "Yirmidört saat\n" +
                                "Ve seni düşünürüm,\n" +
                                "Karanlık, hırslı...\n" +
                                "Seni, cihanların aziz meyvası\n" +
                                "İlan-ı aşk makamından bir mısra,\n" +
                                "Yeşerip, kımıldar içimde,\n" +
                                "Düşer aklıma gözlerin...\n" +
                                "\n" +
                                "Oysa murad alamam.\n" +
                                "Oysa akdan-karadan\n" +
                                "Bilirim, payım bu kadar...\n" +
                                "Unutmuş gülmeyi gözbebeklerim.\n" +
                                "Unutmuş dudaklarım öpmeyi.\n" +
                                "İncesu Deresi, merhaba...");

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
                alertDialogBuilder.setTitle("Sevdan Beni");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Terketmedi sevdan beni,\n" +
                                "Aç kaldım, susuz kaldım,\n" +
                                "Hayın, karanlıktı gece,\n" +
                                "Can garip, can suskun,\n" +
                                "Can paramparça...\n" +
                                "Ve ellerim, kelepçede,\n" +
                                "Tütünsüz, uykusuz kaldım,\n" +
                                "Terketmedi sevdan beni...");

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
                alertDialogBuilder.setTitle("Suskun");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sus, kimseler duymasın,\n" +
                                "Duymasın, ölürüm ha.\n" +
                                "Aymışam yarı gece,\n" +
                                "Seni bulmuşam sonra.\n" +
                                "Seni, kaburgamın altın parçası.\n" +
                                "Seni, dişlerinde elma kokusu\n" +
                                "Bir daha hangi ana doğurur bizi?\n" +
                                "Ruhum... Mısra çekiyorum haberin olsun.\n" +
                                "Çarşıların en küçük meyhanesi bu,\n" +
                                "Saçları yüzümde kardeş, çocuksu.\n" +
                                "Derimizin altında o ölüm namussuzu...\n" +
                                "Ve Ahmedin işi ilk rasgidiyor.\n" +
                                "İlktir dost elinin hançersizliği...\n" +
                                "Ağlıyor yeşil.\n" +
                                "\n" +
                                "Rüya, bütün çektiğimiz.\n" +
                                "Rüya kahrım, rüya zindan.\n" +
                                "Nasıl da yılları buldu,\n" +
                                "Bir mısra boyu maceram...\n" +
                                "Bilmezler nasıl aradık birbirimizi,\n" +
                                "Bilmezler nasıl sevdik,\n" +
                                "İki yitik hasret,\n" +
                                "İki parça can.\n" +
                                "Çatladı yüreği çakmaktaşının,\n" +
                                "Ağıyor gökkuşaklarının serinliğinde\n" +
                                "Çağlardır boğulmuş bir su...\n" +
                                "Ağıyor yeşil.");

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
                alertDialogBuilder2.setTitle("Unutamadığım");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Açardın,\n" +
                                "Yalnızlığımda\n" +
                                "Mavi ve yeşil,\n" +
                                "Açardın,\n" +
                                "Tavşan kanı, kınalı-berrak.\n" +
                                "Yenerdim acıları, kahpelikleri...\n" +
                                "\n" +
                                "Gitmek,\n" +
                                "Gözlerinde gitmek sürgüne.\n" +
                                "Yatmak,\n" +
                                "Gözlerinde yatmak zindanı.\n" +
                                "Gözlerin hani?\n" +
                                "\n" +
                                "\"To be or not to be\" değil.\n" +
                                "\"Cogito ergo sum\" hiç değil...\n" +
                                "Asıl iş, anlamak kaçınılmaz'ı,\n" +
                                "Durdurulmaz çığı\n" +
                                "Sonsuz akımı.\n" +
                                "\n" +
                                "İçmek,\n" +
                                "Gözlerinde içmek ayışığını.\n" +
                                "Varmak,\n" +
                                "Gözlerinde varmak can tılsımına.\n" +
                                "Gözlerin hani?\n" +
                                "\n" +
                                "Canımın gizlisinde bir can idin ki\n" +
                                "Kan değil,sevdamız akardı geceye,\n" +
                                "Sıktıkça cellad,\n" +
                                "Kemendi...\n" +
                                "\n" +
                                "Duymak,\n" +
                                "Gözlerinde duymak üç-ağaçları\n" +
                                "Susmak,\n" +
                                "Gözlerinde susmak,\n" +
                                "Ustura gibi...\n" +
                                "Gözlerin hani?");

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
                alertDialogBuilder.setTitle("Yalnız Değiliz");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir ufka vardık ki artık\n" +
                                "Yalnız değiliz sevgilim.\n" +
                                "Gerçi gece uzun,\n" +
                                "Gece karanlık\n" +
                                "Ama bütün korkulardan uzak.\n" +
                                "Bir sevdadır böylesine yaşamak,\n" +
                                "Tek başına\n" +
                                "Ölüme bir soluk kala,\n" +
                                "Tek başına\n" +
                                "Zindanda yatarken bile,\n" +
                                "Asla yalnız kalmamak.\n" +
                                "\n" +
                                "Şafakları ben balığa çıkarım\n" +
                                "Akan akmayan sularda\n" +
                                "Benim, bütün tezgahlarda paydosa giden\n" +
                                "Bir bahar akşamı dünyada.\n" +
                                "Ben dört duvar arasında değilim\n" +
                                "Pirinçte, pamukta ve tütündeyim,\n" +
                                "Karacadağ, Çukurova ve Cibalide.\n" +
                                "\n" +
                                "Zehirli kör yılanları\n" +
                                "Ve sıtmasıyla\n" +
                                "Gün yirmidört saat insan avında\n" +
                                "Karacadağda çeltikler.\n" +
                                "Bir kız çocuğunun gözyaşı gibi\n" +
                                "- Ayak bileklerinde bir dizi boncuk,\n" +
                                "Sol omzunda nazarlık,\n" +
                                "Dağ başında unutulmuş üşümüş,\n" +
                                "Minicik bir aşiret kızının -\n" +
                                "Damla-damla, berrak olur pirinci.\n" +
                                "Kamyonlarla, katır kervanlarıyla\n" +
                                "Beyler sofrasına gider...\n" +
                                "\n" +
                                "Çukurovam,\n" +
                                "Kundağımız, kefen bezimiz\n" +
                                "Kanı esmer, yüzü ak.\n" +
                                "Sıcağında sabır taşları çatlar,\n" +
                                "Çatlamaz ırgadın yüreği.\n" +
                                "Dilerse buluttan ak,\n" +
                                "Köpükten yumuşak verir pamuğu.\n" +
                                "Külhan, kavgacıdır delikanlısı,\n" +
                                "Ünlü mahpusanelerinde Anadolumun\n" +
                                "En çok Çukurovalılar mahpustur,\n" +
                                "Dostuna yarasını gösterir gibi,\n" +
                                "Bir salkım söğüde su verir gibi,\n" +
                                "Öyle içten\n" +
                                "Öyle derin,\n" +
                                "Türkü söylemek, küfretmek,\n" +
                                "Çukurova yiğidine mahsustur...\n" +
                                "\n" +
                                "Tütünü bilir misin?\n" +
                                "\"Kız saçı\" demiş zeybekler,\n" +
                                "Su içmez her damardan,\n" +
                                "Yerini kolay beğenmez,\n" +
                                "Üşür\n" +
                                "Naz eder,\n" +
                                "Darılır\n" +
                                "İki parmak arasında kıyılmış,\n" +
                                "Bir parçası var kalbimin\n" +
                                "İncecik, ak kağıtlara sarılır,\n" +
                                "Dar vakit yanar da verir kendini.\n" +
                                "Dostun susan dudağına...\n" +
                                "\n" +
                                "Sokaklardan,\n" +
                                "Kıyılardan,\n" +
                                "Gök mavisinden,\n" +
                                "Ekmeğinden,\n" +
                                "Canevinden ayrı düşmeye\n" +
                                "Yani bütün hasretlerin kahrına\n" +
                                "Ve zehrine çaresiz kalmaların,\n" +
                                "İlk nefesi Hızır gibi yetişir\n" +
                                "Cibalide sarılan cıgaranın...\n" +
                                "\n" +
                                "Tütün işçileri yoksul,\n" +
                                "Tütün işçileri yorgun,\n" +
                                "Ama yiğit\n" +
                                "Pırıl - pırıl namuslu.\n" +
                                "Namı gitmiş deryaların ardına\n" +
                                "Vatanımın bir umudu..");

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
                alertDialogBuilder.setTitle("Yurdum Benim Şahdamarım");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Engereğin dişlerine işledim,\n" +
                                "Ağu dişlerine\n" +
                                "Oluklu, çentik...\n" +
                                "Ve vurgun,\n" +
                                "Gözleri bir çift cehennem\n" +
                                "Burnuna kan tütmüş\n" +
                                "Pars bıyığına...\n" +
                                "Dağın pulat yüreğine işledim,\n" +
                                "Şimşeğin masmavi usturasına\n" +
                                "Sevdanı usul-usul\n" +
                                "Sevdanı mısra-mısra\n" +
                                "Lo ben seni hapislerde sevmişim,\n" +
                                "Ben seni sürgünlerde.\n" +
                                "Yurdum benim şahdamarım...\n" +
                                "\n" +
                                "Yücende buzul\n" +
                                "Ve kar,\n" +
                                "Maviş dağ tavşanları\n" +
                                "Gün vuranda alaran\n" +
                                "Zemheri yılanları\n" +
                                "Ve yahut bir hışımla\n" +
                                "Öyle çakılan\n" +
                                "Sonsuzluğun yakışığı kartallar.\n" +
                                "...........\n" +
                                "Başım gözüm üstünesin\n" +
                                "Suskum, avazım üstüne...\n" +
                                "Adından başka silah\n" +
                                "Yazgından başka günah\n" +
                                "Daha yazmamış\n" +
                                "Hiçbir gizli dosyada\n" +
                                "Hiçbir açık kitapta.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });

    }
}