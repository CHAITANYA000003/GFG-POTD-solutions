class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];
        k = k%m;
        int i, j;
        for(i=0; i<n; i++)
        {
            for(j=k; j<m; j++)
            {
                ans[i][j-k] = mat[i][j];
            }
        }
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<k; j++)
            {
                ans[i][m-k+j] = mat[i][j];
            }
        }
        
        return ans;
    }
}