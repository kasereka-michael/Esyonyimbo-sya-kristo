package yira.example.user.nandehymnalebook;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {
    public SongAdapter(@NonNull Context context, ArrayList<String> stringArrayList) {
        super(context, 0, stringArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View songlist = convertView;

        if(position % 2 == 0){
            songlist.setBackgroundColor(Color.parseColor("#f5fffa"));
        }else{
            songlist.setBackgroundColor(Color.parseColor("#eee8aa"));
        }

        return songlist;
    }
}
