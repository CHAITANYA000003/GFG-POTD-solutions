class Solution {
    public static int findClosest(int n, int k, int[] a) {
        // code here
        int low = 0;
        int high = n-1;
        int mid;
        while(low <= high)
        {
            mid = low + (high - low)/2;
            if(a[mid] == k)
            {
                return a[mid];
            }
            else if(a[mid] > k)
            {
                if((mid-1) < 0)
                {
                    break;
                }
                high = mid-1;
            }
            else
            {
                if((mid+1) >= n)
                {
                    break;
                }
                low = mid+1;
            }
        }
        
        if(Math.abs(a[low]-k) > Math.abs(a[high]-k))
        {
            return a[high];
        }
        else if(Math.abs(a[low]-k) < Math.abs(a[high]-k))
        {
            return a[low];
        }
        else
        {
            return Math.max(a[low], a[high]);
        }
    }
}