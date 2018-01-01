package com.example.pc1.perpuskami.Helper;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Editable;
import android.util.Log;
import android.widget.EditText;

import com.example.pc1.perpuskami.BuildConfig;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 08/12/2017.
 */

public class ImportDataBase extends SQLiteOpenHelper {
    private static String DATABASE_NAME = "perpuskami.db";
    public final static String DATABASE_PATH = "/data/data/"+ BuildConfig.APPLICATION_ID+"/databases/";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase dataBase;
    private final Context dbContext;

    public ImportDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.dbContext = context;
        //DATABASE_NAME = DBActivity.DatabaseName;
        // checking database and open it if exists
        if (checkDataBase()) {
            openDataBase();

        } else
        {
            try {
                this.getReadableDatabase();
                copyDataBase();
                this.close();
                openDataBase();

            } catch (IOException e) {
                throw new Error("Error copying database");
            }
//            Toast.makeText(context, "Initial database is created", Toast.LENGTH_LONG).show();
        }
    }


    private void copyDataBase() throws IOException{
        InputStream myInput = dbContext.getAssets().open(DATABASE_NAME);
        String outFileName = DATABASE_PATH + DATABASE_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);

        byte[] buffer = new byte[1024];
        int length;
        final ProgressDialog loading = ProgressDialog.show(dbContext,"", "Importing Database. Please wait...", true);

        while ((length = myInput.read(buffer))>0){
            myOutput.write(buffer, 0, length);
        }

        myOutput.flush();
        myOutput.close();
        myInput.close();
        loading.cancel();
    }


    public void openDataBase() throws SQLException {
        String dbPath = DATABASE_PATH + DATABASE_NAME;
        dataBase = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    private boolean checkDataBase() {
        SQLiteDatabase checkDB = null;
        boolean exist = false;
        try {
            String dbPath = DATABASE_PATH + DATABASE_NAME;
            checkDB = SQLiteDatabase.openDatabase(dbPath, null,
                    SQLiteDatabase.OPEN_READONLY);
        } catch (SQLiteException e) {
            Log.v("db log", "database does't exist");
        }

        if (checkDB != null) {
            exist = true;
            checkDB.close();
        }
        return exist;
    }

    public void open() throws SQLException {
        dataBase = this.getWritableDatabase();
        dataBase = this.getReadableDatabase();
    }

    public void read() throws SQLException {
        dataBase = this.getReadableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public List<Buku> getDataBuku(){
        List<Buku> listDataBuku = new ArrayList<Buku>();
        Cursor c = getReadableDatabase().rawQuery("SELECT * FROM Buku" ,null);

        if (c.moveToFirst()) {
            do {
                Buku buku = new Buku();
                buku.setIDBuku(c.getString(c.getColumnIndex("IDBuku")));
                buku.setJudul(c.getString(c.getColumnIndex("Judul")));
                buku.setPenerbit(c.getString(c.getColumnIndex("Penerbit")));
                buku.setPenulis(c.getString(c.getColumnIndex("Penulis")));
                buku.setTahunTerbit(c.getString(c.getColumnIndex( "TahunTerbit")));
                buku.setJenis(c.getString(c.getColumnIndex("Jenis")));
                buku.setLokasi(c.getString(c.getColumnIndex("Lokasi")));
                buku.setJumlah(c.getInt(c.getColumnIndex("Jumlah")));
                buku.setCover(c.getString(c.getColumnIndex("cover")));
                listDataBuku.add(buku);
            } while (c.moveToNext());
        }
        return listDataBuku;
    }
/*
    public List<Admin> getDataAdmin(int idadmin){
        List<Admin> listDataAdmin = new ArrayList<Admin>();
        Cursor c = getReadableDatabase().rawQuery("select * from Buku where IDBuku = "+idadmin+" order by `id` asc",null);

        if (c.moveToFirst()) {
            do {
                Admin admin = new Admin();
                Admin.setIDAdmin(c.getString(c.getColumnIndex("IDAdmin")));
                Admin.setNama(c.getString(c.getColumnIndex("Nama")));
                Admin.setEmail(c.getInt(c.getColumnIndex("Email")));
                Admin.setTelp(c.getString(c.getColumnIndex("Telp")));
                Admin.setAlamat(c.getString(c.getColumnIndex( "Alamat")));

                listDataAdmin.add(admin);
            } while (c.moveToNext());
        }
        return listDataAdmin;
    }
*/
    public List<User> getDataUser(String id){
        String query = "select *from User where IDUser ='"+id+"' " ;
        List<User> listDataUser = new ArrayList<User>();
        Cursor c = getReadableDatabase().rawQuery(query,null);

        if (c.moveToFirst()) {
            do {
                User user = new User();
                user.setIDUser(c.getString(c.getColumnIndex("IDUser")));
                user.setNama(c.getString(c.getColumnIndex("Nama")));
                user.setEmail(c.getString(c.getColumnIndex("Email")));
                user.setTelp(c.getString(c.getColumnIndex("Telp")));
                user.setAlamat(c.getString(c.getColumnIndex( "Alamat")));
                user.setPassword(c.getString(c.getColumnIndex("Password")));
                listDataUser.add(user);
            } while (c.moveToNext());
        }
        return listDataUser;
    }

    public List<Buku> getSearchbuku(String judul){
        String query = "select *from Buku where Judul like '%"+judul+"%' " ;
        List<Buku> listSearchedBuku = new ArrayList<Buku>();
        Cursor c = getReadableDatabase().rawQuery(query,null);

        if (c.moveToFirst()) {
            do {
                Buku buku = new Buku();
                buku.setIDBuku(c.getString(c.getColumnIndex("IDBuku")));
                buku.setJudul(c.getString(c.getColumnIndex("Judul")));
                buku.setPenerbit(c.getString(c.getColumnIndex("Penerbit")));
                buku.setPenulis(c.getString(c.getColumnIndex("Penulis")));
                buku.setTahunTerbit(c.getString(c.getColumnIndex( "TahunTerbit")));
                buku.setJenis(c.getString(c.getColumnIndex("Jenis")));
                buku.setLokasi(c.getString(c.getColumnIndex("Lokasi")));
                buku.setJumlah(c.getInt(c.getColumnIndex("Jumlah")));
                buku.setCover(c.getString(c.getColumnIndex("cover")));
                listSearchedBuku.add(buku);
            } while (c.moveToNext());
        }
        return listSearchedBuku;
    }

}
