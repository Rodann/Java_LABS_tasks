package com.company;
public class Task13 {

    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }
    public static double getWeight(int earthWeight) {
        double moon = earthWeight*17.0/100.0;
        return moon;
    }
}