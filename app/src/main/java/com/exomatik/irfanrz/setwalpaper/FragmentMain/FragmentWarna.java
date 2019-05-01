package com.exomatik.irfanrz.setwalpaper.FragmentMain;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.exomatik.irfanrz.setwalpaper.DataModel.ModelWarna;
import com.exomatik.irfanrz.setwalpaper.R;
import com.exomatik.irfanrz.setwalpaper.SetWalpaper;
import com.exomatik.irfanrz.setwalpaper.ViewAdapter.AdapterGridWarna;

import java.util.ArrayList;

/**
 * Created by IrfanRZ on 6/2/2018.
 */

public class FragmentWarna extends Fragment {
    private View view;
    private GridView gridWarna;
    private ArrayList<ModelWarna> dataWarna = new ArrayList<ModelWarna>();

    public FragmentWarna(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_warna, container, false);

        gridWarna = (GridView) view.findViewById(R.id.grid_warna);

        dataWarna.add(new ModelWarna("Putih", R.color.putih, "ffffffff"));
        dataWarna.add(new ModelWarna("Hitam", R.color.hitam, "FF080808"));
        dataWarna.add(new ModelWarna("Biru", R.color.blue2, "ff1c8adb"));
        dataWarna.add(new ModelWarna("Hijau", R.color.hijau, "ff52af44"));
        dataWarna.add(new ModelWarna("Abu-abu", R.color.abu_abu, "ff7f7f7f"));
        dataWarna.add(new ModelWarna("Merah", R.color.merah, "ffed1c24"));
        dataWarna.add(new ModelWarna("Kuning", R.color.kuning, "fffff200"));
        dataWarna.add(new ModelWarna("Pink", R.color.pink, "ffffaec9"));
        dataWarna.add(new ModelWarna("Ungu", R.color.ungu, "ffa349a4"));
        dataWarna.add(new ModelWarna("Orange", R.color.orange, "ffff7f27"));
        dataWarna.add(new ModelWarna("Navi", R.color.navi, "ff3f48cc"));
        dataWarna.add(new ModelWarna("Coklat", R.color.coklat, "ffb97a57"));
        dataWarna.add(new ModelWarna("Merah Tua", R.color.merah_tua, "ff800000"));
        dataWarna.add(new ModelWarna("Salmon", R.color.salmon, "ffff8080"));
        dataWarna.add(new ModelWarna("Steel Blue", R.color.steel_blue, "ff408080"));
        dataWarna.add(new ModelWarna("Dark Green", R.color.dark_green, "ff008000"));
        dataWarna.add(new ModelWarna("Gold", R.color.gold, "ff808000"));
        dataWarna.add(new ModelWarna("Spring Green", R.color.spring_green, "ff80ff80"));
        dataWarna.add(new ModelWarna("Indigo", R.color.indigo, "ff400080"));
        dataWarna.add(new ModelWarna("Magenta", R.color.magenta, "ff400040"));
        dataWarna.add(new ModelWarna("Violet", R.color.violet, "ffff80ff"));

        gridWarna.setAdapter(new AdapterGridWarna(getContext(), dataWarna));

        gridWarna.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DialogFragment newFragment = MyDialogFragment
                        .newInstance();
                MyDialogFragment.warna = dataWarna.get(position).getWarna();
                MyDialogFragment.color = dataWarna.get(position).getId();
                MyDialogFragment.code = dataWarna.get(position).getCode();
                MyDialogFragment.typeSelect = 1;

                newFragment.show(getActivity().getFragmentManager(), "dialog");
            }
        });

        return view;
    }
}