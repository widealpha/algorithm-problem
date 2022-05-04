package leetcode.mouth4;

import util.DataUtil;

public class T1791 {
    public static void main(String[] args) {
        System.out.println(new T1791().findCenter(DataUtil.toIntTwoArray("[[1,2],[5,1],[1,3],[1,4]]")));
    }
    public int findCenter(int[][] edges) {
        int center = edges[0][0];
        if(edges[1][0] == center||edges[1][1] == center){
            return center;
        }else {
            return edges[0][1];
        }
    }
}
