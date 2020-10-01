package com.company;

public class Palindrome {
    public static void main(String[] args) {
        String s = "song"; String str = "";  // пусть строка s будет каким-либо словом или фразой, а str будет результатом
        String ss = s;                                             // резервация изначальной строки для красивого ответа:)
        s = s.replaceAll("\\s+","");              // удаляет все пробелы и невидимые символы из изначальной строки (например, tab, \n)
        for (int i = s.length();i>0;i--){                         // начинаем цикл, где отчет будет идти по индексам с конца фразы(слова) к началу
            str += s.charAt(i-1);                                 // прибавляем к итоговой строке(она пустая) буквы в обратном порядке из изначальной строки
        }
        if (s.equalsIgnoreCase(str) == true){
            System.out.println(ss + " является палиндромом");
        }
        else System.out.println(ss + " не является палиндромом");
    }
}
