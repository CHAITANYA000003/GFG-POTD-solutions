class Solution {
  public:
    long long sumMatrix(long long n, long long q) {
        // code here
        if(q==1 || q > 2*n)
            return 0;
        
        long long mid = n+1;
        if(q <= mid)
            return q-1;
        else
            return (2*n)-q+1;
    }
};