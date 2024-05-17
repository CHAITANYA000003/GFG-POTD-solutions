class Solution {
    
    public boolean binarySearch(int[] arr, int key, int ind)
    {
        int low = 0;
        int high = arr.length;
        int mid;
        while(low <= high)
        {
            mid = (low+high)/2;
            if(arr[mid] == key && mid!=ind)
            {
                return true;
            }
            else if(arr[mid] < key)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return false;
    }
    
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++)
        {
            if(binarySearch(arr, arr[i]-x, i))
            {
                return 1;
            }
        }
        
        return -1;
    }
}