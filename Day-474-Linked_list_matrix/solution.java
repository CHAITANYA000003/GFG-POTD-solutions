class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        int n = arr.length;
        Node[][] nodes = new Node[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                nodes[i][j] = new Node(arr[i][j]);
            }
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i<(n-1) && j<(n-1)) {
                    nodes[i][j].right = nodes[i][j+1];
                    nodes[i][j].down = nodes[i+1][j];
                }
                else if(i<(n-1)) {
                    nodes[i][j].right = null;
                    nodes[i][j].down = nodes[i+1][j];
                }
                else if(j<(n-1)){
                    nodes[i][j].down = null;
                    nodes[i][j].right = nodes[i][j+1];
                }
                else {
                    nodes[i][j].right = null;
                    nodes[i][j].down = null;
                }
            }
        }
        
        return nodes[0][0];
    }
}