class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        int n = arr.size();

        int i = 0;
        int temp = -1;
        while (i < n) {
            if (arr.get(i) != i && arr.get(i) != -1) {
                // if array element should be lesser than size and array element should not be at its correct position then only swap with its correct position or index value
                temp = arr.get(arr.get(i));
                arr.set(arr.get(i), arr.get(i));
                arr.set(i, temp);
            } else {
                // if element is at its correct position just increment i and check for remaining array elements
                i++;
            }
        }

        return arr;
    }
}