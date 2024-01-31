package yira.example.user.nandehymnalebook;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;

public class number4 extends MainActivity {

    ImageButton play;
    ImageButton pause;
    MediaPlayer mplayer;
    ImageButton like;
    String filename;
    String resource;
    int checkFileExistence;

    Gson gson = new Gson();



    // @SuppressLint({"ResourceAsColor", "RestrictedApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        filename = "number2";

        like = findViewById(R.id.like);
        Utils u = new Utils();;
        File[] sti = getApplicationContext().getFilesDir().listFiles();
        ArrayList<String> arr = new ArrayList<>();
        File fileJson = sti[0];
        boolean chk = false;
        try {
            String strFileJson = u.getStringFromFile(fileJson.toString());
            Song songs[] = gson.fromJson(strFileJson, Song[].class);
            for(Song s: songs ) {
                Log.i("nandehymne", "num1: " + s.getName() + "num2: " + filename);
                if(s.getName().equals(filename)) {
                    chk = true;
                    like.setImageResource(R.drawable.ic_favorited);
                }
            }
            if(chk == false){}

        } catch (Exception e) {
            e.printStackTrace();
        }



        TextView songView = findViewById(R.id.number4);
        songView.setMovementMethod(new ScrollingMovementMethod());
        songView.setText(Html.fromHtml(getString(R.string.number4)));

        play = findViewById(R.id.play1);
        pause = findViewById(R.id.pause1);
        pause.setVisibility(View.INVISIBLE);


        filename = "number4";
        resource =  "raw/" + filename;

        checkFileExistence = getApplicationContext().getResources().getIdentifier(
                filename,"raw", getApplicationContext().getPackageName());

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.ASYASA);
                Song song = new Song(title, filename);
                String fil =  gson.toJson(song);

                File [] sti = getApplicationContext().getFilesDir().listFiles();
                ArrayList<String> arr = new ArrayList<>();
                File fileJson = sti[0];
                try {
                    String strFileJson = u.getStringFromFile(fileJson.toString());
                    Song songs[] = gson.fromJson(strFileJson, Song[].class);

                    boolean chk = false;
                    String fl;
                    Song so;
                    for(Song s: songs ) {
                        if(!s.getName().equals(filename)){
                            so = new Song(s.getNum(), s.getName());
                            fl =  gson.toJson(so);
                            arr.add(fl);}
                        if(s.getName().equals(filename))
                            chk = true;
                    }
                    if(chk == false)
                        arr.add(fil);
                    u.writeJsonFile(fileJson, arr.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                Log.i("nandehymne", "DATA:" + arr.toString());
                Log.i("nandehymne", "saved!");
            }
        });

        if(checkFileExistence != 0) {

            mplayer = MediaPlayer.create(this, getResources().getIdentifier(resource,
                    null, getApplicationContext().getPackageName()));//Altenative of (this, R.raw.rawFilename)

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DialogInterface.OnClickListener dClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            switch (i) {
                                case DialogInterface.BUTTON_POSITIVE:
                                    if (mplayer.isPlaying()) {
                                        mplayer.stop();
                                        pause.setVisibility(View.INVISIBLE);
                                        play.setVisibility(View.VISIBLE);
                                    } else {
                                        mplayer.start();
                                        play.setVisibility(View.INVISIBLE);
                                        pause.setVisibility(View.VISIBLE);
                                    }
                                    break;

                                case DialogInterface.BUTTON_NEGATIVE:
                                    break;
                            }
                        }
                    };

                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setMessage("Ghunikirirye kowangana sata olwimbo luno?")
                            .setPositiveButton("Inga", dClickListener).setNegativeButton("Iyehe", dClickListener).show();
                }
            });

            pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    mplayer.stop();
                    pause.setVisibility(View.INVISIBLE);
                    play.setVisibility(View.VISIBLE);

                }
            });
        }else{
            pause.setVisibility(View.GONE);
            play.setVisibility(View.GONE);
        }
    }

    @Override
    public void onBackPressed(){
        if(checkFileExistence != 0){
            mplayer.stop();
            pause.setVisibility(View.INVISIBLE);
            play.setVisibility(View.VISIBLE);
        }
        Intent backMain = new Intent(this,MainActivity.class);
        startActivity(backMain);
        finish();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.about:
                startActivity(new Intent(getApplicationContext(), Info.class));
                return(true);
            case R.id.exit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                return(true);
            case R.id.anza:
                startActivity(new Intent(getApplicationContext(), Liked.class));
                return(true);
        }

        return (super.onOptionsItemSelected(menuItem));
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
        super.onPrepareOptionsMenu(menu);
        if(menu.findItem(R.id.searchBar) != null){
            menu.findItem(R.id.searchBar).setVisible(false);
        }

        return super.onPrepareOptionsMenu(menu);
    }

    //Handling the back/aka home button
    @Override
    public boolean onSupportNavigateUp(){
        if(checkFileExistence != 0) {
            if (mplayer.isPlaying()) {
                mplayer.stop();
            }
        }
        Intent backMain = new Intent(this, MainActivity.class);
        startActivity(backMain);
        finish();
        return true;
    }
}


