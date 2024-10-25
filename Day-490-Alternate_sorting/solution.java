class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // Your code goes here
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int order = 0;
        while (i <= j) {
            if ((order & 1) == 0) {
                ans.add(arr[j]);
                order = 1;
                j--;
            } else {
                ans.add(arr[i]);
                order = 0;
                i++;
            }
        }

        return ans;
    }
}