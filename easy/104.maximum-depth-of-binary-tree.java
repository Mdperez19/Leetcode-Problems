/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int BFS(TreeNode currentNode, int count){

        if(currentNode==null){
            return count;
        }

        count++;

        int left = BFS(currentNode.left, count);
        int right = BFS(currentNode.right, count);

        return Integer.max(left, right);
    }
    public int maxDepth(TreeNode root) {
        return BFS(root, 0);
    }
}
// @lc code=end

