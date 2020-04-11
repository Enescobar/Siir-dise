package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nazimhikmet extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nazimhikmek);
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
                alertDialogBuilder.setTitle("Seviyorum Seni");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Seviyorum seni\n" +
                                "ekmeği tuza banıp yer gibi\n" +
                                "Geceleyin ateşler içinde uyanarak\n" +
                                "ağzımı dayayıp musluğa su içer gibi\n" +
                                "Ağır posta paketini\n" +
                                "neyin nesi belirsiz\n" +
                                "telaşlı, sevinçli, kuşkulu açar gibi\n" +
                                "Seviyorum seni\n" +
                                "denizi ilk defa uçakla geçer gibi\n" +
                                "İstanbul'da yumuşacık kararırken ortalık\n" +
                                "içimde kımıldayan birşeyler gibi\n" +
                                "Seviyorum seni\n" +
                                "Yaşıyoruz çok şükür der gibi.");
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
                alertDialogBuilder.setTitle("Mavi Liman");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Çok yorgunum, beni bekleme kaptan.\n" +
                                "Seyir defterini başkası yazsın.\n" +
                                "Çınarlı, kubbeli, mavi bir liman.\n" +
                                "Beni o limana çıkaramazsın...\n");

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
                alertDialogBuilder.setTitle("Aşk Mönüsü");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sen sabahlar ve şafaklar kadar güzelsin\n" +
                                "sen ülkemin yaz geceleri gibisin\n" +
                                "saadetten haber getiren atlı kapını çaldığında\n" +
                                "beni unutma\n" +
                                "ah! saklı gülüm\n" +
                                "sen hem zor hem güzelsin\n" +
                                "şiirlerimin ılıklığında açılmalısın\n" +
                                "sana burada veriyorum hayata ayrılan buseyi\n" +
                                "sen memleketim kadar güzelsin\n" +
                                "ve güzel kal");

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
                alertDialogBuilder.setTitle("Ceviz Ağacı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Başım köpük köpük bulut,\n" +
                                "içim dışım deniz,\n" +
                                "ben bir ceviz ağacıyım Gülhane parkında,\n" +
                                "budak budak, serham serham ihtiyar bir ceviz.\n" +
                                "Ne sen bunun farkındasın, ne polis farkında.\n" +
                                "\n" +
                                "Ben bir ceviz ağacıyım Gülhane parkında,\n" +
                                "Yapraklarım suda balık gibi kıvıl kıvıl.\n" +
                                "Yapraklarım ipek mendil gibi tiril tiril.\n" +
                                "Koparıver, gözlerinin, gülüm, yaşını sil\n" +
                                "Yapraklarım ellerimdir tam yüz bin elim var,\n" +
                                "Yüz bin elle dokunurum sana, Istanbul'a.\n" +
                                "Yapraklarım gözlerimdir.Şaşarak bakarım.\n" +
                                "Yüz bin gözle seyrederim seni, Istanbul'u.\n" +
                                "Yüz bin yürek gibi çarpar, çarpar yapraklarım.\n" +
                                "\n" +
                                "Ben bir ceviz ağacıyım Gülhane parkında,\n" +
                                "Ne sen bunun farkındasın, ne polis farkında");

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
                alertDialogBuilder.setTitle("Kız Çocuğu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Kapıları çalan benim\n" +
                                "kapıları birer birer.\n" +
                                "Gözünüze görünemem\n" +
                                "göze görünmez ölüler.\n" +
                                "\n" +
                                "Hiroşima'da öleli\n" +
                                "oluyor bir on yıl kadar.\n" +
                                "Yedi yaşında bir kızım,\n" +
                                "büyümez ölü çocuklar.\n" +
                                "\n" +
                                "Saçlarım tutuştu önce,\n" +
                                "gözlerim yandı kavruldu.\n" +
                                "Bir avuç kül oluverdim,\n" +
                                "külüm havaya savruldu.\n" +
                                "\n" +
                                "Benim sizden kendim için\n" +
                                "hiçbir şey istediğim yok.\n" +
                                "Şeker bile yiyemez ki\n" +
                                "kâat gibi yanan çocuk.\n" +
                                "\n" +
                                "Çalıyorum kapınızı,\n" +
                                "teyze, amca, bir imza ver.\n" +
                                "Çocuklar öldürülmesin,\n" +
                                "şeker de yiyebilsinler.");

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
                alertDialogBuilder.setTitle("Belki Ben");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Belki ben\n" +
                                "o günden\n" +
                                "çok daha evvel,\n" +
                                "köprü başında sallanarak\n" +
                                "bir sabah vakti gölgemi asfalta salacağım.\n" +
                                "Belki ben\n" +
                                "o günden\n" +
                                "çok daha sonra ,\n" +
                                "matruş çenemde ak bir sakalın izi\n" +
                                "sağ kalacağım...\n" +
                                "Ve ben\n" +
                                "o günden\n" +
                                "çok daha sonra:\n" +
                                "sağ kalırsam eğer,\n" +
                                "şehrin meydan kenarlarında yaslanıp\n" +
                                "duvarlara\n" +
                                "son kavgadan benim gibi sağ kalan\n" +
                                "ihtiyarlara,\n" +
                                "bayram akşamlarında keman\n" +
                                "çalacağım...\n" +
                                "Etrafta mükemmel bir gecenin\n" +
                                "ışıklı kaldırımları\n" +
                                "Ve yeni şarkılar söyleyen\n" +
                                "yeni insanların\n" +
                                "adımları...\n");

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
                alertDialogBuilder.setTitle("Ben Sen O");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("O, yalnız ağaran tanyerini görüyor\n" +
                                "ben, geceyi de\n" +
                                "Sen, yalnız geceyi görüyorsun,\n" +
                                "ben ağaran tanyerinide.");

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
                alertDialogBuilder.setTitle("Ben Senden Önce Ölmek İsterim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ben\n" +
                                "senden önce ölmek isterim.\n" +
                                "Gidenin arkasından gelen\n" +
                                "gideni bulacak mı zannediyorsun?\n" +
                                "Ben zannetmiyorum bunu.\n" +
                                "İyisi mi,beni yaktırırsın,\n" +
                                "odanda ocağın üstüne korsun\n" +
                                "içinde bir kavanozun.\n" +
                                "Kavanoz camdan olsun,\n" +
                                "şeffaf, beyaz camdan olsun\n" +
                                "ki içinde beni görebilesin\n" +
                                "Fedakarlığımı anlıyorsun\n" +
                                "vazgeçtim toprak olmaktan,\n" +
                                "vazgeçtim çiçek olmaktan\n" +
                                "senin yanında kalabilmek için.\n" +
                                "Ve toz oluyorum\n" +
                                "yaşıyorum yanında senin.\n" +
                                "Sonra, sen de ölünce\n" +
                                "kavanozuma gelirsin.\n" +
                                "Ve orada beraber yaşarız\n" +
                                "külümün içinde külün\n" +
                                "ta ki bir savruk gelin\n" +
                                "yahut vefasız bir torun\n" +
                                "bizi ordan atana kadar...\n" +
                                "Ama biz\n" +
                                "o zamana kadar\n" +
                                "o kadar\n" +
                                "karışacağız\n" +
                                "ki birbirimize,\n" +
                                "atıldığımız çöplükte bile zerrelerimiz\n" +
                                "yan yana düşecek.\n" +
                                "Toprağa beraber dalacağız.\n" +
                                "Ve bir gün yabani bir çiçek\n" +
                                "bu toprak parçasından nemlenip filizlenirse\n" +
                                "sapında muhakkak\n" +
                                "iki çiçek açacak :\n" +
                                "biri sen\n" +
                                "biri de ben.\n" +
                                "Ben\n" +
                                "daha ölümü düşünmüyorum.\n" +
                                "Ben daha bir çocuk doğuracağım\n" +
                                "Hayat taşıyor içimden.\n" +
                                "Kaynıyor kanım.\n" +
                                "Yaşayacağım, ama ,çok, pek çok,\n" +
                                "ama sen de beraber.\n" +
                                "Ama ölüm de korkutmuyor beni.\n" +
                                "Yalnız pek sevimsiz buluyorum\n" +
                                "bizim cenaze şeklini.\n" +
                                "Ben ölünceye kadar da\n" +
                                "Bu düzelir herhalde.\n" +
                                "Hapisten çıkmak ihtimalin var mı bugünlerde?\n" +
                                "İçimden bir şey :\n" +
                                "belki diyor.");

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
                alertDialogBuilder.setTitle("Beş Satırla");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Annelerin ninnilerinden\n" +
                                "spikerin okuduğu habere kadar,\n" +
                                "yürekte, kitapta ve sokakta yenebilmek yalanı,\n" +
                                "anlamak, sevgilim, o, bir müthiş bahtiyarlık,\n" +
                                "anlamak gideni ve gelmekte olanı.");

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
                alertDialogBuilder.setTitle("Gözlerin");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Gözlerin gözlerin gözlerin,\n" +
                                "ister hapisaneme, ister hastaneme gel,\n" +
                                "gözlerin gözlerin gözlerin hep güneşte,\n" +
                                "şu Mayıs ayı sonlarında öyledir işte\n" +
                                "Antalya tarafında ekinler seher vakti.\n" +
                                "\n" +
                                "Gözlerin gözlerin gözlerin,\n" +
                                "kaç defa karşımda ağladılar\n" +
                                "çırılçıplak kaldı gözlerin\n" +
                                "altı aylık çocuk gözleri gibi kocaman ve çırılçıplak,\n" +
                                "fakat bir gün bile güneşsiz kalmadılar.\n" +
                                "\n" +
                                "Gözlerin gözlerin gözlerin,\n" +
                                "gözlerin bir mahmurlaşmayagörsün\n" +
                                "sevinçli bahtiyar\n" +
                                "alabildiğine akıllı ve mükemmel\n" +
                                "dillere destan bir şeyler olur dünyaya sevdası insanın.\n" +
                                "\n" +
                                "Gözlerin gözlerin gözlerin,\n" +
                                "sonbaharda öyledir işte kestanelikleri Bursa'nın\n" +
                                "ve yaz yağmurundan sonra yapraklar\n" +
                                "ve her mevsim ve her saat İstanbul.\n" +
                                "\n" +
                                "Gözlerin gözlerin gözlerin,\n" +
                                "gün gelecek gülüm, gün gelecek,\n" +
                                "kardeş insanlar birbirine\n" +
                                "senin gözlerinle bakacaklar gülüm,\n" +
                                "senin gözlerinle bakacaklar.");

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
                alertDialogBuilder2.setTitle("Ne Güzel Şey Hatırlamak Seni");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Ne güzel şey hatırlamak seni:\n" +
                                "ölüm ve zafer haberleri içinden,\n" +
                                "hapiste\n" +
                                "ve yaşım kırkı geçmiş iken...\n" +
                                "\n" +
                                "Ne güzel şey hatırlamak seni:\n" +
                                "bir mavi kumaşın üstünde unutulmuş olan elin\n" +
                                "ve saçlarında\n" +
                                "vakur yumuşaklığı canımın içi İstanbul toprağının...\n" +
                                "İçimde ikinci bir insan gibidir\n" +
                                "seni sevmek saadeti...\n" +
                                "Parmakların ucunda kalan kokusu sarduya yaprağının,\n" +
                                "güneşli bir rahatlık\n" +
                                "ve etin daveti:\n" +
                                "kıpkızıl çizgilerle bölünmüş\n" +
                                "sıcak koyu bir karanlık...\n" +
                                "\n" +
                                "Ne güzel şey hatırlamak seni,\n" +
                                "yazamak sana dair,\n" +
                                "hapiste sırt üstü yatıp seni düşünmek:\n" +
                                "filanca gün, falanca yerde söylediğin söz,\n" +
                                "kendisi değil\n" +
                                "edasındaki dünya...\n" +
                                "\n" +
                                "Ne güzel şey hatırlamak seni.\n" +
                                "Sana tahtadan birşeyler oymalıyım yine:\n" +
                                "bir çekmece\n" +
                                "bir yüzük,\n" +
                                "ve üç metre kadar ince ipekli dokumalıyım.\n" +
                                "Ve hemen\n" +
                                "fırlayarak yerimden\n" +
                                "penceremde demirlere yapışarak\n" +
                                "hürriyetin sütbeyaz maviliğine\n" +
                                "sana yazdıklarımı bağıra bağıra okumalıyım...\n" +
                                "\n" +
                                "Ne güzel şey hatırlamak seni:\n" +
                                "ölüm ve zafer haberleri içinde,\n" +
                                "hapiste\n" +
                                "ve yaşım kırkı geçmiş iken...");

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
                alertDialogBuilder.setTitle("O Mavi Gözlü Bir Devdi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("O mavi gözlü bir devdi.\n" +
                                "Minnacık bir kadın sevdi.\n" +
                                "Kadının hayali minnacık bir evdi,\n" +
                                "bahçesinde ebruliii\n" +
                                "hanımeli\n" +
                                "açan bir ev.\n" +
                                "Bir dev gibi seviyordu dev.\n" +
                                "Ve elleri öyle büyük işler için\n" +
                                "hazırlanmıştı ki devin,\n" +
                                "yapamazdı yapısını,\n" +
                                "çalamazdı kapısını\n" +
                                "bahçesinde ebruliiii\n" +
                                "hanımeli\n" +
                                "açan evin.\n" +
                                "\n" +
                                "O mavi gözlü bir devdi.\n" +
                                "Minnacık bir kadın sevdi.\n" +
                                "Mini minnacıktı kadın.\n" +
                                "Rahata acıktı kadın\n" +
                                "yoruldu devin büyük yolunda.\n" +
                                "Ve elveda! deyip mavi gözlü deve,\n" +
                                "girdi zengin bir cücenin kolunda\n" +
                                "bahçesinde ebruliiii\n" +
                                "hanımeli\n" +
                                "açan eve.\n" +
                                "\n" +
                                "Şimdi anlıyor ki mavi gözlü dev,\n" +
                                "dev gibi sevgilere mezar bile olamaz:\n" +
                                "bahçesinde ebruliiiii\n" +
                                "hanımeli\n" +
                                "açan ev..\n");

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
                alertDialogBuilder.setTitle("Sen Benim Sarhoşluğumsun");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sen benim sarhoşluğumsun\n" +
                                "ne ayıldım\n" +
                                "ne ayılabilirim\n" +
                                "ne ayılmak isterim\n" +
                                "başım ağır\n" +
                                "dizlerim parçalanmış\n" +
                                "üstüm başım çamur içinde\n" +
                                "yanıp sönen ışığına düşe kalka giderim.");

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
                alertDialogBuilder.setTitle("Seni Düşünmek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Seni düşünmek güzel şey, ümitli şey,\n" +
                                "Dünyanın en güzel sesinden\n" +
                                "En güzel şarkıyı dinlemek gibi birşey...\n" +
                                "Fakat artık ümit yetmiyor bana,\n" +
                                "Ben artık şarkı dinlemek değil,\n" +
                                "Şarkı söylemek istiyorum.");

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
                alertDialogBuilder.setTitle("Seni Düşünürüm");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Seni düşünürüm\n" +
                                "Anamın kokusu gelir burnuma\n" +
                                "Dünya güzeli anamın\n" +
                                "\n" +
                                "Binmişsin atlıkarıncasına içimdeki bayramın\n" +
                                "Fırdönersin eteklerinle saçların uçuşur\n" +
                                "Bir yitirip bir bulurum al al olmuş yüzünü\n" +
                                "\n" +
                                "Sebebi ne\n" +
                                "Seni bir bıçak yarası gibi hatırlamamın\n" +
                                "Sen böyle uzakken senin sesini duyup\n" +
                                "Yerimden fırlamamın sebebi ne?\n" +
                                "\n" +
                                "Diz çöküp bakarım ellerine\n" +
                                "Ellerine dokunmak isterim\n" +
                                "Dokunamam\n" +
                                "Arkasından camın\n" +
                                "Ben bir şaşkın seyircisiyim gülüm\n" +
                                "Alaca karanlığımda oynadığım dramın");

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
                alertDialogBuilder.setTitle("Yaşamaya Dair");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yaşamak şakaya gelmez,\n" +
                                "büyük bir ciddiyetle yaşayacaksın\n" +
                                "bir sincap gibi mesela,\n" +
                                "yani, yaşamanın dışında ve ötesinde hiçbir şey beklemeden,\n" +
                                "yani bütün işin gücün yaşamak olacak.\n" +
                                "\n" +
                                "Yaşamayı ciddiye alacaksın,\n" +
                                "yani o derecede, öylesine ki,\n" +
                                "mesela, kolların bağlı arkadan, sırtın duvarda,\n" +
                                "yahut kocaman gözlüklerin,\n" +
                                "beyaz gömleğinle bir laboratuarda\n" +
                                "insanlar için ölebileceksin,\n" +
                                "hem de yüzünü bile görmediğin insanlar için,\n" +
                                "hem de hiç kimse seni buna zorlamamışken,\n" +
                                "hem de en güzel en gerçek şeyin\n" +
                                "yaşamak olduğunu bildiğin halde.\n" +
                                "\n" +
                                "Yani, öylesine ciddiye alacaksın ki yaşamayı,\n" +
                                "yetmişinde bile, mesela, zeytin dikeceksin,\n" +
                                "hem de öyle çocuklara falan kalır diye değil,\n" +
                                "ölmekten korktuğun halde ölüme inanmadığın için,\n" +
                                "yaşamak yanı ağır bastığından.");

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
                alertDialogBuilder.setTitle("Yürümek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yürümek;\n" +
                                "yürümeyenleri arkasında boş sokaklar gibi bırakarak,\n" +
                                "havaları boydan boya yarıp ikiye\n" +
                                "karanlığın gözüne bakarak yürümek..\n" +
                                "yürümek;\n" +
                                "dost omuzbaşlarını omuzlarının yanında duyup,\n" +
                                "kelleni orta yere\n" +
                                "yüreğini yumruklarının içine koyup yürümek ..\n" +
                                "yürümek;\n" +
                                "\n" +
                                "yolunda pusuya yattıklarını,\n" +
                                "arkadan çelme attıklarını bilerek yürümek ..\n" +
                                "yürümek;\n" +
                                "yürekten gülerekten yürümek ...");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}