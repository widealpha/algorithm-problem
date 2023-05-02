package leetcode.year2023.month5;

import util.Description;

import java.util.ArrayList;
import java.util.List;

@Description(difficulty = Description.Difficulty.MIDDLE)
public class T970 {
    public static void main(String[] args) {
        var t = new T970();
        System.out.println(t.powerfulIntegers(2, 3, 10));
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res = new ArrayList<>();
        List<Integer> powX = new ArrayList<>();
        List<Integer> powY = new ArrayList<>();
        powX.add(1);
        powY.add(1);

        if (x != 1) {
            int temp = x;
            while (temp < bound) {
                powX.add(temp);
                temp *= x;
            }
        }
        if (y != 1) {
            int temp = y;
            while (temp < bound) {
                powY.add(temp);
                temp *= y;
            }
        }
        for (int i = 2; i <= bound; i++) {
            label1:
            for (Integer x1 : powX) {
                for (Integer y1 : powY) {
                    if (x1 + y1 == i){
                        res.add(i);
                        break label1;
                    }
                }
            }
        }
        return res;
    }
}
