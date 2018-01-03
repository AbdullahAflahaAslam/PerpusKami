package com.example.pc1.perpuskami;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pc1.perpuskami.Helper.ImportDataBase;
import com.example.pc1.perpuskami.Helper.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    ImportDataBase importDataBase;
    List<User> user = new ArrayList<>();
    EditText username;
    EditText pass;
    Button login;
    String nama;
    String pasword;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        username = (EditText) findViewById(R.id.tv_username);
        pass = (EditText) findViewById(R.id.tv_password);
        login = (Button) findViewById(R.id.button1);
        importDataBase = new ImportDataBase(MainActivity.this);
    }

    @Override
    public  void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:

                if (username.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "insert username", Toast.LENGTH_SHORT).show();
                }
                else {
                   try {
                       user = importDataBase.getDataUser(username.getText().toString());
                        pasword=user.get(0).getPassword();
                        password=pass.getText().toString();
                        if (password.equals(pasword)){
                            nama=user.get(0).getNama();
                            Toast.makeText(MainActivity.this, "welcome "+nama.toString(), Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(this, MainMenu.class));
                        }
                        else {
                           Toast.makeText(MainActivity.this, "wrong password", Toast.LENGTH_SHORT).show();
                       }
                   }
                   catch (IndexOutOfBoundsException e){
                       Toast.makeText(MainActivity.this, "user not found", Toast.LENGTH_SHORT).show();
                   }


                }

                break;
                }
    }

    @Override
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);

    }
}