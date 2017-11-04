package model;

import android.util.Log;

/**
 * Created by nhvn on 11/4/17.
 */

public class MyConvert {
    public static byte sourceType = 0;
    public static float number = 0;
    private static final byte KM = 0, M = 1, CM = 2, MM =3;
    public static float km, m, cm, mm;
    public static void convert()
    {
        switch (sourceType){
            case KM:
                km = number;
                break;
            case M:
                km = number / 1000;
                break;
            case CM:
                km = number / 100000;
                break;
            case MM:
                km = number / 1000000;
                break;
            default:
                km = 0;
                break;
        }
        m = km * 1000;
        cm = m * 100;
        mm = cm * 10;
        Log.i("Convert : ", "type: " + sourceType + "  km =" + km);
    }
}
