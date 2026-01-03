import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t); // Add new request

        // Remove all requests older than t - 3000
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        // The remaining requests are within [t-3000, t]
        return queue.size();
    }
}
