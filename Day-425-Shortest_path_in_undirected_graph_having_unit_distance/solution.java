class Solution {

    public int[] shortestPath(int[][] edges, int n, int m, int src) {
        // Code here
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList<Integer>());
        }

        for (int[] edge : edges) {
            al.get(edge[0]).add(edge[1]);
            al.get(edge[1]).add(edge[0]);
        }

        int[] ans = new int[n];
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        int distance = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int temp = q.poll();
                if (!visited[temp]) {
                    visited[temp] = true;
                    ans[temp] = distance;
                    for (Integer x : al.get(temp)) {
                        q.add(x);
                    }
                }
            }

            distance++;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans[i] = -1;
            }
        }

        return ans;
    }
}