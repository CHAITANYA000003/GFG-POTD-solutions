class Solution {
    private void swap(int a, int b, char[] ch) {
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }

    private void recursion(int ind, char[] ch, ArrayList<String> ans) {
        int n = ch.length;
        if (ind == n) {
            ans.add(new String(ch));
            return;
        }
        for (int i = ind; i < n; i++) {
            if (i != ind && ch[i] == ch[ind]) {
                continue;
            }
            swap(i, ind, ch);
            recursion(ind + 1, ch, ans);
        }
        for (int i = n - 1; i > ind; i--) {
            swap(i, ind, ch);
        }
    }

    public ArrayList<String> findPermutation(String s) {
        // Code here
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        recursion(0, ch, ans);

        return ans;
    }
}