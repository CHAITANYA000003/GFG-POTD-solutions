class Solution {
    // Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        // Your code here
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        boolean[] deadlines = new boolean[n + 1];
        int jobs_done = 0;
        int total_profit = 0;
        for (Job x : arr) {
            for (int i = x.deadline; i > 0; i--) {
                if (!deadlines[i]) {
                    deadlines[i] = true;
                    jobs_done++;
                    total_profit += x.profit;
                    break;
                }
            }
        }

        return new int[] { jobs_done, total_profit };
    }
}