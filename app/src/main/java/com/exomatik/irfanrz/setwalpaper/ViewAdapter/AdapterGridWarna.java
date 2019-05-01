package com.exomatik.irfanrz.setwalpaper.ViewAdapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.exomatik.irfanrz.setwalpaper.DataModel.ModelWarna;
import com.exomatik.irfanrz.setwalpaper.R;

import java.util.ArrayList;

/**
 * Created by IrfanRZ on 03/11/2018.
 */

public class AdapterGridWarna extends BaseAdapter {
    private Context context;
    private ArrayList<ModelWarna> dataWarna;

    public AdapterGridWarna(Context context, ArrayList<ModelWarna> dataWarna) {
        this.context = context;
        this.dataWarna = dataWarna;
    }

    @Override
    public int getCount() {
        return dataWarna.size();
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
        View v = View.inflate(context, R.layout.grid_warna, null);

        ImageView img  = (ImageView) v.findViewById(R.id.image_warna);
        TextView text = (TextView) v.findViewById(R.id.text_warna);

        img.setImageResource(dataWarna.get(position).getId());
        text.setText(dataWarna.get(position).getWarna());

        return v;
    }
}
