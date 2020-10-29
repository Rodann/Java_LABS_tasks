package com.company;

public class Modul2 {
    public void zadcha1(String s, int n){
        String str = "";
        for (int i=0;s.length()-1>=i;i++){
            for (int j=0;j<n;j++){
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }

    public void zadacha2(int [] a){
        int min = 10000;int max = -10000;
        int b = a.length;
        for (int i = 0;i<b;i++){
            if (min>a[i]){
                min = a[i];
            }
            if (max<a[i]){
                max = a[i];
            }
        }
        System.out.println(max-min);
    }

    public void zadacha3(int [] a){
        int sum = 0;
        for (int i =0;i<a.length;i++){
            sum += a[i];
        }
        if (sum%a.length == 0){
            System.out.println(true);
        }
        else System.out.println(false);
    }

    public void zadacha4(int [] a){
        int sum = 0;
        String s = "";
        int b = a.length;
        int ar [];
        ar = new int [b];
        for (int i =0;i<b;i++){
            ar[i] = a[i]+sum;
            s += ar[i] + " ";
            sum = sum + a[i];
        }
        System.out.println(s);
    }

    public void zadacha5(String s){
        int a = s.length()-1;
        double x = Double.parseDouble(s);
        if (x % 10 == 0){
            System.out.println(0);
        }
        else {
            int b = (int) Math.floor(x);
            String str = "" + b;
            int res = a - str.length();
            System.out.println(res);
        }
    }

    public void zadacha6(int n){
        int n0 = 1;
        int n1 = 1;
        int n2 =0;
        for (int i =1;i<n;i++){
             n2= n1+n0;
            n0 = n1;
            n1 = n2;
        }
        System.out.println(n2);
    }

    public void zadacha7(String s){
        int c = 0;
        if (s.length()<=5){
            c++;
        }
        if (s.length() - s.replaceAll(" ", "").length() == 0){
            c++;
        }
        if (s.length() - s.replaceAll("[0-9]", "").length() == s.length()){
            c++;
        }
        if (c == 3){
            System.out.println(true);
        }
        else System.out.println(false);
    }

    public void zadacha8(String s1, String s2){
        if (s1.charAt(0) == s2.charAt(s2.length()-1) && s1.charAt(s1.length()-1) == s2.charAt(0)){
            System.out.println(true);
        }
        else System.out.println(false);
    }

    public void isPrefix(String word, String prefix){
        String s = "-";
      for (int i =0;i<prefix.length();i++){
           if (prefix.charAt(i) == s.charAt(0)){
               System.out.println(true);
          }
           else if (prefix.charAt(i) == word.charAt(i)){
               continue;
          }
           else {
               System.out.println(false);
               break;
           }
      }
    }
    public void isSuffix(String word, String suffix){
        String s = "-";
        int j = 1;
        for (int i = word.length()-1;i>0;i--){
            if (suffix.charAt(suffix.length()-j) == s.charAt(0)){
                System.out.println(true);
                break;
            }
            else  if (suffix.charAt(suffix.length()-j) == word.charAt(i)){
                j++;
                continue;
            }else{
                System.out.println(false);
                break;
            }
        }
        }
        public void zadacha10(int n){
         int res = 0;
        for (int i =1;n>=i;i++){
            if (i%2==0){
                res -= 1;
            }
            else res += 3;
        }
            System.out.println(res);
        }
}
