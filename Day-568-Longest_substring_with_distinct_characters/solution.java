class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = s.length();
        int i = 0;
        int j = 0;
        int maxi = 1;
        int curr = 0;
        while (j < len) {
            char ch = s.charAt(j);
            if (hm.getOrDefault(ch, -1) == -1) {
                hm.put(ch, 1);
                j++;
            } else {
                hm.remove(s.charAt(i));
                i++;
            }
            maxi = Math.max(maxi, j - i);
        }

        return maxi;
    }
}