package com.example.pc1.perpuskami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Setting extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        findViewById(R.id.btn_changepass).setOnClickListener(this);
        findViewById(R.id.btn_notif).setOnClickListener(this);
        findViewById(R.id.btn_help).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_changepass:
                startActivity(new Intent(this, form_editpas.class));
                break;
            case R.id.btn_notif:
                startActivity(new Intent(this, form_editpas.class));
                break;
            case R.id.btn_help:
                startActivity(new Intent(this, form_editpas.class));
                break;
        }
    }
}
