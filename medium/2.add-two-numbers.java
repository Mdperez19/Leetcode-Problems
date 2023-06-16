/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();

        ListNode temp = result;
        char resto = 0;

        while(l1 != null && l2 != null){
            int sumResult = l1.val + l2.val + resto;

            if(resto != 0)
                resto = 0;

            if(sumResult>9){
                sumResult = sumResult % 10;
                resto = 1;
            }
            
            temp = temp.next = new ListNode(sumResult);
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode restList = l1 == null ? l2 : l1;
        ListNode newSublist;
        if(resto !=0)
            newSublist = addTwoNumbers(restList, new ListNode(resto));
        else
            newSublist = restList;

        temp.next = newSublist;
        return result.next;
        
    }
}
// @lc code=end

