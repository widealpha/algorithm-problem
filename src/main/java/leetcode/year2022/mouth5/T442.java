package leetcode.year2022.mouth5;

import java.util.ArrayList;
import java.util.List;

public class T442 {
    public static void main(String[] args) {
        T442 t = new T442();
        System.out.println(t.findDuplicates(new int[]{5, 4, 6, 7, 9, 3, 10, 9, 5, 6}));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            } else {
                result.add(num);
            }
        }
        return result;
    }
}
