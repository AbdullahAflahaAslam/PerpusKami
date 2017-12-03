package com.example.pc1.perpuskami;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//import com.example.pc1.perpuskami.listview.AdapterBuku;
import com.example.pc1.perpuskami.listview.DaftarBuku;
import com.example.pc1.perpuskami.listview.InsertBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListBook extends AppCompatActivity {

    List<DaftarBuku> daftarbukuList = InsertBook.daftarBukuList;
    List<String> judulBuku = new ArrayList<>();
    List<String> jumlahTersedia = new ArrayList<>();
    List<DaftarBuku> mDaftarBuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_book);

        for (DaftarBuku item : daftarbukuList) {
             //tvOut.append(item.getItemName() + "\n");

            judulBuku.add(item.getJudulBuku());
            jumlahTersedia.add(item.getJumlahTersedia());
        }


        Collections.sort(judulBuku);

      // ArrayAdapter<String> adapterr = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, judulBuku);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, judulBuku);
       final ListView listView = (ListView) findViewById(android.R.id.list);
       listView.setAdapter(adapter);

        Collections.sort(daftarbukuList, new Comparator<DaftarBuku>() {
            @Override
            public int compare(DaftarBuku o1, DaftarBuku o2) {
                return o1.getJudulBuku().compareTo(o2.getJudulBuku());
            }

        });

    }



}
