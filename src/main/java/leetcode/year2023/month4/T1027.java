package leetcode.year2023.month4;

import util.Description;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums，返回 nums 中最长等差子序列的长度。
 * 回想一下，nums 的子序列是一个列表 nums[i1], nums[i2], ..., nums[ik] ，且 0 <= i1 < i2 < ... < ik <= nums.length - 1。并且如果 seq[i+1] - seq[i]( 0 <= i < seq.length - 1) 的值都相同，那么序列 seq 是等差的。
 */
@Description(difficulty = Description.Difficulty.MIDDLE)
public class T1027 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 9, 12};
        T1027 t = new T1027();
        System.out.println(t.longestArithSeqLength(arr));
    }

    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int res = 1;
        int[][] dp = new int[n][1001];
        for (int[] ints : dp) {
            Arrays.fill(ints, 1);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int index = nums[i] - nums[j] + 500;
                dp[i][index] = Math.max(dp[i][index], dp[j][index] + 1);
                res = Math.max(dp[i][index], res);
            }
        }
        return res;
    }
}
