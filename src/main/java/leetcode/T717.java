package leetcode;

import util.DataUtil;

public class T717 {
    public static void main(String[] args) {
        System.out.println(new T717().isOneBitCharacter(DataUtil.toIntArray("[1, 1, 1, 0]")));
    }

    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1 || bits[bits.length - 2] == 0) {
            return true;
        }
        boolean flag = false;
        for (int i = 0; i < bits.length; i++) {
            if (flag) {
                flag = false;
            } else if (bits[i] == 1) {
                flag = true;
            } else if (i == bits.length - 1){
                return true;
            }
        }
        return false;
    }
}
