package leetcode.year2023.month4;

import util.Description;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p></p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
@Description(difficulty = Description.Difficulty.EASY)
public class T283 {
    public static void main(String[] args) {
        var t = new T283();
        int[] arr = new int[]{0, 1, 0, 3, 12};
        t.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int left = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                left = i;
                break;
            }
        }
        if (left == -1){
            return;
        }
        for (int i = left; i < nums.length - 1; i++) {
            if (nums[i + 1] != 0) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
