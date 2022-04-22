package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class T824 {
    public static void main(String[] args) {
        T824 t = new T824();
        System.out.println(t.toGoatLatin("I speak Goat Latin"));
    }

    public String toGoatLatin(String sentence) {
        StringBuilder builder = new StringBuilder();
        Set<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (i != 0){
                builder.append(' ');
            }
            char start = s.charAt(0);
            if (vowel.contains(start) || s.length() == 1){
                builder.append(s);
            } else {
                builder.append(s, 1, s.length());
                builder.append(start);
            }

            builder.append("maa");
            for (int j = 0; j < i; j++) {
                builder.append("a");
            }
        }
        return builder.toString();
    }
}
