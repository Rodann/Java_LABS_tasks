package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Modul6 {
    public void zadacha1(int n) {
        int[][] bellTriangle = new int[n+1][n+1];
        bellTriangle[0][0] = 1;

        for (int i=1; i<=n; i++) {
            bellTriangle[i][0] = bellTriangle[i-1][i-1];

            for (int j=1; j<=i; j++) {
                bellTriangle[i][j] = bellTriangle[i-1][j-1] + bellTriangle[i][j-1];
            }
        }
        System.out.println(bellTriangle[n][0]);
    }
    public void translateWord(String word) {
        String result = word;

        if (String.valueOf(result.charAt(0)).toLowerCase().matches("[aeiouy]")) {
            result += "yay";
        } else {
            result = result.toLowerCase();
            String newWord = result.split("[aeiouy]")[0];
            result = result.replaceFirst(newWord,"") + newWord + "ay";
            result = String.valueOf(result.charAt(0))+ result.substring(1);

        }
        System.out.println(result);
    }
    public void translateSentence(String str) {
        String[] tokens = str.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            if (String.valueOf(tokens[i].charAt(0)).toLowerCase().matches("[aeiouy]")) {
                if (String.valueOf(tokens[i].charAt(tokens[i].length() - 1)).matches("[!?.,:;]")) {
                    tokens[i] = tokens[i].substring(0, tokens[i].length() - 1) + "yay" + tokens[i].charAt(tokens[i].length() - 1);
                } else {
                    tokens[i] += "yay";
                }
            } else {
                if (String.valueOf(tokens[i].charAt(0)).matches("[QWRTPSDFGHJKLZXCVBNM]")) {
                    if (String.valueOf(tokens[i].charAt(tokens[i].length() - 1)).matches("[!?.,:;]")) {
                        char mark = tokens[i].charAt(tokens[i].length() - 1);
                        tokens[i] = tokens[i].substring(0, tokens[i].length() - 1);
                        tokens[i] = tokens[i].toLowerCase();
                        String newWord = tokens[i].split("[aeiouy]")[0];
                        tokens[i] = tokens[i].replaceFirst(newWord,"") + newWord + "ay";
                        tokens[i] = String.valueOf(tokens[i].charAt(0)).toUpperCase() + tokens[i].substring(1) + mark;
                    }
                    else {
                        tokens[i] = tokens[i].toLowerCase();
                        String newWord = tokens[i].split("[aeiouy]")[0];
                        tokens[i] = tokens[i].replaceFirst(newWord,"") + newWord + "ay";
                        tokens[i] = String.valueOf(tokens[i].charAt(0)).toUpperCase() + tokens[i].substring(1);
                    }
                } else {
                    if (String.valueOf(tokens[i].charAt(tokens[i].length() - 1)).matches("[!?.,:;]")) {
                        char mark = tokens[i].charAt(tokens[i].length() - 1);
                        tokens[i] = tokens[i].substring(0, tokens[i].length() - 1);
                        tokens[i] = tokens[i].toLowerCase();
                        String newWord = tokens[i].split("[aeiouy]")[0];
                        tokens[i] = tokens[i].replaceFirst(newWord,"") + newWord + "ay";
                        tokens[i] = tokens[i] + mark;
                    } else {
                        tokens[i] = tokens[i].toLowerCase();
                        String newWord = tokens[i].split("[aeiouy]")[0];
                        tokens[i] = tokens[i].replaceFirst(newWord,"") + newWord + "ay";
                    }
                }
            }
        }

        System.out.println(String.join(" ", tokens));
    }

    public void zadacha3(String str) {
        boolean f = true;
        if (!str.startsWith("rgb") && !str.startsWith("rgba")) {
            f = false;
        }

        String[] numbers = str.split("\\(")[1].split(",");
        numbers[numbers.length - 1] = numbers[numbers.length - 1].substring(0, numbers[numbers.length - 1].length() - 1);
        if (str.startsWith("rgb") && !str.startsWith("rgba")) {
            if (str.contains(".")) {
                f = false;
            }
            for (int i = 0; i < numbers.length; i ++) {
                if (numbers[i].trim().equals("")) {
                    f = false;
                }
                int num = Integer.parseInt(numbers[i].trim());
                if (!(num >= 0 && num <= 255)) {
                    f = false;
                }
            }
        }
        else {
            for (int i = 0; i < numbers.length - 1; i ++) {
                if (numbers[i].trim().equals("")) {
                    f = false;
                    break;
                }
                int num = Integer.parseInt(numbers[i].trim());
                if (!(num >= 0 && num <= 255)) {
                    f = false;
                    break;
                }
            }
            if (f==true){
                double num = Double.parseDouble(numbers[3].trim());
                f= num >= 0 && num <= 1;
            }
        }
        System.out.println(f);
    }
    public void zadacha4(String url, String ...paramsToStrip) {
        String str = "";

        if (!url.contains("?"))
            System.out.println(url);
        else {
            str = url.substring(url.indexOf("?") + 1);
            url = url.substring(0, url.indexOf("?") + 1);
        }

        char[] params = str.toCharArray();
        StringBuilder print = new StringBuilder();

        for (char param : params) {
            if (Character.isLetter(param))
                if (!(print.toString().contains(String.valueOf(param)))) {
                    if (paramsToStrip.length > 0) {
                        for (String arg : paramsToStrip) {
                            if (!(arg.contains(String.valueOf(param))))
                                print.append(str, str.lastIndexOf(param), str.lastIndexOf(param) + 3).append("&");
                        }
                    }
                    else
                        print.append(str, str.lastIndexOf(param), str.lastIndexOf(param) + 3).append("&");
                }
        }

        System.out.println(url + print.substring(0, print.length()-1));
    }
    public void zadacha5(String str){
        String[] tokens = str.toLowerCase().split(" ");
        ArrayList<String> hashtags = new ArrayList<>();

        while (hashtags.size() < 3) {
            double maxLength = Double.NEGATIVE_INFINITY;
            String word = "";
            int idx = 0;

            try {
                for (int i = 0; i < tokens.length; i++) {
                    if (tokens[i].length() > maxLength) {
                        maxLength = tokens[i].length();
                        word = tokens[i];
                        idx = i;
                    }
                }

                if (String.valueOf(word.charAt(word.length() - 1)).matches("[!?.,;:]")) {
                    hashtags.add("#" + word.substring(0, word.length() - 1));
                } else {
                    hashtags.add("#" + word);
                }
                tokens[idx] = "";
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(hashtags);
            }
        }
        System.out.println(hashtags);
    }
    public void zadacha6 (int n){
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=2;
        int len=2, next=3;

        while (next < Integer.MAX_VALUE && len < n){
            int count = 0;

            for (int i = 0; i < len; i++){
                for (int j = len-1; j > i; j--){
                    if (arr[i] + arr[j] == next && arr[i] != arr[j])
                        count++;
                    else if (count > 1)
                        break;
                }

                if (count > 1)
                    break;
            }
            if (count == 1) {
                arr[len] = next;
                len++;
            }
            next++;
        }
        System.out.println(arr[n-1]);
    }
    public void zadacha7(String str){
        String substr = "";
        char [] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : chars) {
            if (!builder.toString().contains(String.valueOf(c)))
                builder.append(c);
            else {
                if (builder.length() > substr.length()) {
                    substr = builder.toString();
                }
                builder = new StringBuilder("" + c);
            }
        }
        str = builder.toString();
        if (str.length() > substr.length())
            substr = str;
        System.out.println(substr);
    }
    public void zadacha8 (int num){
        StringBuilder roman = new StringBuilder();

        if (num < 1 || num > 3999)
            System.out.println("Введите число поменьше. ");

        while (num >= 1000) {
            roman.append("M");
            num -= 1000;
        }
        while (num >= 900) {
            roman.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            roman.append("D");
            num -= 500;
        }
        while (num >= 400) {
            roman.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            roman.append("C");
            num -= 100;
        }
        while (num >= 90) {
            roman.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            roman.append("L");
            num -= 50;
        }
        while (num >= 40) {
            roman.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            roman.append("X");
            num -= 10;
        }
        while (num >= 9) {
            roman.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            roman.append("V");
            num -= 5;
        }
        while (num >= 4) {
            roman.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            roman.append("I");
            num -= 1;
        }
        System.out.println(roman.toString());
    }
    public void zadacha9(String formula){
        String[] tokens = formula.split(" ");
        int ans = 0;
        int expectedResult = 0;

        if (!Character.isDigit(tokens[0].charAt(0))) System.out.println(false);
        else ans = Integer.parseInt(tokens[0]);

        int i = 1;
        while (!tokens[i].equals("=")) {
            if (tokens[i].equals("+")){
                ans += Integer.parseInt(tokens[i + 1]);
            }
            if (tokens[i].equals("-")){
                ans -= Integer.parseInt(tokens[i + 1]);
            }
            if (tokens[i].equals("*")){
                ans *= Integer.parseInt(tokens[i + 1]);
            }
            if (tokens[i].equals("/")){
                ans /= Integer.parseInt(tokens[i + 1]);
            }
            i += 2;
        }
        expectedResult = Integer.parseInt(tokens[tokens.length - 1]);
        System.out.println(ans == expectedResult);
    }
    public void zadacha10(int num){
        boolean isDescendant = false;
        StringBuffer buffer1 =new StringBuffer(num);
        StringBuffer buffer2 =new StringBuffer(num);

        if (buffer1.length() % 2 != 0)
            System.out.println(false);
        else {
            while (!isDescendant){
                if(buffer1 != buffer1.reverse()){
                    for(int i = 0; i < buffer1.length(); i += 2){
                        int a = Integer.parseInt(String.valueOf(buffer1.charAt(i)));
                        int b = Integer.parseInt(String.valueOf(buffer1.charAt(i + 1)));
                        buffer2.append(a + b);
                    }
                }
                else
                    isDescendant = true;
            }
        }
        System.out.println(isDescendant);
    }


}
