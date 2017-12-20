package com.example.pc1.perpuskami.Helper;

/**
 * Created by dell on 13/12/2017.
 */

public class Buku {
    String IDBuku,Judul,Penulis,Penerbit,TahunTerbit, Jenis, Lokasi, Cover;
    int Jumlah;

    public Buku() {
    }

    public String getIDBuku() {
        return IDBuku;
    }

    public void setIDBuku(String IDBuku) {
        this.IDBuku = IDBuku;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String penulis) {
        Penulis = penulis;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String penerbit) {
        Penerbit = penerbit;
    }

    public String getTahunTerbit() {
        return TahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        TahunTerbit = tahunTerbit;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String jenis) {
        Jenis = jenis;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String lokasi) {
        Lokasi = lokasi;
    }

    public String getCover() {
        return Cover;
    }

    public void setCover(String cover) {
        Cover = cover;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        Jumlah = jumlah;
    }
}
