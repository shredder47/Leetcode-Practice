package com.shredder.number;

// #NONLEET
public class PrimeNumberList {

    public static void main(String[] args) {

        printPrimeNumbersWithinRange(1,100);
    }

    public static void printPrimeNumbersWithinRange(int start, int end) {

        for (int i = start; i < end; i++) {
            if(primeDetector(i))
                System.out.println(i + " is prime");
        }
    }

    //Number which is divisible by 1 or itself only is considered as prime
    private static boolean primeDetector(int n ){

        // Starting with 2 till n/2
        int i = 2;

        boolean isPrimeDetected = true;

        while (i <= n/2){
            // if any number between 2 to n/2 is multiple means the number is not prime
            if(n % i == 0){
                isPrimeDetected = false;
                break;
            }
            i++;
        }
        return isPrimeDetected;
    }


}
