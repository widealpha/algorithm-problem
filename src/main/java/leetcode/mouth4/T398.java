package leetcode.mouth4;

import java.util.*;

public class T398 {
    public static void main(String[] args) {
        System.out.println(new Solution(new int[]{1, 2, 3, 3, 3}).pick(3));
    }
}

class Solution {
    HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
    Random random = new Random();

    public Solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (hashMap.containsKey(nums[i])) {
                hashMap.get(key).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                hashMap.put(key, list);
            }
        }
    }

    public int pick(int target) {
        List<Integer> list = hashMap.get(target);
        return list.get(random.nextInt(list.size()));
    }
}

