package com.example.tictactoe;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    //    boolean active=true;
    public static final String Extraname = "com.example.tictactoe.extra.name125";
    TextView name;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toast.makeText(this, "o will play 1st move", Toast.LENGTH_SHORT).show();
        getSupportActionBar().hide();
        name = findViewById(R.id.text2);
        Intent intet1 = getIntent();
        String finalname = intet1.getStringExtra(Comp3.Extraname);

        name.setText(finalname);

    }

    int currentplayer = 0;
    int[] gameState = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    int[][] winCondition = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},
            {1, 4, 7}, {2, 5, 8}, {3, 6, 9},
            {1, 5, 9}, {3, 5, 7}};

    int turn = 0;
    public void onClick(View view) {
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());
//        if (!active){
//            reset();
//
//        }
        turn++;
        if(turn == 9){
            Intent intents = new Intent(this, draw.class);
            startActivity(intents);
        }
        if (gameState[tappedImage] == 5) {

            gameState[tappedImage] = currentplayer;
            if (currentplayer == 0) {
                img.setImageResource(R.drawable.o);
                currentplayer = 1;

            } else {
                img.setImageResource(R.drawable.x);
                currentplayer = 0;

            }

        }  // Code here executes on main thread afterR.id.i33); user presses button
        for (int[] winConditions : winCondition) {
            if (gameState[winConditions[0]] == gameState[winConditions[1]] &&
                    gameState[winConditions[1]] == gameState[winConditions[2]] &&
                    gameState[winConditions[0]] != 5) {
                if (gameState[winConditions[0]] == 0) {
                    Toast.makeText(this, "o won", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, winner2.class);
                    intent.putExtra(Extraname, "Player");
                    startActivity(intent);

                } else {
                    Toast.makeText(this, "x Won", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, winner2.class);

                    intent.putExtra(Extraname, "Computer");
                    startActivity(intent);

                }
            }
        }

    }


//   ImageView btn11,btn12,btn13,btn21,btn22,btn23,btn31,btn32,btn33;


//        Toast.makeText(this, "O will play First", Toast.LENGTH_SHORT).show();
//    btn11 = findViewById(R.id.i11);
//    btn12 = findViewById(R.id.i12);
//    btn13 = findViewById(R.id.i13);
//    btn21 = findViewById(R.id.i21);
//    btn22 = findViewById(R.id.i22);
//    btn23 = findViewById(R.id.i23);
//    btn31 = findViewById(R.id.i31);
//    btn32 = findViewById(R.id.i32);
//    btn33 = findViewById(R.id.i33);
//
//            btn11.setOnClickListener(new View.OnClickListener() {
//                @Override
//
//        });
//        i11=findViewById(R.id.i11);
//        i12=findViewById(R.id.i12);
//        i13=findViewById(R.id.i13);


}