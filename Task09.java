package com.company;
public class Task09 {


    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
        
    }
    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        for (int i = 1;i<=3;i++){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}