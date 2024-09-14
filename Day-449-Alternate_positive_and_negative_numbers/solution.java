class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (Integer x : arr) {
            if (x >= 0) {
                pos.add(x);
            } else {
                neg.add(x);
            }
        }

        int n = arr.size();
        int ind = 0;
        int pos_ind = 0;
        int pos_count = pos.size();
        int neg_ind = 0;
        int neg_count = neg.size();
        while (pos_ind < pos_count && neg_ind < neg_count) {
            if ((ind & 1) == 0) {
                arr.set(ind, pos.get(pos_ind));
                ind++;
                pos_ind++;
            } else {
                arr.set(ind, neg.get(neg_ind));
                ind++;
                neg_ind++;
            }
        }

        while (pos_ind < pos_count) {
            arr.set(ind, pos.get(pos_ind));
            ind++;
            pos_ind++;
        }
        while (neg_ind < neg_count) {
            arr.set(ind, neg.get(neg_ind));
            ind++;
            neg_ind++;
        }
    }
}