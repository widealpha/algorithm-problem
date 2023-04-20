package leetcode.year2022.mouth4;

public class T905 {
    public static void main(String[] args) {
        T905 t905 = new T905();
        int[] nums = {3, 1, 2, 4};
        int[] res = t905.sortArrayByParity(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if ((nums[left] & 1) == 0) {
                left++;
            } else if ((nums[left] & 1) == 1 & (nums[right] & 1) == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            } else {
                right--;
            }
        }
        /*n^2
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                continue;
            }
            boolean exchange = false;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    exchange = true;
                }
            }
            if (!exchange) {
                break;
            }
        }*/
        int a = 1, b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
        return nums;
    }
}
