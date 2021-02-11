package com.shredder.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 *  Input: 5
    Output:
    [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
    ]
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(getRow(1));


    }

    public static List<List<Integer>> generate(int numRows) {

        if(numRows == 0) return Collections.emptyList();

        List<List<Integer>> outPutArr = new ArrayList<>();
        outPutArr.add(Collections.singletonList(1)); // Initially adding one item

        //Staring from 2 ,as first item is already added
        int counter = 2;
        while (counter <= numRows){

            // Getting the copy of last Item (i.e list of Integers) and adding zero at first and last place
            List<Integer> lastList = new ArrayList<>(outPutArr.get(outPutArr.size() - 1));
            lastList.add(0,0);
            lastList.add(0);

            //Temp Array to store the item to be added to the existing list
            List<Integer> arrToAppend = new ArrayList<>();

            //This ptr will advance till n - 1
            int ptr = 0;

            while (ptr < lastList.size() - 1) {
                arrToAppend.add(
                                    lastList.get(ptr) //Item at ptr
                                            +
                                    lastList.get(ptr + 1) // Next Adjustment item
                               );
                ptr++;
            }
            // Add result to final output arr
            outPutArr.add(arrToAppend);

            // Increment the step counter
            counter++;
        }

        return outPutArr;
    }

    public static List<Integer> getRow(int rowIndex) {

        List<List<Integer>> generate = generate(rowIndex + 1);
        return generate.get(generate.size() - 1);
    }


}
