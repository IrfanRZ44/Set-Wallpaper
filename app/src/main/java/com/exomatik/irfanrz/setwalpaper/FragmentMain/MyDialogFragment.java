package com.exomatik.irfanrz.setwalpaper.FragmentMain;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.exomatik.irfanrz.setwalpaper.R;

import java.io.IOException;

/**
 * Created by IrfanRZ on 03/11/2018.
 */

public class MyDialogFragment extends DialogFragment {
    TextView customDialog_TextView;
    Button customDialog_Update, customDialog_Dismiss;
    ImageView imageView;
    public static String warna, code;
    public static int color;
    public static int typeSelect;

    public static MyDialogFragment newInstance() {

        return new MyDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View dialogView = inflater.inflate(R.layout.custom_layout, container, false);

        customDialog_TextView = (TextView) dialogView.findViewById(R.id.dialogtextview);
        customDialog_Update = (Button) dialogView.findViewById(R.id.dialogupdate);
        customDialog_Dismiss = (Button) dialogView.findViewById(R.id.dialogdismiss);
        imageView = (ImageView) dialogView.findViewById(R.id.img_dialog_fragment);

        customDialog_TextView.setText(warna);

        if (typeSelect == 1){
            imageView.setImageResource(color);
        }
        else if (typeSelect == 2){
            imageView.setBackgroundColor(color);
        }

        customDialog_Update.setOnClickListener(customDialog_UpdateOnClickListener);
        customDialog_Dismiss.setOnClickListener(customDialog_DismissOnClickListener);

        return dialogView;
    }


    private Button.OnClickListener customDialog_UpdateOnClickListener
            = new Button.OnClickListener() {

        @SuppressLint("ResourceType")
        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawARGB(Integer.valueOf(code.substring(0, 2), 16), Integer.valueOf(code.substring(2, 4), 16)
                    , Integer.valueOf(code.substring(4, 6), 16), Integer.valueOf(code.substring(6, 8), 16));

            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getActivity());
            try {
                wallpaperManager.setBitmap(bitmap);
                Toast.makeText(getActivity(), "Walpaper Berhasil Di Ganti", Toast.LENGTH_SHORT).show();
            }catch (IOException e){
                Toast.makeText(getActivity(), "Walpaper Gagal Di Ganti", Toast.LENGTH_SHORT).show();
            }
            dismiss();
        }
    };



    private Button.OnClickListener customDialog_DismissOnClickListener
            = new Button.OnClickListener() {

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            dismiss();
        }
    };

}
