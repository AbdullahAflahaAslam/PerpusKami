package com.example.pc1.perpuskami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

//import com.example.pc1.perpuskami.listview.AdapterBuku;
import com.example.pc1.perpuskami.Helper.Buku;
import com.example.pc1.perpuskami.Helper.ImportDataBase;
import com.example.pc1.perpuskami.listview.DaftarBuku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListBook extends AppCompatActivity {
    String tryout="Buku001";
    Intent intent;
    List<Buku> daftarbukuList = new ArrayList<>();
    List<String> judulBuku = new ArrayList<>();
    List<String> jumlahTersedia = new ArrayList<>();
    List<Buku> mDaftarBuku;
    EditText keyword;
    String key;
    Button search;
    ImportDataBase importDataBase;

    //AdapterBuku adapterBuku = new AdapterBuku(this, daftarbukuList);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_book);

        search = (Button) findViewById(R.id.buttonSrc);
        keyword = (EditText) findViewById(R.id.editText2);
/*
        for (DaftarBuku item : daftarbukuList) {
             //tvOut.append(item.getItemName() + "\n");

            judulBuku.add(item.getJudulBuku());
            jumlahTersedia.add(item.getJumlahTersedia());
        }

*/
        Collections.sort(judulBuku);


        importDataBase = new ImportDataBase(ListBook.this);

        intent = getIntent();
      //  tryout = intent.getIntExtra(tryout, 1);
        Log.i("tryout",tryout+"");
       // daftarbukuList = importDataBase.getDataBuku("Buku001");

      // ArrayAdapter<String> adapterr = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, judulBuku);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, judulBuku);
       final ListView listView = (ListView) findViewById(android.R.id.list);
       listView.setAdapter(adapter);



     /*   Collections.sort(daftarbukuList, new Comparator<Buku>() {
            @Override
            public int compare(Buku o1, DaftarBuku o2) {
                return o1.getJudul().compareTo(o2.getJudul());
            }

        });
*/
        daftarbukuList = importDataBase.getDataBuku();

        for (Buku item : daftarbukuList) {

            judulBuku.add(item.getJudul());
        }

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daftarbukuList.clear();
                judulBuku.clear();
                listView.setAdapter(null);

                daftarbukuList = importDataBase.getSearchbuku(keyword.getText().toString());

                for (Buku item : daftarbukuList){
                    judulBuku.add(item.getJudul());
                }

                listView.setAdapter(adapter);
            }
        });

    }
}
