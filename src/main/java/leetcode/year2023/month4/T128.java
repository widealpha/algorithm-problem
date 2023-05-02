package leetcode.year2023.month4;

import java.util.*;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * <p></p>
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * <p></p>
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class T128 {
    public static void main(String[] args) {
        var t = new T128();
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(t.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        Set<Integer> set  =new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set.stream().toList());
        Collections.sort(list);
        int res = 1;
        int temp = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) + 1 == list.get(i)){
                temp++;
                res = Math.max(res, temp);
            } else {
                temp = 1;
            }
        }
        return res;
    }
}
