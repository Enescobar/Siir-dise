package com.example.siirdise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class canyucel extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn66,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canyucel);
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
                alertDialogBuilder.setTitle("Akdeniz Yaraşıyor Sana");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Akdeniz yaraşıyor sana\n" +
                                "Yıldızlar terler ya sen de terliyorsun\n" +
                                "Aynı ıslak pırıltı burun kanatlarında\n" +
                                "Hiç dinmiyor motorların gürültüsü\n" +
                                "Köpekler havlıyor uzaktan\n" +
                                "Demin bir çocuk havladı\n" +
                                "Fatmanım cumbadan çarşaf silkiyor yine\n" +
                                "Ali dumdum anasına sövüyor saatlerdir\n" +
                                "Denizi tokmaklıyor balıkçılar\n" +
                                "Bu sesler işte sessizliğini büyüten toprak\n" +
                                "O sesinin sardunyalar gibi konuşkan sessizliği\n" +
                                "Hayatta yattık dün gece\n" +
                                "Üstümüzde meltem\n" +
                                "Kekik kokuyor ellerim hala\n" +
                                "Senle yatmadım sanki\n" +
                                "Dağları dolaştım\n" +
                                "Ben senden öğrendim deniz yazmayı\n" +
                                "Elimden düşmüyor mavi kalem\n" +
                                "Bir tirandil çıkar gibi sefere\n" +
                                "Okula gidiyor öğretmenim\n" +
                                "Ben de ardından açılıyorum\n" +
                                "Bir poyraz çizip deftere\n" +
                                "Bir ada var sırf ebabil\n" +
                                "Dönüyor dönüyor başımda\n" +
                                "Senle yaşadığım günler\n" +
                                "Gümüş bir çevre oldu ömrüm\n" +
                                "Değince güneşine\n" +
                                "Neden sonra buldum o kaçakçı mağarasını\n" +
                                "Gözlerim kamaşınca senden\n" +
                                "Ölüm belki sularından kaçırdığım\n" +
                                "O loş suda yıkanmaktır\n" +
                                "Durdukça yosundan yeşil\n" +
                                "Kulaç attıkça mavi\n" +
                                "Ben düzde sanırdım yıkıntım\n" +
                                "Örenim alkolik asarım\n" +
                                "Mutun doruğundaymışım meğer\n" +
                                "Senle çıkınca anladım\n" +
                                "Eski Yunan atları var hani\n" +
                                "Yeleleri bükümlü\n" +
                                "Gün inerken de öyle\n" +
                                "Ağaçtan izdüşümleriyle\n" +
                                "Yürüyor Balan tepeleri\n" +
                                "Yürüyor bölük bölük can\n" +
                                "Toplu bir güzelliğe doğru\n" +
                                "Kadınım Yaraşıyorsun sen Akdenize");
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
                alertDialogBuilder.setTitle("Anayasası insanın");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Paul Eluard için yazılmıştır\n" +
                                "\n" +
                                "Kan yasası bu insanın:\n" +
                                "Üzümden şarap yapacaksın\n" +
                                "Çakmak taşından ateş\n" +
                                "Ve öpücüklerden insan!\n" +
                                "\n" +
                                "Can yasası bu insanın:\n" +
                                "Savaşlara yoksulluklara\n" +
                                "Ve binbir belaya karşın\n" +
                                "İlle de yaşayacaksın!\n" +
                                "\n" +
                                "Us yasası bu insanın:\n" +
                                "Suyu şavka döndürüp\n" +
                                "Düşü gerçeğe çevirip\n" +
                                "Düşmanı dost kılacaksın!\n" +
                                "\n" +
                                "Anayasası bu insanın\n" +
                                "Emekleyen çocuktan\n" +
                                "Uzayda koşana dek\n" +
                                "Yürürlükte her zaman");

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
                alertDialogBuilder.setTitle("Başka Türlü Bir Şey");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Başka türlü bir şey benim istediğim\n" +
                                "ne ağaca benzer, ne de buluta\n" +
                                "burası gibi değil gideceğim memleket\n" +
                                "denizi ayrı deniz,\n" +
                                "havası ayrı hava..\n" +
                                "\n" +
                                "bir başka yolculuk dalından düşmek yere\n" +
                                "yaşadığından uzun\n" +
                                "\n" +
                                "bir tatlı yolculuk dalından inmek yere\n" +
                                "ağacın yüksekliğince\n" +
                                "dalın yüksekliğince rüzgarda\n" +
                                "ve bir yeni ömür\n" +
                                "vardığın çimen yeşilliğince\n" +
                                "\n" +
                                "nerde gördüklerim\n" +
                                "nerde o beklediğim\n" +
                                "rengi başka\n" +
                                "tadı başka..");

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
                alertDialogBuilder.setTitle("Değişim");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Zeus güya, rüzgâr\n" +
                                "Koşuyor karşıki ağacın ardından\n" +
                                "Yakalayamıyor ki ama\n" +
                                "Daphne değil çünki o yeşil kızın adı");

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
                alertDialogBuilder.setTitle("Demin");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Kasvet, elinde bir paslı makas,\n" +
                                "İstanbul'un asma köprülerini kesti.\n" +
                                "Sevdamızın ipinde cirit oynayan cambaz\n" +
                                "Şimdi bir kör satırdır içimizde.\n" +
                                "Ha düşer,\n" +
                                "Ha düşer,\n" +
                                "Ha düşer...\n" +
                                "Başımızın üstünde demin gülüp duran gökyüzü\n" +
                                "Yedekte bir salapurya şimdi");

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
                alertDialogBuilder.setTitle("Her Şey Sende Gizli");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Yerin seni çektiği kadar ağırsın\n" +
                                "Kanatların çırpındığı kadar hafif..\n" +
                                "Kalbinin attığı kadar canlısın\n" +
                                "Gözlerinin uzağı gördüğü kadar genç...\n" +
                                "Sevdiklerin kadar iyisin\n" +
                                "Nefret ettiklerin kadar kötü..\n" +
                                "Ne renk olursa olsun kaşın gözün\n" +
                                "Karşındakinin gördüğüdür rengin..\n" +
                                "Yaşadıklarını kar sayma:\n" +
                                "Yaşadığın kadar yakınsın sonuna;\n" +
                                "\n" +
                                "Ne kadar yaşarsan yaşa,\n" +
                                "Sevdiğin kadardır ömrün..\n" +
                                "Gülebildiğin kadar mutlusun\n" +
                                "Üzülme bil ki ağladığın kadar güleceksin\n" +
                                "Sakın bitti sanma her şeyi,\n" +
                                "\n" +
                                "Sevdiğin kadar sevileceksin.\n" +
                                "Güneşin doğuşundadır doğanın sana verdiği değer\n" +
                                "Ve karşındakine değer verdiğin kadar insansın\n" +
                                "Bir gün yalan söyleyeceksen eğer\n" +
                                "Bırak karşındaki sana güvendiği kadar inansın.\n" +
                                "Ay ışığındadır sevgiliye duyulan hasret\n" +
                                "Ve sevgiline hasret kaldığın kadar ona yakınsın\n" +
                                "Unutma yagmurun yağdığı kadar ıslaksın\n" +
                                "Güneşin seni ısıttığı kadar sıcak.\n" +
                                "Kendini yalnız hissetiğin kadar yalnızsın\n" +
                                "Ve güçlü hissettiğin kadar güçlü.\n" +
                                "Kendini güzel hissettiğin kadar güzelsin..\n" +
                                "\n" +
                                "İşte budur hayat!\n" +
                                "İşte budur yaşamak bunu hatırladığın kadar yaşarsın\n" +
                                "Bunu unuttuğunda aldığın her nefes kadar üşürsün\n" +
                                "Ve karşındakini unuttuğun kadar çabuk unutulursun\n" +
                                "Çiçek sulandığı kadar güzeldir\n" +
                                "Kuşlar ötebildiği kadar sevimli\n" +
                                "Bebek ağladığı kadar bebektir\n" +
                                "Ve herşeyi öğrendiğin kadar bilirsin bunu da öğren,\n" +
                                "Sevdiğin kadar sevilirsin...");

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
                alertDialogBuilder.setTitle("Kayıp Çocuk");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Birden işitilmez olsun ayak seslerim;\n" +
                                "Gölgem bir başka sokağa sapıversin;\n" +
                                "Unutayım bir anda her şeyi,\n" +
                                "Nerde oturduğumu,\n" +
                                "Bir tuhaf adem olduğumu Can adında.\n" +
                                "Aklım arayadursun başka kapılarda kısmetimi,\n" +
                                "Ben, bilmediğim sokaklarda bir başıma;\n" +
                                "Gönlüm öylesine geniş, öyle ferah,\n" +
                                "İlk defa görmüş gibi dünyayı,\n" +
                                "Bir şaşkınlık içinde, yeniden doğmuş gibi;\n" +
                                "Hatırlamam artık değil mi, dostlar,\n" +
                                "Hatırlamam artık garipliğimi?");

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
                alertDialogBuilder.setTitle("Kuşlar Vardır");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Kuşlar vardır, cana benzer havalarda;\n" +
                                "Soğuksa kar, baharsa yaprak;\n" +
                                "Bir başına büyür toprakta ömrümüz,\n" +
                                "Güneşle yeşil elleriyle çıplak;\n" +
                                "\n" +
                                "- Uslu ayaklarla başlamış yolculuk -\n" +
                                "Yürünmez öyle, bazen durulur,\n" +
                                "Ve iner erenler katına yorgunluk;\n" +
                                "Kapanır sukun üzre kitaplar.\n" +
                                "\n" +
                                "Nefeslerle sürüp giden yaşamamız\n" +
                                "Bir su kenarına gelir durur;\n" +
                                "Ekmekten, şaraptan öte nimetler vardır;\n" +
                                "Yürünmez öyle hep, bazen susulur.");

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
                alertDialogBuilder.setTitle("Martılar ki");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Günlerdir körköstebek nefsimle öyle hırlı\n" +
                                "Ve öylesine harlı ki\n" +
                                "esrik nefesim\n" +
                                "Bir kibrit tutsam parlayacak.\n" +
                                "Bir sarnıç gemisi diyecekler alev almış\n" +
                                "Boğazın iki yakasından\n" +
                                "\n" +
                                "Oysa bir gaz tenekesiyle bir şişe mavi\n" +
                                "Gelişi güzel mi güzel bir ocak\n" +
                                "Suların ortasında sevgili öfkemle benim\n" +
                                "Yanacak bahar erişinceye değin\n" +
                                "Soğuktan morarmış kanatlarını\n" +
                                "ısıtsın diye martılar\n" +
                                "\n" +
                                "Martılar ki sokak çocuklarıdır denizin");

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
                alertDialogBuilder.setTitle("Öyle Bi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Temiz gömlegimi giydim talimden sonra\n" +
                                "Ayaklarını yıkıyor çeşme başında erler\n" +
                                "İşte sen öyle bir serindin\n" +
                                "Tuzladan kaptılarla inerken şehre\n" +
                                "Ne güzel şey sivil denmesi çıplağa\n" +
                                "Ve gün-açık penceresinden meselerin\n" +
                                "Yamacın kuytusuna sokulmuş mavi\n" +
                                "Ufacık bi parça deniz gibiydin\n" +
                                "\n" +
                                "Şipka biberleriyle konmuş okulun camlarına\n" +
                                "Arnavut Köyünün o muhacir güneşi\n" +
                                "İste sen öyle bi cumartesiydin\n" +
                                "Sahanlıkta saçlarını tarıyor kızlar\n" +
                                "Raylar ondan böyle kıvılcımlanıyor\n" +
                                "Köşeleri dönerken, önlükleri altından\n" +
                                "Dünyaya başlar gibi aybaşlarının kokusu\n" +
                                "Kalkan al tıramvaydın ergenlik durağımdan\n" +
                                "\n" +
                                "Meyvahoşun orda bir sabahcı kahvesi\n" +
                                "Gün ağarmıştı ama ben günaydın demedim\n" +
                                "İşte sen öyle ışıklı bir yerdin.\n" +
                                "Bilmiyordum hiç burda bir fırın olduğunu\n" +
                                "Diz çöktüm asfalta, baktım aşağı, üüüü'üh!..\n" +
                                "İşçiler ateşler ay çörekleri\n" +
                                "Ve kılıc gibi taze ekmek kokusu...\n" +
                                "Dağıttık evvel-allah yalnızlıkları\n" +
                                "\n" +
                                "Yaşamak düğünse, sen orda gelindin\n" +
                                "Seni soydum, Güler, dünyayı giyindim");

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
                alertDialogBuilder2.setTitle("Özledim Seni");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder2
                        .setMessage("özledim seni...\n" +
                                "ayrılık yüreğimi uyuşturuyor karıncalandırıyor nicedir.\n" +
                                "beynimi uyuşturuyor özlemin...\n" +
                                "çok sık birlikte olmasak bile\n" +
                                "benimle olduğunu bilmenin\n" +
                                "bunca zamandır içimi ısıttığını\n" +
                                "yeni yeni anlıyorum\n" +
                                "Yokluğun,\n" +
                                "Hatırladıkça yüreğime saplanan bir sizi olmaktan çıkıp\n" +
                                "mütemadiyen bir boşluğa\n" +
                                "Sabahları seni okşayarak başlamaları\n" +
                                "aksamları her isi bir kenara koyup\n" +
                                "seninle baş başa konuşmaları özlüyorum;\n" +
                                "oynaşmalarımızı,\n" +
                                "yürüyüşlerimizi,\n" +
                                "sevimli haşarılığını,\n" +
                                "çocuksu küskünlüğünü...\n" +
                                "Nasılda serttin başkalarına karşı\n" +
                                "beni savunurken;\n" +
                                "ve ne kadar yumuşak\n" +
                                "bir çift kısık gözle kendini\n" +
                                "ellerimin okşayışına bırakırken\n" +
                                "Gitmeni asla istemediğim halde\n" +
                                "buna mecbur olduğunu görmek\n" +
                                "ve sana bunları söylemeden\n" +
                                "''git artık'' demek\n" +
                                "''beni ne kadar çabuk unutursan, o kadar çabuk\n" +
                                "kavuşacaksın mutluluğa''\n" +
                                "demek sana nede zor\n" +
                                "seni görmemek ve belki yıllar sonra\n" +
                                "karsılaştığımızda\n" +
                                "bana bir yabancı gibi bakmanı istemek senden...\n" +
                                "yeni bir sevdayı yasakladığım kalbime söz geçirmek....");

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
                alertDialogBuilder.setTitle("Şey Gibi");
                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Fethi Naci'ye\n" +
                                "\n" +
                                "Şey gibi herbişeyim yahu\n" +
                                "Satır yazamıyorum\n" +
                                "\n" +
                                "Sanki kendimle değil\n" +
                                "Dünyayla ölüyorum\n" +
                                "\n" +
                                "Bağırsam bağırsam bağırsam\n" +
                                "Bağırdığımı duymuyorum\n" +
                                "\n" +
                                "Tek bir musluk var açık\n" +
                                "Onunla akıyorum\n" +
                                "\n" +
                                "İstemeden istemeden istemeden\n" +
                                "İstiyereeeek\n" +
                                "\n" +
                                "Ah sen ölüm denen topal köfte\n" +
                                "Buluştuk bak cenabette\n" +
                                "\n" +
                                "İçim rakı dışım su\n" +
                                "Bu mahmur cinayette\n" +
                                "\n" +
                                "Çocuklar çocuklar çocuklar\n" +
                                "Sizlen doğmamış mıydık biz birlikte\n");

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }


        });

    }
}