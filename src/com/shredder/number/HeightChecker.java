package com.shredder.number;

import java.util.Arrays;

// #EASY
public class HeightChecker {

    public static void main(String[] args) {


        int[] integers = new int[]{1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(integers));
    }

    public static int heightChecker(int[] heights) {
        int[] orderedHeight = heights.clone();
        Arrays.sort(orderedHeight);
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != orderedHeight[i]) {
                count++;
            }
        }
        return count;
    }
}
