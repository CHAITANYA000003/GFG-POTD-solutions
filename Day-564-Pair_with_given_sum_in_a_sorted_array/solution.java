class Solution {
    int countPairs(int arr[], int target) {
        // Complete the function
        int count = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                if (arr[i] == arr[j]) {
                    int totalCount = j - i + 1;
                    count += ((totalCount * (totalCount - 1)) / 2);
                    break;
                } else {
                    int leftCount = 1;
                    while (arr[i] == arr[i + 1]) {
                        leftCount++;
                        i++;
                    }
                    int rightCount = 1;
                    while (arr[j] == arr[j - 1]) {
                        rightCount++;
                        j--;
                    }
                    count += leftCount * rightCount;
                    i++;
                    j--;
                }
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return count;
    }
}