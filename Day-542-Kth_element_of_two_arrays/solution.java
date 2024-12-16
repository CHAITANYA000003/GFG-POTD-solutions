class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        if (a.length > b.length) {
            return kthElement(b, a, k);
        }
        int n1 = a.length;
        int n2 = b.length;
        int low = Math.max(0, k - n2);
        int high = Math.min(n1, k);
        while (low <= high) {
            int m1 = (low + high) / 2;
            int m2 = k - m1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (m1 > 0)
                l1 = a[m1 - 1];
            if (m2 > 0)
                l2 = b[m2 - 1];
            if (m1 < n1)
                r1 = a[m1];
            if (m2 < n2)
                r2 = b[m2];
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = m1 - 1;
            } else {
                low = m1 + 1;
            }
        }

        return -1;
    }
}