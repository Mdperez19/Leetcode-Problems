/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> romanNumbersMap = new HashMap<>();
        romanNumbersMap.put("I", 1);
        romanNumbersMap.put("V", 5);
        romanNumbersMap.put("X", 10);
        romanNumbersMap.put("L", 50);
        romanNumbersMap.put("C", 100);
        romanNumbersMap.put("D", 500);
        romanNumbersMap.put("M", 1000);
        romanNumbersMap.put("IV", 4);
        romanNumbersMap.put("IX", 9);
        romanNumbersMap.put("XL", 40);
        romanNumbersMap.put("XC", 90);
        romanNumbersMap.put("CD", 400);
        romanNumbersMap.put("CM", 900);

        int result = 0;

        for(int i = s.length()-1; i>=0; i--){
            String currentRomanNumber = String.valueOf(s.charAt(i));
            String romanNumber = currentRomanNumber;

            if(i-1>=0){
                String nextRomanNumber = String.valueOf(s.charAt(i-1));
                romanNumber= nextRomanNumber+romanNumber;
            }
                                   
            if(romanNumbersMap.containsKey(romanNumber)){
                result+= romanNumbersMap.get(romanNumber);
                i--;
            }else{
                result+= romanNumbersMap.get(currentRomanNumber);
            }
        }
        return result;
        
    }
}
// @lc code=end

