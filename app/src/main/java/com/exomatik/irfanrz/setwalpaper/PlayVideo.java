package com.exomatik.irfanrz.setwalpaper;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.exomatik.irfanrz.setwalpaper.VideoWallpaper.MyWallpaperService;

public class PlayVideo extends AppCompatActivity {
    private RelativeLayout rlPlay;
    private VideoView videoPlay;
    private ImageView imgBack, imgThumb, imgSetWalpaper;
    private MediaController mediaController;
    public static String pathVideo;
    public static String thumbVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        rlPlay = (RelativeLayout) findViewById(R.id.rl_btn_play);
        videoPlay = (VideoView) findViewById(R.id.video_play);
        imgBack = (ImageView) findViewById(R.id.back);
        imgThumb = (ImageView) findViewById(R.id.img_thumb);
        imgSetWalpaper = (ImageView) findViewById(R.id.img_set_walpaper);

        mediaController = new MediaController(this);
        Glide.with(this).load("file://" + thumbVideo)
                .skipMemoryCache(false)
                .into(imgThumb);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayVideo.this, SetWalpaper.class);
                startActivity(intent);
                finish();
            }
        });

        rlPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgThumb.setVisibility(View.GONE);
                playingVideo();
            }
        });

        imgSetWalpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyWallpaperService.path = pathVideo;
                Intent intent = new Intent(PlayVideo.this, Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void playingVideo(){
        String videoPath = "android.resource://com.exomatik.irfanrz.setwalpaper/"+R.raw.admob;
        Uri uri = Uri.parse(pathVideo);
        videoPlay.setVideoURI(uri);


        videoPlay.setMediaController(mediaController);

        mediaController.setAnchorView(videoPlay);
        videoPlay.start();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(PlayVideo.this, SetWalpaper.class);
        startActivity(intent);
        finish();
    }
}
