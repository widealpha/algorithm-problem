package leetcode.year2023.month4;

import util.Description;

/**
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * <p>
 * 子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 */

@Description(difficulty = Description.Difficulty.MIDDLE)
public class T300 {
    public static void main(String[] args) {
        T300 t300 = new T300();
        int[] arr = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(t300.lengthOfLIS(arr));
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }

        }
        int max = 0;
        for (int num : dp) {
            max = Math.max(max, num);
        }
        return max;
    }
}
