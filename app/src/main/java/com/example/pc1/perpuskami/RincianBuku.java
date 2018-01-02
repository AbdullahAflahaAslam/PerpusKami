package com.example.pc1.perpuskami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pc1.perpuskami.Helper.Buku;
import com.example.pc1.perpuskami.Helper.ImportDataBase;

import java.util.ArrayList;
import java.util.List;

public class RincianBuku extends AppCompatActivity {
    ListBook listBook = new ListBook();
    List<Buku> selected = new ArrayList<>();
    TextView jud;
    TextView pener;
    TextView penu;
    TextView taunter;
    TextView jen;
    TextView lok;
    List<Buku> selectedbook = new ArrayList<Buku>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian_buku);
        Intent intent = getIntent();

        selectedbook = (List<Buku>)intent.getSerializableExtra("selectedBook");

        jud = (TextView) findViewById(R.id.txtJudulBuku);
        pener = (TextView) findViewById(R.id.txtPenerbitBuku);
        penu = (TextView) findViewById(R.id.txtPenulisBuku);
        taunter = (TextView) findViewById(R.id.txtTahunBuku);
        jen = (TextView) findViewById(R.id.txtJenissBuku);
        lok = (TextView) findViewById(R.id.txtLokasiBuku);

        selected.add(selectedbook.get(0));

    try {
        jud.setText(selected.get(0).getJudul());
        pener.setText(selected.get(0).getPenerbit());
        penu.setText(selected.get(0).getPenulis());
        taunter.setText(selected.get(0).getTahunTerbit());
        jen.setText(selected.get(0).getJenis());
        lok.setText(selected.get(0).getLokasi());
    }
    catch (IndexOutOfBoundsException e){
        Toast.makeText(getApplicationContext(),"size "+selected.size(),Toast.LENGTH_SHORT).show();
    }
    }
}
