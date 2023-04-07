package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Friend1 extends AppCompatActivity {
    public static final String Extraname = "com.example.tictactoe.extra.name141";
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend1);
        getSupportActionBar().hide();

    }
    public void openActivity(View v){


        Intent intent = new Intent(this,Friend2.class);
        text = findViewById(R.id.editTextTextPersonName);
        String name = text.getText().toString();
        intent.putExtra(Extraname, name);
        startActivity(intent);

    }
}