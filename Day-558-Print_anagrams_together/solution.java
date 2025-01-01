class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        // Arrays.sort(arr);
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (String s : arr) {
            char[] ch_arr = s.toCharArray();
            Arrays.sort(ch_arr);
            String key = new String(ch_arr);
            if (hm.containsKey(key)) {
                hm.get(key).add(s);
            } else {
                hm.put(key, new ArrayList<>());
                hm.get(key).add(s);
            }
        }

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for (ArrayList<String> al : hm.values()) {
            // Collections.sort(al);
            ans.add(al);
        }

        return ans;
    }
}