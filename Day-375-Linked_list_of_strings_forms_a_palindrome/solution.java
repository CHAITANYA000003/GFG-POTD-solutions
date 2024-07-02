class Solution {
    public boolean compute(Node root) {
        String word = "";
        while (root != null) {
            word += root.data;
            root = root.next;
        }

        boolean flag = true;
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}