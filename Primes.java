package com.company;
public class Primes {
    public static void main(String[] args) {
    int a = 2; int b = 3; int c = 5; int d = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        for (int i = 2;i<=100;i++){
            if ((i % a != 0) && (i % b != 0) && (i % d != 0) && (i % c != 0)) {
                System.out.println(i);
            }
        }
    }
}