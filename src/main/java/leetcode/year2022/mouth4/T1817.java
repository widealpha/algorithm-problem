package leetcode.year2022.mouth4;

import util.DataUtil;

import java.util.*;

public class T1817 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new T1817().findingUsersActiveMinutes(
                DataUtil.toIntTwoArray("[[0,5],[1,2],[0,2],[0,5],[1,3]]"), 5)));
    }

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] answer = new int[k];
        List<Set<Integer>> minute = new ArrayList<>(k);
        Map<Integer, Integer> hashMap = new HashMap<>();
        int now = 0;
        for (int i = 0; i < k; i++) {
            minute.add(new HashSet<>());
        }
        for (int[] log : logs) {
            if (!hashMap.containsKey(log[0])){
                hashMap.put(log[0], now++);
            }
            minute.get(hashMap.get(log[0])).add(log[1]);
        }
        for (Set<Integer> set : minute) {
            if (set.size() > 0) answer[set.size() - 1]++;
        }
        return answer;
    }
}
