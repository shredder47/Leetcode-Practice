package com.shredder.array;

// #EASY
import java.util.Arrays;

/*

    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

    Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

    1 <= n <= 500
    nums.length == 2n
    1 <= nums[i] <= 10^3

    https://leetcode.com/problems/shuffle-the-array/submissions/

 */
public class ShuffleArray {


    public static void main(String[] args) {

        int[] nums1 = new int[]{2, 5, 1, 3, 4, 7};
        int[] nums2 = new int[]{1,2,3,4,4,3,2,1};
        int[] nums3 = new int[]{1,1,2,2};

        System.out.println(Arrays.toString(shuffle(nums1, 3)));
        System.out.println(Arrays.toString(shuffle(nums2, 4)));
        System.out.println(Arrays.toString(shuffle(nums3, 2)));

    }

    public static int[] shuffle(int[] nums, int n) {

        int[] requiredArr = new int[nums.length];

        int partition = n - 1;

        int i = 0;
        int j = partition + 1;
        int reqArrPtr = 0;

        while (i <= partition && j < nums.length) {

            requiredArr[reqArrPtr++] = nums[i++];
            requiredArr[reqArrPtr++] = nums[j++];


        }
        return requiredArr;
    }


}



