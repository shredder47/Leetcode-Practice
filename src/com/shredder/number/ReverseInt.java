package com.shredder.number;

public class ReverseInt {

    public static void main(String[] args) {

        System.out.println(reverse(252578582));


    }

    public static int reverse(int x) {

        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            x = x * -1;
        }

        long reversed = 0;

        while (x > 0) {

            reversed = (reversed * 10) + (x % 10);
            x = x / 10;
        }

        if (isNegative) reversed = reversed * -1;

        return (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) ? 0 : (int) reversed;
    }
}
