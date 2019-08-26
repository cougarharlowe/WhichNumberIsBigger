package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int leftnumber;
    private int rightnumber;
    private int score;
    private int lowerLimit;
    private int upperLimit;

    public BiggerNumberGame(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public void generateRandomNumbers() {
        // generate a number between the upper and lower limits inclusive
        // store that in left number
        // generaate another number and make sure that its different
        // store that in rightnumber

        leftnumber = (int) (Math.random() * (upperLimit - lowerLimit)) + lowerLimit;
        rightnumber = (int) (Math.random() * (upperLimit - lowerLimit)) + lowerLimit;
        while(leftnumber == rightnumber){
            rightnumber = (int) (Math.random() * (upperLimit - lowerLimit)) + lowerLimit;
        }
    }
     public String checkAnswer(int answer){
    //determine if the answer is right
    // based on the values of leftnumber and right number
    // update the score accordingly
    //return a relevant message
         return "hit the woah";
         }


    public int getLeftnumber() {
        return leftnumber;
    }

    public int getRightnumber() {
        return rightnumber;
    }
    public int getScore() {
        return score;
    }

    public void setLeftnumber(int leftnumber) {
        this.leftnumber = leftnumber;
    }

    public void setRightnumber(int rightnumber) {
        this.rightnumber = rightnumber;
    }


}

// wire two buttons and score the textview
//storing them as instance variables
//and using findViewById method

// set onClickListeners for each button

// make an instance variable for BiggerNumberGame object

// construct it in onCreate



