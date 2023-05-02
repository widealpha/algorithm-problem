package leetcode.year2023.month4;

import util.Description;

import java.util.*;

/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * </p>
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
 * </p>
 */

@Description(difficulty = Description.Difficulty.MIDDLE)
public class T49 {
    public static void main(String[] args) {
        var t = new T49();
        String[] arr = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(t.groupAnagrams(arr));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> hashMap = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String rStr = new String(chars);
            if (hashMap.containsKey(rStr)) {
                int index = hashMap.get(rStr);
                list.get(index).add(str);
            } else {
                hashMap.put(rStr, list.size());
                List<String> l = new ArrayList<>();
                l.add(str);
                list.add(l);
            }
        }
        return list;
    }
}
