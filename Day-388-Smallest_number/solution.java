class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        if (s > 9 * d)
            return "-1";

        String ans = "";
        boolean first = true;
        while (d > 0) {
            for (int i = 0; i <= 9; i++) {
                if (i == 0 && first)
                    continue;

                if ((s - i) <= (d - 1) * 9) {
                    ans += String.valueOf(i);
                    s -= i;
                    if (first)
                        first = false;
                    break;
                }
            }
            d--;
        }

        return ans;
    }
}