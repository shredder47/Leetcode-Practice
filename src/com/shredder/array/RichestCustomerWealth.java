package com.shredder.array;

// # EASY
public class RichestCustomerWealth {


    /*
        Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest with a wealth of 6 each, so return 6.
     */

    public static void main(String[] args) {


        int[][] arr = new int[][] {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int row = 0; row < accounts.length; row++){
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++){
                sum += accounts[row][col];
            }
            if(sum > max){
                max = sum;
            }
        }

        return max;
    }
}
