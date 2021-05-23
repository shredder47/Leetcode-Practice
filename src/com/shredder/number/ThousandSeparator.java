package com.shredder.number;

import java.util.Arrays;

// #EASY
public class ThousandSeparator {

    public static void main(String[] args) {
        System.out.println(thousandSeparator(6682));
    }

    public static String thousandSeparator(int n) {
       /* Constraint ->  0 <= n < 2^31           */

        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();

        int numsAdded = 0;
        boolean insertDotNextTime = false;

        while (n != 0) {

            int lastDigit = n % 10;
            n = n / 10;
            numsAdded++;

            if (insertDotNextTime) {
                sb.append(".");
            }
            sb.append(lastDigit);

            if (numsAdded % 3 == 0)
                insertDotNextTime = true;
            else
                insertDotNextTime = false;

        }
        return sb.reverse().toString();
    }
}
