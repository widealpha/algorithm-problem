package leetcode.year2022.mouth4;

import util.DataUtil;

import java.util.Arrays;


public class T1719 {
    public static void main(String[] args) {
        int[][] pairs = DataUtil.toIntTwoArray("[[1,2],[2,3]]");
        System.out.println(new T1719().checkWays(pairs));
    }

    public int checkWays(int[][] pairs) {
        int[] count = new int[500];
        for(int[] row : pairs) {
            for(int element : row) {
                count[element]++;
            }
        }
        System.out.println(Arrays.toString(count));
        return 0;
    }
}
