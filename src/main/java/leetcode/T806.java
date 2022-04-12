package leetcode;

import util.DataUtil;

import java.util.Arrays;

public class T806 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new T806().numberOfLines(
                DataUtil.toIntArray("[10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]"),
                "abcdefghijklmnopqrstuvwxyz")));
    }

    public int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int count = 0;
        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            if (count + width > 100){
                count = width;
                line++;
            } else {
                count += width;
            }
        }
        return new int[]{line, count};
    }
}
