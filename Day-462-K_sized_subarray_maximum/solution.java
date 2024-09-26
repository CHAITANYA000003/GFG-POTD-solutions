class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            pq.add(new int[] { i, arr[i] });
        }
        ans.add(pq.peek()[1]);

        int left = 1;
        int right = k;
        while (right < n) {
            pq.add(new int[] { right, arr[right] });

            while (pq.peek()[0] < left) {
                pq.poll();
            }

            ans.add(pq.peek()[1]);
            left++;
            right++;
        }

        return ans;
    }
}