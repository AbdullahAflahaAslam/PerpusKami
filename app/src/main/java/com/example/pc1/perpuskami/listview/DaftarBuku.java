package com.example.pc1.perpuskami.listview;

/**
 * Created by dell on 29/11/2017.
 */

public class DaftarBuku {
    public String judulBuku;
    public String jumlahTersedia;

    public DaftarBuku() {
    }

    public DaftarBuku(String judulBuku, String jumlahTersedia) {
        this.judulBuku = judulBuku;
        this.jumlahTersedia = jumlahTersedia;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getJumlahTersedia() {
        return jumlahTersedia;
    }

    public void setJumlahTersedia(String jumlahTersedia) {
        this.jumlahTersedia = jumlahTersedia;
    }

    @Override
    public String toString() {
        return "DaftarBuku{" +
                "judulBuku='" + judulBuku + '\'' +
                ", jumlahTersedia='" + jumlahTersedia + '\'' +
                '}';
    }
}
