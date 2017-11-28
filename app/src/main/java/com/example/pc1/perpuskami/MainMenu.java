package com.example.pc1.perpuskami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        findViewById(R.id.btn_profile).setOnClickListener(this);
        findViewById(R.id.btn_bookList).setOnClickListener(this);
        findViewById(R.id.btn_borrowBook).setOnClickListener(this);
        findViewById(R.id.btn_Setting).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_profile:
                startActivity(new Intent(this, Profile.class));
                break;
            case R.id.btn_Setting:
                startActivity(new Intent(this,Setting.class));
                break;
        }
    }
}
