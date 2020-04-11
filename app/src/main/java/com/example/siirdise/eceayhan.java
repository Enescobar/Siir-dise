package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eceayhan extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eceayhan);
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
                alertDialogBuilder.setTitle("Açık Atlas");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Hayattan ders veriyor diye öğretmenleri kızdıran\n" +
                                "Tuzu bir bulmuş çocukları saklamadan güldüren dünyaya\n" +
                                "Su kaçırmaz bir eşeğin sesine açıktır penceresi\n" +
                                "Bir sınıfın, batı son dersinde, kuşluk vakti\n" +
                                "\n" +
                                "Meşeler yapraklanınca bir tuhaf olurlar işte\n" +
                                "Koparılmış kürt çiçekleri, hatırlayarak amcalarını\n" +
                                "Azınlıkta oldukları bir okulda bile, sorarlar soru\n" +
                                "Neden feriklerin ve eşeklerin memeleri vardır?\n" +
                                "\n" +
                                "En arka sırada çift dikişliler, sınavda en öne\n" +
                                "İntihara ve denizde nasıl boğulmaya çalışırlar\n" +
                                "Yalnız Orta Doğu'da el altında satılan bir atlas\n" +
                                "Kim demiş on sekiz yaşından küçükler okuyamaz\n" +
                                "\n" +
                                "Bakıldı ki kum saati, ters çevrilmiş, çıt, usul isa asi olmuş\n" +
                                "İkinci karnede babası yarısını silahıyla dışarda bırakıp\n" +
                                "Öyle öğretildiği için saygılı, sınıfa giren parmak çocuğun\n" +
                                "Boş yerine, girilmeyen bir dersin denizi, gelip oturmuş\n" +
                                "\n" +
                                "Açık kalmış atlası, deniz taşmıştır, darılmasın Fırat ama\n" +
                                "\n" +
                                "Hayatın orta öğretmeni sustu, dondu gülmeleri çocukların\n" +
                                "Bir cenaze töreninde daha ölümlü karşılamaya götürüleceğiz\n" +
                                "\n" +
                                "Efendiler! Eşekler susabilirler\n" +
                                "Ne yani çocuklar hiç gülmeyecekler mi?");
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
                alertDialogBuilder.setTitle("Anahtarlar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Çünkü kapıları\n" +
                                "götürüyorlar (öyle yanlış ki)\n" +
                                "Cam kırıkları üzerinde\n" +
                                "Gülüyor ve\n" +
                                "Gülen artık çingene değildir\n" +
                                "Değil mi değil\n" +
                                "Bilmem şu uzakta odaların\n" +
                                "Pancurlarını açmışlar\n" +
                                "Açmışlar mı açmışlar\n" +
                                "Denize karşı\n" +
                                "(deniz yoktur ya)\n" +
                                "İçerdekiler içerlerde\n" +
                                "Dışardakiler dışarlarda kalmışlar\n" +
                                "Kalmışlar mı kalmışlar\n" +
                                "Anahtarları çalan bir çingenedir\n" +
                                "Bir çingene mi bir çingene bire");

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
                alertDialogBuilder.setTitle("Çapalı Karşı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Çünkü kapıları\n" +
                                "götürüyorlar (öyle yanlış ki)\n" +
                                "Cam kırıkları üzerinde\n" +
                                "Gülüyor ve\n" +
                                "Gülen artık çingene değildir\n" +
                                "Değil mi değil\n" +
                                "Bilmem şu uzakta odaların\n" +
                                "Pancurlarını açmışlar\n" +
                                "Açmışlar mı açmışlar\n" +
                                "Denize karşı\n" +
                                "(deniz yoktur ya)\n" +
                                "İçerdekiler içerlerde\n" +
                                "Dışardakiler dışarlarda kalmışlar\n" +
                                "Kalmışlar mı kalmışlar\n" +
                                "Anahtarları çalan bir çingenedir\n" +
                                "Bir çingene mi bir çingene biree");

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
                alertDialogBuilder.setTitle("Fayton");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("O sahibinin sesi gramofonlarda çalınan şey\n" +
                                "incecik melankolisiymiş yalnızlığının\n" +
                                "intihar karası bir faytona binmiş geçerken ablam\n" +
                                "caddelerinden ölümler aşkı pera'nın\n" +
                                "\n" +
                                "Esrikmiş herhal bahçe bahçe çiçekleri olan ablam\n" +
                                "çiçeksiz bir çiçekçi dükkanının önünde durmuş\n" +
                                "tüllere sarılmış mor bir karadağ tabancasıyla\n" +
                                "zakkum fotoğrafları varmış cezayir menekşeleri camekânda\n" +
                                "\n" +
                                "Ben ki son üç gecedir intihar etmedim hiç, bilemem\n" +
                                "intihar karası bir faytonun ağışı göğe atlarıyla birlikte\n" +
                                "cezayir menekşelerini seçip satın alışından olabilir mi ablamın");

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
                alertDialogBuilder.setTitle("Gökyüzün de Bir Cenaze Töreni");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Düşmemiş Hezarfen Efendi'yle karşılaşır mı acaba?\n" +
                                "\n" +
                                "Bir bakmışım baloncusu uçmuş kan mavisi balonlar\n" +
                                "Kuşların vurulduğu mevsim Üsküdar iskele alanında\n" +
                                "\n" +
                                "Bir bakmışım gökyüzünde gömülmez bir cenaze töreni\n" +
                                "Ve aşağıda, yıkanmış balonlar demetinin başında\n" +
                                "\n" +
                                "Kurşun ayaklı bir parmak çocuk, kırılır ağlamaz\n" +
                                "Ölümü ustaca oyalayan babam öldürülmüş ben satarım\n" +
                                "\n" +
                                "Kopmuş bir kocakarının da eteklerinde azat kuşları\n" +
                                "Oğlum öldürülmüş ben satarım Üsküdar iskele alanında");

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
                alertDialogBuilder.setTitle("Usta İşi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Kollarında eski balık dövmeleri\n" +
                                "teodor kasap perhiz ahali içmez\n" +
                                "ay türkçe rakı çıkmıştır kapalı\n" +
                                "ve geniş muhlis sabahattin'den\n" +
                                "ayşe opereti ne güzel bir hiç\n" +
                                "\n" +
                                "Üç yıllar var ki minyatürlere mahkûm\n" +
                                "teodor'un o eski balık dövmeleri\n" +
                                "ay osmanlılaşmış abi tüfekçi olmuş\n" +
                                "ve korkunç taş gülmekler muhlis'te\n" +
                                "gibi merdivenli bir sokaklar uzatmış\n" +
                                "çiçek bahçelerine kaçabilsin ayşe\n" +
                                "atlı tramvaylarla ne güzel bir hiç\n" +
                                "\n" +
                                "İşte o biçim gecelerde kucaklamış\n" +
                                "getirir enflasyon arkadaşlarını\n" +
                                "kova abdülhamit akşam gazeteleri\n" +
                                "dağlar gibi yalnızlık ne güzel bir hiç.");

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
                alertDialogBuilder.setTitle("Üç Gencin Kalbi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir gemici tanırım\n" +
                                "Kalbini bir limanda bırakmış\n" +
                                "Ya kaybolursa?\n" +
                                "Ağlar çocukluğundaki gibi\n" +
                                "Kalbini almaya gidecek hâlâ\n" +
                                "\n" +
                                "Bir oğlan tanırım\n" +
                                "Derin yeşil gözlü\n" +
                                "Gönlü güney denizlerinin dibi\n" +
                                "Kalbi ise yerinde\n" +
                                "Birine vermeye gidecek\n" +
                                "Bir gemi arar durur\n" +
                                "Bulutlardan.\n" +
                                "\n" +
                                "Bir şair tanırım\n" +
                                "Onunki içler acısı\n" +
                                "Kalbini asla vermemiş\n" +
                                "Çalmışlar\n" +
                                "Kalbi eski bir efsanede saklı.");

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
                alertDialogBuilder.setTitle("Şiirin Deniz Kıyısında ki Sesi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Denize atılmış şiirdir bence\n" +
                                "Yurtsayan, yurdu bilinmeyen bir yıldız\n" +
                                "\n" +
                                "Şiirin deniz kıyısındaki sesine bırakılmış ölümdür\n" +
                                "yanacak sarayların kestiği bir, yarım ay.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });



    }
}