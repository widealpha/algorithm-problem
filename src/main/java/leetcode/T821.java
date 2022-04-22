package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class T821 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new T821().shortestToChar("loveleetcode", 'e')));
    }

    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[i] = Integer.MAX_VALUE;
        }
        List<Integer> cPlace = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cPlace.add(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (Integer place :cPlace){
                res[i] = Math.min(res[i], Math.abs(i - place));
            }
        }

        return res;
    }
}
