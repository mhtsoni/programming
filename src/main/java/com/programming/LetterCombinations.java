package com.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Letter Combinations of a Phone Number
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/">...</a>
 * Approach is to make a multiply function for 2 arrays and call it again and again for the output array and the new
 * array that needs to be multiplied.
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String[]> h = new HashMap<>();
        h.put('2', new String[]{"a","b","c"});
        h.put('3', new String[]{"d","e","f"});
        h.put('4', new String[]{"g","h","i"});
        h.put('5', new String[]{"j","k","l"});
        h.put('6', new String[]{"m","n","o"});
        h.put('7', new String[]{"p","q","r", "s"});
        h.put('8', new String[]{"t","u","v"});
        h.put('9', new String[]{"w","x","y", "z"});
        return generateProduct(h, digits.toCharArray());
    }
    private List<String> generateProduct(HashMap<Character,String[]> h, char[] digits) {
        if(digits.length < 1) return new ArrayList<>();
        List<String> solution = Arrays.asList(h.get(digits[0]));
        for(int i =1; i<digits.length; i++) {
            solution = product(solution, Arrays.asList(h.get(digits[i])));
        }
        return solution;
    }

    private List<String> product(List<String> arr1, List<String> arr2) {
        List<String> solution = new ArrayList<>();
        for(int i =0; i<arr1.size(); i++) {
            for(int j =0; j<arr2.size(); j++) {
                solution.add(arr1.get(i)+arr2.get(j));
            }
        }
        return solution;
    }
}
