package leetcode.year2023.month4;

import util.Description;

import java.util.Arrays;

/**
 * 给你一个字符串数组 names ，和一个由 互不相同 的正整数组成的数组 heights 。两个数组的长度均为 n 。
 * </p>
 * 对于每个下标 i，names[i] 和 heights[i] 表示第 i 个人的名字和身高。
 * </p>
 * 请按身高 降序 顺序返回对应的名字数组 names 。
 * </p>
 */
@Description(difficulty = Description.Difficulty.EASY)
public class T2418 {
    public static void main(String[] args) {
        var t = new T2418();
        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};
        System.out.println(Arrays.toString(t.sortPeople(names, heights)));
    }

    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            int max = heights[i];
            int maxIndex = i;
            for (int j = i; j < heights.length; j++) {
                if (heights[j] > max) {
                    max = heights[j];
                    maxIndex = j;
                }
            }
            swap(heights, maxIndex, i);
            swap(names, maxIndex, i);
        }
        return names;
    }

    void swap(Object[] arr, int i, int j) {
        Object o = arr[i];
        arr[i] = arr[j];
        arr[j] = o;
    }

    void swap(int[] arr, int i, int j) {
        int o = arr[i];
        arr[i] = arr[j];
        arr[j] = o;
    }
}
