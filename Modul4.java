package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Modul4 {
    public void zadacha1(int n, int k, String s) {
        String ns = "";
        int ks = 0;
        String[] j = s.split(" ");
        for (int i = 0; i < n; i++) {
            if (ks + j[i].length() < k + 1) {
                ns +=  " " + j[i];
                ks+= j[i].length();
            } else {
                ns += "\n" + j[i];
                ks = j[i].length();
            }
        }
        System.out.println(ns.trim());
    }

    public void zadacha2(String s){
        int f = 0, l = 0;
        ArrayList<String> j = new ArrayList<>();
        StringBuilder st = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                f++;
                st = st.append("(");
            }
            if (s.charAt(i) == ')') {
                l++;
                st = st.append(")");
            }
            if (f == l) {
                if (l != 0) {
                    j.add(st.toString());
                    st = new StringBuilder();
                }
            }
        }
        System.out.println(j);
    }

    public void toCamelCase(String s) {
        String ns = "";
        String k = "";
        for (int i = 0; s.length() - 1 >= i; i++) {
            ns += s.charAt(i);
            if (s.charAt(i) == '_') {
                k = s.charAt(i + 1) + "";
                ns += k.toUpperCase();
                s = s.replace(s.charAt(i + 1), ' ');
            }
        }
        ns = ns.replaceAll("_", "").replaceAll(" ", "");
        System.out.println(ns);
    }

    public void toSnakeCase(String s) {
        String ns = "";
        String k = "";
        for (int i = 0; s.length() - 2 >= i; i++) {
            ns += s.charAt(i);
            k = s.charAt(i + 1) + "";
            if (k.matches("[A-Z]")) {
                ns += "_";
                ns += k.toLowerCase();
            }
        }
        ns = ns.replaceAll("[A-Z]", "");
        System.out.println(ns + s.charAt(s.length() - 1));
    }

    public void zadacha4(double a[]) {
        double scale = Math.pow(10, 2);
        if (a[1] > 17) {
            double ob = (17 - a[0]) * a[2];
            double sverh = (a[1] - 17) * a[2] * a[3];
            double res = Math.ceil((ob + sverh) * scale) / scale;
            System.out.println(res);
        } else {
            double res = Math.ceil(((a[1] - a[0]) * a[2]) * scale) / scale;
            System.out.println(res);
        }
    }

    public void zadacha5(String s, String s1) {
        double kg = 0;
        double metr = 0;
        double bmi = 0;
        int ind = s.indexOf(" ") + 1;
        int ind1 = s1.indexOf(" ") + 1;
        kg = Double.parseDouble(s.substring(0, s.indexOf(" ")));
        metr = Double.parseDouble(s1.substring(0, s1.indexOf(" ")));

        if (s.charAt(ind) == 'p') {
            kg *= 0.453592;
        }

        if (s1.charAt(ind1) == 'i') {
            metr *= 0.0254;
        }

        bmi = Math.round(kg / (metr * metr) * 10d) / 10d;
        if (bmi < 24.9 && bmi >= 18.5) {
            System.out.println(bmi + " Normal weight");
        } else if (bmi < 18.5) {
            System.out.println(bmi + " Underweight");
        } else System.out.println(bmi + " Overweight");
    }

    public void zadacha6(int n) {
        int f = 1;
        String l = Integer.toString(n);
        int len = l.length();
        int sum = 0;
        int len1 = len;
        if (len == 1) {
            System.out.println("0");
        } else {
            for (int i = 0; i <= len; i++) {
                while (len1 > 0) {
                    f = f * (n % 10);
                    n = n / 10;
                    len1--;
                }
                n = f;
                f = 1;
                len1 = len;
                sum++;
            }
        }
        System.out.println(sum);
    }

    public void zadacha7(String s) {
        int k= 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)){
                k++;
                s = s.substring(0, i) + s.substring(i+1, s.length());
                i--;
            }
            else
            if(k>1){
                s = s.substring(0, i) + "*" +k + s.substring(i, s.length());
                k = 1;
            }
        }
        if(k>1)
            s = s+"*" +k;
        System.out.println(s);

    }

        public void zadacha8(String s, String s1){
            String[] j = new String[s.length()];
            String[] j1 = new String[s.length()];
            String[] j2 = new String[s.length()];
            String[] j3 = new String[s.length()];
            boolean m = false;
            j = s.split(" ");
            j1 = s1.split(" ");
            int p = 0, q = 0;
            for (int i = 0; i < j[j.length-1].length(); i++) {
                if (j[j.length-1].substring(i, i + 1).matches("^(?i:[aeiouy]).*")) {
                    j2[p] = j[j.length-1].substring(i, i + 1).toLowerCase();
                    p++;
                }
            }
            for (int i = 0; i < j1[j1.length-1].length(); i++) {
                if (j1[j1.length-1].substring(i, i + 1).matches("^(?i:[aeiouy]).*")) {
                    j3[q] = j1[j1.length-1].substring(i, i + 1).toLowerCase();
                    q++;
                }
            }
            if (p == q){
                for(int i = 0; i<p; i++){
                    if(j2[i].charAt(0) == j3[i].charAt(0)){
                        m = true;
                    }
                }
            }
            System.out.println(m);
        }

        public void zadacha9(int n1, int n2){
        String num = n1+""; String num1 = n2+"";
        char c = ' ' ; char c1=' ';
        for (int i = 0; num.length()>i;i++){
            if (i == num.length()-1){
                break;
            }
            if (num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                c = num.charAt(i);
            }
        }
            for (int i = 0; num1.length()>i;i++){
                if (i == num1.length()-1){
                    break;
                }
                if (num1.charAt(i)==num1.charAt(i+1) && num1.charAt(i)== c){
                    c1 = num1.charAt(i);
                }
            }
            if (c1!=' '){
                System.out.println(true);
            }
            else System.out.println(false);
        }
        public void zadacha10(String s, String c){
            int k = 0, m, sum = 0;
            while (s.indexOf(c) != -1) {
                k = s.indexOf(c);
                m = s.indexOf(c, k + 1);
                for(int i = k+1; i<m;i++) {
                    if (s.charAt(i) == s.charAt(i+1)) {
                        sum--;
                    }
                }
                s = s.substring(m+1);
                sum = sum + m - 1 - k;
            }
            System.out.println(sum);

        }

}

