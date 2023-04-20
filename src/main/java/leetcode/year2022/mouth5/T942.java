package leetcode.year2022.mouth5;

import java.util.Arrays;

public class T942 {
    public static void main(String[] args) {
        T942 t = new T942();
        System.out.println(Arrays.toString(t.diStringMatch("IDID")));
    }

    public int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int min = 0;
        int max = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                res[i] = min++;
            } else {
                res[i] = max--;
            }
        }
        res[s.length()] = max;
        return res;
    }
}
