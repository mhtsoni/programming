package com.programming;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 1637. Widest Vertical Area Between Two Points Containing No Points
 * <a href="https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/?envType=daily-question&envId=2023-12-21">...</a>
 */
public class WidestVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int[] dp = new int[points.length];
        dp[0] = 0;
        int maxDistance = 0;
        for(int i = 1 ; i< points.length; i++) {
            dp[i] = Math.max((points[i][0] - points[i-1][0]), dp[i-1]);
            maxDistance = Math.max(dp[i], maxDistance);
        }
        return maxDistance;
    }
}
