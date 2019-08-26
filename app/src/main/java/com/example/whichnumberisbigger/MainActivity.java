 package com.example.whichnumberisbigger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    private Button buttonLeft;
    private Button buttonRight;
    private TextView textViewScore;
    private BiggerNumberGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setListeners();
        game = new BiggerNumberGame(0, 3984);
        updateGameDisplay();


    }

     private void updateGameDisplay() {
        // set the text of each button
         buttonLeft.setText(String.valueOf(game.getLeftnumber()));
         buttonRight.setText(String.valueOf(game.getRightnumber()));
         textViewScore.setText(String.valueOf(game.getScore()));


               
         // set the text of the score
         

     }

     private void setListeners() {
         // creating an anonymous inner class that implements view.OnClickListener
         // overriding the one abstract method onClick(view v)
         buttonLeft.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int answer = Integer.parseInt(buttonLeft.getText().toString());
                 String message = game.checkAnswer(answer);
                 Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                 game.generateRandomNumbers();
                 updateGameDisplay();
             }
         });
         buttonRight.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int answer = Integer.parseInt(buttonRight.getText().toString());
                 String message = game.checkAnswer(answer);
                 Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                 game.generateRandomNumbers();
                 updateGameDisplay();
             }
         });
     }

     // construct the game
     // do any initial set up before the player takes their first turn


     private void wireWidgets() {
        buttonLeft = findViewById(R.id.button_main_left);
        buttonRight = findViewById(R.id.button_main_right);
        textViewScore = findViewById(R.id.Textview_main_score);
     }
 }
