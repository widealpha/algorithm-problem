package leetcode.year2023.month4;

import util.Description;

/**
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *<p/>
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *<p/>
 * 返回容器可以储存的最大水量。
 *<p/>
 * 说明：你不能倾斜容器。
 *<p/>
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */
@Description(difficulty = Description.Difficulty.MIDDLE)
public class T11 {
    public static void main(String[] args) {
        var t = new T11();
        int[] height = new int[]{};
        System.out.println(t.maxArea(height));
    }

    public int maxArea(int[] height) {
        return 0;
    }
}
