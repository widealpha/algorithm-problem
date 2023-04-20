package leetcode.year2022.mouth4;

import util.DataUtil;

public class T1672 {
    public static void main(String[] args) {
        System.out.println(new T1672().maximumWealth(DataUtil.toIntTwoArray("[[1,2,3],[3,2,1]]")));
    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] row : accounts){
            int t = 0;
            for (int i: row){
                t += i;
            }
            max  = Math.max(t, max);
        }
        return max;
    }
}
