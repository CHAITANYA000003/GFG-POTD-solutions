class Solution {
    String removeDups(String str) {
        // code here
        boolean[] alphabet = new boolean[26];
        String ans = "";

        for (Character ch : str.toCharArray()) {
            if (!alphabet[ch - 'a']) {
                ans += ch;
                alphabet[ch - 'a'] = true;
            }
        }

        return ans;
    }
}