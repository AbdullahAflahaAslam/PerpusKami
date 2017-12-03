package com.example.pc1.perpuskami.listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 29/11/2017.
 */

public class InsertBook {
    public static List<DaftarBuku> daftarBukuList;
    public static Map<String, DaftarBuku> DaftarBukuMap;

    static{
        daftarBukuList=new ArrayList<>();
        DaftarBukuMap=new HashMap<>();

        addItem(new DaftarBuku("BukuA","2"));
        addItem(new DaftarBuku("BukuB","3"));
        addItem(new DaftarBuku("BukuC","5"));
        addItem(new DaftarBuku("BukuD","5"));
        addItem(new DaftarBuku("BukuE","5"));
        addItem(new DaftarBuku("BukuF","5"));
        addItem(new DaftarBuku("BukuG","5"));
        addItem(new DaftarBuku("BukuH","5"));
        addItem(new DaftarBuku("BukuI","5"));
        addItem(new DaftarBuku("BukuJ","5"));

    }


    private static void addItem(DaftarBuku item){
        daftarBukuList.add(item);
        DaftarBukuMap.put(item.getJudulBuku(), item);
    }
}
