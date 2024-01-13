/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

import java.util.*;

// @lc code=start
class Solution {

    class PositionFrequency{
        public int frequency;
        public int index;

        public PositionFrequency(int index){
            this.frequency = 1;
            this.index = index;
        }

        public int getFrequency(){
            return frequency;
        }

        public int getIndex(){
            return index;
        }
    }

    public int firstUniqChar(String s) {
        Map<Character, PositionFrequency> lettersMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(lettersMap.containsKey(letter)){
                lettersMap.get(letter).frequency++;
            }else{
                lettersMap.put(letter, new PositionFrequency(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(lettersMap.get(letter).getFrequency() == 1)
                return lettersMap.get(letter).getIndex();
        }

        return -1;
    }
}
// @lc code=end

