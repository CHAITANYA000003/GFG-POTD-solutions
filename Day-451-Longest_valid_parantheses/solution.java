class Solution {
    static int maxLength(String s) {
        // code here
        int ans = 0;
        int n = s.length();
        int op, cl;
        op = cl = 0;

        // left to right check
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                op++;
            } else if (s.charAt(i) == ')') {
                cl++;
            }

            if (cl > op) {
                op = cl = 0;
            }
            if (cl == op) {
                ans = Math.max(ans, cl + op);
            }
        }

        op = cl = 0;
        // right to left check
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                op++;
            } else if (s.charAt(i) == ')') {
                cl++;
            }
            if (op > cl) {
                op = cl = 0;
            }
            if (op == cl) {
                ans = Math.max(ans, cl + op);
            }
        }

        return ans;
    }
}