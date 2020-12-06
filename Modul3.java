package com.company;

public class Modul3 {
    public void zadacha1(int a, int b, int c){
        int d = b*b - 4*a*c;
        if (d < 0){
            System.out.println(0);
        }
        if (d == 0){
            System.out.println(1);
        }
        if (d > 0){
            System.out.println(2);
        }
    }
public void zadacha2(String s){
    s = s.replaceFirst("zip", "");
        if (s.indexOf("zip") == -1) {
            System.out.println(-1);
        }
        else {
            int str = s.indexOf("zip") + 3;
            System.out.println(str);
        }
}
public void zadacha3(int n){
        int sum = 0;
        for (int i = 1;n>i;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if (n == sum){
            System.out.println(true);
        }
        else System.out.println(false);
    //System.out.println(sum);
}
public void zadacha4(String s){
        if (s.length() < 2){
            System.out.println("Несовместимо");
        }
        else if (s.charAt(0) == s.charAt(s.length()-1)){
            System.out.println("Два - это пара");
        }
        else{
            String f = ""+s.charAt(0);
            String l = ""+s.charAt(s.length()-1);
            s = s.substring(1, s.length()-1);
            System.out.println(l+s+f);
        }
}
public void zadacha5(String s){
        String n = s.replaceAll("[A-F]", "").replaceAll("[a-f]", "").replaceAll("[0-9]", "");
        if (n.length()==1 && s.length() == 7){
            System.out.println(true);
        }
        else System.out.println(false);
}
public void zadacha6(int [] a,int [] b ){
    int count1 = 0;
    for (int i = 0; i < a.length; i++) {
        for (int j = i+1; j < a.length; j++) {
            if (a[j] == a[i]) {
                count1++;
                break;
            }
        }
    }
    int res1 = a.length - count1;


    int count2 = 0;
    for (int i = 0; i < b.length; i++) {
        for (int j = i+1; j < b.length; j++) {
            if (b[j] == b[i]) {
                count2++;
                break;
            }
        }
    }
    int res2 = b.length - count2;

    if (res1 == res2){
        System.out.println(true);
        }
    else System.out.println(false);

}
public void zadacha7(int n) {
    String s = "" + n * n;
    if (n==1 || n==0) {
        System.out.println(true);
    }
    else if (n==2 || n==3) {
        System.out.println(false);
    }
    else if (s.length() % 2 == 0){
        String left = "";
        for (int i = 0; i < s.length() / 2; i++) {
            left += s.charAt(i) ;
        }
        String right = s.replaceAll(left, "");
        int sum = Integer.parseInt(left) + Integer.parseInt(right);
        if (sum == n){
            System.out.println(true);
        }
        else System.out.println(false);
    }
    else{
        String left = "";
        for (int i = 0; i < Math.round(Math.floor(s.length() / 2)); i++) {
            left += s.charAt(i) ;
        }
        String right = s.replaceAll(left, "");
        int sum = Integer.parseInt(left) + Integer.parseInt(right);
        if (sum == n){
            System.out.println(true);
        }
        else System.out.println(false);
    }
    }
    public void zadacha8(String s){
        int c = 0, z = 0;
        StringBuilder st = new StringBuilder("");
        for (int i = 0; i< s.length()-2; i++){
            if (s.substring(i,i+1).matches("0")){
                z++;
                if(z>c){
                    c=z;
                }
            }
            else{
                z = 0;
            }
        }
        for (int i = 0; i<c; i++){
            st.append("0");
        }
        System.out.println(st.toString());
        }

    public void zadacha9(int n){
        if (n==2||n==3||n==5||n==7){
            System.out.println(n);
        }
        else if ((n % 2 != 0) && (n % 3 != 0) && (n % 5 != 0) && (n % 7 != 0)){
            System.out.println(n);
        }
        else{
            while (!((n % 2 != 0) && (n % 3 != 0) && (n % 5 != 0) && (n % 7 != 0))){
                n++;
            }
            System.out.println(n);
        }
    }

    public void zadacha10(int x, int y, int z){
        int k1;int k2; int g;
        if (z>y && z>x){
            g = z;
            k1 = x;
            k2 = y;
        }
        else if (y>z && y>x){
            g = y;
            k1 = x;
            k2 = z;
        }
        else {
            g = x;
            k1 = y;
            k2 = z;
        }
        if (g*g == k1*k1+k2*k2){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}


