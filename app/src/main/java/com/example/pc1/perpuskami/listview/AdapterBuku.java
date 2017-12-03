package com.example.pc1.perpuskami.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pc1.perpuskami.R;

import java.util.List;

/**
 * Created by dell on 29/11/2017.
 */

public class AdapterBuku extends ArrayAdapter<DaftarBuku>{
    List<DaftarBuku> mDaftarBuku;
    LayoutInflater minflater;



    public AdapterBuku(Context context, List<DaftarBuku> objects) {
        super (context, R.layout.list_buku, objects);

        mDaftarBuku = objects;
        minflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = minflater.inflate(R.layout.list_buku, parent, false);
        }

        TextView daftarbuku = (TextView) convertView.findViewById(R.id.buku);
        TextView jmlbuku = (TextView) convertView.findViewById(R.id.qty);

        DaftarBuku item = mDaftarBuku.get(position);

        daftarbuku.setText(item.getJudulBuku());
        jmlbuku.setText(item.getJumlahTersedia());
        return convertView;
    }


}
