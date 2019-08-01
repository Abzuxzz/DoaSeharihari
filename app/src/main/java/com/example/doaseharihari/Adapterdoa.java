package com.example.doaseharihari;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class Adapterdoa extends BaseAdapter {
    private String[] juduldoa;
    private String[] isidoa;
    private String[] artidoa;
    Context tampildoa;

    public Adapterdoa(String[] judul_doa, String[] isi_doa, String[] arti_doa, MainActivity mainActivity) {
        juduldoa = judul_doa;
        isidoa = isi_doa;
        artidoa = arti_doa;
        tampildoa = mainActivity;
    }

    @Override
    public int getCount() {
        return juduldoa.length;
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
        //memasukkan layout item ke dalam customlistactivity
        View tampilan = LayoutInflater.from(tampildoa).inflate(R.layout.item_doa,null);
        //konekan komponen pada layout item ke adapterbuah
        TextView txtitem = (TextView) tampilan.findViewById(R.id.txtitem);
        //tampikan data ke komponen di dalam layout
        txtitem.setText(juduldoa[position]);
        //tampilkan ke listview
        return tampilan;
    }
}
