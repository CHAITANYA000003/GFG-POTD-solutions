class Solution {
    public int[] topoSort(ArrayList<ArrayList<Integer>> adj, int k) {
        int[] indegree = new int[k];
        for (int i = 0; i < k; i++) {
            for (Integer x : adj.get(i)) {
                indegree[x]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int[] topo = new int[k];
        int ind = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            topo[ind++] = node;
            for (Integer x : adj.get(node)) {
                indegree[x]--;
                if (indegree[x] == 0) {
                    q.add(x);
                }
            }
        }

        return topo;
    }

    public String findOrder(String[] dict, int n, int k) {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n - 1; i++) {
            String s1 = dict[i];
            String s2 = dict[i + 1];
            int len = Math.min(s1.length(), s2.length());
            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }

        int[] topo = topoSort(adj, k);
        String ans = "";
        for (int x : topo) {
            ans += (char) (x + 'a');
        }
        // System.out.println(ans);

        return ans;
    }
}