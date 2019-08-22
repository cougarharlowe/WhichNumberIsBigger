package com.example.whichnumberisbigger;

public class BiggerNumberClass {
    private int leftnumber;
    private int rightnumber;
    private int score;
    private int lowerLimit;
    private int upperLimit;

    public BiggerNumberClass(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    public void generateRandomNumbers() {
        // generate a number between the upper and lower limits inclusive
        // store that in left number
        // generaate another number and make sure that its different
        // store that in rightnumber

    }
   // public String checkAnswer(int Answer){
        //determine if the answer is right
        // based on the values of leftnumber and right number
        // update the score accordingly
        //return a relevant message

    }

    public int getLeftnumber() {
        return leftnumber;
    }

    public int getRightnumber() {
        return rightnumber;
    }

    public void setLeftnumber(int leftnumber) {
        this.leftnumber = leftnumber;
    }

    public void setRightnumber(int rightnumber) {
        this.rightnumber = rightnumber;
    }

}
