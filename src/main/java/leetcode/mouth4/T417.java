package leetcode.mouth4;

import java.util.*;

public class T417 {
    public static void main(String[] args) {
        T417 t417 = new T417();
        int[][] heights = new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
//        int[][] heights = new int[][]{{2, 1}, {1, 2}};
        List<List<Integer>> list = t417.pacificAtlantic(heights);
        for (List<Integer> l : list) {
            System.out.println(l);
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};
        int[][] res = new int[m][n];
        Queue<int[]> points = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            res[0][i] = 1;
            points.add(new int[]{0, i});
        }
        for (int i = 1; i < n; i++) {
            res[i][0] = 1;
            points.add(new int[]{i, 0});
        }

        while (!points.isEmpty()) {
            int[] point = points.poll();
            for (int i = 0; i < 4; i++) {
                int rx = point[0] + dx[i];
                int ry = point[1] + dy[i];
                if (rx >= 0 && rx < m && ry >= 0 && ry < n && res[rx][ry] == 0) {
                    if (heights[rx][ry] >= heights[point[0]][point[1]]) {
                        res[rx][ry] = 1;
                        points.add(new int[]{rx, ry});
                    }
                }
            }
        }

        int[][] res1 = new int[m][n];

        for (int i = 0; i < n; i++) {
            res1[m - 1][i] = 1;
            points.add(new int[]{m - 1, i});
        }
        for (int i = 0; i < m - 1; i++) {
            res1[i][n - 1] = 1;
            points.add(new int[]{i, n - 1});
        }

        while (!points.isEmpty()) {
            int[] point = points.poll();
            for (int i = 0; i < 4; i++) {
                int rx = point[0] + dx[i];
                int ry = point[1] + dy[i];
                if (rx >= 0 && rx < m && ry >= 0 && ry < n && res1[rx][ry] == 0) {
                    if (heights[rx][ry] >= heights[point[0]][point[1]]) {
                        res1[rx][ry] = 1;
                        points.add(new int[]{rx, ry});
                    }
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] + res1[i][j] == 2) {
                    list.add(Arrays.asList(i, j));
                }
            }
        }
        return list;
    }
}
