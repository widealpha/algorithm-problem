package leetcode.mouth4;

import java.util.*;

public class T380 {
    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
    }
}

class RandomizedSet {
    int index = 0;
    HashMap<Integer,Integer> hashMap;
    ArrayList<Integer> arrayList;

    public RandomizedSet() {
        hashMap = new HashMap<>();
        arrayList = new ArrayList<>();
    }

    public boolean insert(int val) {
        arrayList.add(val);
        return hashMap.put(val, index++) == null;
    }

    public boolean remove(int val) {
        Integer i = hashMap.remove(val);
        if (i != null){
            arrayList.set(i, null);
        }
        return i != null;
    }

    public int getRandom() {
        Random random = new Random();
        Integer i = arrayList.get(random.nextInt(index));
        while (i == null){
            i = arrayList.get(random.nextInt(index));
        }
        return i;
    }
}

