package com.exomatik.irfanrz.setwalpaper.FragmentMain;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.exomatik.irfanrz.setwalpaper.MainActivity;
import com.exomatik.irfanrz.setwalpaper.R;
import com.exomatik.irfanrz.setwalpaper.SetWalpaper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IrfanRZ on 6/2/2018.
 */

public class FragmentVideo extends Fragment {
    private View view;
    private RelativeLayout rlSource, rlPlayStore, rlRateUs, rlCrop, rlMute;
//    private InterstitialAd mInterstitialAd;

    public FragmentVideo() {

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);

        rlSource = (RelativeLayout) view.findViewById(R.id.rl_add_video);
        rlPlayStore = (RelativeLayout) view.findViewById(R.id.rl_more_apps);
        rlRateUs = (RelativeLayout) view.findViewById(R.id.rl_rate_app);
        rlCrop = (RelativeLayout) view.findViewById(R.id.rl_crop_video);
        rlMute = (RelativeLayout) view.findViewById(R.id.rl_audio);

        rlSource.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SetWalpaper.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        rlPlayStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String appPackageName = getActivity().getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=exomatik")));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=exomatik")));
                }
            }
        });

        rlRateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://play.google.com/store/apps/details?id" + getActivity().getPackageName());
//                Uri uri = Uri.parse("http://play.google.com/store/apps/details?id=com.exomatik.irfanrz.qrbarcodescanner");
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + getActivity().getPackageName())));
//                            Uri.parse("http://play.google.com/store/apps/details?id=com.exomatik.irfanrz.qrbarcodescanner")));

                }
            }
        });

        rlCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(v, "Maaf, fitur ini belum tersedia", Snackbar.LENGTH_LONG);

                snackbar.show();
            }
        });

        rlMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(v, "Maaf, fitur ini belum tersedia", Snackbar.LENGTH_LONG);

                snackbar.show();
            }
        });
        return view;
    }

}