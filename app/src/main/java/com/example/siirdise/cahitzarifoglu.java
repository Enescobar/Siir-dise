package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cahitzarifoglu extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cahitzarifoglu);
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
                alertDialogBuilder.setTitle("Hızlı Akan Mızrak");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sabahtır\n" +
                                "Alkışlar gecenin\n" +
                                "Sıcak damları sükûn yapılarıyla\n" +
                                "Aydınlatır bir ucundan\n" +
                                "Kahvaltı sofrasında çay tasını\n" +
                                "\n" +
                                "Düzgün uysal\n" +
                                "Işıklı bir de ağız\n" +
                                "Gizlice götürür hücreyi bütüne\n" +
                                "Ve akla her gelen telgraf telinde\n" +
                                "Öpüşür iki güvercin\n" +
                                "İncelmiş ve yumuşamış gagalarıyla\n" +
                                "\n" +
                                "Bu geçen mızrak\n" +
                                "Kalın kararlı\n" +
                                "Atanın değer biçilmez atıyla\n" +
                                "Kuşkusuz yolunda gerek\n" +
                                "\n" +
                                "Mızrak geçer ışığı\n" +
                                "Geçer geceyi dolduran karanlığı da");
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
                alertDialogBuilder.setTitle("Saç");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Zili - siz geldiniz -pamağınız durunca\n" +
                                "a saçlısı biraz karşınızda\n" +
                                "Ama durun uzun zaman önce\n" +
                                "daha sizinle karşılaşmadan\n" +
                                "dört köşeli\n" +
                                "kavşaktaki odada\n" +
                                "çook uzun daha dikdörtgen\n" +
                                "masa duruyor.\n" +
                                "\n" +
                                "Korkuyu herşeyden çok orda\n" +
                                "Bir de zil sesinizi alınca\n" +
                                "Daha size banyoyu\n" +
                                "Havasız banyoyu açmadan\n" +
                                "Korkuyu götürüp kilere\n" +
                                "Kum torbasının içine tutuyor.\n" +
                                "\n" +
                                "Oyuncak saklı gelişinizle\n" +
                                "küçük yamyam ağızlı\n" +
                                "yassı alnını\n" +
                                "her gülüşün içinde tutan\n" +
                                "yontma biçimiyle a saçlısı\n" +
                                "karşınızda hemen\n" +
                                "\n" +
                                "a saçlısı\n" +
                                "daha herşeyi anlaşılmadan\n" +
                                "daha siz ona aydınlanmadan\n" +
                                "geçici bir bilardo alanında\n" +
                                "kuzgun hançerli\n" +
                                "sakal gibi el içen\n" +
                                "donuk\n" +
                                "solgun kaçışlı\n" +
                                "sevmeye ve sevdirmeye\n" +
                                "\n" +
                                "bir erke biçimi geyik salmış\n" +
                                "a saçlısı\n" +
                                "durunca güvercinli kapıda\n" +
                                "mesela oldukça bir viyanadan\n" +
                                "meçhul bir bayın göğe yaslanan şapkasıyla\n" +
                                "elverişli çay sergisi");

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
                alertDialogBuilder.setTitle("Sen Kuş Olur Gidersin Bir Trenle");
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
                alertDialogBuilder.setTitle("Taş Gemi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("biraz yukardan\n" +
                                "taş et\n" +
                                "ot mu yoksa\n" +
                                "taşetot\n" +
                                "alır şaşmadan\n" +
                                "gündüzden geceye geceden gündüze\n" +
                                "ve bütün geleceklere\n" +
                                "çağırır şimdiden ve el koyar\n" +
                                "ne varsa\n" +
                                "ne dökülse küreden\n" +
                                "\n" +
                                "güneşi çıkarırken toprak\n" +
                                "bir de süsler koşturur insanoğlunun\n" +
                                "bir günlük atını\n" +
                                "sıcak el üfler güneşi karnında köpükleriyle\n" +
                                "bir göl huzurundan tutşup\n" +
                                "başlar yanmaya\n" +
                                "ve seslenir yüce dağ\n" +
                                "serin\n" +
                                "toplar kartalı yılanıyla\n" +
                                "\n" +
                                "atlasın omuzlarından gencecik kayalar\n" +
                                "eğildiler bir mermerin önüne\n" +
                                "\n" +
                                "koşunuz ak saçlı bulutlar\n" +
                                "denize yakın\n" +
                                "bir çakılın kızgın yapısında\n" +
                                "güneşle ilk kez selama durmuş\n" +
                                "narin gövdeli soylu karınca");

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
                alertDialogBuilder.setTitle("Zamana Yay Gerip Ok Atmak");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("biraz yukardan\n" +
                                "taş et\n" +
                                "ot mu yoksa\n" +
                                "taşetot\n" +
                                "alır şaşmadan\n" +
                                "gündüzden geceye geceden gündüze\n" +
                                "ve bütün geleceklere\n" +
                                "çağırır şimdiden ve el koyar\n" +
                                "ne varsa\n" +
                                "ne dökülse küreden\n" +
                                "\n" +
                                "güneşi çıkarırken toprak\n" +
                                "bir de süsler koşturur insanoğlunun\n" +
                                "bir günlük atını\n" +
                                "sıcak el üfler güneşi karnında köpükleriyle\n" +
                                "bir göl huzurundan tutşup\n" +
                                "başlar yanmaya\n" +
                                "ve seslenir yüce dağ\n" +
                                "serin\n" +
                                "toplar kartalı yılanıyla\n" +
                                "\n" +
                                "atlasın omuzlarından gencecik kayalar\n" +
                                "eğildiler bir mermerin önüne\n" +
                                "\n" +
                                "koşunuz ak saçlı bulutlar\n" +
                                "denize yakın\n" +
                                "bir çakılın kızgın yapısında\n" +
                                "güneşle ilk kez selama durmuş\n" +
                                "narin gövdeli soylu karınca");

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
                alertDialogBuilder.setTitle("Aylak Göz");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Erkenden aşındırır aşkını\n" +
                                "Odaların köşelerine zamansız oturur\n" +
                                "Duyarsa bir çocuğun\n" +
                                "Oyundan çağrıldığını\n" +
                                "\n" +
                                "Başının her seferinde döndüğü kumarı\n" +
                                "Gönlünü bir tarzla kurularken kazanır\n" +
                                "Anlarsa yenilen bir kadının\n" +
                                "Darda kaldığını\n" +
                                "\n" +
                                "Kendi kendine ardaşak kaçağı\n" +
                                "Arada bir bakınır ne yaptığına\n" +
                                "Süresiz kıpılır tablolara yangelir\n" +
                                "Ve oturdu mu bir masaya\n" +
                                "Hakkını verir çay içmenin\n" +
                                "\n" +
                                "Bu adam kitapların uçlarına\n" +
                                "çizilmiş itilmiş resim\n" +
                                "Korkmadan yaşar tebessum gösterir\n" +
                                "Ağır başıyla nöbet alır\n" +
                                "Dağdan kaçar şehri çevirir\n" +
                                "Ve bırakır gönlünü bir tazı sıçramasına\n" +
                                "\n" +
                                "Erkenden aşındırır aşkını\n" +
                                "Anlamaz bir kadının\n" +
                                "Süresiz kapılıp yangeldiği tablolara\n" +
                                "Severek tebessüm attığını\n" +
                                "Ağır başıyla kopar dağdan\n" +
                                "Nöbet alır şehri devirir");

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
                alertDialogBuilder.setTitle("Koşu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Mağaralar taştan yolcu örüyor\n" +
                                "Böyle üstünlük görülmemiştir bir bebek\n" +
                                "Göğü sevmeyi\n" +
                                "Ve yerden korkmayı biliyor\n" +
                                "Kendine bir ses bekliyor bir sarık\n" +
                                "Aleme tanrı\n" +
                                "\n" +
                                "Bir bebek susar nihayet\n" +
                                "Sezer de ağaçların otların\n" +
                                "Topraktan çıktığını\n" +
                                "\n" +
                                "Bir bebek ağlar\n" +
                                "Bir bebek mor ağzından\n" +
                                "Bilinir söyleyince\n" +
                                "\n" +
                                "Zerdüşt nereye gittiyse\n" +
                                "Hep kartalı gördü\n" +
                                "\n" +
                                "Ve güneş tek hüneriyle\n" +
                                "Bir yaprağı kertenkeleyi çakıltaşını\n" +
                                "Ve mor olduğunu suların\n" +
                                "\n" +
                                "Beyin tırtıl\n" +
                                "Taş taşlar taşların\n" +
                                "Dipsiz süresiz seslerine tırmanır\n" +
                                "Çünkü ses katlanır\n" +
                                "Kazılır kayalara\n" +
                                "Ses geçilir iki kaşın arasından\n" +
                                "Sonsuz nefes alır\n" +
                                "Ülkedir dudakta\n" +
                                "\n" +
                                "Zerdüşt neredeyse\n" +
                                "Kartal orada yığınak\n" +
                                "O\n" +
                                "Zincirli ayakların durmadan çıktığı\n" +
                                "Tek bir basamak\n" +
                                "\n" +
                                "Kaya gözlü ağaç saçlı\n" +
                                "Taşın içindeki böcek\n" +
                                "Bu ilk fırtına kapısında\n" +
                                "\n" +
                                "Taşın içinde böcek\n" +
                                "Taşır kendini yürür\n" +
                                "Bedenini bir uçtan bir uca\n" +
                                "Nabzı vurur dinler şaşırır\n" +
                                "Çalışan eşyasını yakalar\n" +
                                "Sorar fare kuş balık\n" +
                                "\n" +
                                "her şey kendi yerinde\n" +
                                "Taşın içindeki böcek\n" +
                                "Ki inanır\n" +
                                "Ve çatlar taş\n" +
                                "\n" +
                                "Gök eğilir\n" +
                                "O geçer kartalıyla\n" +
                                "\n" +
                                "Yüreği büyülenir burkulur\n" +
                                "Gözleri gerilir\n" +
                                "Ağzından bir donanmayla bekler\n" +
                                "Mermer yerine şahlanır\n" +
                                "Çizilir kanar\n" +
                                "\n" +
                                "Bardağa ilk düşen damlasında\n" +
                                "Uyuyan güvercin\n" +
                                "Ve ilk taşan damlasında\n" +
                                "Bir azgın güvercin\n" +
                                "Bulutları saçlarından sürükler\n" +
                                "Bayram yerlerini geçer hızla\n" +
                                "\n" +
                                "Bir sabah kartalın bembeyaz kadınıyla\n" +
                                "Dağlardan düzlere nehirlerle\n" +
                                "Çırpınarak çığlıklar atarak\n" +
                                "O\n" +
                                "Durmadan saratustra");

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
                alertDialogBuilder.setTitle("Ölü Atlar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Karışık bir iç deniz bunalımı\n" +
                                "Zafersiz bir kalyonda\n" +
                                "Ölümün her anki hatırasından uzak\n" +
                                "insanı her halinden tanıyan\n" +
                                "sakat bir ölü atlar alıcısı\n" +
                                "\n" +
                                "Ucuza kilitlenmiş bir dağ ceylanı\n" +
                                "Ancak bir tabuyu öldürecek bir zamanda\n" +
                                "göğün bütün ön görmelerinden uzak\n" +
                                "fenerler tutulup tekmeler atılan\n" +
                                "önemli bir es çağ tanrısı\n" +
                                "\n" +
                                "telaşla yenilen analarda kayboluşları\n" +
                                "sevgisiz kalan babalarda\n" +
                                "lekesiz bir güneşle ancak\n" +
                                "çocuğunu sardığı bezler arınan\n" +
                                "ağrıtmaz sanılan bir yaşamak şarkısı\n" +
                                "\n" +
                                "ikisinden birini örter kanadı\n" +
                                "durulmayıp tebessüm ettirilen şarkıda\n" +
                                "sevinçsiz canlara dayanmak\n" +
                                "her an bir başka ışıksızı arayan\n" +
                                "acıması bir çocuğun masal cücelerine");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}