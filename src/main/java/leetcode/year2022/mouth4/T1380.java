package leetcode.year2022.mouth4;

import java.util.ArrayList;
import java.util.List;

public class T1380 {
    public static void main(String[] args) {
        System.out.println(new T1380().luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}).toString());
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int m = 0;
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    m = j;
                }
            }
            boolean found = false;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][m] > min) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(matrix[i][m]);
            }
        }
        return result;
    }
}
