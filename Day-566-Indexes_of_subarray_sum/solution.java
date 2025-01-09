class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (target == 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    ans.add(i + 1);
                    ans.add(i + 1);
                    return ans;
                }
            }
        }
        int i = 0;
        int j = 0;
        int curr = 0;
        while (j < n) {
            if (curr == target) {
                ans.add(i + 1);
                ans.add(j);
                return ans;
            } else if (curr < target) {
                curr += arr[j];
                j++;
            } else {
                curr -= arr[i];
                i++;
            }
        }
        while (curr > target && i <= j) {
            curr -= arr[i];
            i++;
        }
        if (curr == target) {
            ans.add(i + 1);
            ans.add(j);
            return ans;
        }

        ans.add(-1);
        return ans;
    }
}