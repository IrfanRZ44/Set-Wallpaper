package com.exomatik.irfanrz.setwalpaper.ViewAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.exomatik.irfanrz.setwalpaper.DataModel.ModelVideo;
import com.exomatik.irfanrz.setwalpaper.R;

import java.util.ArrayList;

/**
 * Created by IrfanRZ on 03/11/2018.
 */

public class AdapterGridVideo extends BaseAdapter {
    private Context context;
    private ArrayList<ModelVideo> dataVideo;

    public AdapterGridVideo(Context context, ArrayList<ModelVideo> dataVideo) {
        this.context = context;
        this.dataVideo = dataVideo;
    }

    @Override
    public int getCount() {
        return dataVideo.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.grid_video, null);

        ImageView imgVideo  = (ImageView) v.findViewById(R.id.image_video_thumb);
        TextView textNama = (TextView) v.findViewById(R.id.text_video_nama);
        TextView textUkuran = (TextView) v.findViewById(R.id.text_video_ukuran);

//        img.setImageResource(dataVideo.get(position).getId());
//        text.setText(dataVideo.get(position).getWarna());
//        imgVideo.setImageResource(dataVideo.get(position).);
        Glide.with(context).load("file://" + dataVideo.get(position).getStr_thumb())
                .skipMemoryCache(false)
                .into(imgVideo);

//        textNama.setText(dataVideo.get(position).getStr_path().toString());
        textUkuran.setText(dataVideo.get(position).getStr_path());

        return v;
    }
}
