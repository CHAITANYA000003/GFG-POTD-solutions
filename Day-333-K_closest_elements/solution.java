class Solution {
    int[] printKClosest(int[] a, int n, int k, int x) {
        // code here
        int low = 0;
        int high = n-1;
        int mid;
        
        while(low <= high) {
            mid = low + (high - low)/2;
            if(a[mid] == x) {
                low = mid+1;
                high = mid-1;
                break;
            }
            else if(a[mid] < x) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        int temp = low;
        low = high;
        high = temp;
        
        int[] ans = new int[k];
        int ind=0;
        while(k>0) {
            if(low >= 0 && high < n) {
                int low_diff = Math.abs(a[low]-x);
                int high_diff = Math.abs(a[high]-x);
                
                if(low_diff < high_diff) {
                    ans[ind++] = a[low];
                    low--;
                }
                else {
                    ans[ind++] = a[high];
                    high++;
                }
            }
            else if(low >= 0) {
                ans[ind++] = a[low];
                low--;
            }
            else {
                ans[ind++] = a[high];
                high++;
            }
            k--;
        }
        return ans;
    }
}