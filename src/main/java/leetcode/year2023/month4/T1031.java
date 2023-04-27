package leetcode.year2023.month4;

import util.Description;

/**
 * 给你一个整数数组 nums 和两个整数 firstLen 和 secondLen，请你找出并返回两个非重叠 子数组 中元素的最大和，长度分别为 firstLen 和 secondLen 。
 * </p>
 * 长度为 firstLen 的子数组可以出现在长为 secondLen 的子数组之前或之后，但二者必须是不重叠的。
 * </p>
 * 子数组是数组的一个 连续 部分
 * </p>
 */
@Description(difficulty = Description.Difficulty.MIDDLE, solve = false)
public class T1031 {
    public static void main(String[] args) {
        var t = new T1031();
        int[] nums = new int[]{};
        int firstLength = 0;
        int secondLength = 0;
        System.out.println(t.maxSumTwoNoOverlap(nums, firstLength, secondLength));
    }

    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;
        int[] sum1 = new int[n];
        int[] sum2 = new int[n];

        int res = 0;
        for (int i = Math.max(firstLen, secondLen); i < n; i++) {

        }
        return 0;
    }
}
