package leetcode.year2023.month4;

import util.Description;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Description(difficulty = Description.Difficulty.EASY, solve = false)
public class T2423 {
    public static void main(String[] args) {
        var t = new T2423();
        System.out.println(t.equalFrequency("cbccca"));
    }

    public boolean equalFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        if (map.size() == 1) {
            return true;
        }
        Map<Integer, List<Character>> map1 = new HashMap<>();
        for (var entry : map.entrySet()) {
            if (!map1.containsKey(entry.getValue())) {
                map1.put(entry.getValue(), new ArrayList<>());
            }
            map1.get(entry.getValue()).add(entry.getKey());
        }
        if (map1.size() == 1 && map1.containsKey(1)) return true;
        if (map1.size() != 2) return false;
        List<Integer> keys = new ArrayList<>(map1.keySet());
        if (keys.get(0) - keys.get(1) != 1) if (keys.get(1) == 1) return true;
        if (keys.get(1) - keys.get(0) != 1) if (keys.get(0) != 1) return true;
        if (keys.get(0) - keys.get(1) != 1 && keys.get(1) - keys.get(0) != 1) return false;
        List<List<Character>> list = new ArrayList<>(map1.values());
        return list.get(0).size() == 1 || list.get(1).size() == 1;
    }
}
