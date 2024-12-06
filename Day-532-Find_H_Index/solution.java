class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int ans = 0;
        int n = citations.length;
        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] > ans) {
                ans++;
            }
        }

        return ans;
    }
}