package leetcode.year2022.mouth4;

public class T883 {
    public static void main(String[] args) {
        T883 t = new T883();
        System.out.println(t.projectionArea(new int[][]{{2}}));
    }

    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    ans++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                max = Math.max(max, grid[i][j]);
            }
            ans += max;
        }

        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, grid[j][i]);
            }
            ans += max;
        }
        return ans;
    }

}
