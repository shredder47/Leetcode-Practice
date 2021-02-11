package com.shredder.array;

// #EASY

import java.util.Arrays;

/*
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
  */
public class RunningSum {

     public static void main(String[] args) {
         int[] nums1 = new int[]{1,2,3,4};
         int[] nums2 = new int[]{1,1,1,1,1};
         int[] nums3 = new int[]{3,1,2,10,1};

         System.out.println(Arrays.toString(runningSum(nums1)));
         System.out.println(Arrays.toString(runningSum(nums2)));
         System.out.println(Arrays.toString(runningSum(nums3)));

     }

     public static int[] runningSum(int[] nums) {
         int i = 0;
         int runningSum = 0;

         while (i < nums.length){

             runningSum = nums[i] + runningSum;
             nums[i] = runningSum;
             i ++;
         }

         return nums;
     }

}
