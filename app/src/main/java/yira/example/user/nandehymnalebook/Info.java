package yira.example.user.nandehymnalebook;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

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
