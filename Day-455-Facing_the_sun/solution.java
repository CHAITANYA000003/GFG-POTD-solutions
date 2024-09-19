class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int n = height.length;
        int count = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (height[i] > maxi) {
                count++;
                maxi = height[i];
            }
        }

        return count;
    }
}