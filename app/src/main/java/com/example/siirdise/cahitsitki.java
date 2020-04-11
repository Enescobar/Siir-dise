package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cahitsitki extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cahitsitki);
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
                alertDialogBuilder.setTitle("Aşk Adamı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Dolaştığım denizlerce düşünüyorum,\n" +
                                "Bineceğim son gemi değil midir\n" +
                                "Hayır sahibi omuzlarda giden tabut.\n" +
                                "Herkes gibi teselliye muhtaç olsaydım eğer,\n" +
                                "Derdim ki: 'Elbet bir ağlayanım olur benim de;\n" +
                                "Ramazan geceleri Yasin okuyanım,\n" +
                                "Baharda kabrime menekşe getirenim de.'\n" +
                                "\n" +
                                "Fakat bütün bunlar da olur,\n" +
                                "Yine tasa etmem,\n" +
                                "Yine kırılmam kimseye.\n" +
                                "Ben aşk adamıyım,\n" +
                                "Sevmeye geldim insanları,\n" +
                                "Gönlümle, elimle, kafamla sevmeye;\n" +
                                "Hesapsız, karşılıksız,\n" +
                                "Ayrılık gayrilik gözetmeden.\n" +
                                "Gün gelip gidersem şayet,\n" +
                                "Öyle severekten gideceğim ki,\n" +
                                "Karanlık kıyılardan bile olsa,\n" +
                                "Candan selamlarım,\n" +
                                "Civarımdan geçecek gemileri;\n" +
                                "Güneşli gemileri;\n" +
                                "Şarkılı gemileri;\n" +
                                "İçlerinde kendim varmışım gibi!");
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
                alertDialogBuilder.setTitle("Aşk Masalı");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Nerde ne zaman bu hava çalınsa\n" +
                                "Hoş geldi geçmişteki güzel günler\n" +
                                "Nereye gidersen git günlük tasa\n" +
                                "Bırak biraz da şad olsun gönüller\n" +
                                "\n" +
                                "Beşiktaş'ta gün görmüş bir bahçede\n" +
                                "Nisan akşamlarının en tatlısı\n" +
                                "Sevdiceğim on dördünü sürmede\n" +
                                "Bende gönüllerin en kanatlısı\n" +
                                "\n" +
                                "Ben delikanlıyım o kız ve dilber\n" +
                                "Bahar kokan o yanıp tutuşan ben\n" +
                                "Şakadan derken dalmışız beraber\n" +
                                "Aşk bahçesine çıkılmaz içinden\n" +
                                "\n" +
                                "Ölüyorum senin için güzelim\n" +
                                "Nasıl gülüp sokuluyor sahi mi\n" +
                                "Saçlarını okşayan hangi elim\n" +
                                "Kollarımda o yarin kendisi mi\n" +
                                "\n" +
                                "Çöl olsa aşar dağ olsa yıkarım\n" +
                                "Bizi ayıran kalın duvarları\n" +
                                "Bu acı gerçeğe sonradan vardım\n" +
                                "Gök çoktan yeşildir,dal çoktan sarı\n" +
                                "\n" +
                                "Bir define var gitsem bulur muyum\n" +
                                "Öpüştüğümüz ağaçlar altında\n" +
                                "Sevmek devam eden en güzel huyum\n" +
                                "İnsan bir kere sever hayatında\n" +
                                "\n" +
                                "Ben değilim söz açan gelecekten\n" +
                                "Var mı yok mu alemde bir o akşam\n" +
                                "Hiçbir şey istemiyorum felekten\n" +
                                "Bir daha seninle beraber olsam");

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
                alertDialogBuilder.setTitle("Bahar Sarhoşluğu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İlk sevgilimin gülüşüne benzer\n" +
                                "Bir Nisan havası değil mi esen?\n" +
                                "Zincirlere, kelepçelere inat,\n" +
                                "Kanatlarımı açmak zamanıdır;\n" +
                                "Allahaısmarladık kaldırımlar.\n" +
                                "\n" +
                                "Giyenler düşünsün dar elbiseyi;\n" +
                                "Ölçülü sözü, hesaplı adımı\n" +
                                "Ben kurtuldum kafeste kuş olmaktan;\n" +
                                "Saltanat sürer gibi uçuyorum,\n" +
                                "Erk ağacı gelin olduğu gün.\n" +
                                "\n" +
                                "Hayranım bu şehrin bacalarına.\n" +
                                "İrili ufaklı, hep bir ağızdan,\n" +
                                "Nasıl derinden gökyüzüne doğru\n" +
                                "Bir türkü söylüyorar öyle sessiz!\n" +
                                "Dmanı daim olsun güzel baca!\n" +
                                "\n" +
                                "Yuvası saçakta kalan kırlangıç,\n" +
                                "Yuvası dallara emanet serçe.\n" +
                                "Derken camiler üstünde güvercin,\n" +
                                "Minareler katında geçiyorum,\n" +
                                "Gökyüzü mahallesi istanbul'un.\n" +
                                "\n" +
                                "Süt beyaz bir martıyım açıklarda.\n" +
                                "Gemilere ben yol gösteriyorum,\n" +
                                "Buğday ve ilaç yüklü gemilere.\n" +
                                "Bir kanat vuruşta bulutlardayım;\n" +
                                "Bir süzülüşte vatanım dalgalar!");

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
                alertDialogBuilder.setTitle("Batan Gemi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İnsanlar dalgasına tutulmuş bir gemiyim!\n" +
                                "Sağa sola sallanıp,bakın,çırpınıyorum;\n" +
                                "Fakat bilmem ki sarhoş onlar mıdır,ben miyim;\n" +
                                "İnsanlar dalgasına tutulmuş bir gemiyim!\n" +
                                "\n" +
                                "Deliklerim açıldı tazyikinden suların;\n" +
                                "Kudurmuş denizinde hakkın çırpınıyorum!\n" +
                                "Güverteyi yıkıyor çığlığı yolcuların.\n" +
                                "Kudurmuş denizinde hakkın çırpınıyorum!\n" +
                                "\n" +
                                "Gittikçe kabarıyor,amanın,bu dalgalar;\n" +
                                "Ufuk sise gömülü,ne gelen var ne giden.\n" +
                                "Kaptan imdat düdüğü durmadan çalar!\n" +
                                "Kaptan imdat düdüğü beyhude çalar!\n" +
                                "\n" +
                                "Ne zaman kara yüzü göreceğim,ne zaman!\n" +
                                "Bir ümit dağılıyor çıkan her nefesimden.\n" +
                                "Batacağım galiba bir limana varmadan!\n" +
                                "Ne zaman kara yüzü göreceğim,ne zaman.\n");

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
                alertDialogBuilder.setTitle("Ben Aşk Adamıyım");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Dolaştığım denizlerce düşünüyorum,\n" +
                                "Bineceğim son gemi değil midir\n" +
                                "Hayır sahibi omuzlarda giden tabut.\n" +
                                "Herkes gibi teselliye muhtaç olsaydım eğer,\n" +
                                "Derdim ki: \"Elbet bir ağlayanım olur benim de;\n" +
                                "Ramazan geceleri Yasin okuyanım,\n" +
                                "Baharda kabrime menekşe getirenim de.\"\n" +
                                "\n" +
                                "Fakat bütün bunlar da olur,\n" +
                                "Yine tasa etmem,\n" +
                                "Yine kırılmam kimseye.\n" +
                                "Ben aşk adamıyım,\n" +
                                "Sevmeye geldim insanları,\n" +
                                "Gönlümle, elimle, kafamla sevmeye;\n" +
                                "Hesapsız, karşılıksız,\n" +
                                "Ayrılık gayrılık gözetmeden.\n" +
                                "Gün gelip gidersem şayet,\n" +
                                "Öyle severekten gideceğim ki,\n" +
                                "Karanlık kıyılardan bile olsa,\n" +
                                "Candan selamlarım,\n" +
                                "Civarımdan geçecek gemileri;\n" +
                                "Güneşli gemileri;\n" +
                                "Şarkılı gemileri;\n" +
                                "İçlerinde kendim varmışım gibi!");

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
                alertDialogBuilder.setTitle("Ben Ölecek Adam Değilim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Kapımı çalıp durma ölüm,\n" +
                                "Açmam;\n" +
                                "Ben ölecek adam değilim.\n" +
                                "\n" +
                                "Alıştım bir kere gökyüzüne;\n" +
                                "Bunca yıllık yoldaşımdır bulutlar.\n" +
                                "Sıkılırım,\n" +
                                "Kuşlar cıvıldamasa dallarında,\n" +
                                "Yemişlerine doymadığım ağaçların,\n" +
                                "Yağmur mu yağıyor,\n" +
                                "Güneş mi var,\n" +
                                "Farketmeliyim\n" +
                                "Baktığım pencereden.\n" +
                                "Deniz görünmeli çıksam balkona.\n" +
                                "Tamamlamalı manzarayı\n" +
                                "Karlı dağlarla sürülmüş tarlalar.\n" +
                                "Ekmekten olamam doğrusu,\n" +
                                "Nimet bildiğim;\n" +
                                "Sudan geçemem,\n" +
                                "Tuzludur teneffüs ettiğim hava.\n" +
                                "Ya nasıl dururum olduğum yerde,\n" +
                                "Öyle upuzun yatmış,\n" +
                                "İki elim yanıma getirilmiş,\n" +
                                "Hareketsiz,\n" +
                                "Sükûta râmolmuş;\n" +
                                "Sanki devrilmiş bir heykel?\n" +
                                "\n" +
                                "Ellerim ne der sonra bana?\n" +
                                "Soğumuş kalbime ne cevap veririm?\n" +
                                "Utanmaz mıyım ayaklarımdan?\n" +
                                "\n" +
                                "Kalkmalıyım,\n" +
                                "Dolaşmalıyım,\n" +
                                "Sokaklarda, parklarda.\n" +
                                "El sallamalıyım\n" +
                                "Giden trenlere,\n" +
                                "Kalkan vapurlara.\n" +
                                "Bilmeliyim,\n" +
                                "Gölgelerin boyundan,\n" +
                                "Saatin kaç olduğunu...\n" +
                                "Islık çalmalıyım.\n" +
                                "Türkü söylemeliyim\n" +
                                "Yol boyunca,\n" +
                                "Keyfimden ya hüznümden.\n" +
                                "Geçmiş günleri hatırlamalıyım,\n" +
                                "Dalıp dalıp akarsuya,\n" +
                                "Hayaller kurmalıyım,\n" +
                                "Güzel geleceğe dair.\n" +
                                "Yanımdan geçenler olmalı,\n" +
                                "Selâm almalıyım;\n" +
                                "Robenson'u düşünmeliyim,\n" +
                                "Garipliğini:\n" +
                                "Şükretmeliyim\n" +
                                "İnsanlar arasında olduğuma.\n" +
                                "Nedir ki eninde sonunda ölüm?\n" +
                                "Ayrı düşmek değil mi aşinalardan?\n" +
                                "\n" +
                                "Kapımı çalıp durma ölüm,\n" +
                                "Açmam;\n" +
                                "Ben ölecek adam değilim.");

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
                alertDialogBuilder.setTitle("Desem Ki");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Desem ki vakitlerden bir Nisan akşamıdır,\n" +
                                "Rüzgârların en ferahlatıcısı senden esiyor,\n" +
                                "Sende seyrediyorum denizlerin en mavisini,\n" +
                                "Ormanların en kuytusunu sende gezmekteyim,\n" +
                                "Senden kopardım çiçeklerin en solmazını,\n" +
                                "Toprakların en bereketlisini sende sürdüm,\n" +
                                "Sende tattım yemişlerin cümlesini.\n" +
                                "Desem ki sen benim için,\n" +
                                "Hava kadar lazım,\n" +
                                "Ekmek kadar mübarek,\n" +
                                "Su gibi aziz bir şeysin;\n" +
                                "Nimettensin, nimettensin!\n" +
                                "Desem ki...\n" +
                                "İnan bana sevgilim inan,\n" +
                                "Evimde şenliksin, bahçemde bahar;\n" +
                                "Ve soframda en eski şarap.\n" +
                                "Ben sende yaşıyorum,\n" +
                                "Sen bende hüküm sürmektesin.\n" +
                                "Bırak ben söyleyeyim güzelliğini,\n" +
                                "Rüzgârlarla, nehirlerle, kuşlarla beraber.\n" +
                                "Günlerden sonra bir gün,\n" +
                                "Şayet sesimi farkedemezsen,\n" +
                                "Rüzgârların, nehirlerin, kuşların sesinden,\n" +
                                "Bil ki ölmüşüm.\n" +
                                "Fakat yine üzülme, müsterih ol;\n" +
                                "Kabirde böceklere ezberletirim güzelliğini,\n" +
                                "Ve neden sonra\n" +
                                "Tekrar duyduğun gün sesimi gökkubbede,\n" +
                                "Hatırla ki mahşer günüdür\n" +
                                "Ortalığa düşmüşüm seni arıyorum.");

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
                alertDialogBuilder.setTitle("Gün Olur ki");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Gün olur ki ne gökyüzü para eder,\n" +
                                "Ne deniz kenarı, ne bağlar bahçeler.\n" +
                                "Gün olur ki ne kız, ne rakı, ne şiir,\n" +
                                "Hiçbir şey insanı sarmaz, kandıramaz;\n" +
                                "Her çeşmeden boş döner, elindeki tas.\n" +
                                "Gün olur ki çıldırmak işten değildir.");

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
                alertDialogBuilder.setTitle("Hatıralar");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bilmem ki hâtıralar,\n" +
                                "Ne istersiniz benden,\n" +
                                "Gelir gelmez sonbahar?\n" +
                                "\n" +
                                "Bu kanad çırpış neden?\n" +
                                "Cama vuracak ne var\n" +
                                "Ey eski hâtıralar\n" +
                                "\n" +
                                "Sanmayın güller açar,\n" +
                                "Bülbül değildir öten;\n" +
                                "Bu rüzgâr başka rüzgâr.\n" +
                                "\n" +
                                "Ne istersiniz benden,\n" +
                                "Bilmem ki hâtıralar,\n" +
                                "Gelir gelmez sonbahar?");

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
                alertDialogBuilder.setTitle("Hepimize Dair");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yalnız kendi başın mı dertli sanırsın,\n" +
                                "Gölgesi yeryüzünde avare insan?\n" +
                                "Taş da istemezdi yosun tuttuğunu;\n" +
                                "Solmakta her çiçek kokusu uçunca.\n" +
                                "Tasadır ağaca rüzgârda yaprağı;\n" +
                                "Her kuş yanar az çok ölen yavrusuna;\n" +
                                "Sivrisinek de halinden memnun değil;\n" +
                                "Vızıltısı şikâyet makamındadır.");

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
                alertDialogBuilder2.setTitle("Hep Yaşadığıma Dair");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("Bu gölge yer pazar günü\n" +
                                "Bu şehir, bu tren sesi\n" +
                                "Gök bildiğim bu mavilik\n" +
                                "Yeşil dallardan süzülen\n" +
                                "Oturduğum rahat koltuk\n" +
                                "Beyaz örtüsü masanın\n" +
                                "Sigaram, kahvem, gazetem\n" +
                                "Elimin çizdiği kavis\n" +
                                "Kovmak için sinekleri\n" +
                                "Kolumda işleyen saat\n" +
                                "Ve esnemem arada bir\n" +
                                "Hep yaşadığıma dair");

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
                alertDialogBuilder.setTitle("Karasevda");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir kere sevdaya tutulmaya gör;\n" +
                                "Ateşlere yandığının resmidir.\n" +
                                "Aşık dediğin, Mecnun misali kör;\n" +
                                "Ne bilsin alemde ne mevsimidir.\n" +
                                "\n" +
                                "Dünya bir yana, o hayal bir yana;\n" +
                                "Bir meşaledir pervaneyim ona.\n" +
                                "Altında bir ömür dönedolana\n" +
                                "Ağladığım yer penceresi midir?\n" +
                                "\n" +
                                "Bir köşeye mahzun çekilen için,\n" +
                                "Yemekten içmekten kesilen için,\n" +
                                "Sensiz uykuyu haram bilen için,\n" +
                                "Ayrılık ölümün diğer ismidir");

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
                alertDialogBuilder.setTitle("Memleket");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Bir yanda Anadolu bir yanda Rumeli'dir.\n" +
                                "Hepsi bizden yolcusu olsun hancısı olsun\n" +
                                "Efkar ettiğimiz şey memleketin halidir\n" +
                                "Sanmam hemşehrim sanmam bundan acısı olsun\n" +
                                "\n" +
                                "Köylümüz efendimiz tarlasında perişan\n" +
                                "İşçimiz kardeşimiz kavgasında perişan\n" +
                                "Anam bacımdır bahtı karasında perişan\n" +
                                "Hemen Allah cümlemizin yardımcısı olsun");

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
                alertDialogBuilder.setTitle("Otuzbeş Yaş Şiiri");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yaş otuz beş! yolun yarısı eder.\n" +
                                "Dante gibi ortasındayız ömrün.\n" +
                                "Delikanlı çağımızdaki cevher,\n" +
                                "Yalvarmak, yakarmak nafile bugün,\n" +
                                "Gözünün yaşına bakmadan gider.\n" +
                                "Şakaklarıma kar mı yağdı ne var?\n" +
                                "Benim mi Allahım bu çizgili yüz?\n" +
                                "Ya gözler altındaki mor halkalar?\n" +
                                "Neden böyle düşman görünürsünüz,\n" +
                                "Yıllar yılı dost bildiğim aynalar?\n" +
                                "Zamanla nasıl değişiyor insan!\n" +
                                "Hangi resmime baksam ben değilim.\n" +
                                "Nerde o günler, o şevk, o heyecan?\n" +
                                "Bu güler yüzlü adam ben değilim;\n" +
                                "Yalandır kaygısız olduğum yalan.\n" +
                                "Hayal meyal şeylerden ilk aşkımız;\n" +
                                "Hatırası bile yabancı gelir.\n" +
                                "Hayata beraber başladığımız,\n" +
                                "Dostlarla da yollar ayrıldı bir bir;\n" +
                                "Gittikçe artıyor yalnızlığımız.\n" +
                                "Gökyüzünün başka rengi de varmış!\n" +
                                "Geç farkettim taşın sert olduğunu.\n" +
                                "Su insanı boğar, ateş yakarmış!\n" +
                                "Her doğan günün bir dert olduğunu,\n" +
                                "İnsan bu yaşa gelince anlarmış.\n" +
                                "Ayva sarı nar kırmızı sonbahar!\n" +
                                "Her yıl biraz daha benimsediğim.\n" +
                                "Ne dönüp duruyor havada kuşlar?\n" +
                                "Nerden çıktı bu cenaze? ölen kim?\n" +
                                "Bu kaçıncı bahçe gördüm tarumar?\n" +
                                "Neylersin ölüm herkesin başında.\n" +
                                "Uyudun uyanamadın olacak.\n" +
                                "Kimbilir nerde, nasıl, kaç yaşında?\n" +
                                "Bir namazlık saltanatın olacak,\n" +
                                "Taht misali o musalla taşında.\n");

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
                alertDialogBuilder.setTitle("Yalan Dünya");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("İlk günden alıştığımız emektar dünya,\n" +
                                "Anne yüzünde dost yüzünde evlat yüzünde.\n" +
                                "Her sabah yeniden başlayan şeye doymadık,\n" +
                                "Düşümüz gerçeğimiz ne varsa yeryüzünde.\n" +
                                "\n" +
                                "Gökyüzü belledik şu ürperen maviliği,\n" +
                                "Başımız darda kalınca el açtığımız yer.\n" +
                                "Gökyüzüdür avutan akıllıyı deliyi,\n" +
                                "Gökyüzünde bulutlar uçurtmalar ümitler.\n" +
                                "\n" +
                                "Her mevsimiyle insanı ayrı ayrı saran,\n" +
                                "Bunca güzelliği nasıl koyup gideceğiz.\n" +
                                "Yaman çalacak o çalmayası saat yaman,\n" +
                                "Geçmiş ola bir kez yumuldu mu gözlerimiz.");

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
                alertDialogBuilder.setTitle("İnsanoğlu");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Adem'le Havva'dan geldiğim doğru;\n" +
                                "Vuruldum bir kere elma dalına\n" +
                                "Hala aklımda o Tufan yağmuru;\n" +
                                "Şükür çıktığıma Nuh'un salına.\n" +
                                "\n" +
                                "Ölmek varsa günün birinde gayri,\n" +
                                "Göz nuru, el emeği, alın teri\n" +
                                "Yaşadığım iyi kötü günleri\n" +
                                "Değişmem hiçbir cennet masalına.\n");

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
                alertDialogBuilder.setTitle("Şaşırdım Kaldım");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Şaşırdım kaldım nasıl atsam adım;\n" +
                                "Gün kasvet gece kasvet.\n" +
                                "Bulutlar, sisler içinde bunaldım;\n" +
                                "Gök mavisine hasret.\n" +
                                "\n" +
                                "Olmuyor seni düşünmemek Tanrım,\n" +
                                "Ummamak senden medet.\n" +
                                "Suyun dibine vardı ayaklarım;\n" +
                                "Suyun dibinde zulmet.\n" +
                                "\n" +
                                "Kalmadı ümidin soluk ve cılız\n" +
                                "Işığında bereket.\n" +
                                "Ve ölüm, kapımda kişner, sabırsız\n" +
                                "Bir at oldu nihayet.");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });


    }
}