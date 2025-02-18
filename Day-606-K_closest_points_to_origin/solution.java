class Solution {
    private double distance(int[] x) {
        return Math.sqrt(x[0] * x[0] + x[1] * x[1]);
    }

    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(a[2], b[2]));
        for (int[] x : points) {
            double dist = distance(x);
            pq.add(new double[] { x[0], x[1], dist });
        }

        int[][] ans = new int[k][2];
        int ind = 0;
        while (k-- > 0) {
            double[] temp = pq.poll();
            ans[ind++] = new int[] { (int) temp[0], (int) temp[1] };
        }

        return ans;
    }
}