package leetcode.mouth4;

import util.DataUtil;

import java.util.ArrayList;
import java.util.List;

public class T969 {
    public static void main(String[] args) {
        System.out.println(new T969().pancakeSort(DataUtil.toIntArray("[3,2,4,1]")));
    }

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = arr.length; i > 0; i--) {
            for (int j = 1; j <= arr.length; j++) {
                if (arr[j - 1] == i){
                    if (j == i){
                        break;
                    }
                    res.add(j);
                    for (int k = 0; k < j / 2; k++) {
                        int temp = arr[k];
                        arr[k] = arr[j - k - 1];
                        arr[j - k - 1] = temp;
                    }
                    res.add(i);
                    for (int k = 0; k < i / 2 ; k++) {
                        int temp = arr[k];
                        arr[k] = arr[i - k - 1];
                        arr[i - k - 1] = temp;
                    }
                    break;
                }
            }
        }
        return res;
    }
}
