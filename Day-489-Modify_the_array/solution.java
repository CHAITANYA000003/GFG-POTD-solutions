class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ans.add(arr[i]);
            }
        }
        int i = ans.size();
        for (; i < n; i++) {
            ans.add(0);
        }

        return ans;
    }
}