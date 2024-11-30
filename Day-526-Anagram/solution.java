class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        // Your code here
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for (Character ch : s1.toCharArray()) {
            a1[ch - 'a']++;
        }
        for (Character ch : s2.toCharArray()) {
            a2[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }
}