class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row =0;
        int cols= m-1;
        while(row<n&&cols>=0){
            if(matrix[row][cols]==target){
                return true;
            }
            else if(matrix[row][cols]<target){
                row++;
            }
            else {
                cols--;
            }
        }
        return false;
    }
}