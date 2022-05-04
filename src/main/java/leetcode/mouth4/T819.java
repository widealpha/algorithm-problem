package leetcode.mouth4;

import java.util.*;

public class T819 {
    public static void main(String[] args) {
        System.out.println(new T819().mostCommonWord("\"Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. ", new String[]{"hit"}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] word = paragraph.split("[ !?',;.]+");
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        for (String s : word) {
            s = s.toLowerCase();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        Map<Integer, List<String>> map2 = new HashMap<>();
        int max = 0;
        for (String s : map.keySet()) {
            if (map2.containsKey(map.get(s))) {
                map2.get(map.get(s)).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map2.put(map.get(s), list);
            }
            if (map.get(s) > max) {
                max = map.get(s);
            }
        }

        for (int i = max; i > 0; i--) {
            for (String s : map2.getOrDefault(i, new ArrayList<>())) {
                if (!ban.contains(s)) {
                    return s;
                }
            }
        }
        return word[0];
    }
}
