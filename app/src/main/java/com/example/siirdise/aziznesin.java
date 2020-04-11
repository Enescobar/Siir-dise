package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aziznesin extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aziznesin);
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
                alertDialogBuilder.setTitle("67. Yaş");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Benim doğduğum gün\n" +
                                "Günler uzamaya başlar\n" +
                                "Öyle bir öleceğim ki\n" +
                                "Geceler uzamaya başlayacak\n" +
                                "Ve öyle bir öleceğim ki\n" +
                                "Günlerle gecelerden başka\n" +
                                "Hiçkimse öldüğümü anlamayacak");
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
                alertDialogBuilder.setTitle("Acının Duvarı Aşılınca");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Benim doğduğum gün\n" +
                                "Günler uzamaya başlar\n" +
                                "Öyle bir öleceğim ki\n" +
                                "Geceler uzamaya başlayacak\n" +
                                "Ve öyle bir öleceğim ki\n" +
                                "Günlerle gecelerden başka\n" +
                                "Hiçkimse öldüğümü anlamayacak");

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
                alertDialogBuilder.setTitle("Aşk Üzre");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sevişirken yılan bile dokunmaz\n" +
                                "Tapınmakta aşktan saygın olamaz\n" +
                                "Sevda üzre yıldırım olsa çarpmaz\n" +
                                "İstiyorsan uzak kalmak ölümden\n" +
                                "Hep aşk üzre olmaslısın a caanım\n" +
                                "Ki ölüm de sevişirken kıyamaz");

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
                alertDialogBuilder.setTitle("Beklemek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Gözler önünde işte\n" +
                                "Gittikçe arınıyorum kendimden\n" +
                                "Her giden güzelleşir\n" +
                                "Gidiyorum güzelleşmek için\n" +
                                "Unutulsun diye çirkinliklerim\n" +
                                "Gelecek birisi güzeldir\n" +
                                "Gelince güzel değil\n" +
                                "Hele gelmişse çirkin\n" +
                                "Yaşam, ölüm gelecek diye güzel\n" +
                                "Ey güzeller güzeli beklediğim\n" +
                                "Kaç saatim, kaç dakikam ya da saniyem\n" +
                                "Artık ne gelmek ne de gitmek\n" +
                                "Yaşamın en zor yanı beklemek\n" +
                                "Hiçbirimiz beklemedik doğmayı,\n" +
                                "Doğduğumuzdan beri beklediğimiz\n" +
                                "ÖLMEK");

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
                alertDialogBuilder.setTitle("Boşuna");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Sen yoksun.........\n" +
                                "Boşuna yağıyor yağmur...\n" +
                                "Birlikte ıslanmayacağız ki.....\n" +
                                "Boşuna bu nehir......\n" +
                                "Çırpınıp pırpırlanması.....\n" +
                                "Kıyısında oturup göremeyeceğiz ki...\n" +
                                "Uzar uzar gider..\n" +
                                "Boşuna yorulur yollar..\n" +
                                "Birlikte yürüyemiyeceğiz ki..\n" +
                                "Özlemlerde ayrılıklar da boşuna\n" +
                                "Öyle uzaklardayız..\n" +
                                "Birlikte ağlayamayacağız ki\n" +
                                "Seviyorum seni boşuna..\n" +
                                "Boşuna yaşıyorum\n" +
                                "Yaşamı bölüşemiyeceğiz ki ...");

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
                alertDialogBuilder.setTitle("En Güzel");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bu müze var ya bu müze\n" +
                                "Seninle gezerken güzel\n" +
                                "Kimseler yoksa salonda\n" +
                                "Seni öpmek en güzel\n" +
                                "Bu rakı var ya bu rakı\n" +
                                "Seninle içerken güzel\n" +
                                "Kimler olursa olsun varsın\n" +
                                "Rakılı ağzından öpmek en güzel\n" +
                                "İşte bu dünya var ya bu dünya\n" +
                                "Seninle yaşarken güzel\n" +
                                "Sen varsın ya sen\n" +
                                "Ancak benimleysen güzel");

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
                alertDialogBuilder.setTitle("Güneş Doğunca");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("O çırılçıplak gecede\n" +
                                "Sen sendin ben de ben\n" +
                                "Bütün gece güneş açtık öpüşlerden\n" +
                                "Gün doğunca ne oldu birden\n" +
                                "O sabah kendi soğuğumuzdan\n" +
                                "Kar yağdırdık güneşten\n" +
                                "hep o korkuydu içimdeki\n" +
                                "Ya sen de sen değilsen.");

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
                alertDialogBuilder.setTitle("Şiire Tutunmak");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yok başka hiçbir umarın\n" +
                                "En granit kayanın en ortasında\n" +
                                "Balta girmemiş karanlıklarında kıpırtısız\n" +
                                "Ya ölmektir kurtuluşun\n" +
                                "Yada şiir tutunmak\n" +
                                "\n" +
                                "O en gergin tele şöyle bir dokun\n" +
                                "Son tınıyla tel kopsun\n" +
                                "Ayak sesleri duyulsun ölümün\n" +
                                "Her yanın her yönün çıkmaz\n" +
                                "Nereye baksan yok\n" +
                                "Hiç bile herşey sayılır o bulunduğun yerde\n" +
                                "Kurtarırsa kurtarır ancak\n" +
                                "Yine şiire tutunmak.");

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
                alertDialogBuilder.setTitle("Ölüme Eğilmek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Uyumaya değil\n" +
                                "Rüyalarıma gidiyorum\n" +
                                "Orada yaşayacağım isteğimce\n" +
                                "Uyanıkken hiç yaşayamadığım\n" +
                                "Hepsi de gençti güzeldi\n" +
                                "Sevdim sevildim diye aldanarak\n" +
                                "Son gördüğüm onlar olacak\n" +
                                "Bunca yıldır sevgiye dayanamadığım\n" +
                                "Ölüme değil\n" +
                                "Sonsuzluğa gidiyorum\n" +
                                "Orda dinleneceğim gönlümce\n" +
                                "Yaşarken hiç mi hiç dinlenemediğim\n" +
                                "Kalemim yine elimde\n" +
                                "Kağıtlarım da önümde\n" +
                                "Son uykusunda düşecek başım\n" +
                                "Sağlığımda hiç eğmediğim.");

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
                alertDialogBuilder.setTitle("Okul");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Mapus damı bana çok şey öğretti\n" +
                                "Ama en çok sabretmeyi\n" +
                                "Yalnızken kalabalık olmayı\n" +
                                "Kalabalıktayken de kendimle kalmayı\n" +
                                "Ve sürekli kavga edip\n" +
                                "Durmadan kendimle barışmayı\n" +
                                "Hiç göçünüp yüksünmeden\n" +
                                "İhanetlere katlanmayı\n" +
                                "Beş metrede beşbin metreyi yürümeyi\n" +
                                "Ve duvarların darlığında\n" +
                                "Dünyaları dolaşmayı\n" +
                                "Ve hepsinden de çok\n" +
                                "Bütün yuvarlakları yüreğimde bileyip sivriltmeyi\n" +
                                "İnsan olmayı insan olmayı..\n");

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
                alertDialogBuilder2.setTitle("Merak");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("içimde bir merak\n" +
                                "öyle bir merak ki\n" +
                                "ölümümden bir ay sonra\n" +
                                "bir güncük yaşamak\n" +
                                "ve\n" +
                                "dostu düşmanı\n" +
                                "suç üstü yakalamak");

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
                alertDialogBuilder.setTitle("Susarak");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Güneş altında söylenmedik söz yokmuş..\n" +
                                "Bu yüzden geceleri söylüyorum sevdiğimi..\n" +
                                "Ne gece ne gündüz yokmuş söylenmemiş söz..\n" +
                                "Bende söylenmişleri söylüyorum yeni biçimde..\n" +
                                "Hiç bir biçim kalmamış dünyada denenmedik...\n" +
                                "Bende susuyorum sevgimi saklayıp içimde....\n" +
                                "Duyuyorsun değilmi suskunluğumu nasıl haykırıyor...\n" +
                                "Susarak sevgisini ilan eden çok var sevgilim ...\n" +
                                "Ama bir başka seven yok benim sustuğum biçimde ...");

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
                alertDialogBuilder.setTitle("İnsanlar Gider");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("insanlar gider şarkıları kalır\n" +
                                "şarkılar var uzun\n" +
                                "yüzyıllar dolanır\n" +
                                "şarkılar var kısa\n" +
                                "söylendiği yerde kalır\n" +
                                "şarkılar var benim şarkılarım\n" +
                                "söyletmezler içimde kalır.\n");

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
                alertDialogBuilder.setTitle("Yaşıyorum Demek");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Çok merak ediyorum kendimi\n" +
                                "Başıma birşey mi geldi\n" +
                                "Öldüm mü kaldım mı\n" +
                                "Hiçbir haber yok kendimden\n" +
                                "\n" +
                                "Bu sabah kapımı çaldım\n" +
                                "Kapıyı açan kendim\n" +
                                "Bir süre kendime baktım\n" +
                                "Bu güleç yüz bendim\n" +
                                "\n" +
                                "Oh ne güzel bir sabah\n" +
                                "Bugün de yaşıyorum demek\n" +
                                "Benden başka yok kimsem\n" +
                                "Beni merak edecek.");

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
                alertDialogBuilder.setTitle("Hoşçakal Güzel Dünyam");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Hiç kimse buyur etmedi beni\n" +
                                "Bu dünyada hiçbir yere\n" +
                                "Ama açtım bütün kapıları tekmeleyerek\n" +
                                "Bütün engelleri göğüsleyip yıkarak\n" +
                                "Buyrun dediler o zaman incelikle\n" +
                                "Buyur ettiler\n" +
                                "Ve\n" +
                                "Buyurdum\n" +
                                "\n" +
                                "Elimden geldiğince görevimi yaptım\n" +
                                "Gülümsedim hıçkırıklarımı boğarak\n" +
                                "Sonunda kimsenin yorulmadığı denli yoruldum\n" +
                                "Artık kapılar açık kalsın\n" +
                                "Bundan sonra gireceklere\n" +
                                "Şimdi dinlenmeye gidiyorum\n" +
                                "Hoşcakal güzel dünyam.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });



    }
}