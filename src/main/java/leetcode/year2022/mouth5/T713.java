package leetcode.year2022.mouth5;

public class T713 {
    public static void main(String[] args) {
        T713 t = new T713();
        System.out.println(t.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int res = nums[i];
            if (res >= k) {
                continue;
            }
            count++;
            for (int j = i + 1; j < length; j++) {
                res = res * nums[j];
                if (res >= k) {
                    break;
                }
                count++;
            }
        }
        return count;
    }
}
