package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Friend2 extends AppCompatActivity {
    public static final String Extraname = "com.example.tictactoe.extra.name142";
    public static final String Extranames = "com.example.tictactoe.extra.name1434";
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend2);
        getSupportActionBar().hide();

    }
    public void openActivity(View v){
        Toast.makeText(this, "O Will Play first", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,game3.class);
        Intent intet1 = getIntent();
        String finalname = intet1.getStringExtra(Friend1.Extraname);
        text = findViewById(R.id.editTextTextPersonName);
        String name = text.getText().toString();
        intent.putExtra(Extraname, name);
        intent.putExtra(Extranames,finalname);
        startActivity(intent);

    }
}