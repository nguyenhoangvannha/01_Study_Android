package com.example.android.gamefreakingmathbai081;

import java.util.Random;

/**
 * Created by nhvn on 11/6/17.
 */

public class GamePlay {
    private static int score;
    private static int num01;
    private static int num02;
    private static int operator;
    private static char cOperator;
    private static int result;
    private static int numReturn;
    private static Random random;
    private static boolean bReturn = false;
    private static final byte ADD = 0, SUB = 1, MUL = 2, DIV = 3;
    public GamePlay(){
        operator = ADD;
        random = new Random();
    }
    public static boolean getResult(){
        return bReturn;
    }
    public static void  makeNewGame(boolean bLastestAnswer){
        if(bLastestAnswer == true){
            score = getScore() + 1;
        } else {
            score = 0;
        }
        operator = ADD;
        random = new Random();
        GenerateValues();
    }
    private static void GenerateValues() {
        num01 = random.nextInt(100);
        num02 = random.nextInt(100);
        operator = random.nextInt(4);

        switch (getOperator()){
            case ADD:
                cOperator = '+';
                result = getNum01() + getNum02();
                break;
            case SUB:
                cOperator = '-';
                result = getNum01() - getNum02();
                break;
            case MUL:
                cOperator = 'x';
                result = getNum01() * getNum02();
                break;
            case DIV:
                cOperator = '/';
                result = getNum01() / getNum02();
                break;
                default: result = 0;
        }

        bReturn = random.nextBoolean();
        if(bReturn){
            numReturn = result;
        } else {
            numReturn = random.nextInt(getNum01() * getNum02());
        }

    }

    public static int getNum01() {
        return num01;
    }

    public static int getNum02() {
        return num02;
    }

    public static int getOperator() {
        return operator;
    }

    public static int getNumReturn() {
        return numReturn;
    }

    public static char getcOperator() {
        return cOperator;
    }

    public static int getScore() {
        return score;
    }
}
