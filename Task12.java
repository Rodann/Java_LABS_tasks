package com.company;
public class Task12 {
    /*
    Идиотский метод, т.к по сути 2 и 3 if не нужен. Я так понимаю, нужно повесить ярлык "фрукт" на яблоко и персик,
    но я не знаю как это сделать. А если и делать, то очень замудренно получится.

    Если таких фруктов будет 10 000, то вручную вешать ярлыки очень трудно. Нужно что-то вроде словаря,
    с помощью которого будет проводится отбор. В этом словаре будут названия фруктов,и если найдется фрукт из
    этого словаря,то он будет выводится.

     */
    public static void main(String[] args) {
        String apple = "Яблоко";
        String porridge = "Каша";
        String sausage = "Колбаса";
        String peach = "Персик";

        if (apple == "Яблоко"){
            System.out.println("apple");
        }
        if (porridge == "Яблоко" | porridge == "Персик"){
            System.out.println("peach");
        }
        if (sausage == "Яблоко" | sausage == "Персик"){
            System.out.println("peach");
        }
        if (peach == "Яблоко" | peach == "Персик"){
            System.out.println("peach");
        }
    }
}
