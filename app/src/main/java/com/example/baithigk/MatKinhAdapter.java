package com.example.baithigk;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MatKinhAdapter extends BaseAdapter {
    private List <MatKinh> listData;
    private Context context;
    private int layout;

    public MatKinhAdapter(List<MatKinh> listData, Context context, int layout) {
        this.listData = listData;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int i) {
        return listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= layoutInflater.inflate(layout,null);

        TextView tenMk = view.findViewById(R.id.id_name_glass_listv);
        TextView giaMk = view.findViewById(R.id.id_cost_glass_listv);
        TextView forMk = view.findViewById(R.id.id_for_listv);
        ImageView imageMk = view.findViewById(R.id.id_image_listv);

        MatKinh matKinh = listData.get(i);

        tenMk.setText(matKinh.getTenMk());
        giaMk.setText(String.valueOf(matKinh.getGiaMk()));
        forMk.setText(matKinh.getForMk());
        imageMk.setImageResource(matKinh.getFlagImage());

        return view;
    }
}
