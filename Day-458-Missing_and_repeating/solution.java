class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int a = 0;
        int b = 0;
        int n = arr.length;

        // Finding the repeating number
        for (int i = 0; i < n; i++) {
            int ind;
            ind = arr[i] < 0 ? -(arr[i] + 1) : (arr[i] - 1);
            if (arr[ind] > 0) {
                arr[ind] = -arr[ind];
            } else {
                b = ind + 1;
            }
        }

        // Finding the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                a = i + 1;
                break;
            }
        }

        return new int[] { b, a };
    }
}