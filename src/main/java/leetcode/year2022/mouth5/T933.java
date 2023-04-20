package leetcode.year2022.mouth5;

import java.util.ArrayDeque;
import java.util.Queue;

public class T933 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
    }
}

@SuppressWarnings("unused")
class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
