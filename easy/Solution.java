/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */
import java.util.*;
// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> nodesVisited = new HashSet<>();
        
        while (headA != null) {
            nodesVisited.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if(nodesVisited.contains(headB))
                return headB;
            headB = headB.next;
        }

        return null;
    }
}
// @lc code=end


