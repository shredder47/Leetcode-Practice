package com.shredder.array;

import java.util.HashMap;
import java.util.HashSet;

// #EASY
public class UniqueOccurrences {

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            set.add(map.get(key));
        }
        return map.size() == set.size();
    }
}
