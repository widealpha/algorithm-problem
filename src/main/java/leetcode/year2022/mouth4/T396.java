package leetcode.year2022.mouth4;

public class T396 {
    public static void main(String[] args) {
        T396 t = new T396();
        System.out.println(t.maxRotateFunction(new int[]{4, 3, 2, 6}));
    }

    public int maxRotateFunction(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        if(n == 0) return 0;
        //从n到最后的和
        int[] dp = new int[n];
        dp[n - 1] = nums[n - 1];
        for (int i = n - 2; i > 0; i--) {
            dp[i] = dp[i + 1] + nums[i];
        }
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 1; j < n; j++) {
                sum += dp[j];
            }
            max = Math.max(max, sum);
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] - nums[n - j] + nums[(n - j + i - 1) % n];
            }
        }
        return max;
    }
}
