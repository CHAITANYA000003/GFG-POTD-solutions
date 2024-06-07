class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int[] a = new int[maxx+2];
        for(int i=0; i<n; i++)
        {
            a[l[i]]++;
            a[r[i]+1]--;
        }
        
        int adder = 0;
        for(int i=1; i<maxx+2; i++)
        {
            adder += a[i];
            a[i] = adder;
        }
        
        int maxCount = 0;
        int ans = 0;
        for(int i=1; i<maxx+1; i++)
        {
            if(a[i]>maxCount)
            {
                maxCount = a[i];
                ans = i;
            }
        }
        
        return ans;
    }
}