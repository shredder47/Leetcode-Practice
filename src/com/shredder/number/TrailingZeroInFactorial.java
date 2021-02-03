package com.shredder.number;

public class TrailingZeroInFactorial {

    public static void main(String[] args) {

        trailingZeroes(5);
        trailingZeroes(3);
        trailingZeroes(0);

    }

    public static int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5){
            count += n / i;
        }
        System.out.println("Number of Zeroes for factorial : " + n  +"! is : " + count);
        return count;
    }

}
