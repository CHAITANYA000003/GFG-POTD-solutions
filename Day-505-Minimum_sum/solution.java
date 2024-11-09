class Solution {
    String minSum(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for (int i = 0; i < n; i += 2) {
            a1.add(arr[i]);
        }
        for (int i = 1; i < n; i += 2) {
            a2.add(arr[i]);
        }

        // adding the two numbers
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        int i = a1.size() - 1;
        int j = a2.size() - 1;
        while (i >= 0 && j >= 0) {
            int val = a1.get(i) + a2.get(j) + carry;
            carry = val / 10;
            val = val % 10;
            ans.add(val);
            i--;
            j--;
        }
        if (i == 0) {
            int val = a1.get(0) + carry;
            carry = val / 10;
            ans.add(val);
        }
        ans.add(carry);

        // converting the sum to string output
        int k = ans.size() - 1;
        while (k >= 0 && ans.get(k) == 0) {
            k--;
        }
        // String sum = "";
        StringBuilder sum = new StringBuilder("");
        while (k >= 0) {
            sum.append(String.valueOf(ans.get(k)));
            k--;
        }
        if (sum.length() == 0) {
            return "0";
        }

        return sum.toString();
    }
}