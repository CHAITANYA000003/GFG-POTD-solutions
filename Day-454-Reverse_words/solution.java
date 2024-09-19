class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String ans = "";
        int len = str.length();
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '.') {
                // System.out.println(temp);
                if (!ans.equals("")) {
                    ans = temp + "." + ans;
                } else {
                    ans = temp;
                }
                temp = "";
            } else {
                temp += str.charAt(i);
            }
        }
        if (!ans.equals("")) {
            ans = temp + "." + ans;
        } else {
            ans = temp;
        }

        return ans;
    }
}