package com.exomatik.irfanrz.setwalpaper;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.exomatik.irfanrz.setwalpaper.FragmentMain.FragmentVideo;
import com.exomatik.irfanrz.setwalpaper.FragmentMain.FragmentWarna;
import com.exomatik.irfanrz.setwalpaper.FragmentMain.MyDialogFragment;
import com.exomatik.irfanrz.setwalpaper.ViewAdapter.ViewPagerAdapter;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;

public class MainActivity extends AppCompatActivity {
//    private AdView adView;
    private TabLayout tabKategori;
    private ViewPager viewKategori;
    private TextView textToolbar;
    private ImageView imgToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tabKategori = (TabLayout) findViewById(R.id.tab_Kategori);
        viewKategori = (ViewPager) findViewById(R.id.view_Kategori);
        textToolbar = (TextView) findViewById(R.id.text_toolbar);
        imgToolbar = (ImageView) findViewById(R.id.img_toolbar);

//        adView = (AdView) findViewById(R.id.adView);
//
//        adView.setVisibility(View.GONE);

//        setAdMob();
        setFragment();

        imgToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textToolbar.getText().toString().contains("Video")) {
                    Toast.makeText(MainActivity.this, "Add Video", Toast.LENGTH_SHORT).show();
                } else {
                    setDialogColor();
                }
            }
        });
    }

    private void setDialogColor() {
        ColorPickerDialogBuilder
                .with(MainActivity.this)
                .setTitle("Pilih Warna")
                .initialColor(-1)
                .wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
                .density(12)
                .setOnColorSelectedListener(new OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(int selectedColor) {

                    }
                })
                .setPositiveButton("ok", new ColorPickerClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
                        String hexColor = String.format("#%06X", (0xFFFFFF & selectedColor));

                        DialogFragment newFragment = MyDialogFragment.newInstance();
                        MyDialogFragment.warna = hexColor;
                        MyDialogFragment.code = "ff" + hexColor.replaceAll("#", "");
                        MyDialogFragment.color = selectedColor;
                        MyDialogFragment.typeSelect = 2;

                        newFragment.show(MainActivity.this.getFragmentManager(), "dialog");
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .build()
                .show();
    }


//    private void setAdMob() {
//        MobileAds.initialize(this, String.valueOf(R.string.admob));
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
//        adView.loadAd(adRequest);
//        adView.setVisibility(View.GONE);
//
//        adView.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                super.onAdLoaded();
//                adView.setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onAdFailedToLoad(int errorCode) {
//                super.onAdFailedToLoad(errorCode);
//                adView.setVisibility(View.GONE);
//            }
//        });
//    }

    private void setFragment() {
        ViewPagerAdapter adapterKategori = new ViewPagerAdapter(getSupportFragmentManager());

        adapterKategori.AddFragment(new FragmentVideo(), "Video");
        adapterKategori.AddFragment(new FragmentWarna(), "Warna");

        viewKategori.setAdapter(adapterKategori);
        tabKategori.setupWithViewPager(viewKategori);

        tabKategori.getTabAt(0).setText("VIDEO");
        tabKategori.getTabAt(1).setText("WARNA");

        textToolbar.setText("Video Walpaper");
        imgToolbar.setImageResource(R.drawable.ic_video_white);
        tabKategori.getTabAt(0).setIcon(R.drawable.ic_video);
        tabKategori.getTabAt(1).setIcon(R.drawable.ic_warna_gray);

        tabKategori.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        textToolbar.setText("Video Walpaper");
                        imgToolbar.setImageResource(R.drawable.ic_video_white);
                        tab.setIcon(R.drawable.ic_video);
                        tabKategori.getTabAt(1).setIcon(R.drawable.ic_warna_gray);
                        break;
                    case 1:
                        textToolbar.setText("Color Walpaper");
                        imgToolbar.setImageResource(R.drawable.ic_color_white);
                        tab.setIcon(R.drawable.ic_warna);
                        tabKategori.getTabAt(0).setIcon(R.drawable.ic_video_gray);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
