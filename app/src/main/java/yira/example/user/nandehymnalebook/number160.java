package yira.example.user.nandehymnalebook;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class number160 extends MainActivity {

    ImageButton play;
    ImageButton pause;
    MediaPlayer mplayer;
    String filename;
    String resource;
    int checkFileExistence;



    // @SuppressLint({"ResourceAsColor", "RestrictedApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number160);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


        TextView songView = findViewById(R.id.number160);
        songView.setMovementMethod(new ScrollingMovementMethod());
        songView.setText(Html.fromHtml(getString(R.string.number160)));

        play = findViewById(R.id.play1);
        pause = findViewById(R.id.pause1);
        pause.setVisibility(View.INVISIBLE);


        filename = "number160";
        resource =  "raw/" + filename;

        checkFileExistence = getApplicationContext().getResources().getIdentifier(
                filename,"raw", getApplicationContext().getPackageName());

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


