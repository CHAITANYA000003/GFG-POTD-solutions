class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        int n = arr.length;
        int i = 0;
        int j = k;
        ans.add(hm.size());
        while (j < n) {
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);
            if (hm.getOrDefault(arr[i], -1) == 1) {
                hm.remove(arr[i]);
            } else {
                hm.put(arr[i], hm.get(arr[i]) - 1);
            }
            ans.add(hm.size());
            i++;
            j++;
        }

        return ans;
    }
}