package yira.example.user.nandehymnalebook;

//import android.annotation.TargetApi;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


//import java.lang.annotation.Target;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static String LOG_TAG = "nandehymne";
   public ArrayAdapter<String> adapter;

//    private static final String BUNDLE_RECYCLER_LAYOUT = "recycler_layout";
    public static int top;
    private static View v;
    public static int ind;
    public static ListView songsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(LOG_TAG, "save state");
       // MobileAds.initialize(this, "YOUR_ADMOB_ca-app-pub-1941505919262658~4500013525");

        songsList = findViewById(R.id.songsList);//My view to hold the array of songs in list




       // mAdView = findViewById(R.id.adView);
        //AdRequest adRequest = new AdRequest.Builder().build();
       // mAdView.loadAd(adRequest);

        //SearchView searchView = findViewById(R.id.searchBar);

        /* searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                adapter.getFilter().filter(s);
                return false;
            }
        });*/

        //getActionBar().setIcon(R.drawable.my_icon);

        ArrayList<String> arraySongs = new ArrayList<>();// The array of songs

        //Adding songs to my array of songs
        arraySongs.add("1. MUTEYA BUHA ENGUBI");
        arraySongs.add("2. OMUKAMA ANEMWASA");
        arraySongs.add("3. NASYAMULANGIRA");
        arraySongs.add("4. ASYASA");
        arraySongs.add("5. MUTEYA WE MINYISY’ENDAMBI");
        arraySongs.add("6. IMWE BABUYIRIRE");
        arraySongs.add("7. ASYASWASA, ASYASWASA");
        arraySongs.add("8. EKIRO YESU ASYATWENDA");
        arraySongs.add("9. BUHA ENGUBI");
        arraySongs.add("10. TWASYAHINDANA ELUBULA");
        arraySongs.add("11. MULAMYA NGANDIKUKWAMA");
        arraySongs.add("12. HALI EYISOKO YOSWIRE");
        arraySongs.add("13. NYIHENAYE KWILAB’AMATWA");
        arraySongs.add("14. WOWE AMAKUTA");
        arraySongs.add("15. YESU KRISTO MWANYANZA");
        arraySongs.add("16. WERAY’EBYALA BYAGHE");
        arraySongs.add("17. NYIPIPIRE OLWANZO");
        arraySongs.add("18. TUGHENDE ABASIRIKANI");
        arraySongs.add("19. LEBAYA SUTEBAWE");
        arraySongs.add("20. IBUK’OMUTIMA WAWE");
        arraySongs.add("21. NASA KU MUSALABA");
        arraySongs.add("22. MUYISA, MUYISA");
        arraySongs.add("23. NYUSULE");
        arraySongs.add("24. NYIKWANZIRE MWAMI");
        arraySongs.add("25. NYIKUH’EBYOSI");
        arraySongs.add("26. NYINEMWASA KO NDI");
        arraySongs.add("27. MWAMI NI MWENGE");
        arraySongs.add("28. NGASONDA ERYERA");
        arraySongs.add("29. UBYE NETU");
        arraySongs.add("30. ULANGIRE BWAMIRA");
        arraySongs.add("31. LYUBA LY’OMUTIMA");
        arraySongs.add("32. YESU NIWE RIBWE");
        arraySongs.add("33. AKANZONDOLA");
        arraySongs.add("34. NDI N’OBUHOLO MO MUTIMA");
        arraySongs.add("35. NYANZIRY’OBWIRA");
        arraySongs.add("36. NAMAKWIKIRIRYA");
        arraySongs.add("37. MBYE HAKUHI NAWE");
        arraySongs.add("38. TUKASIKIRA KU KRISTO OLUKUKA");
        arraySongs.add("39. NASYABYA NYINIKIRIRYE");
        arraySongs.add("40. MWIKIRIRYE, MUSIKAYE");
        arraySongs.add("41. YESU ABYE NAWE EHOSI");
        arraySongs.add("42. TWAMIKALA N’ABIRA");
        arraySongs.add("43. RIHOL’EMWISI WA YESU");
        arraySongs.add("44. OMUGHULU MUBÎRÎ WAGHE AHWERE");
        arraySongs.add("45. UMBE BIBLIA");
        arraySongs.add("46. EBINYWA BY’ENGEBE");
        arraySongs.add("47. OKO MUSIKE W’E YORODANI");
        arraySongs.add("48. HASYABY’OBUTSEME");
        arraySongs.add("49. EYO HAKUHI");
        arraySongs.add("50. IRI EKIHUGHO KYOWENE");
        arraySongs.add("51. TUBATISAYE");
        arraySongs.add("52. ASA SOKO Y’OMUYISA");
        arraySongs.add("53. KIRIMU KIBUYIRIRE");
        arraySongs.add("54. HALY’EKYO NGASABA MWAMI");
        arraySongs.add("55. SULIWAHIKA KU YESU MULAMYA");
        arraySongs.add("56. NATALIRE HALI KU YESU");
        arraySongs.add("57. OYO ANZIRE ASE");
        arraySongs.add("58. YO MWAMI WA BOSI");
        arraySongs.add("59. YESU KRISTO ATWANZA");
        arraySongs.add("60. YESU TUTSEMESAYE");
        arraySongs.add("61. KANDI EKINYWA KYA YESU");
        arraySongs.add("62. YESU NYIKWANZIRE");
        arraySongs.add("63. NINDI ANGATULAMYA");
        arraySongs.add("64. UKALUHA? UBWIRE YESU");
        arraySongs.add("65. KA LYOWENE KUNDU-KUNDU");
        arraySongs.add("66. NATSEMIRE KIRO EKYO");
        arraySongs.add("67. ABANZIRWE N’OMWAMI");
        arraySongs.add("68. NDAMIBAWE");
        arraySongs.add("69. TWASYAPOLYA KO AW’ENGEBE");
        arraySongs.add("70. MUGHULU YESU ASYAHINDANIA AMAMI");
        arraySongs.add("71. NZAKIRWE MO KWEHI?");
        arraySongs.add("72. HALI OLUBANZA");
        arraySongs.add("73. OMWAMI AKABIRIKIRA");
        arraySongs.add("74. BIBA OMO NGYAKYA");
        arraySongs.add("75. OMULENGE GH’OMULISYA");
        arraySongs.add("76. LAMYA AB’EBIBI");
        arraySongs.add("77. INGYE NYANZIRE ENGULU");
        arraySongs.add("78. TULAMAYE ABAHERIRE");
        arraySongs.add("79. AMALIMA ERIRE");
        arraySongs.add("80. TUKOLE");
        arraySongs.add("81. KOL’OMUBIRI WAWE");
        arraySongs.add("82. OMO NGYAKYA");
        arraySongs.add("83. MUKENG’ERINA LY’OMWAMI");
        arraySongs.add("84. TUPIPY’OMWAMI NI MWENGE");
        arraySongs.add("85. NYIPIPIRE NYAMUHANGA");
        arraySongs.add("86. TUPIPE OMWAMI");
        arraySongs.add("87. TATA TWAS’AH’ULI");
        arraySongs.add("88. SUNYILABE KO");
        arraySongs.add("89. NDAMBI MBUYA Y’ERISABA");
        arraySongs.add("90. EBIRO NDATU BYAMAHWA");
        arraySongs.add("91. YITSINGE, USABE");
        arraySongs.add("92. WIBUKE SABATO");
        arraySongs.add("93. KIRO KY’ERILUHUKA");
        arraySongs.add("94. ERIHINDANA LY’E SABATO");
        arraySongs.add("95. EBIRO NDATU BYAHWERE");
        arraySongs.add("96. TWAMAKUKOKYA KANDI");
        arraySongs.add("97. MOTOW’ENGULU MBUYA");
        arraySongs.add("98. NYIKWANZIRE WE MULAMYA");
        arraySongs.add("99. NAMIBUK’OMUSALABA");
        arraySongs.add("100. ITWE TWAMABAN’OMWIRA");
        arraySongs.add("101. YESU KRISTO AKABIRIKIRA");
        arraySongs.add("102. OMO LUKYO L’OMWEYO");
        arraySongs.add("103. UBUTAWE AKANDI");
        arraySongs.add("104. UNYITABE NYINEMUKULIRIRA");
        arraySongs.add("105. ANGATOKA ERILAMYA");
        arraySongs.add("106. TWASYAHIMB’ENDATA W’ERIBWE");
        arraySongs.add("107. UNYIBWIRE EBYA YESU");
        arraySongs.add("108. OMULISYA MWANZE");
        arraySongs.add("109. NAHIRIRW’OKO LULENGO");
        arraySongs.add("110. BANEHO ABAKABIK’EMIGHAMBO");
        arraySongs.add("111. OBWIRA NA YESU");
        arraySongs.add("112. UNYISAMALIRE");
        arraySongs.add("113. MWASE KWINGYE");
        arraySongs.add("114. LUYI LIKINGWIRE");
        arraySongs.add("115. MUKUMU MUNENE");
        arraySongs.add("116. WASOND’EBINDU?");
        arraySongs.add("117. NAMASEGHERA, MULAMYA");
        arraySongs.add("118. YESU MWALIHA");
        arraySongs.add("119. ERIRIBA LY’OMUSASI");
        arraySongs.add("120. SESENE, NAMIKIRIRYA");
        arraySongs.add("121. NGANDIMB’OLWANZO LUWE");
        arraySongs.add("122. HAHUHI NAWE");
        arraySongs.add("123. HALY’ERINA LY’ERISWEKYA");
        arraySongs.add("124. YESU MUSA");
        arraySongs.add("125. EKYAKAKALA KIBUYA");
        arraySongs.add("126. OLW’ABIKIRIRYE");
        arraySongs.add("127. NYAMUHANG’ASY’ESYONYUNYU");
        arraySongs.add("128. NDAMBI MBUYA Y’ERISABA");
        arraySongs.add("129. YESU WAS’EWETU");
        arraySongs.add("130. NDI WAWE MWAMI");
        arraySongs.add("131. NANGAKUSOSA KUNDU");
        arraySongs.add("132. MUSALABA WA YESU");
        arraySongs.add("133. NYIRENDERE NAWE MWAMI");
        arraySongs.add("134. OLWANZO LW’ERISWEKERA");
        arraySongs.add("135. NYIKWANZIRE KWILABA MWAMI");
        arraySongs.add("136. AHW’ASYANZONDOLA HOSI");
        arraySongs.add("137. NGASOND’OMWAMI YESU");
        arraySongs.add("138. TWALA ENGEBE YAGHE");
        arraySongs.add("139. NYIWITE OMWIRA");
        arraySongs.add("140. YESU YO WAMBIRIKIRA");
        arraySongs.add("141. MBYE WAWE MWAMI");
        arraySongs.add("142. KIRO EKI KY’E SABATO");
        arraySongs.add("143. TWAMABUKA TUTSUMULE");
        arraySongs.add("144. MWAMI UNYISONDOL’ENDATA");
        arraySongs.add("145. SIGHUGHANE OMUBIRI");
        arraySongs.add("146. TABAL’EMWISI WAGHE");
        arraySongs.add("147. UNYIRETE HAKUHI");
        arraySongs.add("148. EHOSI NA YESU");
        arraySongs.add("149. GENDER’OMO MWISI");
        arraySongs.add("150. NIKWA ABAGHESI BALI HAYI?");
        arraySongs.add("151. SINYASY’EMBITA YAGHE");
        arraySongs.add("152. YESU BUGH’OMO MWEYO");
        arraySongs.add("153. OMW’ISONDA ERY’ENGYAKYA");
        arraySongs.add("154. UNYIBWIRE, UWE MUTEYA");
        arraySongs.add("155. NASYABYA AHO UKASONDA");
        arraySongs.add("156. YIHI, EBINYWA EBIBI");
        arraySongs.add("157. NI NDAMBI Y’ERIGHESA");
        arraySongs.add("158. MUKOLE LUBA");
        arraySongs.add("159. NYINE MUKUSONDA");
        arraySongs.add("160. KYANGAMB’ERIBYA WAWE");
        arraySongs.add("161. MWAMI NAGHE");
        arraySongs.add("162. MO NZIR’AKANYISONDOLA");
        arraySongs.add("163. YESU AKABIRIKIRA");
        arraySongs.add("164. MO BISANDO BYAWE YESU");
        arraySongs.add("165. NYIKWANZIRE");
        arraySongs.add("166. RIBWE RYA KERA");
        arraySongs.add("167. KIBANZA KYA KERA");
        arraySongs.add("168. MUKAMA MULISYA");
        arraySongs.add("169. MWIMAYE OBWAMI");
        arraySongs.add("170. MUHANGIKI MWAMI");
        arraySongs.add("171. KWE! MUTEYA");
        arraySongs.add("172. MUBUKE ABAGHOMBE");
        arraySongs.add("173. NGASONDA ERIKIRIRYA");
        arraySongs.add("174. OBUTSEME BULI OKO BASYAYA YO");
        arraySongs.add("175. MULAMYA KA YO MULISYA");
        arraySongs.add("176. RIKIRIRYA RIRI");
        arraySongs.add("177. SIHALI MWIRIMYA");
        arraySongs.add("178. MWAMI BYASYABYA KIRO KI?");
        arraySongs.add("179. OMUKWI AMASA");
        arraySongs.add("180. SITWASY’EKIRO");
        arraySongs.add("181. TWAMULINDA");
        arraySongs.add("182. TWALANGIR’AMASALALI");
        arraySongs.add("183. MWATSI MUBUYA");
        arraySongs.add("184. BUTSEME OKO KIHUGHO");
        arraySongs.add("185. RIBYA YO BYASYATUHA KI?");
        arraySongs.add("186. TWASUBWIRE ERIKULAKIRA");
        arraySongs.add("187. KANDI MULAMYA");
        arraySongs.add("188. NIKWA NABYA N’EBIBI");
        arraySongs.add("189. SITULI N’OMUYI OMO KIHUGHO");
        arraySongs.add("190. ERINA RYA YESU");
        arraySongs.add("191. YESU MULAMYA W’EKWENENE");
        arraySongs.add("192. MO MUSALABA GH’OMULAMYA");
        arraySongs.add("193. ERIBYA WA YESU");
        arraySongs.add("194. HAMABYA OLWANZO");
        arraySongs.add("195. TUHE OMULIRO W’ERIBYA HO");
        arraySongs.add("196. MULI KAGHALA OMO MUSASI");
        arraySongs.add("197. KIRO YESU ASYASA");
        arraySongs.add("198. YESU Y’OMWIRA ULABIRE");
        arraySongs.add("199. MWAMI APIPAWE");
        arraySongs.add("200. OMUBUYIRIRE, MWAMI MUTOKI");

        // Creating an adapter so I can have my songs seen in an android UI
        //adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, arraySongs);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, arraySongs);
        //Setting the arrayAdapter to my Array of songs
        songsList.setAdapter(adapter);
        songsList.setSelectionFromTop(ind,top);

        songsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String item = (String) adapterView.getItemAtPosition(position);
                Log.i(LOG_TAG, String.valueOf(songsList.getFirstVisiblePosition()));
                ind = songsList.getFirstVisiblePosition();
                Log.i(LOG_TAG, " index: " + ind);
                v = songsList.getChildAt(0);
                top = (v == null) ? 0 : (v.getTop() - songsList.getPaddingTop());
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
                        Log.i(LOG_TAG, "restore state");
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem item = menu.findItem(R.id.searchBar);
        SearchView searchView;
        searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onPrepareOptionsMenu(menu);
    }

           @Override
            public boolean onOptionsItemSelected(MenuItem menuItem){
                switch (menuItem.getItemId()){

                    case R.id.about:
                        Log.i(LOG_TAG, "save state");
                        startActivity(new Intent(getApplicationContext(), Info.class));
                        return(true);
                    case R.id.exit:
                        Log.i(LOG_TAG, "gone back");
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        return(true);
                    case R.id.anza:
                        startActivity(new Intent(getApplicationContext(), Liked.class));
                        return(true);
                }
                return (super.onOptionsItemSelected(menuItem));
            }

    //@TargetApi(15)
    public void onBackPressed(){
        //finish();
        //System.exit(0);
        /*Intent CloseInt = new Intent(getApplicationContext(), MainActivity.class);
        CloseInt.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        CloseInt.putExtra("Close App", true);
        startActivity(CloseInt);
        finish();*/
//        Log.i(LOG_TAG, "gone back");
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
//            cvp = 0;
//            cvp = ((LinearLayoutManager)rv.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        super.onSaveInstanceState(outState);
        Log.i(LOG_TAG, "save state");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(LOG_TAG, "restore state");

    }
}
