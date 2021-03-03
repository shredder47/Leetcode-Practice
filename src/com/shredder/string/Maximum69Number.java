package com.shredder.string;

// #EASY
public class Maximum69Number {

    public static void main(String[] args) {

        System.out.println(maximum69Number(9669));
    }

    public  static int maximum69Number (int num) {
        int duplicate = num;
        int pow = -1;
        int digits = 0;

        while (duplicate != 0) {
            if (duplicate % 10 == 6){
                pow = digits;
            }
            duplicate /= 10;
            digits++;
        }
        return num + (pow == -1 ? 0 : 3 * (int) Math.pow(10, pow));
    }

}
