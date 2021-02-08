package com.shredder.array;

import java.util.Arrays;

// #EASY
public class TwoSum {

    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    public static void main(String[] args) {

        int[] arr = new int[]{2,7,11,7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));


    }

    public static int[] twoSum(int[] nums, int target) {

        int fVal = -1;
        int sVal = -1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    fVal = i;
                    sVal = j;
                    break;
                }
            }
            if((fVal != -1) && (sVal != -1)){

                break;
            }
        }

        return new int[]{fVal,sVal};

    }


}
