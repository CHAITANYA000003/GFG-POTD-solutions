class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        ArrayList<int[]> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new int[] { start[i], end[i] });
        }

        // sorting based on the end times
        Collections.sort(al, (x, y) -> (x[1] - y[1]));

        int ans = 1;
        int curr_end = al.get(0)[1];
        for (int i = 1; i < n; i++) {
            if (al.get(i)[0] > curr_end) {
                curr_end = al.get(i)[1];
                ans++;
            }
        }

        return ans;
    }
}