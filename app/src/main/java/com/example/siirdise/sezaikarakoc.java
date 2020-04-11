package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sezaikarakoc extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sezaikarakoc);
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
                alertDialogBuilder.setTitle("Adak Işığı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sıcak yaz göklerinde\n" +
                                "Önde uzanan ovada\n" +
                                "Birden bir ışık sağdan\n" +
                                "Bir ışık soldan çıkar\n" +
                                "Ve bunlar\n" +
                                "Şimşek hızıyla birbirlerine ulaşırlar\n" +
                                "Bunu halk adak için uğur sayar\n" +
                                "Derler: Leyla ile Mecnun buluştular\n" +
                                "Bu göz açıp kapama anında\n" +
                                "Ne varsa dile muradında\n" +
                                "Mutlak yerine gelir arzun\n" +
                                "Yerde kavuşmayanlar gökte kavuşurlar\n" +
                                "Ve bir uğurlu anda\n" +
                                "Kavuşmak isteyenleri kavuştururlar");
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
                alertDialogBuilder.setTitle("Anneler Ve Çocuklar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Anne ölünce çocuk\n" +
                                "Bahçenin en yalnız köşesinde\n" +
                                "Elinde bir siyah çubuk\n" +
                                "Ağzında küçük bir leke\n" +
                                "\n" +
                                "Çocuk öldü mü güneş\n" +
                                "Simsiyah görünür gözüne\n" +
                                "Elinde bir ip nereye\n" +
                                "Bilmez bağlayacağını anne\n" +
                                "\n" +
                                "Kaçar herkesten\n" +
                                "Durmaz bir yerde\n" +
                                "Anne ölünce çocuk\n" +
                                "Çocuk ölünce anne");

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
                alertDialogBuilder.setTitle("Balkon");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Çocuk düşerse ölür çünkü balkon\n" +
                                "Ölümün cesur körfezidir evlerde\n" +
                                "Yüzünde son gülümseme kaybolurken çocukların\n" +
                                "Anneler anneler elleri balkonların demirinde\n" +
                                "\n" +
                                "İçimde ve evlerde balkon\n" +
                                "Bir tabut kadar yer tutar\n" +
                                "Çamaşırlarınızı asarsınız hazır kefen\n" +
                                "Şezlongunuza uzanır ölü\n" +
                                "\n" +
                                "Gelecek zamanlarda\n" +
                                "Ölüleri balkonlara gömecekler\n" +
                                "İnsan rahat etmeyecek\n" +
                                "Öldükten sonra da\n" +
                                "\n" +
                                "Bana sormayın böyle nereye\n" +
                                "Koşa koşa gidiyorum\n" +
                                "Alnından öpmeye gidiyorum\n" +
                                "Evleri balkonsuz yapan mimarların");

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
                alertDialogBuilder.setTitle("Batış");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Güneştir düşen turuncusunda menekşeler sunarım\n" +
                                "Gece artık hiç dönülmeyecek yerlerdeki o sevgiliye\n" +
                                "Çocuklara kekik toplıyan o sevgiliye\n" +
                                "Bir kekik uzatan çocuk anne deyince\n" +
                                "Deniz dibinden çatı çeken\n" +
                                "Çocuk üstüne arkadaş üstüne\n" +
                                "\n" +
                                "Güneştir düşen yeşilinde bir yüz döner\n" +
                                "Değişmiyen o gençliğiyle sevgili\n" +
                                "Ölümden sonraki kurtulma gibi\n" +
                                "Döner döner de gelir karşıma\n" +
                                "Deniz dibinden cıkan ahtapot ölüleri\n" +
                                "Eski utanmaları çeker su yüzüne\n" +
                                "\n" +
                                "Güneştir kırmızı ve ben en çömezi bir rengin\n" +
                                "Altın hatıralar hükümetinin\n" +
                                "Bitmeyen sultanı o sevgiliye adanmış\n" +
                                "Soy utanc soy anış soy sevgi\n" +
                                "Gel artmaz azalmaz ey sevgi");

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
                alertDialogBuilder.setTitle("Benim Sevgim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ah benim sevgim çiçek örneği\n" +
                                "Çarpılmışların kinini yeniler\n" +
                                "Beni alnımdan vurmak ister\n" +
                                "Saraların iftiraların gençliği\n" +
                                "\n" +
                                "Bilirim geçmektir sevgi\n" +
                                "Ölümün en yumuşak en ayarlı yerinden\n" +
                                "Çünkü çocuklar geçer\n" +
                                "Ölümün en yumuşak en ayarlı yerinden\n" +
                                "\n" +
                                "Zarif vakitlerin seçkin kadınları\n" +
                                "Hazırlardı kızlıklarında (doğum)ları\n" +
                                "Kaçmakla kurtulamadıkları\n" +
                                "Arada uyguladıkları");

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
                alertDialogBuilder.setTitle("Çeşmeler");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("I.\n" +
                                "\n" +
                                "Benim yalnızlığımdan\n" +
                                "Damıtılmış çeşmeler\n" +
                                "Kurumuş unutulmuş\n" +
                                "Çeşmelerin akışıyım\n" +
                                "İnsanlık içinde\n" +
                                "\n" +
                                "Ay görmez onları onlar ayı görür\n" +
                                "Aydan haberlidirler\n" +
                                "Söylediklerinin çoğu\n" +
                                "Ay hakkındadır\n" +
                                "Aya dair\n" +
                                "Ayın tarihine ait\n" +
                                "\n" +
                                "Fındıklılı Mehmet Ağa\n" +
                                "Çeşmesi\n" +
                                "Silahtar Tarihinin yazarı\n" +
                                "Yenilmez karpuzlar\n" +
                                "Acı salatalıklar yıkamıştım suyunda\n" +
                                "İçilmez\n" +
                                "Bozuk suyunda\n" +
                                "Gece yarısı\n" +
                                "Ayışığında\n" +
                                "Yaz ay ve ben\n" +
                                "Silinmeye yüz tutmuş yazı\n" +
                                "Ölümü hecelemiştik\n" +
                                "Ortalığı dolduran sesinde\n" +
                                "Ta... aşağılarda olan yatıra\n" +
                                "Bir türkü söylüyordu\n" +
                                "Ölüm ötesinde açmış\n" +
                                "Menekşeler kimliğinde\n" +
                                "\n" +
                                "Ölüydü insanlar\n" +
                                "Yalnız yaşıyordu o yatır\n" +
                                "Ve o çeşme\n" +
                                "Ben de\n" +
                                "Sıratı andıran bir çizgide\n" +
                                "Soluyordum devrildim devrileceğimi\n" +
                                "Hayatı ve ölümü birlikte\n" +
                                "Aynı geçmezlik ve değişmezlikte\n" +
                                "Aynı yenilik ve tazelikte\n" +
                                "Ürpererek geçiyordu yarasalar\n" +
                                "Uzaklardan\n" +
                                "Beyoğlu'nu bir telgraf gibi\n" +
                                "İleterek birbirine");

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
                alertDialogBuilder.setTitle("Donuk Aşk");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yine akşam oldu,\n" +
                                "Yalnızlık omuzlarıma çivisini çaktı yine,\n" +
                                "Uzaklık aynı gerçi,\n" +
                                "Heryerdeyken olan uzaklığın pek değişmedi,\n" +
                                "Yine akşam oldu orda olduğu gibi,\n" +
                                "Görebiliyorum seni burdan da,\n" +
                                "Aynısıydı ordayken de,\n" +
                                "Uzaklıktan korkmuyorum belki de,\n" +
                                "Orada da aynıydı uzaklık gerçi\n" +
                                "Donuklaşmış oldu artık bu,\n" +
                                "Bir o kadar da hüzünlü romanlar gibi,\n" +
                                "Galiba ben baştan kaybetmişim,\n" +
                                "Belki de ben baştan kazanmışım, insanlık kaybetmiş...");

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
                alertDialogBuilder.setTitle("Kara Yılan");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Güneşin yeni doğduğunu sana haber veriyorum\n" +
                                "Yağmurun hafifliğini toprağın ağırlığını\n" +
                                "Ve bütün varlığımla kara yılan seni çağırıyorum\n" +
                                "Seni çağırıyorum parmaklarımdan süt içmeye\n" +
                                "Pamuğun ağırlığını yapan dağın hafifliğini\n" +
                                "Sana haber veriyorum yeni doğduğunu güneşin\n" +
                                "\n" +
                                "Ben güneyli çocuk arkadaşım ben güneyli çocuk\n" +
                                "Günahlarım kadar ömrüm vardır\n" +
                                "Ağarmayan saçımı güneşe tutuyorum\n" +
                                "Saçlarımı acının elinde unutuyorum\n" +
                                "Parmaklarımdan süt içmeye çağırıyorum seni\n" +
                                "Ben güneyli çocuk arkadaşım ben güneyli çocuk\n" +
                                "\n" +
                                "Ben çiçek gibi taşımıyorum göğsümde aşkı\n" +
                                "Ben aşkı göğsümde kurşun gibi taşıyorum\n" +
                                "Gelmiş dayanmış demir kapısına sevdanın\n" +
                                "Ben yaşamıyor gibi yaşamıyor gibi yaşıyorum\n" +
                                "Ben aşkı göğsümde kurşun gibi taşıyorum\n" +
                                "\n" +
                                "Seni süt içmeye çağırıyorum parmaklarımdan\n" +
                                "Kara yılan kara yılan kara yılan kara yılan");

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
                alertDialogBuilder.setTitle("Rüzgar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Uçurtmamı rüzgâr yırttı dostlarım!\n" +
                                "Gelin duvağından kopan bir rüzgâr...\n" +
                                "Bu rüzgâr yüzünden bulutlar yarım;\n" +
                                "Bu rüzgâr yüzünden bana olanlar...\n" +
                                "\n" +
                                "O ceviz dalları, o asma, o dut,\n" +
                                "Gül gül, mektup mektup büyüyen umut...\n" +
                                "Yangından yangına arda kalmış tut.\n" +
                                "Muhabbet sürermiş bir rüzgâr kadar.");

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
                alertDialogBuilder.setTitle("Mona Rosa");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Mona Rosa. Siyah güller, ak güller.\n" +
                                "Geyve'nin gülleri ve beyaz yatak.\n" +
                                "Kanadı kırık kuş merhamet ister.\n" +
                                "Ah senin yüzünden kana batacak.\n" +
                                "Mona Rosa. Siyah güller, ak güller.\n" +
                                "\n" +
                                "Ulur aya karşı kirli çakallar,\n" +
                                "Ürkek ürkek bakar tavşanlar dağa.\n" +
                                "Mona Rosa bugün bende bir hal var.\n" +
                                "Yağmur iri iri düşer toprağa,\n" +
                                "Ulur aya karşı kirli çakallar.\n" +
                                "\n" +
                                "Açma pencereni perdeleri çek,\n" +
                                "Mona Rosa seni görmemeliyim.\n" +
                                "Bir bakışın ölmem için yetecek.\n" +
                                "Anla Mona Rosa ben bir deliyim.\n" +
                                "Açma pencereni perdeleri çek.\n" +
                                "\n" +
                                "Zeytin ağaçları, söğüt gölgesi,\n" +
                                "Bende çıkar güneş aydınlığına.\n" +
                                "Bir nişan yüzüğü bir kapı sesi.\n" +
                                "Seni hatırlatır her zaman bana.\n" +
                                "Zeytin ağaçları, söğüt gölgesi.\n" +
                                "\n" +
                                "Zambaklar en ıssız yerlerde açar\n" +
                                "Ve vardır her vahşi çiçekte gurur.\n" +
                                "Bir mumun ardında bekleyen rüzgar,\n" +
                                "Işıksız ruhumu sallar da durur.\n" +
                                "Zambaklar en ıssız yerlerde açar.\n" +
                                "\n" +
                                "Ellerin, ellerin ve parmakların\n" +
                                "Bir nar çiçeğini eziyor gibi.\n" +
                                "Ellerinden belli olur bir kadın,\n" +
                                "Denizin dibinde geziyor gibi.\n" +
                                "Ellerin, ellerin ve parmakların.\n" +
                                "\n" +
                                "Zaman ne de çabuk geçiyor Mona.\n" +
                                "Saat onikidir söndü lambalar\n" +
                                "Uyu da turnalar girsin rüyana,\n" +
                                "Bakma tuhaf tuhaf göğe bu kadar.\n" +
                                "Zaman ne de çabuk geçiyor Mona.\n" +
                                "\n" +
                                "Akşamları gelir incir kuşları,\n" +
                                "Konarlar bahçemin incirlerine.\n" +
                                "Kiminin rengi ak kiminin sarı.\n" +
                                "Ah beni vursalar bir kuş yerine.\n" +
                                "Akşamları gelir incir kuşları.\n" +
                                "\n" +
                                "Ki ben Mona Rosa bulurum seni\n" +
                                "İncir kuşlarının bakışlarında.\n" +
                                "Hayatla doldurur bu boş yelkeni.\n" +
                                "O masum bakışların su kenarında.\n" +
                                "Ki ben Mona Rosa bulurum seni.\n" +
                                "\n" +
                                "Kırgın kırgın bakma yüzüme Rosa.\n" +
                                "Henüz dinlemedin benden türküler.\n" +
                                "Benim aşkım uymaz öyle her saza.\n" +
                                "En güzel şarkıyı bir kurşun söyler.\n" +
                                "Kırgın kırgın bakma yüzüme Rosa.\n" +
                                "\n" +
                                "Artık inan bana muhacir kızı,\n" +
                                "Dinle ve kabul et itirafımı.\n" +
                                "Bir soğuk, bir mavi, bir garip sızı\n" +
                                "Alev alev sardı her tarafımı.\n" +
                                "Artık inan bana muhacir kızı.\n" +
                                "\n" +
                                "Yağmurdan sonra büyürmüş başak,\n" +
                                "Meyvalar sabırla olgunlaşırmış.\n" +
                                "Bir gün gözlerimin ta içine bak\n" +
                                "Anlarsın ölüler niçin yaşarmış.\n" +
                                "Yağmurdan sonra büyürmüş başak.\n" +
                                "\n" +
                                "Altın bilezikler o kokulu ten\n" +
                                "Cevap versin bu kuş tüyüne.\n" +
                                "Bir tüy ki can verir gülümsesen,\n" +
                                "Bir tüy ki kapalı geceye güne.\n" +
                                "Altın bilezikler o kokulu ten.\n" +
                                "\n" +
                                "Mona Rosa. Siyah güller, ak güller.\n" +
                                "Geyve'nin gülleri ve beyaz yatak.\n" +
                                "Kanadı kırık kuş merhamet ister,\n" +
                                "Ah senin yüzünden kana batacak.\n" +
                                "Mona Rosa. Siyah güller, ak güller.");

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
                alertDialogBuilder2.setTitle("Rüzgar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Uçurtmamı rüzgâr yırttı dostlarım!\n" +
                                "Gelin duvağından kopan bir rüzgâr...\n" +
                                "Bu rüzgâr yüzünden bulutlar yarım;\n" +
                                "Bu rüzgâr yüzünden bana olanlar...\n" +
                                "\n" +
                                "O ceviz dalları, o asma, o dut,\n" +
                                "Gül gül, mektup mektup büyüyen umut...\n" +
                                "Yangından yangına arda kalmış tut.\n" +
                                "Muhabbet sürermiş bir rüzgâr kadar.");

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
                alertDialogBuilder.setTitle("Sessiz Müzik");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sen kış güneşi misin\n" +
                                "Yakarsın ısıtmazsın\n" +
                                "\n" +
                                "Bir ırmağın ortası yoksa\n" +
                                "Seni mi hatırlayacağım\n" +
                                "\n" +
                                "Bu dünyada olup bitenlerin\n" +
                                "Olup bitmemiş olması için\n" +
                                "Ne yapıyorsun\n" +
                                "\n" +
                                "Sizin evin duvarları taştan\n" +
                                "Dumanı da mı taştan\n" +
                                "\n" +
                                "Seni kız arkadaşlarından\n" +
                                "Sevinç gözyaşları içinde\n" +
                                "Öpen olmayacak mı\n" +
                                "\n" +
                                "Ezberlediğin şiir\n" +
                                "Beklediğin adam");

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
                alertDialogBuilder.setTitle("Tahta At");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Dostlarımız geldi hafif danslar geldi\n" +
                                "Şeker verdik aslan yeleleri aldık kırk kapı açtık\n" +
                                "Kırk kapı açtık Mavi Sakal öldü\n" +
                                "Kırk odanın içinde güzel aslanlar güldü\n" +
                                "Sen güldün Asya güldü hafif danslar geldi\n" +
                                "\n" +
                                "Gel kalbini saat yap odamıza\n" +
                                "Saatin içine kutsal sözler yaz\n" +
                                "Güneş yap aşka güzel ölümleri uslu ölümleri\n" +
                                "Gel mesut odalar içinde çözül güzel bulmaca\n" +
                                "Güzel ve mağrur ve katil\n" +
                                "\n" +
                                "İç dünyamı ikili susmalarla bölme\n" +
                                "Şiir günlük konuşma dilimiz\n" +
                                "Kıskançlığımdan örülme bir perde\n" +
                                "Perdeye çarpan beş deniz\n" +
                                "Kuvveti yok bende itham etmek hakkından önce\n" +
                                "\n" +
                                "II\n" +
                                "Dostlarımız geldi sağlam izleri var karda\n" +
                                "Yapacaklarının yapılabileceği iyi öğretildi onlara\n" +
                                "Ve sağlam kutular içine koydular gölgelerini\n" +
                                "Karışık bir ses teller üzerinde Londra\n" +
                                "Gel bu gece görülmemiş bir şey olacak\n" +
                                "\n" +
                                "Yanlış bir dağın altından yanlış bir su çıkarsa\n" +
                                "Kaybolursa taşlar içinde taşlar getiren taş bir bulut\n" +
                                "Eşkiya heybesinde çizgili kayığa asıl\n" +
                                "Merhametin bildik kaynağı eşkiyalar\n" +
                                "Kıldan ince çarpık bilgileri unut\n" +
                                "Sessiz derin sonsuz yaslı duvarlar önünde\n" +
                                "Türküler içinde en şen en senin olanı söyle\n" +
                                "\n" +
                                "III\n" +
                                "Aşk kadar nazlı saat kadar gerçek\n" +
                                "Bir bülbül bakıyor bana doğru\n" +
                                "Boş oda kadar tedirgin tehlike kadar güzel\n" +
                                "Bir bülbül içimde sedefle kaplanıyor\n" +
                                "Payıma korkarım eşsiz bir azap düşecek\n" +
                                "\n" +
                                "Dostlarımız geldi öldü büyücüler\n" +
                                "İnsanla peygamber arası basık bir gürültü içinde\n" +
                                "Korkunç ilgiler döner dolaplar\n" +
                                "Sedef gurur ve inat içinde\n" +
                                "\n" +
                                "Seni bana getirsin ölüm yatağımdayken\n" +
                                "Kırık ayaklı tahta at.");

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
                alertDialogBuilder.setTitle("Yağmur Duası");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Ben geldim geleli açmadı gökler\n" +
                                "Ya ben bulutları anlamıyorum\n" +
                                "Ya bulutlar benden bir şeyler bekler\n" +
                                "Hayat bir ölümdür aşk bir uçurum\n" +
                                "Ben geldim geleli açmadı gökler\n" +
                                "\n" +
                                "Bir yağmur bilirim bir de kaldırım\n" +
                                "Biri damla damla alnıma düşer\n" +
                                "Diğerinde durur göğe bakarım\n" +
                                "Ne şehir, ne deniz kokan gemiler\n" +
                                "Bir yağmur bilirim bir de kaldırım\n" +
                                "\n" +
                                "Nedense aldanmış ilk gece annem\n" +
                                "Efsunlu bir gömlek giydirmiş bana\n" +
                                "İişte vuramadı gökler bana gem\n" +
                                "Dinmedi içimde kopan fırtına\n" +
                                "Nedense ilk gece aldanmış annem\n" +
                                "\n" +
                                "Biri çıkmış gibi boş bir mezardan\n" +
                                "Ortalıkta ölüm sessizliği var\n" +
                                "Bana ne geldiyse geldi yukardan\n" +
                                "Bana ne yaptıysa yaptı bulutlar\n" +
                                "Biri çıkmış gibi boş bir mezardan\n" +
                                "\n" +
                                "İyiki bilmiyor kalabalıklar\n" +
                                "Yağmura bakmayı cam arkasından\n" +
                                "İnsandan insana şükürki fark var\n" +
                                "Birine cennetse birine zindan\n" +
                                "İyiki bilmiyor kalabalıklar\n" +
                                "\n" +
                                "Yağmur duasına çıksaydık dostlar\n" +
                                "Bulutlar yarılır hava açardı\n" +
                                "Şimdi ne ihtimal nede imkan ar\n" +
                                "Göğe hükmetmkten kolay ne vardı?\n" +
                                "Yağmur duasına çıksaydık dostlar\n" +
                                "\n" +
                                "Ben geldim geleli açmadı gökler\n" +
                                "Ya ben bulutları anlamıyorum\n" +
                                "Ya bulutlar benden bir şeyler bekler\n" +
                                "Hayat bir ölümdür aşk bir uçurum\n" +
                                "Ben geldim geleli açmadı gökler");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });



    }
}