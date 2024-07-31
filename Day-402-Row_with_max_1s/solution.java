class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int i = 0;
        int j = arr[0].length-1;
        int ans = -1;
        while(i < n && j>=0){
            if(arr[i][j] == 1){
                j--;
                ans = i;
            }
            else {
                i++;
            }
        }
        
        return ans;
    }
}