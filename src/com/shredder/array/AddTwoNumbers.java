package com.shredder.array;

// #MEDIUM
public class AddTwoNumbers {

    // https://leetcode.com/problems/add-two-numbers/

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p>
     * Input: l1 = [2,4,3],
     * l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     * <p>
     * Input: l1 = [9,9,9,9,9,9,9],
     * l2 =        [9,9,9,9]
     * Output:     [8,9,9,9,0,0,0,1]
     */

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);


        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);


        ListNode temp = addTwoNumbers(l1, l2);

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //LinkedList Pointers
        ListNode first = null;
        ListNode last = null;

        int carryForward = 0;

        //Condition for continuing with the calculation
        while (l1 != null || l2 != null) { // Stop when both has no value left

            /* Keep summing when values are found ! */
            int sum = 0;
            sum += carryForward;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // #IMPCONCEPT

            // Dividing the sum return what must be carry forwarded, like we do using hand calculation
            carryForward = sum / 10;                // 11 div 10 = 1 || 8 div 10 = 0

            // Mod the sum return what was left
            int valueToPut = sum % 10;              // 11 mod 10 = 1 || 8 mod 10 = 8


            ListNode newNode = new ListNode();
            newNode.val = valueToPut;


            if (first == null) {//When its the first time
                first = newNode;
                last = newNode;
            } else {// Assign a value to last's next then move the last pointer to the newly created node
                last.next = newNode;
                last = newNode;
            }
        }
        // When Carry is forwarded even after all the above operation, make sure its appended to the final entry
        if (carryForward == 1) last.next = new ListNode(1);
        return first;
    }


}
