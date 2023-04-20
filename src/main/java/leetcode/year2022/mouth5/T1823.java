package leetcode.year2022.mouth5;

import java.util.ArrayList;
import java.util.List;

public class T1823 {
    public static void main(String[] args) {
        T1823 t = new T1823();
//        System.out.println(t.findTheWinner(5, 2));
        System.out.println(t.findTheWinner(6, 5));
    }

    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int place = 0;
        while (list.size() > 1) {
            place += k - 1;
            place %= list.size();
            list.remove(place);
        }
        return list.get(0);
    }
}
