class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    if (arr[j] == arr[k]) {
                        int btwn = k - j + 1;
                        ans += (btwn * (btwn - 1) / 2);
                        break;
                    } else {
                        int leftCount = 1;
                        while (j + 1 < k && arr[j] == arr[j + 1]) {
                            leftCount++;
                            j++;
                        }
                        int rightCount = 1;
                        while (k - 1 > j && arr[k] == arr[k - 1]) {
                            rightCount++;
                            k--;
                        }

                        ans += leftCount * rightCount;
                    }
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }
}