class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        if (arr.length < 2) {
            return new ArrayList<>();
        }
        int sum_diff = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        int n1, n2;
        n1 = n2 = 0;
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (Math.abs(sum - target) < sum_diff) {
                n1 = arr[i];
                n2 = arr[j];
                sum_diff = Math.abs(sum - target);
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        ans.add(n1);
        ans.add(n2);

        return ans;
    }
}