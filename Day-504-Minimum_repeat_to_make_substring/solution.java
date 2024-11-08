class Solution {
    static boolean kmp(String str, String needle) {
        int n = needle.length();
        if (n == 0) {
            return true;
        }
        // Build longest prefix suffix table (lps)
        int[] lps = new int[n];
        int prevLps = 0;
        int i = 1;
        while (i < n) {
            if (needle.charAt(i) == needle.charAt(prevLps)) {
                lps[i] = prevLps + 1;
                prevLps++;
                i++;
            } else {
                if (prevLps == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    prevLps = lps[prevLps - 1];
                }
            }
        }

        // pattern matching step
        i = 0;
        int j = 0;
        int m = str.length();
        while (i < m) {
            if (str.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }

            if (j == n) {
                return true;
            }
        }

        return false;
    }

    static int minRepeats(String s1, String s2) {
        // code here
        int l1 = s1.length();
        int l2 = s2.length();
        int multi = l2 / (float) l1 > l2 / l1 ? l2 / l1 + 1 : l2 / l1;
        String hay1 = s1.repeat(multi);
        String hay2 = s1.repeat(multi + 1);
        if (kmp(hay1, s2)) {
            return multi;
        } else if (kmp(hay2, s2)) {
            return multi + 1;
        }

        return -1;
    }
};