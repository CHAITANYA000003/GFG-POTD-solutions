class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String min_string = arr[0];
        for (String s : arr) {
            if (s.length() < min_string.length()) {
                min_string = s;
            }
        }

        String prefix = min_string;
        for (int i = 0; i < arr.length; i++) {
            String curr = "";
            for (int j = 0; j < prefix.length(); j++) {
                if (arr[i].charAt(j) == min_string.charAt(j)) {
                    curr += min_string.charAt(j);
                } else {
                    prefix = curr.length() < prefix.length() ? curr : prefix;
                }
            }
        }

        return prefix.length() == 0 ? "-1" : prefix;
    }
}