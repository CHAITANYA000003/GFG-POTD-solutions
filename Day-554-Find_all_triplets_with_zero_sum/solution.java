class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        int n = arr.length;
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i])) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                hm.put(arr[i], temp);
            } else {
                ArrayList<Integer> temp = hm.get(arr[i]);
                temp.add(i);
                hm.put(arr[i], temp);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int neg = -1 * (arr[i] + arr[j]);
                if (hm.containsKey(neg)) {
                    for (Integer k : hm.get(neg)) {
                        if (k > j) {
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(i);
                            temp.add(j);
                            temp.add(k);
                            ans.add(temp);
                        }
                    }
                }
            }
        }

        return ans;
    }
}