package com.programming;

/**
 * Palindrome Number
 * <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 */
public class IsPalindrome {
    public boolean isPalindrome(int y) {
        char[] x = ("" + y).toCharArray();
        int i=0;
        while(i<(x.length-i-1)) {
            if(x[i]!=x[x.length-i-1]) return false;
            i++;
        }
        return true;
    }
}
