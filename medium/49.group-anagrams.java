/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */
import java.util.*;
// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> strsLettersOrdered = new HashMap<>();

        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String strLettersOrdered = new String(chars);
            if(strsLettersOrdered.containsKey(strLettersOrdered)){
                strsLettersOrdered.get(strLettersOrdered).add(str);
            }else{
                strsLettersOrdered.put(strLettersOrdered, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(strsLettersOrdered.values());
    }
}
// @lc code=end

