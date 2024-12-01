class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        int[] a = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            a[ch - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (a[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '$';
    }
}