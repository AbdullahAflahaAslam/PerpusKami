package com.example.pc1.perpuskami.Helper;

/**
 * Created by dell on 13/12/2017.
 */

public class Peminjaman {
    int IDPeminjaman,Denda;
    String IDUser, IDAdmin, TanggalPinjam, TanggalHarusKembali, TanggalKembali;

    public Peminjaman() {
    }

    public int getIDPeminjaman() {
        return IDPeminjaman;
    }

    public void setIDPeminjaman(int IDPeminjaman) {
        this.IDPeminjaman = IDPeminjaman;
    }

    public int getDenda() {
        return Denda;
    }

    public void setDenda(int denda) {
        Denda = denda;
    }

    public String getIDUser() {
        return IDUser;
    }

    public void setIDUser(String IDUser) {
        this.IDUser = IDUser;
    }

    public String getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(String IDAdmin) {
        this.IDAdmin = IDAdmin;
    }

    public String getTanggalPinjam() {
        return TanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        TanggalPinjam = tanggalPinjam;
    }

    public String getTanggalHarusKembali() {
        return TanggalHarusKembali;
    }

    public void setTanggalHarusKembali(String tanggalHarusKembali) {
        TanggalHarusKembali = tanggalHarusKembali;
    }

    public String getTanggalKembali() {
        return TanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        TanggalKembali = tanggalKembali;
    }
}
