class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        int candidate1 = 0, candidate2 = 0;
        int counter1 = 0, counter2 = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == candidate1) {
                counter1++;
            } else if (nums.get(i) == candidate2) {
                counter2++;
            } else if (counter1 == 0) {
                candidate1 = nums.get(i);
                counter1++;
            } else if (counter2 == 0) {
                candidate2 = nums.get(i);
                counter2++;
            } else {
                counter1--;
                counter2--;
            }
        }

        int temp = Math.max(candidate1, candidate2);
        candidate1 = Math.min(candidate1, candidate2);
        candidate2 = temp;
        int v1 = 0, v2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == candidate1) {
                v1++;
            } else if (nums.get(i) == candidate2) {
                v2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if (v1 <= n / 3 && v2 <= n / 3) {
            ans.add(-1);
        }
        if (v1 > n / 3) {
            ans.add(candidate1);
        }
        if (v2 > n / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}