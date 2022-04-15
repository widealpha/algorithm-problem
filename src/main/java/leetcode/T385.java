package leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
class NestedInteger {
    int value;

    // Constructor initializes an empty nested list.
    public NestedInteger() {
    }


    // Constructor initializes a single integer.
    public NestedInteger(int value) {
        this.value = value;
    }

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger() {
        return true;
    }

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger() {
        return value;
    }

    // Set this NestedInteger to hold a single integer.
    public void setInteger(int value) {
        this.value = value;
    }

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    public void add(NestedInteger ni) {
    }

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList() {
        return null;
    }
}

public class T385 {
    public static void main(String[] args) {
        System.out.println(new T385().deserialize("[123,[456,[789]]]"));
    }

    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        } else if (s.length() <= 2) {
            return new NestedInteger();
        }
        NestedInteger res = new NestedInteger();
        int start = 1, level = 0;
        for (int i = 1; i < s.length(); i++) {
            if (level == 0 && (s.charAt(i) == ',' || i == s.length() - 1)) {
                res.add(deserialize(s.substring(start, i)));
                start = i + 1;
            } else if (s.charAt(i) == '[') level++;
            else if (s.charAt(i) == ']') level--;
        }
        return res;
    }

}
