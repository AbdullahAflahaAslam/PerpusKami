package com.example.pc1.perpuskami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);


           }
           @Override
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                startActivity(new Intent(this, MainMenu.class));
                break;
        }
           }

    }


