class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                ans.add(a[i]);
                i++;
            } else {
                ans.add(b[j]);
                j++;
            }
        }
        while (i < n) {
            ans.add(a[i]);
            i++;
        }
        while (j < m) {
            ans.add(b[j]);
            j++;
        }

        return ans;
    }
}