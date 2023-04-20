package leetcode.year2022.mouth5;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Stack;

public class T591 {
    public static void main(String[] args) {
        T591 t = new T591();
        System.out.println(t.isValid("<![CDATA[wahaha]]]><![CDATA[]> wahaha]]>"));
    }

    public boolean isValid(String code) {
        if (code.charAt(0) != '<' || code.charAt(code.length() - 1) != '>' || code.charAt(1) == '!') {
            return false;
        }
        Map.Entry<String, Integer> pair;
        Stack<String> tagStack = new Stack<>();
        try {
            for (int i = 0; i < code.length(); i++) {
                if (code.charAt(i) == '<') {
                    if (code.charAt(i + 1) == '/') {
                        pair = readTag(code, i + 2);
                        i = pair.getValue();
                        if (!tagStack.pop().equals(pair.getKey())) {
                            return false;
                        }
                        if (tagStack.isEmpty() && i < code.length() - 2) {
                            return false;
                        }
                    } else if (code.charAt(i + 1) == '!') {
                        Integer next = readCData(code, i + 1);
                        if (next == null) {
                            return false;
                        } else {
                            i = next;
                        }
                    } else {
                        pair = readTag(code, i + 1);
                        i = pair.getValue();
                        String tag = pair.getKey();
                        for (char c : tag.toCharArray()) {
                            if (c < 'A' || c > 'Z') {
                                return false;
                            }
                        }
                        if (tag.length() < 1 || tag.length() > 9) {
                            return false;
                        }
                        tagStack.push(pair.getKey());
                    }
                } else {
                    if (tagStack.isEmpty()) {
                        return false;
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        }
        return tagStack.isEmpty();
    }


    Map.Entry<String, Integer> readTag(String s, int start) {
        StringBuilder builder = new StringBuilder();
        while (s.charAt(start) != '>') {
            builder.append(s.charAt(start++));
        }
        return new AbstractMap.SimpleEntry<>(builder.toString(), start);
    }

    Integer readCData(String s, int start) {
        if (!s.startsWith("![CDATA[", start)) {
            return null;
        } else {
            for (int i = start + 7; i < s.length(); i++) {
                if (s.charAt(i) == ']' && s.charAt(i + 1) == ']' && s.charAt(i + 2) == '>') {
                    return i + 2;
                }
            }
        }
        return null;
    }
}
