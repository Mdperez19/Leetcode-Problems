/*
 * @lc app=leetcode id=1207 lang=java
 *
 * [1207] Unique Number of Occurrences
 */
import java.util.*;
// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int num : arr) {
            if(!frequencies.containsKey(num))
                frequencies.put(num,0);
            frequencies.put(num, frequencies.get(num)+1);
        }

        long uniqueFrequency = frequencies.values().stream()
                                                    .distinct()
                                                    .count();
        
        return frequencies.size() == uniqueFrequency;
    }
}
// @lc code=end

