package leetcode;

public class T868 {
    public static void main(String[] args) {
        T868 t = new T868();
        System.out.println(t.binaryGap(6));
    }

    public int binaryGap(int n) {
        int count = 0;
        int max = 0;
        boolean flag = false;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (flag){
//                    flag = false;
                    max = Math.max(count, max);
                    count = 1;
                } else {
                    flag = true;
                    count++;
                }
            } else {
                if (flag) {
                    count++;
                }
            }
            n >>= 1;
        }
        return max;
    }
}
