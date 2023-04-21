package leetcode.year2023.month4;

import util.Description;

/**
 * 给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
 */
@Description(difficulty = Description.Difficulty.EASY)
public class T2413 {
    public static void main(String[] args) {
        T2413 t = new T2413();
        System.out.println(t.smallestEvenMultiple(10));
    }

    public int smallestEvenMultiple(int n) {
        return n << (n % 2);
    }
}
