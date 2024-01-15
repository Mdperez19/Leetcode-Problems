/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */
import java.util.*;
// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            if (!frequencyMap.containsKey(num))
                frequencyMap.put(num, 1);
            else
                frequencyMap.put(num, frequencyMap.get(num) + 1);
        }

        Queue<Integer> topFrequents = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get)
                                                                    .reversed());
        for (int num : frequencyMap.keySet()) {
            topFrequents.add(num);
        }

        int[] topKfrequency = new int[k];
        for (int i = 0; i < k; i++) {
            topKfrequency[i] = topFrequents.poll();
        }
        
        return topKfrequency;
    }
}
// @lc code=end

