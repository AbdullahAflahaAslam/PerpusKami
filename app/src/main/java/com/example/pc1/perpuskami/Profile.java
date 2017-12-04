package com.example.pc1.perpuskami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        findViewById(R.id.btn_setting1).setOnClickListener(this);
        findViewById(R.id.btn_booklist1).setOnClickListener(this);
        findViewById(R.id.btn_history).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_setting1:
                startActivity(new Intent(this, SettingProfile.class));
                break;
        }
    }
}
