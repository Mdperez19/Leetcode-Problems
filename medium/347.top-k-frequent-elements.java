/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */
import java.util.*;
// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {    
            if (!frequencyMap.containsKey(num))
                frequencyMap.put(num, 1);
            else
                frequencyMap.put(num, frequencyMap.get(num)+1);

        }

        return frequencyMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();

    }
}
// @lc code=end

