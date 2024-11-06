class Solution {
    // Function to determine if array arr can be split into three equal sum sets.
    public List<Integer> findSplit(int[] arr) {
        // code here
        int n = arr.length;
        int sum = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            ans.add(-1);
            ans.add(-1);
            return ans;
        }

        int i = 0;
        int curr = 0;
        while (curr < sum / 3 && i < n) {
            curr += arr[i];
            i++;
        }
        if (curr == sum / 3) {
            ans.add(i);
            curr = 0;
            while (curr < sum / 3 && i < n) {
                curr += arr[i];
                i++;
            }
            if (curr == sum / 3) {
                ans.add(i);
                return ans;
            }
        }

        ans.clear();
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}