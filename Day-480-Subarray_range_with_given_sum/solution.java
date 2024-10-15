class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        int ans = 0;
        int pre_sum = 0;
        for (int i = 0; i < n; i++) {
            pre_sum += arr[i];
            if (hm.getOrDefault((pre_sum - tar), -1) != -1) {
                ans += hm.get(pre_sum - tar);
            }
            hm.put(pre_sum, hm.getOrDefault(pre_sum, 0) + 1);
        }

        return ans;
    }
}