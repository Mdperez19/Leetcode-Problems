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

        Deque<Integer> digitsResult = new ArrayDeque<>();

    
        int sum = digits[digits.length-1]+1;

        if(sum>=10){
            carry = 1;
            sum-=10;
        }else
            carry = 0;

        digitsResult.addFirst(sum);

        for (int i = digits.length-2 ; i>=0 ; i--) {
            
            sum = digits[i] + carry;
            if(sum>=10){
                carry = 1;
                sum-=10;
            }else
                carry = 0;
                
            digitsResult.addFirst(sum);
        }

        if(carry == 1)
            digitsResult.addFirst(1);


        return digitsResult.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
// @lc code=end

