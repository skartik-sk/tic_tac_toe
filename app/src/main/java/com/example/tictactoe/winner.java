package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class winner extends AppCompatActivity {
TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        name = findViewById(R.id.nothinkg);
         Intent intet1 = getIntent();
        String finalname = intet1.getStringExtra(Game2.Extraname);
        name.setText(finalname);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }
    public void openActivity(View v){
//        Toast.makeText(this, "Welcome Player", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Game2.class);
        startActivity(intent);

    }
}