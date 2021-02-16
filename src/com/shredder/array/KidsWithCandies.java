package com.shredder.array;

import java.util.ArrayList;
import java.util.List;


// #EASY
public class KidsWithCandies {


    public static void main(String[] args) {

        System.out.println(kidsWithCandies(new int[]{12, 1, 12}, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> resultArr = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                resultArr.add(true);
            } else {
                resultArr.add(false);
            }
        }
        return resultArr;
    }
}
