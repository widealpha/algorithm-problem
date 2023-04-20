package leetcode.year2023.month4;

import util.Description;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给你两个整数数组 arr1 和 arr2，返回使 arr1 严格递增所需要的最小「操作」数（可能为 0）。
 * 每一步「操作」中，你可以分别从 arr1 和 arr2 中各选出一个索引，分别为 i 和 j，0 <= i < arr1.length 和 0 <= j < arr2.length，然后进行赋值运算 arr1[i] = arr2[j]。
 * 如果无法让 arr1 严格递增，请返回 -1。
 */
@Description(difficulty = Description.Difficulty.HARD, solve = false)
public class T1187 {
    public static void main(String[] args) {
        T1187 t1187 = new T1187();
        int[] arr1 = new int[]{1, 5, 3, 6, 7};
        int[] arr2 = new int[]{1, 3, 2, 4};
        System.out.println(t1187.makeArrayIncreasing(arr1, arr2));
    }

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        arr2 = removeDuplicates(arr2);
        Arrays.sort(arr2);
        int n = arr1.length;
        int m = Math.min(arr1.length, arr2.length);

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

            }
        }
        return 0;
    }

    int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int i : set) {
            result[index++] = i;
        }
        return result;
    }
}
