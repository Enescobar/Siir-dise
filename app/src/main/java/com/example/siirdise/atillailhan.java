package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class atillailhan extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atillailhan);
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
                alertDialogBuilder.setTitle("Aysel Git Başımdan");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Aysel git başımdan ben sana göre değilim\n" +
                                "Ölümüm birden olacak seziyorum.\n" +
                                "Hem kötüyüm karanlığım biraz çirkinim\n" +
                                "Aysel git başımdan istemiyorum.\n" +
                                "\n" +
                                "Benim yağmurumda gezinemezsin üşürsün\n" +
                                "Dağıtır gecelerim sarışınlığını\n" +
                                "Uykularımı uyusan nasıl korkarsın,\n" +
                                "hiçbir dakikamı yaşayamazsın.\n" +
                                "Aysel git başımdan ben sana göre değilim.\n" +
                                "Benim için kirletme aydınlığını,\n" +
                                "hem kötüyüm karanlığım biraz çirkinim\n" +
                                "\n" +
                                "Islığımı denesen hemen düşürürsün,\n" +
                                "gözlerim hızlandırır tenhalığını\n" +
                                "Yanlış şehirlere götürür trenlerim.\n" +
                                "Ya ölmek ustalığını kazanırsın,\n" +
                                "ya korku biriktirmek yetisini.\n" +
                                "Acılarım iyice bol gelir sana,\n" +
                                "sevincim bir türlü tutmaz sevincini.\n" +
                                "Aysel git başımdan ben sana göre değilim.\n" +
                                "Ümitsizliğimi olsun anlasana\n" +
                                "hem kötüyüm, karanlığım biraz, çirkinim.\n" +
                                "\n" +
                                "Sevindiğim anda sen üzülürsün.\n" +
                                "Sonbahar uğultusu duymamışsın ki\n" +
                                "içinden bir gemi kalkıp gitmemiş,\n" +
                                "uzak yalnızlık limanlarına.\n" +
                                "Aykırı bir yolcuyum dünya geniş,\n" +
                                "Büyük bir kulak çınlıyor içimdeki.\n" +
                                "Çetrefil yolculuğum kesinleşmiş.\n" +
                                "Sakın başka bir şey getirme aklına.\n" +
                                "Aysel git başımdan ben sana göre değilim,\n" +
                                "ölümüm birden olacak seziyorum,\n" +
                                "hem kötüyüm, karanlığım biraz, çirkinim.\n" +
                                "Aysel git başımdan seni seviyorum...");
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
                alertDialogBuilder.setTitle("Bekle");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Geleceğim bekle dedi\n" +
                                "Ben beklemedim o da gelmedi\n" +
                                "ölüm gibi birşeydi\n" +
                                "Ama kimse ölmedi");

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
                alertDialogBuilder.setTitle("Cinayet Saati");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Haliç'te bir vapuru vurdular dört kişi\n" +
                                "Demirlemişti eli kolu bağlıydı ağlıyordu\n" +
                                "Dört bıçak çekip vurdular dört kişi\n" +
                                "Yemyeşil bir ay gökte dağılıyordu\n" +
                                "\n" +
                                "Deli cafer ismail tayfur ve şaşı\n" +
                                "Maktulün onbeş yıllık arkadaşı\n" +
                                "Üçü kamarot öteki aşçıbaşı\n" +
                                "Dört bıçak çekip vurdular dört kişi\n" +
                                "\n" +
                                "Cinayeti kör bir balıkçı gördü\n" +
                                "Ben gördüm kulaklarım gördü\n" +
                                "Vapur kudurdu kuduz gibi böğürdü\n" +
                                "Hiçbiriniz orada yoktunuz\n" +
                                "\n" +
                                "Demirlemişti eli kolu bağlıydı ağlıyordu\n" +
                                "On üç damla gözyaşını saydım\n" +
                                "Allahına kitabına sövüp saydım\n" +
                                "Şafak nabız gibi atıyordu\n" +
                                "Sarhoştum Kasımpaşa'daydım\n" +
                                "Hiçbiriniz orada yoktunuz\n" +
                                "\n" +
                                "Haliç'te bir vapuru vurdular dört kişi\n" +
                                "Polis kaatilleri arıyordu\n" +
                                "Deli cafer ismail tayfur ve şaşı\n" +
                                "Üzerime yüklediler bu işi\n" +
                                "Sarhoştum Kasımpaşa'daydım\n" +
                                "Vapuru onlar vurdu ben vurmadım\n" +
                                "Cinayeti kör bir balıkçı gördü\n" +
                                "\n" +
                                "Ben vursam kendimi vuracaktım");

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
                alertDialogBuilder.setTitle("Böyle Bir Sevmek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("ne kadınlar sevdim zaten yoktular\n" +
                                "yağmur giyerlerdi sonbaharla bir\n" +
                                "azıcık okşasam sanki çocuktular\n" +
                                "bıraksam korkudan gözleri sislenir\n" +
                                "ne kadınlar sevdim zaten yoktular\n" +
                                "böyle bir sevmek görülmemiştir\n" +
                                "\n" +
                                "hayır sanmayın ki beni unuttular\n" +
                                "hala arasıra mektupları gelir\n" +
                                "gerçek değildiler birer umuttular\n" +
                                "eski bir şarkğ belki bir şiir\n" +
                                "ne kadınlar sevdim zaten yoktular\n" +
                                "böyle bir sevmek görülmemiştir\n" +
                                "\n" +
                                "yalnızlıklarımda elimden tuttular\n" +
                                "uzak fısıltıları içimi ürpertir\n" +
                                "sanki gökyüzünde bir buluttular\n" +
                                "nereye kayboldular şimdi kimbilir\n" +
                                "ne kadınlar sevdim zaten yoktular\n" +
                                "böyle bir sevmek görülmemiştir.");

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
                alertDialogBuilder.setTitle("Elimden Gelen Bu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Elimden gelen bu ben iki kişiyim\n" +
                                "Çoğalmak neyse ne azalmak zor\n" +
                                "Birisi seni her an bırakıp gittiğim\n" +
                                "Öbürü kan gibi tutulmuş seviyor\n" +
                                "Ağzındaki acı alnındaki çizgiyim\n" +
                                "Gözlerine kirli bir bulut getirdim\n" +
                                "Hiçbir sevinç aydınlığı onu silemiyor\n" +
                                "\n" +
                                "Elimden gelen bu ben iki kişiyim\n" +
                                "Birisi kapadığın kapılardan gitmiyor\n" +
                                "Yağmur yağmaksa o güneş açmaksa o\n" +
                                "Bir yerin üşüse onun sıcaklığı\n" +
                                "Öbürü en içten çağrını işitmiyor\n" +
                                "Alıp tutmaksa o basıp gitmekse o\n" +
                                "Bakışları kıyısız deniz uzaklığı\n" +
                                "\n" +
                                "Elimden gelen bu ben iki kişiyim\n" +
                                "İkisi birden çıkmaya uğraşıyor\n" +
                                "Bilmem ki hangisinden nasıl vazgeçeyim\n" +
                                "Birisi yeni baştan serüvene başlamış\n" +
                                "Öbürü silahında son mermiyi sıkıyor\n" +
                                "Çoğalmak neyse ne azalmak zor");

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
                alertDialogBuilder.setTitle("Gece Buluşması");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sen İstinye'de bekle ben buradayım\n" +
                                "İçimde köpek gibi havlayan yalnızlığım\n" +
                                "Belki gelmem gelemem 5 dakika bekle git\n" +
                                "Çünkü ben buradayım karanlıktayım\n" +
                                "\n" +
                                "Çünkü elimi kestim beni kan tutuyor\n" +
                                "Şarabım bütün ekşi suyum soğuk\n" +
                                "Yanımda olmadınmı seni seviyorum\n" +
                                "Belki gelmem gelemem 5 dakika bekle git\n" +
                                "\n" +
                                "Yüzünü ıslatmadan ağlıyabilir misin\n" +
                                "Gece yarıları telefon ettin mi hiç\n" +
                                "Karanlık adamlar hüviyetini sordu mu\n" +
                                "Ben senin olmadığını arıyorum\n" +
                                "Belki gelmem gelemem 5 dakika bekle git\n" +
                                "\n" +
                                "Yabancı gibisin miyop gözlerin kısık\n" +
                                "Bana ait ne varsa hepsi seni korkutuyor\n" +
                                "Sana ait ne varsa hiçbiri benim değil\n" +
                                "Belki ölmek hakkımı kullanıyorum\n" +
                                "Belki gelmem gelemem 5 dakika bekle git");

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
                alertDialogBuilder.setTitle("Kimi Sevsem Sensin");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("her şeyi terk ettim / ne aşk ne şehvet\n" +
                                "sarışın başladığım esmer bitiyor\n" +
                                "anlaşılmaz yüzü koyu gölgeli\n" +
                                "dudakları keskin kırmızı jilet\n" +
                                "bir belaya çattık / nasıl bitirmeli\n" +
                                "gitar kımıldadı mı zaman deliniyor\n" +
                                "kimi sevsem sensin / hayret\n" +
                                "kapıların kapalı girilemiyor\n" +
                                "* * *\n" +
                                "\n" +
                                "kimi sevsem sensin / senden ibaret\n" +
                                "hepsini senin adınla çağırıyorum\n" +
                                "arkamdan şımarık gülüşüyorlar\n" +
                                "getirdikleri yağmur / sende unuttuğum\n" +
                                "hani o sımsıcak iri çekirdekli\n" +
                                "senin gibi vahşi öpüşüyorlar\n" +
                                "kimi sevsem sensin / hayret\n" +
                                "in misin cin misin anlamıyorum\n");

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
                alertDialogBuilder.setTitle("Mahur Beste");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Şenlik dağıldı bir acı yel kaldı bahçede yalnız\n" +
                                "O mahur beste çalar Müjgan'la ben ağlaşırız\n" +
                                "Gitti dostlar şölen bitti ne eski heyecan ne hız\n" +
                                "Yalnız kederli yalnızlığımızda sıralı sırasız\n" +
                                "O mahur beste çalar Müjgan'la ben ağlaşırız\n" +
                                "\n" +
                                "Bir yangın ormanından püskürmüş genç fidanlardı\n" +
                                "Güneşten ışık yontarlardı sert adamlardı\n" +
                                "Hoyrattı gülüşleri aydınlığı çalkalardı\n" +
                                "Gittiler akşam olmadan ortalık karardı\n" +
                                "\n" +
                                "Bitmez sazların özlemi daha sonra daha sonra\n" +
                                "Sonranın bilinmezliği bir boyut katar ki onlara\n" +
                                "Simsiyah bir teselli olur belki kalanlara\n" +
                                "Geceler uzar hazırlık sonbahara");

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
                alertDialogBuilder.setTitle("İstanbul Ağrısı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Kanatları parça parça bu ağustos geceleri\n" +
                                "Yıldızlar kaynarken\n" +
                                "Şangır şungur ayaklarımın dibine dökülen\n" +
                                "Sen\n" +
                                "Eğer yine İstanbul'san\n" +
                                "Yine kan kopuklu cehennem sarmaşıkları büyüteceğim\n" +
                                "Pançak pançak şiirler tüküreceğim\n" +
                                "Demek yine ben\n" +
                                "Limandaki direkler ormanında bütün bandıralar ayaklanıyor\n" +
                                "Kapı önlerinde boyunlarını bükmüş tek tek kafiyeler\n" +
                                "Yahudi sokaklarını aydınlatan Telaviv şarkıları\n" +
                                "Mavi asfaltlara çökmüş\n" +
                                "Diz bağlıyor\n" +
                                "Eğer sen yine İstanbul'san\n" +
                                "Kirli dudaklarını bulut bulut dudaklarıma uzatan\n" +
                                "Sirkeci Garı'nda tren çığlıklarıyla bıçaklanıp\n" +
                                "İntihar dumanları içindeki Haydarpaşa'dan\n" +
                                "Anadolu üstlerine bakıp bakıp\n" +
                                "Ağlayan\n" +
                                "Sen eğer yine İstanbul'san\n" +
                                "Aldanmıyorsam\n" +
                                "Yakaları karanfilli ....... eğer beni aldatmıyorsa\n" +
                                "Kulaklarımdan kan fışkırıncaya kadar\n" +
                                "Yine senin emrindeyim\n" +
                                "Utanmasam\n" +
                                "Gözlerimi damla damla kadehime damlatarak\n" +
                                "Kendimi yani şu bildiğim Atilla İlhan'i\n" +
                                "Zehirleyebilirim\n" +
                                "Sonbahar karanlıkları tuttu tutacak\n" +
                                "Tarlabaşı pansiyonlarında bekarlar buğulanıyor\n" +
                                "İmtihan çığlıkları yükseliyor üniversite'den\n" +
                                "Tophane İskelesi'nde diesel kamyonları sarhoş\n" +
                                "Direksiyonlarının koynuna girmiş bıçkın şöförler\n" +
                                "Uykusuz dalgalanıyor\n" +
                                "Ulan İstanbul sen misin\n" +
                                "Senin ellerin mi bu eller\n" +
                                "Ulan bu gemiler senin gemilerin mi\n" +
                                "Minarelerini kürdan gibi dişlerinin arasında\n" +
                                "Liman liman götüren\n" +
                                "Ulan bu mazot tüküren bu dövmeli gemiler senin mi\n" +
                                "Akşamlar yassıldıkça neden böyle devleşiyorlar\n" +
                                "Neden durmaksızın imdat kıvılcımlari fışkırıyor\n" +
                                "Antenlerinden\n" +
                                "Neden\n" +
                                "Peki İstanbul ya ben\n" +
                                "Ya mısralarını dört renkli duvar afişleri gibi boy boy\n" +
                                "Gümrük duvarlarına yapıştıran yolcu abbas\n" +
                                "Ya benim kahrım\n" +
                                "Ya senin ağrın\n" +
                                "Ağır kabaralarınla uykularımı ezerek deliksiz yaşattığın\n" +
                                "Çaresiz zehirler kusan çılgın bir yılan gibi\n" +
                                "Burgu burgu içime boşalttığın\n" +
                                "O senin ağrın\n" +
                                "O senin\n" +
                                "Eğer sen yine İstanbul'san\n" +
                                "Yanılmıyorsam\n" +
                                "Koltuğumun altında eski bir kitap diye götürmek istediğim\n" +
                                "Sicilyalı balıkçılara Marsilyalı dok işçilerine\n" +
                                "Satır satır okumak istediğim\n" +
                                "Sen\n" +
                                "Eğer yine İstanbul'san\n" +
                                "Eğer senin ağrınsa iğneli beşik gibi her tarafımda hissettiğim\n" +
                                "Ulan yine sen kazandın İstanbul\n" +
                                "Sen kazandın ben yenildim\n" +
                                "Kulaklarımdan kan fışkırıncaya kadar\n" +
                                "Yine emrindeyim\n" +
                                "Ölsem yalnız kalsam cüzdanım kaybolsa\n" +
                                "Parasız kalsam tenhalarda kalsam çarpılsam\n" +
                                "Hiç bir gün hiçbir postacı kapımı çalmasa\n" +
                                "Yanılmıyorsam\n" +
                                "Sen eğer yine İstanbul'san\n" +
                                "Senin ıslıklarınsa kulaklarıma saplanan bu ıslıklar\n" +
                                "Gözbebeklerimde gezegenler gibi dönen yalnızlığımdan\n" +
                                "Bir tekmede kapılarını kırıp çıktım demektir\n" +
                                "Ulan bunu sen de bilirsin İstanbul\n" +
                                "Kaç kere yazdım kimbilir\n" +
                                "Kaç kere kirpiklerimiz kasaturalara dönmüş diken diken\n" +
                                "1949 Eylül'ünde birader mirc ve ben\n" +
                                "Sokaklarında mohikanlar gibi ateş yaktık\n" +
                                "Sana taptık ulan\n" +
                                "Unuttun mu\n" +
                                "Sana taptık.");

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
                alertDialogBuilder.setTitle("Sultan-ı Yegah");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Şamdanları dolanınca eski zaman sevdalarının\n" +
                                "Başlar ay doğarken saltanatı sultan-ı yegahın\n" +
                                "Nemli yumuşaklığı tende denizden gelen ahın\n" +
                                "Gizemli kanatları ruhta ölüm karanlığının\n" +
                                "Başlar ay doğarken saltanatı sultan-ı yegahın\n" +
                                "\n" +
                                "Yansıyan yaslı gülüşmelerdir karasevdalı suda\n" +
                                "Bülbüller kırılır umutsuzluktan yalnızlık korusunda\n" +
                                "Eylem dağılmış gönül tenha çalgılar kış uykusunda\n" +
                                "Ölümün tartışılmazlığı nihayet anlaşılsa da\n" +
                                "Başlar ay doğarken saltanatı sultan-ı yegahın\n" +
                                "\n" +
                                "Bir başkasının yaşantısıdır dönüp arkamıza baksak\n" +
                                "Çünkü yaşadıklarımız başkasının yargısına tutsak\n" +
                                "Su yasak rüzgar yasak açık kapılar yasak\n" +
                                "Belki bu karanlıkta yasakları yasaklasak\n" +
                                "Başlar ay doğarken saltanatı sultan-ı yegahın\n");

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
                alertDialogBuilder2.setTitle("Sen Beyaz Bir Kadınsın");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("asıl büyük sarhoş benim\n" +
                                "uzaktaki\n" +
                                "ben ki tek damla şarap içmedim\n" +
                                "ekmeğin beyaz zeytinin siyah\n" +
                                "olduğunu biliyorum\n" +
                                "asıl büyük sarhoş benim\n" +
                                "uzaktaki\n" +
                                "benim kusturucu sarhoşluğum\n" +
                                "yoksulluğum\n" +
                                "\n" +
                                "yüzüme bakmasan da\n" +
                                "yağmura düşürsen de gözlerini\n" +
                                "gözlerime bakmasan da ne kadar\n" +
                                "o kadar aydınlığın gökyüzüme uzanıyor\n" +
                                "uykularımda nefesinin sıcaklığı\n" +
                                "o kadar\n" +
                                "hangi akşam kapımı çalan sen değilsin\n" +
                                "sen değil misin gizli bir kıvılcım gibi\n" +
                                "gözbebeklerimde duran\n" +
                                "umutsuzlandığım her akşam\n" +
                                "senin rüzgârın almıyor mu\n" +
                                "uğultulu yorgunluğumu\n" +
                                "yoksulluğun eşiğinde kapaklandığım zaman\n" +
                                "ellerimden sımsıkı tutmuyor mu senin\n" +
                                "iyimserliğin\n" +
                                "\n" +
                                "ben bu tezgâhı kurdumsa senin için kurdum\n" +
                                "senin için dokuduğum basma ve pazen\n" +
                                "denizin yeşilinden süzdüğüm balık\n" +
                                "göğün mavisinden çaldığım kuş\n" +
                                "senin için\n" +
                                "felsefe okudumsa\n" +
                                "iktisat okudumsa gece yarıları\n" +
                                "boğazım kurumuş içim bir kalabalık\n" +
                                "sıcacık mısralar okudumsa yunus' dan\n" +
                                "senin için okudum\n" +
                                "geceyarıları\n" +
                                "\n" +
                                "sen beyaz bir kadınsın\n" +
                                "uzaktaki\n" +
                                "GÖZLERİN AKLIMDAN ÇIKMIYOR\n" +
                                "sen beyaz bir kadınsın\n" +
                                "karanlıkları dinleyen\n" +
                                "uzaktaki\n" +
                                "sarmaşıkları duyuyor musun rüzgârda\n" +
                                "yorgun başını\n" +
                                "üşümüş yastığına koyuyor musun\n" +
                                "uyuyor musun");

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
                alertDialogBuilder.setTitle("Sen Burda Bir Yabancısın");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("bu rüzgarın tadı senin hiç tatmadığın\n" +
                                "bu yolcular bilmediğin bir yerden geliyor\n" +
                                "konuştukları dil ömrünce duymadığın\n" +
                                "gözlerini sakla sen burda bir yabancısın\n" +
                                "akşam tren raylarına yağmur yağıyor\n" +
                                "\n" +
                                "devrilmiş bu sokak ayak basmadığın\n" +
                                "çarmıha gerilmiş afişler ıslanıyor\n" +
                                "karanlıkta bir kadın tanımadığın\n" +
                                "bir şeyler söylüyor anlamadığın\n" +
                                "şüpheli oteller üstüne geriniyor\n" +
                                "sen burda bir yabancısın saklanmalısın\n" +
                                "akşam tren raylarına yağmur yağıyor");

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
                alertDialogBuilder.setTitle("Sen Benim Hiçbir Şeyimsin");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sen benim hiçbir şeyimsin\n" +
                                "Yazdıklarımdan çok daha az\n" +
                                "Hiç kimse misin bilmem ki nesin\n" +
                                "Lüzumundan fazla beyaz\n" +
                                "Sen benim hiçbir şeyimsin\n" +
                                "Varlığın yokluğun anlaşılmaz\n" +
                                "\n" +
                                "Galiba eski liman üzerindesin\n" +
                                "Nasıl karanlığıma bir yıldız olmak\n" +
                                "Dudaklarınla cama çizdiğin\n" +
                                "En fazla sonbahar otellerinde\n" +
                                "Üniversiteli bir kız uykusu bulmak\n" +
                                "Yalnızlığı öldüresiye çirkin\n" +
                                "Sabaha karşı öldüresiye korkak\n" +
                                "Kulağı çabucak telefon zillerinde\n" +
                                "\n" +
                                "Sen benim hiçbir şeyimsin\n" +
                                "Hiçbir sevişmek yaşamışlığım\n" +
                                "Henüz boş bir roman sahifesinde\n" +
                                "Hiç kimse misin bilmem ki nesin\n" +
                                "Ne çok çığlıkların silemediği\n" +
                                "Zaten yok bir tren penceresinde\n" +
                                "\n" +
                                "Sen benim hiçbir şeyimsin\n" +
                                "Yabancı bir şarkı gibi yarım\n" +
                                "Yağmurlu bir ağaç gibi ıslak\n" +
                                "Hiç kimse misin bilmem ki nesin\n" +
                                "Uykumun arasında çağırdığım\n" +
                                "Çocukluk sesimle ağlayarak\n" +
                                "\n" +
                                "Sen benim hiçbir şeyimsin");

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
                alertDialogBuilder.setTitle("Yalnızlık Şiiri");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Karanlığın insanı delirten bir ihtişamı vardır\n" +
                                "Yıldızlar aydınlık fikirler gibi havada salkım salkım\n" +
                                "Bu gece dağ başları kadar yalnızım\n" +
                                "\n" +
                                "Çiçekler damlıyor gecenin parmaklarından\n" +
                                "Dudaklarımda eski bir mektep türküsü\n" +
                                "Karanlıkta sana doğru uzanmış ellerim\n" +
                                "Gözlerim gözlerini arıyor durmadan\n" +
                                "Nerdesin?");

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
                alertDialogBuilder.setTitle("Nasıl Bir Sevdaysa");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("ay çok mu gecikti neredeyse çıkar\n" +
                                "sen yanlızlığıma varır varmaz\n" +
                                "az sonra yağmuru durduracaklar\n" +
                                "rüzgarı değiştirdim\n" +
                                "ustura ağzı poyraz\n" +
                                "\n" +
                                "yok canım yıldızları unutmadık\n" +
                                "mutlaka yerlerinde bulunacaklar\n" +
                                "kenarı yaldızlı mavi bir karanlık\n" +
                                "sütlü çıplaklığını örtecek kadar\n" +
                                "\n" +
                                "senin için olduğu asla bilinmeyecek\n" +
                                "yapraklarını birden dökecek dutlar\n" +
                                "şafak sökerken sekiz on kadar şimşek\n" +
                                "balkonda işlemeli müstesna bulutlar\n" +
                                "\n" +
                                "ayak bastığın an şehir de değişebilir\n" +
                                "yoksa Moskova mı\n" +
                                "belki berlin belki dakar\n" +
                                "belki 30'lardan mehtap yorgunu izmir\n" +
                                "körfez'de şerefine donatılmış vapurlar\n" +
                                "\n" +
                                "nerede ne zaman kaç kere yaşadık\n" +
                                "nasıl bir sevdaysa eskitememiş yıllar\n" +
                                "bitirdiğimiz herşeye yeniden başladık\n" +
                                "dudaklarımızda birbirimizden mısralar\n");

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
                alertDialogBuilder.setTitle("An Gelir");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("an gelir\n" +
                                "paldır küldür yıkılır bulutlar\n" +
                                "gökyüzünde anlaşılmaz bir heybet\n" +
                                "o eski heyecan ölür\n" +
                                "an gelir biter muhabbet\n" +
                                "çalgılar susar heves kalmaz\n" +
                                "şatârâbân ölür\n" +
                                "\n" +
                                "şarabın gazabından kork\n" +
                                "çünkü fena kırmızıdır\n" +
                                "kan tutar / tutan ölür\n" +
                                "sokaklar kuşatılmış\n" +
                                "karakollar taranır\n" +
                                "yağmurda bir militan ölür\n" +
                                "\n" +
                                "an gelir\n" +
                                "ömrünün hırsızıdır\n" +
                                "her ölen pişman ölür\n" +
                                "hep yanlış anlaşılmıştır\n" +
                                "hayalleri yasaklanmış\n" +
                                "an gelir şimşek yalar\n" +
                                "masmavi dehşetiyle siyaset meydanını\n" +
                                "direkler çatırdar yalnızlıktan\n" +
                                "sehpada pir sultan ölür\n" +
                                "\n" +
                                "son umut kırılmıştır\n" +
                                "kaf dağı'nın ardındaki\n" +
                                "ne selam artık ne sabah\n" +
                                "kimseler bilmez nerdeler\n" +
                                "namlı masal sevdalıları\n" +
                                "evvel zaman içinde\n" +
                                "kalbur saman ölür\n" +
                                "kubbelerde uğuldar bâkî\n" +
                                "çeşmelerden akar sinan\n" +
                                "an gelir\n" +
                                "-lâ ilâhe illallah-\n" +
                                "kanunî süleyman ölür\n" +
                                "\n" +
                                "görünmez bir mezarlıktır zaman\n" +
                                "şairler dolaşır saf saf\n" +
                                "tenhalarında şiir söyleyerek\n" +
                                "kim duysa / korkudan ölür\n" +
                                "-tahrip gücü yüksek-\n" +
                                "saatlı bir bombadır patlar\n" +
                                "an gelir\n" +
                                "attilâ ilhan ölür\n");

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
                alertDialogBuilder.setTitle("Yasak Sevişmek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("öteki kapımdan gel bunu açamazsın\n" +
                                "eski gözlerinle gel öldürmek vakti gel\n" +
                                "hem tetik bulun ardında biri olmasın\n" +
                                "hanidir ben bu evde saklanıyorum\n" +
                                "adımı değiştirdim başka bir adla yaşıyorum\n" +
                                "gece gündüz siyah gözlük kullanıyorum\n" +
                                "öteki kapımdan gel bunu açamazsın\n" +
                                "sabaha karşı gel bütün gözlerinle gel\n" +
                                "\n" +
                                "pancurların gerisinde kararıyorum\n" +
                                "içime belalar doğuyor sonbahar doğuyor\n" +
                                "telefonda sesini tanıyamıyorum\n" +
                                "yüzün parmaklarımdan akıp kayboluyor\n" +
                                "böyle hep bir şey kopuyor bir şey kırılıyor\n" +
                                "sabaha karşı gel eski gözlerinle gel\n" +
                                "öteki kapımdan gel bunu açamazsın\n" +
                                "hem tetik bulun ardında biri olmasın\n" +
                                "\n" +
                                "artık hiç kimse beni yaşamıyor\n" +
                                "aşklarımı büyük kemanlarla çizdiler\n" +
                                "korkularım oldum bittim kimsesizdiler\n" +
                                "yalnız bir mısra mıyım ıslanıyorum\n" +
                                "bir revolver romanımı tamamlıyor\n" +
                                "oyun bitti ışıklarımı söndürdüler\n" +
                                "yokmuşsun gibi gel öldürmek vakti gel\n" +
                                "öteki kapımdan gel bunu açamazsın\n" +
                                "üzerime kilitleyip mühürlediler\n" +
                                "hem tetik bulun ardında biri olmasın");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}