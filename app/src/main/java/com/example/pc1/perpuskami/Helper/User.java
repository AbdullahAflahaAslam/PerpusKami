package com.example.pc1.perpuskami.Helper;

/**
 * Created by dell on 13/12/2017.
 */

public class User {
    String IDUser,Nama,Email,Telp,Alamat,Password;

    public User() {
    }

    public User(String IDUser, String nama, String email, String telp, String alamat, String password) {
        this.IDUser = IDUser;
        Nama = nama;
        Email = email;
        Telp = telp;
        Alamat = alamat;
        Password = password;
    }

    public String getIDUser() {
        return IDUser;
    }

    public void setIDUser(String IDUser) {
        this.IDUser = IDUser;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelp() {
        return Telp;
    }

    public void setTelp(String telp) {
        Telp = telp;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
