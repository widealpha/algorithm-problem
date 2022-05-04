package leetcode.mouth4;

import util.DataUtil;

import java.util.Arrays;

public class T1561 {
    public static void main(String[] args) {
        System.out.println(new T1561().maxCoins(DataUtil.toIntArray("[2,4,1,2,7,8]")));
    }

    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        for (int i = piles.length / 3; i < piles.length; i += 2) {
            sum += piles[i];
        }
        return sum;
    }
}
