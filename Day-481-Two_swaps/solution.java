class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int n = arr.size();
        int misplaced = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != i + 1) {
                misplaced++;
                if (arr.get(arr.get(i) - 1) == i + 1) {
                    flag = true;
                }
            }
        }

        if (misplaced == 0 || misplaced == 3) {
            return true;
        } else if (misplaced == 4 && flag) {
            return true;
        }

        return false;
    }
}