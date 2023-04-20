package leetcode.year2022.mouth4;

import util.DataUtil;
import util.Description;

import static util.Description.Difficulty.EASY;

@Description(difficulty = EASY)
public class T1043 {
    public static void main(String[] args) {
        System.out.println(new T1043().maxSumAfterPartitioning(DataUtil.toIntArray("[3,2,4,1]"),3));
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int length = arr.length;
        int[] dp = new int[length + 1];
        for (int i = 1; i <= length; i++) {
            int maxValue = arr[i - 1];
            for (int j = i - 1; j >= 0 && j >= i - k; j--) {
                dp[i] = Math.max(dp[i], dp[j] + maxValue * (i - j));
                if (j > 0) maxValue = Math.max(maxValue, arr[j - 1]);
            }
        }
        return dp[length];
    }
}
