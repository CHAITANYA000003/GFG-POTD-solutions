class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Convert the entries of the map to a list
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

        // Sort the list: first by value in descending order, then by key in ascending
        // order
        list.sort((entry1, entry2) -> {
            int valueComparison = entry2.getValue().compareTo(entry1.getValue()); // Descending value
            if (valueComparison != 0) {
                return valueComparison;
            } else {
                return entry1.getKey().compareTo(entry2.getKey()); // Ascending key
            }
        });

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> x : list) {
            // ans.add(x.getKey());
            int count = x.getValue();
            int val = x.getKey();
            while (count-- > 0) {
                ans.add(val);
            }
        }

        return ans;
    }
}