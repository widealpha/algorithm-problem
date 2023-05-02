package leetcode.year2023.month5;

import util.Description;

import java.util.*;

@Description(difficulty = Description.Difficulty.MIDDLE, solve = false)
public class T1376 {
    public static void main(String[] args) {
        var t = new T1376();
        int[] manager = new int[]{-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6};
        int[] informTime = new int[]{1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
        System.out.println(t.numOfMinutes(15, 0, manager, informTime));
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> g = new HashMap<Integer, List<Integer>>();
        // 构建邻接表
        for (int i = 0; i < n; i++) {
            g.putIfAbsent(manager[i], new ArrayList<Integer>());
            g.get(manager[i]).add(i);
        }
        Queue<int[]> queue = new ArrayDeque<int[]>();
        // 将起点放入队列
        queue.offer(new int[]{headID, 0});
        int res = 0;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int tmpId = arr[0], val = arr[1];
            // 如果当前节点没有下属，说明到达了叶子节点，更新结果
            if (!g.containsKey(tmpId)) {
                res = Math.max(res, val);
            } else {
                // 将当前节点的下属加入队列，更新时间
                for (int ne : g.get(tmpId)) {
                    queue.offer(new int[]{ne, val + informTime[tmpId]});
                }
            }
        }
        return res;
    }

}
