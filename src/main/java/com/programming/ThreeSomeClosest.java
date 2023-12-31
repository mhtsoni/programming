package com.programming;

import java.util.Arrays;

/**
 * 3Sum Closest.
 * <a href="https://leetcode.com/problems/3sum-closest/description/">...</a>
 * The idea for any K-sum problem is that first sort the array and then  select all possible combinations till k-2
 * elements are left to be selected.
 * For the last two elements keep 2 points one at last and one after the k-3 selected element now if sum<target
 * increase first pointer else decrease second pointer.
 */
public class ThreeSomeClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length-2; i++) {
            int j= i+1;
            int k = nums.length-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(findDistance(closestSum, target) >= findDistance(sum, target)) {
                    closestSum = sum;
                }
                if(sum<target) {
                    j++;
                } else if(sum>target) {
                    k--;
                }
                else {
                    return sum;
                }
            }
        }
        return closestSum;
    }



    private int findDistance(int x, int y) {
        if(x>y) {
            return Math.abs(x-y);
        }
        return Math.abs(y-x);
    }
}
