class Solution {
    
    HashSet<ArrayList<Integer>> s = new HashSet<>();
    
    public void recursion(int arr[], int n, int k, int ind, int curSum, List<Integer> cur, List<List<Integer>> ans)
    {
        if(curSum == k)
        {
            if(s.contains(cur))
            {
                return;
            }
            s.add(new ArrayList<>(cur));
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(ind == n)
        {
            return;
        }
        if(curSum > k)
        {
            return;
        }
        
        cur.add(arr[ind]);
        recursion(arr, n, k, ind+1, curSum+arr[ind], cur, ans);
        cur.remove(cur.size() - 1);
        recursion(arr, n, k, ind+1, curSum, cur, ans);
    }
    
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        // Code Here.
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        recursion(arr, n, k, 0, 0, new ArrayList<>(), ans);
        return ans;
    }
}