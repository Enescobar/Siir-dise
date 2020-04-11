package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turgutuyar extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turgutuyar );
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
                alertDialogBuilder.setTitle("Akşamüstü Rüyası");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Şimdi gemiler geçer uzaklardan\n" +
                                "Gönlüm güvertede sereserpedir.\n" +
                                "Işıklı geceler,saz sesleri, peynir ekmek\n" +
                                "Ne biletim ne param ne dostum var\n" +
                                "Pır pır eder yüreğim bakındıkça...\n" +
                                "-Uyan Turgut um, garibim, uyan Bura Terme'dir.\n" +
                                "\n" +
                                "Terme köprüsünden kamyonlar geçer,\n" +
                                "Irgatlar üç orada beş burada konuşurlar\n" +
                                "Bir gece başlar, yarı siyah, yarı kırmızı\n" +
                                "Cigaramı yakar evime dönerim...\n" +
                                "-Gidin gemiler, gidin\n" +
                                "Vardığınız yerlere selam edin\n" +
                                "Gün olur bütün kaygılardan uzak\n" +
                                "Ben de gelirim...");
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
                alertDialogBuilder.setTitle("Aramızda ki");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("sevgilim sevgilim\n" +
                                "kuzey sanrısı gibidir\n" +
                                "geceyi beşe filan böler\n" +
                                "sonra ayılar hüzünden ölmez\n" +
                                "sevgilim sevgilim\n" +
                                "açlıktan ölür onlar\n" +
                                "\n" +
                                "işte bundan ötürü\n" +
                                "hüznü artık bir ayıya bıraktım\n" +
                                "sevgilim sevgilim\n" +
                                "bir ayıya\n" +
                                "ister ormanda kullansın\n" +
                                "ister buzdağında\n" +
                                "\n" +
                                "hayatın kutlu olsun sevgilim\n" +
                                "ki sana değişe değişe aktım\n" +
                                "kimi zaman bir japon gibi uykusuz kaldım\n" +
                                "-uykusuz kalır mı onlar bilmem aslında-\n" +
                                "sevgilim sevgilim\n" +
                                "bir orman gibi çoğal aramızda\n" +
                                "şehirden bir çocuk olarak şurda burda\n" +
                                "bir sabuntozu markasında köpürerek\n" +
                                "çınarın tutsaklığını\n" +
                                "ve menekşenin tutsaklığını\n" +
                                "ve menekşenin sevincini yaşa\n" +
                                "sevgilim sevgilim\n" +
                                "hüzüne yer var hayatımızda\n");

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
                alertDialogBuilder.setTitle("Biliyor musun");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("biliyor musun\n" +
                                "aşk şiiri yazmaktan bıktım\n" +
                                "bir gün şöyle bir baktım\n" +
                                "yazdığım bütün şiirler öyle\n" +
                                "bir sarsılma, nedir bu\n" +
                                "bir otuz aşk şiiri daha\n" +
                                "kendimi hiç suçlamadım\n" +
                                "\n" +
                                "peki o zaman ben neden\n" +
                                "dereceler sokayım koltuğumun altına\n" +
                                "ateşim varsa zaten\n" +
                                "ey gözleri maden\n" +
                                "çünkü aşk bir suçlamadır\n" +
                                "sonuna kadar yaşanmamışsa\n" +
                                "bir bardak birada yeni bir deniz\n" +
                                "ve yağmur\n" +
                                "eski bir denizde yeni bir ada\n" +
                                "yaşanmamışsa\n" +
                                "\n" +
                                "sözgelimi Galata'dan Afrika'ya gidiyordum\n" +
                                "korsanları kralları ve bazı ülkeleri\n" +
                                "ve bütün madenleri\n" +
                                "ve kendi sonumu\n" +
                                "iyi görmüyordum sonunda\n" +
                                "her türlü madeni\n" +
                                "elimde bir sürü kağıtla\n" +
                                "hazırladım kendimi");

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
                alertDialogBuilder.setTitle("Bir İntihar Akşamı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Kısacık yoğun bir akşam\n" +
                                "herkesin yüzünün bir anıya karıştığı\n" +
                                "yoğun bir akşam\n" +
                                "bana bir memur gibi davrandılar hastanelerde\n" +
                                "ve bir intihar üstüne söylenti\n" +
                                "bütün kıyıları dolaştı durdu\n" +
                                "kısacık bir akşam\n" +
                                "\n" +
                                "Kısacık serin bir akşam\n" +
                                "kelebeklerin atlarla yarıştığı\n" +
                                "yoğun bir akşam\n" +
                                "bazı mektuplar damgalandı postanelerde\n" +
                                "oturuldu bir takım şarkılar söylendi\n" +
                                "bir adam bir kadının kapısını vurdu\n" +
                                "kısacık bir akşam\n" +
                                "\n" +
                                "Neyi söylesem bir kahramanlıktı\n" +
                                "içinde azıcık buluştuğumuz\n" +
                                "bir bulutla bir kağıt peçete arasında\n" +
                                "kısacık yoğun bir akşam\n" +
                                "şaşırdım hüznümü nerelere bıraksam\n" +
                                "bir yanda kasıklarımın sarsılmaz gücü ve\n" +
                                "kısacık yoğun bir akşam\n" +
                                "\n" +
                                "Her şey bir unutkanlıktı\n" +
                                "arada bir deliler gibi kavuştuğumuz\n" +
                                "tüfekle vurulmuş bir parsın yarasında\n" +
                                "kısacık yoğun bir akşam\n" +
                                "biliyordum bir soğuktu nereye varsam\n" +
                                "bir yanımda bir el bir yanda vazgeçilmez bir sancı ve\n" +
                                "kısacık yoğun bir akşam.\n" +
                                "\n" +
                                "Kim karıştırdı gerçekliğine\n" +
                                "yaşadığım sonsuzluğun\n" +
                                "ve oturuldu bir takım şeyler söylendi\n" +
                                "imla kurallarıyla mutsuzluk üstüne\n" +
                                "kısacık bir akşam\n" +
                                "duraladım ne yapsam\n" +
                                "\n" +
                                "Kim karıştırdı gerçekliğine\n" +
                                "su terazilerindeki ensizliğin\n" +
                                "ve fotoğraflar çekildi ben çıkmadım herkes eğlendi\n" +
                                "araba vapurlarıyla denizsizlik üstüne\n" +
                                "kısacık bir akşam\n" +
                                "o kadar kısa ki bir akşam\n" +
                                "\n" +
                                "yüzümü suyun ardında buldum\n" +
                                "kıyılar bu yüzdendir öyle dediler\n" +
                                "kısacık yoğun bir akşam\n" +
                                "serin bir akşam öyle söylediler...\n");

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
                alertDialogBuilder.setTitle("Çok Üşümek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir Kalır uzun resimlerde anısı sakallarımızın\n" +
                                "Urban içinde Üşüyüp Üşüyüp kaldığımızın\n" +
                                "\n" +
                                "Bir Kalır yanık yağlar yataklarda o oteller\n" +
                                "Meydanlar heykeller sizin olmadığınız o her yer\n" +
                                "\n" +
                                "O çok yalınç gerçekli gelip gitmeler\n" +
                                "\n" +
                                "Bir Kalır uzun duvarlar ve onların dipleri\n" +
                                "Bir Kalır Yılgın Adamların hep \"Evet\" dedikleri\n" +
                                "\n" +
                                "Çok üşürdük hep üşürdük üşümekti bütün yaşadığımız\n" +
                                "Üşürdü ellerimiz aşkımız sonsuz uzun sakallarımız\n" +
                                "\n" +
                                "Tükenir dağınık diriliği kaşıntımızın bir gün\n" +
                                "Bir Kalır uzun kitaplarda anısı çok Üşüdüğümüzün\n");

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
                alertDialogBuilder.setTitle("Denge");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sizin alınız al inandım\n" +
                                "Sizin morunuz mor inandım\n" +
                                "Tanrınız büyük amenna\n" +
                                "Şiiriniz adamakıllı şiir\n" +
                                "Dumanı da caba\n" +
                                "\n" +
                                "Bütün ağaçlarla uyuşmuşum\n" +
                                "Kalabalık ha olmuş ha olmamış\n" +
                                "Sokaklarda yitirmiş cebimde bulmuşum\n" +
                                "Ama sokaklar şöyleymiş\n" +
                                "Ağaçlar böyleymiş\n" +
                                "Ama sizin adınız ne\n" +
                                "Benim dengemi bozmayınız\n" +
                                "\n" +
                                "Aşkım da değişebilir gerçeklerim de\n" +
                                "Pırıl pırıl dalgalı bir denize karşı\n" +
                                "Yangelmişim diz boyu sulara\n" +
                                "Hepinize iyiniyetle gülümsüyorum\n" +
                                "Hiçbirinizle dövüşemem\n" +
                                "Benim bir gizli bildiğim var\n" +
                                "Sizin alınız al inandım\n" +
                                "Morunuz mor inandım\n" +
                                "Ben tam kendime göre\n" +
                                "Ben tam dünyaya göre\n" +
                                "Ama sizin adınız ne\n" +
                                "Benim dengemi bozmayınız\n");

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
                alertDialogBuilder.setTitle("Göğe Bakma Durağı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İkimiz birden sevinebiliriz göğe bakalım\n" +
                                "Şu kaçamak ışıklardan şu şeker kamışlarından\n" +
                                "Bebe dişlerinden güneşlerden yaban otlarından\n" +
                                "Durmadan harcadığım şu gözlerimi al kurtar\n" +
                                "Şu aranıp duran korkak ellerimi tut\n" +
                                "Bu evleri atla bu evleri de bunları da\n" +
                                "Göğe bakalım\n" +
                                "\n" +
                                "Falanca durağa şimdi geliriz göğe bakalım\n" +
                                "İnecek var deriz otobüs durur ineriz\n" +
                                "Bu karanlık böyle iyi aferin tanrıya\n" +
                                "Herkes uyusun iyi oluyor hoşlanıyorum\n" +
                                "Hırsızlar polisler açlar toklar uyusun\n" +
                                "Herkes uyusun bir seni uyutmam bir de ben uyumam\n" +
                                "Herkes yokken biz oluruz biz uyumayalım\n" +
                                "Nasıl olsa sarhoşuz nasıl olsa öpüşürüz sokaklarda\n" +
                                "Beni bırak göğe bakalım\n" +
                                "\n" +
                                "Senin bu ellerinde ne var bilmiyorum göğe bakalım\n" +
                                "Tuttukça güçleniyorum kalabalık oluyorum\n" +
                                "Bu senin eski zaman gizlerin yalnız gibi ağaçlar gibi\n" +
                                "Sularım ısınsın diye bakıyorum ısınıyor\n" +
                                "Seni aldım bu sunturlu yere getirdim\n" +
                                "Sayısız penceren vardı bir bir kapattım\n" +
                                "Bana dönesin diye bir bir kapattım\n" +
                                "Şimdi otobüs gelir biner gideriz\n" +
                                "Dönmeyeceğimiz bir yer beğen başka türlüsü güç\n" +
                                "Bir ellerin bir ellerim yeter belliyelim yetsin\n" +
                                "Seni aldım bana ayırdım durma kendini hatırlat\n" +
                                "Durma kendini hatırlat\n" +
                                "Durma göğe bakalım");

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
                alertDialogBuilder.setTitle("Kan Uyku");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir biz varız güzel öbürleri hep çirkin\n" +
                                "Birde bu terli karanlık\n" +
                                "Sonra bir şey daha var muhakkak ama adını bilmiyorum\n" +
                                "Nereden başlasam sonunda o ışıkla karşılaşıyorum\n" +
                                "Yarı çıplak utanmaz bir kadın resmini aydınlatıyor\n" +
                                "Akşam oluyor ya bir türlü inanamıyorum\n" +
                                "Oturmuş iri yapılı adamlar esrar çekiyorlar\n" +
                                "Daha bir aydınlık olsun diye içtikleri su\n" +
                                "Sarı toprakdan testileri güneşte pişiriyorlar\n" +
                                "\n" +
                                "Bir korkuyorum yanlız kalmaktan bir korkuyorum\n" +
                                "Gündüzleri delice çalışıyorum geceleri kadınlarla yatıyorum\n" +
                                "\n" +
                                "Sonra birden büyümüş görüyorum ağaçları\n" +
                                "Kısrakları birden yavrulamış\n" +
                                "Havaları birden güneşli\n" +
                                "\n" +
                                "Kadınlarla yattığım yetse ya\n" +
                                "Birde kadınlarla yattığıma inanmam gerekiyor\n" +
                                "\n" +
                                "Hoşlanmıyorum");

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
                alertDialogBuilder.setTitle("Kimsede Görmediğim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Kimsede görmediğim bir şiir\n" +
                                "yüzü al ve akşamı aşıyor\n" +
                                "Eski bir tanrı gibi kendi dininde\n" +
                                "Uzun süren bir dönemi düşlüyor olmalı\n" +
                                "İçindeki bir içkinin sıcaklığında\n" +
                                "Suskunluğu bir başkaldırı olmalı\n" +
                                "Elleri ayakları sinemalara bulaşmış\n" +
                                "Romanlara bulaşmış\n" +
                                "Genel helalara bulaşmış\n" +
                                "Dağları iyi bilmediğinden\n" +
                                "Denizleri anımsamış olmalı\n" +
                                "Gözleri o yüzden çırpıntılı\n" +
                                "\n" +
                                "Kara başlıklı geçmiş,\n" +
                                "Sonsuz gelecek\n" +
                                "Şimdi burda vakit gece ya\n" +
                                "Bir yerlerde ey gözleri maden\n" +
                                "Gündüz olmalı\n" +
                                "Taşın içinde bir gündüz\n" +
                                "Demirin,, ağacın.");

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
                alertDialogBuilder2.setTitle("Tut Ki Ben");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("tut ki sen bir şiiri çok iyi yazsan\n" +
                                "ya da çok iyi bir şiir yazsan\n" +
                                "bir saatin aralıksız işleyişi\n" +
                                "bir çocuğun bir sokak kedisini sevişi\n" +
                                "bilmem ki sanki güzel bir akşam gibi\n" +
                                "onun için her akşamı iyi yaşamalıyım\n" +
                                "yani kıskanılan onu\n" +
                                "demek istediğim hepsi");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog1 = alertDialogBuilder2.create();

                // alerti gösteriyoruz
                alertDialog1.show();
            }


        });



    }
}