/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int lastIndex = m+n-1;

        int nums1Index = m - 1;
        int nums2Index = n - 1;

        // fill array from right
        while (nums1Index >= 0 && nums2Index >= 0 ) {
            
            if(nums2[nums2Index] > nums1[nums1Index] ){
                nums1[lastIndex] = nums2[nums2Index];
                nums2Index--;
            }else{
                nums1[lastIndex] = nums1[nums1Index];
                nums1Index--;
            }
            lastIndex--;
        }

        // fill with remaining  nums2
        while (nums2Index >= 0) {
            nums1[lastIndex] = nums2[nums2Index];
            nums2Index--;
            lastIndex--;
        }

        
    }
}
// @lc code=end

