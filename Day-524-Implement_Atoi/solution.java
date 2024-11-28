class Solution {
    public int myAtoi(String s) {
        // Your code here
        int n = s.length();
        long ans = 0;
        int i = 0;
        // skipping leading zeroes
        while (i < n) {
            if (s.charAt(i) != ' ') {
                break;
            }
            i++;
        }

        // checking for sign
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // reading the integers
        while (i < n) {
            if (s.charAt(i) != '0') {
                break;
            }
            i++;
        }
        while (i < n) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                ans = ans * 10 + (ch - '0');
                if (ans * sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (ans * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                i++;
            } else {
                break;
            }
        }

        return (int) (ans * sign);
    }
}