class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
        long result = 1;
        x = x%m;
        
        while(n>0)
        {
            if((n&1) == 1)
            {
                result = (result*x) % m;
            }
            
            n >>= 1;
            x = (x*x) % m;
        }
        
        return result;
    }
}