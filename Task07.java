package com.company;

import java.util.function.IntToDoubleFunction;

public class Task07 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }
    public static double convertCelsiusToFahrenheit(int celsius) {

        double TF = (9.0/5.0) * celsius + 32;
        return TF;
    }
}