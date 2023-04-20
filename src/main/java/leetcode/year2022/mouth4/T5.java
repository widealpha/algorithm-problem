package leetcode.year2022.mouth4;

public class T5 {
    public static void main(String[] args) {
        System.out.println(new T5().longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        int size = s.length();
        if (size == 1) {
            return s;
        }
        boolean[][] dp = new boolean[size][size];
        int start = 0;
        int maxLen = 1;
        for (int i = 0; i < size; i++) {
            dp[i][i] = true;
        }

        for (int l = 2; l <= size; l++) {
            for (int i = 0; i < size; i++) {
                int j = l + i - 1;
                if (j >= size) {
                    break;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }
                if (dp[i][j] && l > maxLen) {
                    maxLen = l;
                    start = i;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
