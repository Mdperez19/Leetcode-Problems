/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {

        int carry = 0;

        List<Integer> digitsResult = new ArrayList<>();

        int sum = digits[digits.length-1]+1;

        if(sum>=10){
            carry = 1;
            sum-=10;
        }else
            carry = 0;

        digitsResult.add(sum);

        for (int i = digits.length-2 ; i>=0 ; i--) {
            
            sum = digits[i] + carry;
            if(sum>=10){
                carry = 1;
                sum-=10;
            }else
                carry = 0;
                
            digitsResult.add(sum);
        }

        if(carry == 1){
            digitsResult.add(1);
        }

        int[] arrayResult = new int[digitsResult.size()];
        for (int i = digitsResult.size()-1; i>=0; i--) {
            arrayResult[digitsResult.size()-i-1] = digitsResult.get(i);
        }


        return arrayResult;
    }
}
// @lc code=end

