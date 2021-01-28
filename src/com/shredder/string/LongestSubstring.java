package com.shredder.string;

import java.util.HashSet;
import java.util.Set;

// #MEDIUM
public class LongestSubstring {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("qrsvbspk"));
    }

    // SLIDING WINDOW PROBLEM
    public static int lengthOfLongestSubstring(String s) {

        int startPtr = 0;
        int endPtr = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (endPtr < s.length()) {
            if (!set.contains(s.charAt(endPtr))) {
                set.add(s.charAt(endPtr));
                endPtr++;
                if (set.size() > max)
                    max = set.size();
            } else {
                set.remove(s.charAt(startPtr));
                startPtr++;
            }

        }
        return max;
    }
}
