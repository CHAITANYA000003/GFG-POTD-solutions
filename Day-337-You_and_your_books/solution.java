class Solution {
    long max_Books(int arr[], int n, int k) {
        // Your code here
        long ans = 0;
        long temp = 0;
        
        for(int i=0; i<n; i++)
        {
            if(arr[i] <= k)
            {
                temp += arr[i];
            }
            else
            {
                ans = Math.max(ans, temp);
                temp = 0;
            }
        }
        ans = Math.max(ans, temp);
        
        return ans;
    }
}