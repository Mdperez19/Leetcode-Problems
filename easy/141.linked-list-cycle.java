/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */
import java.util.*;
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();

        ListNode currentNode = head;

        while (currentNode != null) {
            if(nodes.contains(currentNode))
                return true;
            else
                nodes.add(currentNode);
            currentNode = currentNode.next;
        }

        return false;
    }
}
// @lc code=end

