package com.company;


import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.security.MessageDigest;
import static java.lang.System.out;



public class Modul5 {
    public void encrypt(String s){
        ArrayList<String> a = new ArrayList<String>();
        a.add((int)s.charAt(0)+"");
        for (int i=1; s.length()>i;i++){
            int asci = (int) s.charAt(i);
            int ascii = (int) s.charAt(i-1);
            int ras = asci - ascii;
            a.add(ras+"");
        }
        System.out.println(a);
    }
    public void  decrypt(int[] arr) {
        int[] encoded = new int[arr.length];
        System.arraycopy(arr, 0, encoded, 0, arr.length);
        char[] result = new char[arr.length];
        result[0] = (char) arr[0];
        for (int i = 1; i < encoded.length; i++) {
            result[i] = (char) (encoded[i] + encoded[i - 1]);
            encoded[i] = encoded[i] + encoded[i - 1];
        }
        System.out.println(result);
    }
    public void zadacha2(String name, String start, String end) {
        char startLetter = start.charAt(0);
        int startNumber = Integer.parseInt(String.valueOf(start.charAt(1)));
        char endLetter = end.charAt(0);
        int endNumber = Integer.parseInt(String.valueOf(end.charAt(1)));

        if (startLetter == endLetter && startNumber == endNumber){
            System.out.println(false);
        }

        switch (name) {
            case "Pawn": {
                if (startLetter == endLetter && startNumber == 2 && endNumber == 4){
                    System.out.println(true);
                    break;
                }
                System.out.println(startLetter == endLetter && endNumber == (startNumber + 1));
                break;
            }
            case "Knight": {
                System.out.println((Math.abs(startLetter - endLetter) == 2 && Math.abs(startNumber - endNumber) == 1) || (Math.abs(startLetter - endLetter) == 1 && Math.abs(startNumber - endNumber) == 2));
                break;
            }
            case "Bishop": {
                System.out.println(Math.abs(startLetter - endLetter) == Math.abs(startNumber - endNumber));
                break;
            }
            case "Rook": {
                System.out.println((startLetter == endLetter && startNumber != endNumber) || (startLetter != endLetter && startNumber == endNumber));
                break;
            }
            case "Queen": {
                if ((startLetter == endLetter && startNumber != endNumber) || (startLetter != endLetter && startNumber == endNumber)){
                    System.out.println(true);
                    break;
                }
                if (Math.abs(startLetter - endLetter) == Math.abs(startNumber - endNumber))
                    System.out.println(true);
                break;
            }
            case "King": {
                System.out.println(Math.abs(startLetter - endLetter) < 2 && Math.abs(startNumber - endNumber) < 2);
                break;
            }
        }
    }
    public void zadacha3(String str1, String str2) {
        char[] chars = str1.toCharArray();
        int startOfSearch = 0;
        for (char c : chars) {
            if (str2.indexOf(String.valueOf(c), startOfSearch) != -1)
                startOfSearch = str2.indexOf(String.valueOf(c), startOfSearch) + 1;
            else
                System.out.println(false);
        }
        System.out.println(true);
    }
    public void zadacha4(int[] mass) {
        int sum = 0;
        for (int value : mass) {
            sum += value;
        }
        while (sum > 9) {
            int mult = 1;
            while (sum > 0) {
                mult *= sum % 10;
                sum /= 10;
            }
            sum = mult;
        }
        System.out.println(sum);
    }
    public void zadacha5(String[] strs) {
        String[] allVowels = new String[]{"a", "e", "y", "u", "i", "o"};
        String vowels = "";
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < allVowels.length; i++) {
            if (strs[0].contains(allVowels[i]) && !vowels.contains(allVowels[i])) {
                vowels += allVowels[i];
            }
        }
        if (vowels.length() > 0) {
            result.add(strs[0]);
        } else {
            System.out.println(result);
        }
        for (int i = 1; i < strs.length; i++) {
            boolean pass = true;
            for (int j = 0; j < vowels.length(); j++) {
                if (!strs[i].contains(String.valueOf(vowels.charAt(j)))) {
                    pass = false;
                    break;
                }
            }
            if (pass)
                result.add(strs[i]);
        }
        System.out.println(result);
    }
    public void zadacha6(long cardNum) {
        StringBuilder str = new StringBuilder();
        long number = cardNum;

        if (Long.toString(number).length() >= 14 && Long.toString(number).length() <= 19) {
            // step 1
            long lastNum = number % 10;
            StringBuilder cardNumStr = new StringBuilder(Long.toString(number /= 10));
            // step 2
            cardNumStr.reverse();
            // step 3
            for (int i = 0; i < cardNumStr.length(); i++) {
                if (i % 2 != 0) {
                    int c = Character.getNumericValue(cardNumStr.charAt(i)) * 2;

                    if (c > 9) {
                        String buf = Integer.toString(c);

                        str.append(Character.getNumericValue(buf.charAt(0)) + Character.getNumericValue(buf.charAt(1)));
                    } else {
                        str.append(c);
                    }
                } else {
                    str.append(cardNumStr.charAt(i));
                }
            }
            //System.out.println(str);
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += Character.getNumericValue(str.charAt(i));
            }
            //System.out.println(sum);
            //System.out.println(lastNum);
            System.out.println(lastNum == 10 - sum % 10);
        }
        else System.out.println(false);
    }
    public void zadacha7(int num) {
        String str = "";
        if (num == 0) System.out.println("zero");

        switch (num / 100) {
            case 1: {
                str += "one hundred ";
                break;
            }
            case 2: {
                str += "two hundred ";
                break;
            }
            case 3: {
                str += "three hundred ";
                break;
            }
            case 4: {
                str += "four hundred ";
                break;
            }
            case 5: {
                str += "five hundred ";
                break;
            }
            case 6: {
                str += "six hundred ";
                break;
            }
            case 7: {
                str += "seven hundred ";
                break;
            }
            case 8: {
                str += "eight hundred ";
                break;
            }
            case 9: {
                str += "nine hundred ";
                break;
            }
        }

        switch (num / 10 % 10) {
            case 1: {
                switch (num % 10) {
                    case 0: {
                        str += "ten";
                        System.out.println(str);
                    }
                    case 1: {
                        str += "eleven";
                        System.out.println(str);
                    }
                    case 2: {
                        str += "twelve";
                        System.out.println(str);
                    }
                    case 3: {
                        str += "thirteen";
                        System.out.println(str);
                    }
                    case 4: {
                        str += "fourteen";
                        System.out.println(str);
                    }
                    case 5: {
                        str += "fifteen";
                        System.out.println(str);
                    }
                    case 6: {
                        str += "sixteen";
                        System.out.println(str);
                    }
                    case 7: {
                        str += "seventeen";
                        System.out.println(str);
                    }
                    case 8: {
                        str += "eighteen";
                        System.out.println(str);
                    }
                    case 9: {
                        str += "nineteen";
                        System.out.println(str);
                    }
                }
            }

            case 2: {
                str += "twenty ";
                break;
            }
            case 3: {
                str += "thirty ";
                break;
            }
            case 4: {
                str += "forty ";
                break;
            }
            case 5: {
                str += "fifty ";
                break;
            }
            case 6: {
                str += "sixty ";
                break;
            }
            case 7: {
                str += "seventy ";
                break;
            }
            case 8: {
                str += "eighty ";
                break;
            }
            case 9: {
                str += "ninety ";
                break;
            }
        }

        switch (num % 10) {
            case 1: {
                str += "one";
                break;
            }
            case 2: {
                str += "two";
                break;
            }
            case 3: {
                str += "three";
                break;
            }
            case 4: {
                str += "four";
                break;
            }
            case 5: {
                str += "five";
                break;
            }
            case 6: {
                str += "six";
                break;
            }
            case 7: {
                str += "seven";
                break;
            }
            case 8: {
                str += "eight";
                break;
            }
            case 9: {
                str += "nine";
                break;
            }
        }

        System.out.println(str);
    }
    public void numToRus(int num) {
        String str = "";

        if (num == 0) System.out.println("ноль");

        switch (num / 100) {
            case 1: {
                str += "сто ";
                break;
            }
            case 2: {
                str += "двести ";
                break;
            }
            case 3: {
                str += "триста ";
                break;
            }
            case 4: {
                str += "четыреста ";
                break;
            }
            case 5: {
                str += "пятьсот ";
                break;
            }
            case 6: {
                str += "шестьсот ";
                break;
            }
            case 7: {
                str += "семьсот ";
                break;
            }
            case 8: {
                str += "восемьсот ";
                break;
            }
            case 9: {
                str += "девятьсот ";
                break;
            }
        }

        switch (num / 10 % 10) {
            case 1: {
                switch (num % 10) {
                    case 0: {
                        str += "десять";
                        System.out.println(str);
                    }
                    case 1: {
                        str += "одиннадцать";
                        System.out.println(str);
                    }
                    case 2: {
                        str += "двенадцать";
                        System.out.println(str);
                    }
                    case 3: {
                        str += "тринадцать";
                        System.out.println(str);
                    }
                    case 4: {
                        str += "четырнадцать";
                        System.out.println(str);
                    }
                    case 5: {
                        str += "пятнадцать";
                        System.out.println(str);
                    }
                    case 6: {
                        str += "шестнадцать";
                        System.out.println(str);
                    }
                    case 7: {
                        str += "семнадцать";
                        System.out.println(str);
                    }
                    case 8: {
                        str += "восемьнадцать";
                        System.out.println(str);
                    }
                    case 9: {
                        str += "двадцать";
                        System.out.println(str);
                    }
                }
            }

            case 2: {
                str += "двадцать ";
                break;
            }
            case 3: {
                str += "тридцать ";
                break;
            }
            case 4: {
                str += "сорок ";
                break;
            }
            case 5: {
                str += "пятьдесят ";
                break;
            }
            case 6: {
                str += "шестьдесят ";
                break;
            }
            case 7: {
                str += "семьдесят ";
                break;
            }
            case 8: {
                str += "восемьдесят ";
                break;
            }
            case 9: {
                str += "девяносто ";
                break;
            }
        }

        switch (num % 10) {
            case 1: {
                str += "один";
                break;
            }
            case 2: {
                str += "два";
                break;
            }
            case 3: {
                str += "три";
                break;
            }
            case 4: {
                str += "четыре";
                break;
            }
            case 5: {
                str += "пять";
                break;
            }
            case 6: {
                str += "шесть";
                break;
            }
            case 7: {
                str += "семь";
                break;
            }
            case 8: {
                str += "восемь";
                break;
            }
            case 9: {
                str += "девять";
                break;
            }
        }
        System.out.println(str);
    }

    public void zadacha8(String str){
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] hash = new byte[0];
        hash = digest.digest(str.getBytes());
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        out.println(hexString.toString());
    }
    public void zadacha9(String str) {
        String[] tokens = str.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equalsIgnoreCase("of") && !tokens[i].equalsIgnoreCase("and") && !tokens[i].equalsIgnoreCase("the") && !tokens[i].equalsIgnoreCase("in")) {
                tokens[i] = String.valueOf(tokens[i].charAt(0)).toUpperCase() + tokens[i].substring(1).toLowerCase();
            } else {
                tokens[i] = tokens[i].toLowerCase();
            }
        }
        System.out.println(String.join(" ", tokens));
    }
    public void zadacha10(int n) {
        int num = 1;
        int i = 1;
        String res = "";

        while (n > num) {
            i++;
            num = 3 * i * (i - 1) + 1;
        }
        int l = i;//3
        if (n != num)
            res = "invalid";
        else {
            while (l < i * 2 - 1) {//ot 3 do 5
                for (int a = 0; a < i * 2 - 1 - l; a++) // ot 0 do 2
                    res += "  ";
                for (int b = 0; b < l; b++)//ot 0 do 3
                    res += " o  ";
                res += "\n";
                l++;
            }
            while (l >= i) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += "  ";
                for (int b = l; b > 0; b--)
                    res += " o  ";
                res += "\n";
                l--;
            }
        }
        out.println(res);
    }
}


