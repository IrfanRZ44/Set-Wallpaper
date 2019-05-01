package com.exomatik.irfanrz.setwalpaper;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.exomatik.irfanrz.setwalpaper.VideoWallpaper.MovieLiveWallpaperService;

//import com.exomatik.irfanrz.setwalpaper.VideoWallpaper.MovieLiveWallpaperService;
//import com.exomatik.irfanrz.setwalpaper.VideoWallpaper.SettingsActivity;

public class Main2Activity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(v);
            }
        });


    }


    private void click(View view) {

        Snackbar snackbar = Snackbar
                .make(view, "Maaf, fitur ini belum tersedia", Snackbar.LENGTH_LONG);

        snackbar.show();

//        Intent intent = new Intent(Main2Activity.this, MovieLiveWallpaperService.class);
//        intent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
//                new ComponentName(this, MovieLiveWallpaperService.class));
//        startActivity(intent);

//        Intent localIntent = new Intent();
//        localIntent.addFlags(67108864);
//        localIntent.addFlags(32768);
//        localIntent.addFlags(268435456);
//        localIntent.setAction(WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
//        localIntent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT, new ComponentName(this, MovieLiveWallpaperService.class));
//        startActivity(localIntent);

    }
}
