class Solution {
    int search(int[] arr, int key) {
     
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[left]<=arr[mid]){
                if(arr[left]<=key && key<=arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(arr[mid]<=key && key<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        } 
        return -1;
    }
}