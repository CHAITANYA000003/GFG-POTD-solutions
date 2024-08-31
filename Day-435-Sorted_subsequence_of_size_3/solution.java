class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        if (n < 3) {
            return new ArrayList<Integer>();
        }

        int[] minLeft = new int[n];
        int[] maxRight = new int[n];
        Arrays.fill(minLeft, Integer.MAX_VALUE);
        Arrays.fill(maxRight, Integer.MIN_VALUE);

        // populating the minLeft array
        minLeft[0] = arr[0];
        for (int i = 1; i < n; i++) {
            minLeft[i] = Math.min(minLeft[i - 1], arr[i]);
        }

        // populating the maxRight array
        maxRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], arr[i]);
        }

        // for(int x: minLeft) {
        // System.out.print(x + " ");
        // }
        // System.out.println();
        // for(int x: maxRight) {
        // System.out.print(x + " ");
        // }

        for (int j = 1; j < n - 1; j++) {
            if (minLeft[j - 1] < arr[j] && arr[j] < maxRight[j + 1]) {
                return new ArrayList<Integer>(Arrays.asList(minLeft[j - 1], arr[j], maxRight[j + 1]));
            }
        }

        return new ArrayList<Integer>();
    }
}