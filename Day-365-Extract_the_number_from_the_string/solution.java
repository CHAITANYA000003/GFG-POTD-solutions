class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long ans = -1;
        String curr = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '9') {
                while (i < sentence.length() && sentence.charAt(i) != ' ') {
                    i++;
                }
                curr = "";
            } else if (sentence.charAt(i) >= '0' && sentence.charAt(i) < '9') {
                curr += sentence.charAt(i);
            } else if (sentence.charAt(i) == ' ' && curr != "") {
                ans = Math.max(ans, Long.valueOf(curr));
                curr = "";
            }
        }

        if (curr != "")
            ans = Math.max(ans, Long.valueOf(curr));

        return ans;
    }
}