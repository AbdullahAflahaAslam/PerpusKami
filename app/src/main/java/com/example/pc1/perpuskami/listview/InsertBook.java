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

        addItem(new DaftarBuku( judulBuku:"bukuA" jumlahTersedia:"3"));
        addItem(new DaftarBuku( judulBuku:"bukuB" jumlahTersedia:"4"));
        addItem(new DaftarBuku( judulBuku:"bukuC" jumlahTersedia:"1"));

    }

    private static void addItem(DaftarBuku item){
        daftarBukuList.add(item);
        DaftarBukuMap.put(item.getJudulBuku(), item);
    }
}
