package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Comp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp1);
        getSupportActionBar().hide();

    }

    public void openActivity(View v){

        Intent intent = new Intent(this,Game2.class);
        startActivity(intent);

    }
    public void openActivity2(View v){

        Intent intent1 = new Intent(this,Game.class);
        startActivity(intent1);

    }

}