package com.shredder.string;

// #EASY
public class LongestCommonPrefix {

    public static void main(String[] args) {


        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs2 = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {

        String lcp = "";

        if (strs == null || strs.length == 0) {
            return lcp;
        }

        int index = 0;

        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return lcp;
                }
            }
            lcp += c;
            index++;

        }
        return lcp;


    }

}
