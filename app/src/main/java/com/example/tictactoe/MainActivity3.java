package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();

    }
    public void openActivity(View v){
//        Toast.makeText(this, "Welcome Player", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,game3.class);
        startActivity(intent);

    }
    public void openActivity2(View v){
//        Toast.makeText(this, "Welcome Player", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(this,Comp1.class);
        startActivity(intent1);

    }
}