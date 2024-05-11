class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        List<Long> ans = new ArrayList<Long>();
        ans.add(n);
        while(n != 1)
        {
            if((n&1) == 0)
            {
                n = (long)Math.pow(n, 0.5f);
            }
            else
            {
                n = (long)Math.pow(n, 1.5f);
            }
            ans.add(n);
        }
        
        return ans;
    }
}