class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            pq.add(arr[i]);
            arr[i - k] = pq.poll();
        }
        int i = n - k;
        while (i < n) {
            arr[i++] = pq.poll();
        }
    }
}