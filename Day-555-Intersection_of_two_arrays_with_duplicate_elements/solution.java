class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        if (a.length > b.length) {
            // making that a is the smaller array;
            return intersectionWithDuplicates(b, a);
        }

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (Integer x : a) {
            hs1.add(x);
        }
        for (Integer x : b) {
            hs2.add(x);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer x : hs1) {
            if (hs2.contains(x)) {
                ans.add(x);
            }
        }

        return ans;
    }
}