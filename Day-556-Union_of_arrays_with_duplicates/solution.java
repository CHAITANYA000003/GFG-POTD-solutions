class Solution {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (Integer x : a) {
            hs.add(x);
        }
        for (Integer y : b) {
            hs.add(y);
        }

        return hs.size();
    }
}