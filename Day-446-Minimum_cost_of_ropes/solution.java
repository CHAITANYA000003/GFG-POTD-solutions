class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long x : arr) {
            pq.add(x);
        }

        long ans = 0;
        while (pq.size() > 1) {
            long e1 = pq.poll();
            long e2 = pq.poll();
            ans += e1 + e2;
            pq.add(e1 + e2);
        }

        return ans;
    }
}