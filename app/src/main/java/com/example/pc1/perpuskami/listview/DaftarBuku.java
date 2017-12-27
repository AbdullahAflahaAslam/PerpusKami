package com.example.pc1.perpuskami.listview;

/**
 * Created by dell on 27/12/2017.
 */

public class DaftarBuku {
    public String IDBuku,Judul,Penulis,Penerbit,TahunTerbit,Jenis,Lokasi;
    public int Jumlah;

    public DaftarBuku() {
    }

    public DaftarBuku(String IDBuku, String judul, String penulis, String penerbit, String tahunTerbit, String jenis, String lokasi, int jumlah) {
        this.IDBuku = IDBuku;
        Judul = judul;
        Penulis = penulis;
        Penerbit = penerbit;
        TahunTerbit = tahunTerbit;
        Jenis = jenis;
        Lokasi = lokasi;
        Jumlah = jumlah;
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

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        Jumlah = jumlah;
    }



    @Override
    public String toString() {
        return "BookList{" +
                "IDBuku='" + IDBuku + '\'' +
                ", Judul='" + Judul + '\'' +
                ", Penulis='" + Penulis + '\'' +
                ", Penerbit='" + Penerbit + '\'' +
                ", TahunTerbit='" + TahunTerbit + '\'' +
                ", Jenis='" + Jenis + '\'' +
                ", Lokasi='" + Lokasi + '\'' +

                ", Jumlah=" + Jumlah +
                '}';
    }
}
