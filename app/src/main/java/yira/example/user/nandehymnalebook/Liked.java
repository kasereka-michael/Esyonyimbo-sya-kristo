package yira.example.user.nandehymnalebook;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Liked extends AppCompatActivity {


    public static ListView likedSongs;
    ImageView image;
    public ArrayAdapter<String> adapter;
    String strFileJson;
    Gson gson = new Gson();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


        likedSongs = findViewById(R.id.likedSongs);
        image = findViewById(R.id.profile_image);


        Utils u = new Utils();;
        File[] sti = getApplicationContext().getFilesDir().listFiles();
        ArrayList<String> arr = new ArrayList<>();
        File fileJson = sti[0];
        try {
             strFileJson = u.getStringFromFile(fileJson.toString());
            Song songs[] = gson.fromJson(strFileJson, Song[].class);
            for(Song s: songs ) {
                Log.i("nandehymne", "num1: " + s.getName());
            arr.add(s.getNum());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, arr);
        //Setting the arrayAdapter to my Array of songs
        likedSongs.setAdapter(adapter);




        likedSongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                          @RequiresApi(api = Build.VERSION_CODES.O)
                          @Override
                          public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                              String item = (String) adapterView.getItemAtPosition(position);
                              //Toast.makeText(getApplicationContext(), item, Toast.LENGTH_LONG).show();
                              switch (item) {
                                  case "1. MUTEYA BUHA ENGUBI":
                                      startActivity(new Intent(getApplicationContext(), number1.class));
                                      break;
                                  case "2. OMUKAMA ANEMWASA":
                                      startActivity(new Intent(getApplicationContext(), number2.class));
                                      break;
                                  case "3. NASYAMULANGIRA":
                                      startActivity(new Intent(getApplicationContext(), number3.class));
                                      break;
                                  case "4. ASYASA":
                                      startActivity(new Intent(getApplicationContext(), number4.class));
                                      break;
                                  case "5. MUTEYA WE MINYISY’ENDAMBI":
                                      startActivity(new Intent(getApplicationContext(), number5.class));
                                      break;
                                  case "6. IMWE BABUYIRIRE":
                                      startActivity(new Intent(getApplicationContext(), number6.class));
                                      break;
                                  case "7. ASYASWASA, ASYASWASA":
                                      startActivity(new Intent(getApplicationContext(), number7.class));
                                      break;
                                  case "8. EKIRO YESU ASYATWENDA":
                                      startActivity(new Intent(getApplicationContext(), number8.class));
                                      break;
                                  case "9. BUHA ENGUBI":
                                      startActivity(new Intent(getApplicationContext(), number9.class));
                                      break;
                                  case "10. TWASYAHINDANA ELUBULA":
                                      startActivity(new Intent(getApplicationContext(), number10.class));
                                      break;
                                  case "11. MULAMYA NGANDIKUKWAMA":
                                      startActivity(new Intent(getApplicationContext(), number11.class));
                                      break;
                                  case "12. HALI EYISOKO YOSWIRE":
                                      startActivity(new Intent(getApplicationContext(), number12.class));
                                      break;
                                  case "13. NYIHENAYE KWILAB’AMATWA":
                                      startActivity(new Intent(getApplicationContext(), number13.class));
                                      break;
                                  case "14. WOWE AMAKUTA":
                                      startActivity(new Intent(getApplicationContext(), number14.class));
                                      break;
                                  case "15. YESU KRISTO MWANYANZA":
                                      startActivity(new Intent(getApplicationContext(), number15.class));
                                      break;
                                  case "16. WERAY’EBYALA BYAGHE":
                                      startActivity(new Intent(getApplicationContext(), number16.class));
                                      break;
                                  case "17. NYIPIPIRE OLWANZO":
                                      startActivity(new Intent(getApplicationContext(), number17.class));
                                      break;
                                  case "18. TUGHENDE ABASIRIKANI":
                                      startActivity(new Intent(getApplicationContext(), number18.class));
                                      break;
                                  case "19. LEBAYA SUTEBAWE":
                                      startActivity(new Intent(getApplicationContext(), number19.class));
                                      break;
                                  case "20. IBUK’OMUTIMA WAWE":
                                      startActivity(new Intent(getApplicationContext(), number20.class));
                                      break;
                                  case "21. NASA KU MUSALABA":
                                      startActivity(new Intent(getApplicationContext(), number21.class));
                                      break;
                                  case "22. MUYISA, MUYISA":
                                      startActivity(new Intent(getApplicationContext(), number22.class));
                                      break;
                                  case "23. NYUSULE":
                                      startActivity(new Intent(getApplicationContext(), number23.class));
                                      break;
                                  case "24. NYIKWANZIRE MWAMI":
                                      startActivity(new Intent(getApplicationContext(), number24.class));
                                      break;
                                  case "25. NYIKUH’EBYOSI":
                                      startActivity(new Intent(getApplicationContext(), number25.class));
                                      break;
                                  case "26. NYINEMWASA KO NDI":
                                      startActivity(new Intent(getApplicationContext(), number26.class));
                                      break;
                                  case "27. MWAMI NI MWENGE":
                                      startActivity(new Intent(getApplicationContext(), number27.class));
                                      break;
                                  case "28. NGASONDA ERYERA":
                                      startActivity(new Intent(getApplicationContext(), number28.class));
                                      break;
                                  case "29. UBYE NETU":
                                      startActivity(new Intent(getApplicationContext(), number29.class));
                                      break;
                                  case "30. ULANGIRE BWAMIRA":
                                      startActivity(new Intent(getApplicationContext(), number30.class));
                                      break;
                                  case "31. LYUBA LY’OMUTIMA":
                                      startActivity(new Intent(getApplicationContext(), number31.class));
                                      break;
                                  case "32. YESU NIWE RIBWE":
                                      startActivity(new Intent(getApplicationContext(), number32.class));
                                      break;
                                  case "33. AKANZONDOLA":
                                      startActivity(new Intent(getApplicationContext(), number33.class));
                                      break;
                                  case "34. NDI N’OBUHOLO MO MUTIMA":
                                      startActivity(new Intent(getApplicationContext(), number34.class));
                                      break;
                                  case "35. NYANZIRY’OBWIRA":
                                      startActivity(new Intent(getApplicationContext(), number35.class));
                                      break;
                                  case "36. NAMAKWIKIRIRYA":
                                      startActivity(new Intent(getApplicationContext(), number36.class));
                                      break;
                                  case "37. MBYE HAKUHI NAWE":
                                      startActivity(new Intent(getApplicationContext(), number37.class));
                                      break;
                                  case "38. TUKASIKIRA KU KRISTO OLUKUKA":
                                      startActivity(new Intent(getApplicationContext(), number38.class));
                                      break;
                                  case "39. NASYABYA NYINIKIRIRYE":
                                      startActivity(new Intent(getApplicationContext(), number39.class));
                                      break;
                                  case "40. MWIKIRIRYE, MUSIKAYE":
                                      startActivity(new Intent(getApplicationContext(), number40.class));
                                      break;
                                  case "41. YESU ABYE NAWE EHOSI":
                                      startActivity(new Intent(getApplicationContext(), number41.class));
                                      break;
                                  case "42. TWAMIKALA N’ABIRA":
                                      startActivity(new Intent(getApplicationContext(), number42.class));
                                      break;
                                  case "43. RIHOL’EMWISI WA YESU":
                                      startActivity(new Intent(getApplicationContext(), number43.class));
                                      break;
                                  case "44. OMUGHULU MUBÎRÎ WAGHE AHWERE":
                                      startActivity(new Intent(getApplicationContext(), number44.class));
                                      break;
                                  case "45. UMBE BIBLIA":
                                      startActivity(new Intent(getApplicationContext(), number45.class));
                                      break;
                                  case "46. EBINYWA BY’ENGEBE":
                                      startActivity(new Intent(getApplicationContext(), number46.class));
                                      break;
                                  case "47. OKO MUSIKE W’E YORODANI":
                                      startActivity(new Intent(getApplicationContext(), number47.class));
                                      break;
                                  case "48. HASYABY’OBUTSEME":
                                      startActivity(new Intent(getApplicationContext(), number48.class));
                                      break;
                                  case "49. EYO HAKUHI":
                                      startActivity(new Intent(getApplicationContext(), number49.class));
                                      break;
                                  case "50. IRI EKIHUGHO KYOWENE":
                                      startActivity(new Intent(getApplicationContext(), number50.class));
                                      break;
                                  case "51. TUBATISAYE":
                                      startActivity(new Intent(getApplicationContext(), number51.class));
                                      break;
                                  case "52. ASA SOKO Y’OMUYISA":
                                      startActivity(new Intent(getApplicationContext(), number52.class));
                                      break;
                                  case "53. KIRIMU KIBUYIRIRE":
                                      startActivity(new Intent(getApplicationContext(), number53.class));
                                      break;
                                  case "54. HALY’EKYO NGASABA MWAMI":
                                      startActivity(new Intent(getApplicationContext(), number54.class));
                                      break;
                                  case "55. SULIWAHIKA KU YESU MULAMYA":
                                      startActivity(new Intent(getApplicationContext(), number55.class));
                                      break;
                                  case "56. NATALIRE HALI KU YESU":
                                      startActivity(new Intent(getApplicationContext(), number56.class));
                                      break;
                                  case "57. OYO ANZIRE ASE":
                                      startActivity(new Intent(getApplicationContext(), number57.class));
                                      break;
                                  case "58. YO MWAMI WA BOSI":
                                      startActivity(new Intent(getApplicationContext(), number58.class));
                                      break;
                                  case "59. YESU KRISTO ATWANZA":
                                      startActivity(new Intent(getApplicationContext(), number59.class));
                                      break;
                                  case "60. YESU TUTSEMESAYE":
                                      startActivity(new Intent(getApplicationContext(), number60.class));
                                      break;
                                  case "61. KANDI EKINYWA KYA YESU":
                                      startActivity(new Intent(getApplicationContext(), number61.class));
                                      break;
                                  case "62. YESU NYIKWANZIRE":
                                      startActivity(new Intent(getApplicationContext(), number62.class));
                                      break;
                                  case "63. NINDI ANGATULAMYA":
                                      startActivity(new Intent(getApplicationContext(), number63.class));
                                      break;
                                  case "64. UKALUHA? UBWIRE YESU":
                                      startActivity(new Intent(getApplicationContext(), number64.class));
                                      break;
                                  case "65. KA LYOWENE KUNDU-KUNDU":
                                      startActivity(new Intent(getApplicationContext(), number65.class));
                                      break;
                                  case "66. NATSEMIRE KIRO EKYO":
                                      startActivity(new Intent(getApplicationContext(), number66.class));
                                      break;
                                  case "67. ABANZIRWE N’OMWAMI":
                                      startActivity(new Intent(getApplicationContext(), number67.class));
                                      break;
                                  case "68. NDAMIBAWE":
                                      startActivity(new Intent(getApplicationContext(), number68.class));
                                      break;
                                  case "69. TWASYAPOLYA KO AW’ENGEBE":
                                      startActivity(new Intent(getApplicationContext(), number69.class));
                                      break;
                                  case "70. MUGHULU YESU ASYAHINDANIA AMAMI":
                                      startActivity(new Intent(getApplicationContext(), number70.class));
                                      break;
                                  case "71. NZAKIRWE MO KWEHI?":
                                      startActivity(new Intent(getApplicationContext(), number71.class));
                                      break;
                                  case "72. HALI OLUBANZA":
                                      startActivity(new Intent(getApplicationContext(), number72.class));
                                      break;
                                  case "73. OMWAMI AKABIRIKIRA":
                                      startActivity(new Intent(getApplicationContext(), number73.class));
                                      break;
                                  case "74. BIBA OMO NGYAKYA":
                                      startActivity(new Intent(getApplicationContext(), number74.class));
                                      break;
                                  case "75. OMULENGE GH’OMULISYA":
                                      startActivity(new Intent(getApplicationContext(), number75.class));
                                      break;
                                  case "76. LAMYA AB’EBIBI":
                                      startActivity(new Intent(getApplicationContext(), number76.class));
                                      break;
                                  case "77. INGYE NYANZIRE ENGULU":
                                      startActivity(new Intent(getApplicationContext(), number77.class));
                                      break;
                                  case "78. TULAMAYE ABAHERIRE":
                                      startActivity(new Intent(getApplicationContext(), number78.class));
                                      break;
                                  case "79. AMALIMA ERIRE":
                                      startActivity(new Intent(getApplicationContext(), number79.class));
                                      break;
                                  case "80. TUKOLE":
                                      startActivity(new Intent(getApplicationContext(), number80.class));
                                      break;
                                  case "81. KOL’OMUBIRI WAWE":
                                      startActivity(new Intent(getApplicationContext(), number81.class));
                                      break;
                                  case "82. OMO NGYAKYA":
                                      startActivity(new Intent(getApplicationContext(), number82.class));
                                      break;
                                  case "83. MUKENG’ERINA LY’OMWAMI":
                                      startActivity(new Intent(getApplicationContext(), number83.class));
                                      break;
                                  case "84. TUPIPY’OMWAMI NI MWENGE":
                                      startActivity(new Intent(getApplicationContext(), number84.class));
                                      break;
                                  case "85. NYIPIPIRE NYAMUHANGA":
                                      startActivity(new Intent(getApplicationContext(), number85.class));
                                      break;
                                  case "86. TUPIPE OMWAMI":
                                      startActivity(new Intent(getApplicationContext(), number86.class));
                                      break;
                                  case "87. TATA TWAS’AH’ULI":
                                      startActivity(new Intent(getApplicationContext(), number87.class));
                                      break;
                                  case "88. SUNYILABE KO":
                                      startActivity(new Intent(getApplicationContext(), number88.class));
                                      break;
                                  case "89. NDAMBI MBUYA Y’ERISABA":
                                      startActivity(new Intent(getApplicationContext(), number89.class));
                                      break;
                                  case "90. EBIRO NDATU BYAMAHWA":
                                      startActivity(new Intent(getApplicationContext(), number90.class));
                                      break;
                                  case "91. YITSINGE, USABE":
                                      startActivity(new Intent(getApplicationContext(), number91.class));
                                      break;
                                  case "92. WIBUKE SABATO":
                                      startActivity(new Intent(getApplicationContext(), number92.class));
                                      break;
                                  case "93. KIRO KY’ERILUHUKA":
                                      startActivity(new Intent(getApplicationContext(), number93.class));
                                      break;
                                  case "94. ERIHINDANA LY’E SABATO":
                                      startActivity(new Intent(getApplicationContext(), number94.class));
                                      break;
                                  case "95. EBIRO NDATU BYAHWERE":
                                      startActivity(new Intent(getApplicationContext(), number95.class));
                                      break;
                                  case "96. TWAMAKUKOKYA KANDI":
                                      startActivity(new Intent(getApplicationContext(), number96.class));
                                      break;
                                  case "97. MOTOW’ENGULU MBUYA":
                                      startActivity(new Intent(getApplicationContext(), number97.class));
                                      break;
                                  case "98. NYIKWANZIRE WE MULAMYA":
                                      startActivity(new Intent(getApplicationContext(), number98.class));
                                      break;
                                  case "99. NAMIBUK’OMUSALABA":
                                      startActivity(new Intent(getApplicationContext(), number99.class));
                                      break;
                                  case "100. ITWE TWAMABAN’OMWIRA":
                                      startActivity(new Intent(getApplicationContext(), number100.class));
                                      break;
                                  case "101. YESU KRISTO AKABIRIKIRA":
                                      startActivity(new Intent(getApplicationContext(), number101.class));
                                      break;
                                  case "102. OMO LUKYO L’OMWEYO":
                                      startActivity(new Intent(getApplicationContext(), number102.class));
                                      break;
                                  case "103. UBUTAWE AKANDI":
                                      startActivity(new Intent(getApplicationContext(), number103.class));
                                      break;
                                  case "104. UNYITABE NYINEMUKULIRIRA":
                                      startActivity(new Intent(getApplicationContext(), number104.class));
                                      break;
                                  case "105. ANGATOKA ERILAMYA":
                                      startActivity(new Intent(getApplicationContext(), number105.class));
                                      break;
                                  case "106. TWASYAHIMB’ENDATA W’ERIBWE":
                                      startActivity(new Intent(getApplicationContext(), number106.class));
                                      break;
                                  case "107. UNYIBWIRE EBYA YESU":
                                      startActivity(new Intent(getApplicationContext(), number107.class));
                                      break;
                                  case "108. OMULISYA MWANZE":
                                      startActivity(new Intent(getApplicationContext(), number108.class));
                                      break;
                                  case "109. NAHIRIRW’OKO LULENGO":
                                      startActivity(new Intent(getApplicationContext(), number109.class));
                                      break;
                                  case "110. BANEHO ABAKABIK’EMIGHAMBO":
                                      startActivity(new Intent(getApplicationContext(), number110.class));
                                      break;
                                  case "111. OBWIRA NA YESU":
                                      startActivity(new Intent(getApplicationContext(), number111.class));
                                      break;
                                  case "112. UNYISAMALIRE":
                                      startActivity(new Intent(getApplicationContext(), number112.class));
                                      break;
                                  case "113. MWASE KWINGYE":
                                      startActivity(new Intent(getApplicationContext(), number113.class));
                                      break;
                                  case "114. LUYI LIKINGWIRE":
                                      startActivity(new Intent(getApplicationContext(), number114.class));
                                      break;
                                  case "115. MUKUMU MUNENE":
                                      startActivity(new Intent(getApplicationContext(), number115.class));
                                      break;
                                  case "116. WASOND’EBINDU?":
                                      startActivity(new Intent(getApplicationContext(), number116.class));
                                      break;
                                  case "117. NAMASEGHERA, MULAMYA":
                                      startActivity(new Intent(getApplicationContext(), number117.class));
                                      break;
                                  case "118. YESU MWALIHA":
                                      startActivity(new Intent(getApplicationContext(), number118.class));
                                      break;
                                  case "119. ERIRIBA LY’OMUSASI":
                                      startActivity(new Intent(getApplicationContext(), number119.class));
                                      break;
                                  case "120. SESENE, NAMIKIRIRYA":
                                      startActivity(new Intent(getApplicationContext(), number120.class));
                                      break;
                                  case "121. NGANDIMB’OLWANZO LUWE":
                                      startActivity(new Intent(getApplicationContext(), number121.class));
                                      break;
                                  case "122. HAHUHI NAWE":
                                      startActivity(new Intent(getApplicationContext(), number122.class));
                                      break;
                                  case "123. HALY’ERINA LY’ERISWEKYA":
                                      startActivity(new Intent(getApplicationContext(), number123.class));
                                      break;
                                  case "124. YESU MUSA":
                                      startActivity(new Intent(getApplicationContext(), number124.class));
                                      break;
                                  case "125. EKYAKAKALA KIBUYA":
                                      startActivity(new Intent(getApplicationContext(), number125.class));
                                      break;
                                  case "126. OLW’ABIKIRIRYE":
                                      startActivity(new Intent(getApplicationContext(), number126.class));
                                      break;
                                  case "127. NYAMUHANG’ASY’ESYONYUNYU":
                                      startActivity(new Intent(getApplicationContext(), number127.class));
                                      break;
                                  case "128. NDAMBI MBUYA Y’ERISABA":
                                      startActivity(new Intent(getApplicationContext(), number128.class));
                                      break;
                                  case "129. YESU WAS’EWETU":
                                      startActivity(new Intent(getApplicationContext(), number129.class));
                                      break;
                                  case "130. NDI WAWE MWAMI":
                                      startActivity(new Intent(getApplicationContext(), number130.class));
                                      break;
                                  case "131. NANGAKUSOSA KUNDU":
                                      startActivity(new Intent(getApplicationContext(), number131.class));
                                      break;
                                  case "132. MUSALABA WA YESU":
                                      startActivity(new Intent(getApplicationContext(), number132.class));
                                      break;
                                  case "133. NYIRENDERE NAWE MWAMI":
                                      startActivity(new Intent(getApplicationContext(), number133.class));
                                      break;
                                  case "134. OLWANZO LW’ERISWEKERA":
                                      startActivity(new Intent(getApplicationContext(), number134.class));
                                      break;
                                  case "135. NYIKWANZIRE KWILABA MWAMI":
                                      startActivity(new Intent(getApplicationContext(), number135.class));
                                      break;
                                  case "136. AHW’ASYANZONDOLA HOSI":
                                      startActivity(new Intent(getApplicationContext(), number136.class));
                                      break;
                                  case "137. NGASOND’OMWAMI YESU":
                                      startActivity(new Intent(getApplicationContext(), number137.class));
                                      break;
                                  case "138. TWALA ENGEBE YAGHE":
                                      startActivity(new Intent(getApplicationContext(), number138.class));
                                      break;
                                  case "139. NYIWITE OMWIRA":
                                      startActivity(new Intent(getApplicationContext(), number139.class));
                                      break;
                                  case "140. YESU YO WAMBIRIKIRA":
                                      startActivity(new Intent(getApplicationContext(), number140.class));
                                      break;
                                  case "141. MBYE WAWE MWAMI":
                                      startActivity(new Intent(getApplicationContext(), number141.class));
                                      break;
                                  case "142. KIRO EKI KY’E SABATO":
                                      startActivity(new Intent(getApplicationContext(), number142.class));
                                      break;
                                  case "143. TWAMABUKA TUTSUMULE":
                                      startActivity(new Intent(getApplicationContext(), number143.class));
                                      break;
                                  case "144. MWAMI UNYISONDOL’ENDATA":
                                      startActivity(new Intent(getApplicationContext(), number144.class));
                                      break;
                                  case "145. SIGHUGHANE OMUBIRI":
                                      startActivity(new Intent(getApplicationContext(), number145.class));
                                      break;
                                  case "146. TABAL’EMWISI WAGHE":
                                      startActivity(new Intent(getApplicationContext(), number146.class));
                                      break;
                                  case "147. UNYIRETE HAKUHI":
                                      startActivity(new Intent(getApplicationContext(), number147.class));
                                      break;
                                  case "148. EHOSI NA YESU":
                                      startActivity(new Intent(getApplicationContext(), number148.class));
                                      break;
                                  case "149. GENDER’OMO MWISI":
                                      startActivity(new Intent(getApplicationContext(), number149.class));
                                      break;
                                  case "150. NIKWA ABAGHESI BALI HAYI?":
                                      startActivity(new Intent(getApplicationContext(), number150.class));
                                      break;
                                  case "151. SINYASY’EMBITA YAGHE":
                                      startActivity(new Intent(getApplicationContext(), number151.class));
                                      break;
                                  case "152. YESU BUGH’OMO MWEYO":
                                      startActivity(new Intent(getApplicationContext(), number152.class));
                                      break;
                                  case "153. OMW’ISONDA ERY’ENGYAKYA":
                                      startActivity(new Intent(getApplicationContext(), number153.class));
                                      break;
                                  case "154. UNYIBWIRE, UWE MUTEYA":
                                      startActivity(new Intent(getApplicationContext(), number154.class));
                                      break;
                                  case "155. NASYABYA AHO UKASONDA":
                                      startActivity(new Intent(getApplicationContext(), number155.class));
                                      break;
                                  case "156. YIHI, EBINYWA EBIBI":
                                      startActivity(new Intent(getApplicationContext(), number156.class));
                                      break;
                                  case "157. NI NDAMBI Y’ERIGHESA":
                                      startActivity(new Intent(getApplicationContext(), number157.class));
                                      break;
                                  case "158. MUKOLE LUBA":
                                      startActivity(new Intent(getApplicationContext(), number158.class));
                                      break;
                                  case "159. NYINE MUKUSONDA":
                                      startActivity(new Intent(getApplicationContext(), number159.class));
                                      break;
                                  case "160. KYANGAMB’ERIBYA WAWE":
                                      startActivity(new Intent(getApplicationContext(), number160.class));
                                      break;
                                  case "161. MWAMI NAGHE":
                                      startActivity(new Intent(getApplicationContext(), number161.class));
                                      break;
                                  case "162. MO NZIR’AKANYISONDOLA":
                                      startActivity(new Intent(getApplicationContext(), number162.class));
                                      break;
                                  case "163. YESU AKABIRIKIRA":
                                      startActivity(new Intent(getApplicationContext(), number163.class));
                                      break;
                                  case "164. MO BISANDO BYAWE YESU":
                                      startActivity(new Intent(getApplicationContext(), number164.class));
                                      break;
                                  case "165. NYIKWANZIRE":
                                      startActivity(new Intent(getApplicationContext(), number165.class));
                                      break;
                                  case "166. RIBWE RYA KERA":
                                      startActivity(new Intent(getApplicationContext(), number166.class));
                                      break;
                                  case "167. KIBANZA KYA KERA":
                                      startActivity(new Intent(getApplicationContext(), number167.class));
                                      break;
                                  case "168. MUKAMA MULISYA":
                                      startActivity(new Intent(getApplicationContext(), number168.class));
                                      break;
                                  case "169. MWIMAYE OBWAMI":
                                      startActivity(new Intent(getApplicationContext(), number169.class));
                                      break;
                                  case "170. MUHANGIKI MWAMI":
                                      startActivity(new Intent(getApplicationContext(), number170.class));
                                      break;
                                  case "171. KWE! MUTEYA":
                                      startActivity(new Intent(getApplicationContext(), number171.class));
                                      break;
                                  case "172. MUBUKE ABAGHOMBE":
                                      startActivity(new Intent(getApplicationContext(), number172.class));
                                      break;
                                  case "173. NGASONDA ERIKIRIRYA":
                                      startActivity(new Intent(getApplicationContext(), number173.class));
                                      break;
                                  case "174. OBUTSEME BULI OKO BASYAYA YO":
                                      startActivity(new Intent(getApplicationContext(), number174.class));
                                      break;
                                  case "175. MULAMYA KA YO MULISYA":
                                      startActivity(new Intent(getApplicationContext(), number175.class));
                                      break;
                                  case "176. RIKIRIRYA RIRI":
                                      startActivity(new Intent(getApplicationContext(), number176.class));
                                      break;
                                  case "177. SIHALI MWIRIMYA":
                                      startActivity(new Intent(getApplicationContext(), number177.class));
                                      break;
                                  case "178. MWAMI BYASYABYA KIRO KI?":
                                      startActivity(new Intent(getApplicationContext(), number178.class));
                                      break;
                                  case "179. OMUKWI AMASA":
                                      startActivity(new Intent(getApplicationContext(), number179.class));
                                      break;
                                  case "180. SITWASY’EKIRO":
                                      startActivity(new Intent(getApplicationContext(), number180.class));
                                      break;
                                  case "181. TWAMULINDA":
                                      startActivity(new Intent(getApplicationContext(), number181.class));
                                      break;
                                  case "182. TWALANGIR’AMASALALI":
                                      startActivity(new Intent(getApplicationContext(), number182.class));
                                      break;
                                  case "183. MWATSI MUBUYA":
                                      startActivity(new Intent(getApplicationContext(), number183.class));
                                      break;
                                  case "184. BUTSEME OKO KIHUGHO":
                                      startActivity(new Intent(getApplicationContext(), number184.class));
                                      break;
                                  case "185. RIBYA YO BYASYATUHA KI?":
                                      startActivity(new Intent(getApplicationContext(), number185.class));
                                      break;
                                  case "186. TWASUBWIRE ERIKULAKIRA":
                                      startActivity(new Intent(getApplicationContext(), number186.class));
                                      break;
                                  case "187. KANDI MULAMYA":
                                      startActivity(new Intent(getApplicationContext(), number187.class));
                                      break;
                                  case "188. NIKWA NABYA N’EBIBI":
                                      startActivity(new Intent(getApplicationContext(), number188.class));
                                      break;
                                  case "189. SITULI N’OMUYI OMO KIHUGHO":
                                      startActivity(new Intent(getApplicationContext(), number189.class));
                                      break;
                                  case "190. ERINA RYA YESU":
                                      startActivity(new Intent(getApplicationContext(), number190.class));
                                      break;
                                  case "191. YESU MULAMYA W’EKWENENE":
                                      startActivity(new Intent(getApplicationContext(), number191.class));
                                      break;
                                  case "192. MO MUSALABA GH’OMULAMYA":
                                      startActivity(new Intent(getApplicationContext(), number192.class));
                                      break;
                                  case "193. ERIBYA WA YESU":
                                      startActivity(new Intent(getApplicationContext(), number193.class));
                                      break;
                                  case "194. HAMABYA OLWANZO":
                                      startActivity(new Intent(getApplicationContext(), number194.class));
                                      break;
                                  case "195. TUHE OMULIRO W’ERIBYA HO":
                                      startActivity(new Intent(getApplicationContext(), number195.class));
                                      break;
                                  case "196. MULI KAGHALA OMO MUSASI":
                                      startActivity(new Intent(getApplicationContext(), number196.class));
                                      break;
                                  case "197. KIRO YESU ASYASA":
                                      startActivity(new Intent(getApplicationContext(), number197.class));
                                      break;
                                  case "198. YESU Y’OMWIRA ULABIRE":
                                      startActivity(new Intent(getApplicationContext(), number198.class));
                                      break;
                                  case "199. MWAMI APIPAWE":
                                      startActivity(new Intent(getApplicationContext(), number199.class));
                                      break;
                                  case "200. OMUBUYIRIRE, MWAMI MUTOKI":
                                      startActivity(new Intent(getApplicationContext(), number200.class));
                                      break;
                              }


                                }

                      });
//        String jsonFileString = Utils.getJsonFromAssets(getApplicationContext(), "likedSongs.json");
//        Log.i("nandehymne", jsonFileString);
//        Gson gson = new Gson();
//        Type listUserType = new TypeToken<List<Song>>() { }.getType();
//        List<Song> songs = gson.fromJson(jsonFileString, listUserType);
//        for (int i = 0; i < songs.size(); i++) {
//            Log.i("data", "> Item " + i + "\n" + songs.get(i));
//        }


       // TextView thanksView = findViewById(R.id.thanks);
      //  thanksView.setText(Html.fromHtml(getString(R.string.thanks)));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.exit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                return(true);
        }

        return (super.onOptionsItemSelected(menuItem));
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
