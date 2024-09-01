class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int ans = 0;
        int sum1 = 0;
        int sum2 = 0;
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                sum1 += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                sum2 += arr2.get(j);
                j++;
            } else {
                ans += Math.max(sum1, sum2) + arr1.get(i);
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < n) {
            sum1 += arr1.get(i);
            i++;
        }

        while (j < m) {
            sum2 += arr2.get(j);
            j++;
        }

        ans += Math.max(sum1, sum2);

        return ans;
    }
}