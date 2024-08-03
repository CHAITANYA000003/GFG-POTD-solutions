class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length; // total number of people present at the party
        for (int i = 0; i < n; i++) {
            int knows = 0;
            int known_by = 0;

            // the row sum of the ith person tells us how many they know
            for (int j = 0; j < n; j++) {
                knows += mat[i][j];
            }

            // the column sum tells us by how many the ith person is known
            for (int j = 0; j < n; j++) {
                known_by += mat[j][i];
            }

            if (knows == 0 && known_by == n - 1) {
                return i;
            }
        }

        return -1;
    }
}