package com.shredder.number;

// #NONLEET
public class FactorsOfNumber {

    public static void main(String[] args) {

        int n = 25;
        printFactorsOfANumber(n);

    }

    public static void printFactorsOfANumber(int n) {

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println((i) + ", " + (n / i));
                }
            }
        }

    }


}
