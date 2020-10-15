package com.company;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntToDoubleFunction;

public class Modul1 {
    public void zadacha1(int op1, int op2) {
        int res = op1 % op2;
        System.out.println(res);
    }
    public void zadacha2(int osn, int visot){
        int res = osn*visot/2;
        System.out.println(res);
    }
    public void zadacha3(int chic, int cow, int pig){
        int res = chic*2+cow*4+pig*4;
        System.out.println(res);
    }
    public void zadacha4(double prob, int prize, int pay){
        if (prob*prize > pay){
            System.out.println(true);
        }
        else System.out.println(false);
    }
    public void zadacha5(int n, int a, int b){
        if (a - b == n){
            System.out.println("subtraction");
        }
        else if (a / b == n){
            System.out.println("division");
        }
        else if (a * b == n){
            System.out.println("multiplication");
        }
        else if (a + b == n){
            System.out.println("addition");
        }
        else System.out.println("none");
    }
    public void zadacha6(char a){
        int c = (int) a;
        System.out.println(c);
    }
    public void zadacha7(int a){
        int res = 0;
        for (int i = 1;i<=a;i++){
            res += i;
        }
        System.out.println(res);
    }
    public void zadacha8(int a, int b){
        int res = a+b-1;
        System.out.println(res);
        //Сумма двух сторон треугольника должна быть больше третьей стороны
    }
    public void zadacha9(int[] a){
        int res = 0;
        int b = a.length;
            for (int i = 0;i<b;i++){
                res += (int) Math.pow(a[i],3);
            }
        System.out.println(res);
    }
    public void zadacha10(int a, int b, int c){
        for (int i = 0;i<b;i++){
            a = a + a;
        }
        if (a % c == 0){
            System.out.println(true);
        }
        else System.out.println(false);
        //System.out.println(a);
    }
}
