class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : arr) {
            pq.add(x);
        }
        while (k-- > 0) {
            ans.add(pq.remove());
        }

        return ans;
    }
}