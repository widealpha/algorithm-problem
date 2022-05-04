package leetcode.mouth4;

import java.util.ArrayList;
import java.util.List;

public class T386 {
    public static void main(String[] args) {
        System.out.println(new T386().lexicalOrder(13));
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            pre(res, i, n);
        }
        return res;
    }

    public void pre(List<Integer> res, int cur, int n) {
        if (cur > n) {
            return;
        }
        res.add(cur);
        for (int i = 0; i < 10; i++) {
            pre(res, cur * 10 + i, n);
        }
    }
}
