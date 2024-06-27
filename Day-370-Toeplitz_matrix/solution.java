class Solution {
    /*You are required to complete this method*/
    boolean isToepliz(int mat[][]) {
        // Get the number of rows and columns in the matrix
        int rows = mat.length;
        int cols = mat[0].length;
        
        // Iterate through each element in the matrix except the last row and last column
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                // Check if the current element is equal to the element in the next row and next column
                if (mat[i][j] != mat[i + 1][j + 1]) {
                    // If any element does not match, the matrix is not a Toeplitz matrix
                    return false;
                }
            }
        }
        
        // If all elements match their diagonal counterparts, the matrix is a Toeplitz matrix
        return true;
    }
}