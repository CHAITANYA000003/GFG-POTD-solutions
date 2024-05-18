class Solution {
    public int binarySearch(List<Integer> a)
    {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        
        while(low<high)
        {
            mid = low + (high-low)/2;
            if(a.get(mid) < a.get(mid+1))
            {
                low = mid+1;
            }
            else
            {
                high = mid;
            }
        }
        return a.get(low);
    }
    
    public int findPeakElement(List<Integer> a) {
        // Code here
        return binarySearch(a);
    }
}