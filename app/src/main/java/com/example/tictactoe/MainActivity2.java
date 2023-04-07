package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

    }
    public void openActivity(View v){
        Toast.makeText(this, "Welcome Player", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);

    }


}