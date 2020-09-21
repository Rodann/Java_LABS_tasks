package com.company;
public class Task10 {


    public static void main(String[] args) {
    System.out.println(sec(1530));
    }
      public static int sec(int vremya){
            int vrem = vremya % 100 * 60;
          return vrem;
      }
    }
