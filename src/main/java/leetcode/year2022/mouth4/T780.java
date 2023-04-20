package leetcode.year2022.mouth4;

public class T780 {
    public static void main(String[] args) {
        System.out.println(new T780().reachingPoints(1, 1, 3, 5));
    }

    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx > sx && ty > sy && tx != ty) {
            if (tx > ty) {
                tx %= ty;
            } else {
                ty %= tx;
            }
        }
        if (tx == sx && ty == sy) {
            return true;
        } else if (tx == sx && ty > sy) {
            return (ty - sy) % sx == 0;
        } else if (tx > sx && ty == sy) {
            return (tx - sx) % sy == 0;
        } else {
            return false;
        }
    }
}
