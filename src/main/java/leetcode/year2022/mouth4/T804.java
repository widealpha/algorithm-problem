package leetcode.year2022.mouth4;

import util.DataUtil;

import java.util.HashSet;

public class T804 {
    public static void main(String[] args) {
        System.out.println(new T804().uniqueMorseRepresentations(DataUtil.toStringArray("[\"gin\",\"zen\",\"gig\",\"msg\"]")));
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
