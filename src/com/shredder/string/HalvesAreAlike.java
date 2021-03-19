package com.shredder.string;

import java.util.HashSet;
import java.util.Set;

// #EASY
public class HalvesAreAlike {

    public static void main(String[] args) {

        System.out.println(halvesAreAlike("book"));;
    }

    public static boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int n = s.length();
        int[] arr = new int[2];
        for (int i = 0; i < n; i++) {
            if (set.contains(s.charAt(i))) {
                arr[(2 * i) / n]++;
            }
        }
        return arr[0] == arr[1];
    }

}
