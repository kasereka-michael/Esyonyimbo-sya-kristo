package yira.example.user.nandehymnalebook;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;


import com.google.android.material.navigation.NavigationView;

public class firstone extends AppCompatActivity {
    private static String LOG_TAG = "nandehymne";
        private Button move;


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
                Log.i(LOG_TAG, "gone back");
                return(true);

        }
        return (super.onOptionsItemSelected(menuItem));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//request windows features
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_firstone);

        final DrawerLayout drawerLayout = findViewById(R.id.drawerlayout);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        move=findViewById(R.id.move);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(firstone.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

}


