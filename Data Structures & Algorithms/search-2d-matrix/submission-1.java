class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for ( int r = 0; r < matrix.length; r++ ) {
            int start = 0, end = matrix[r].length - 1;
            while (start<=end) {
                int mid = start + (end - start) / 2;
                if ( matrix[r][mid] < target ) start = mid + 1;
                else if ( matrix[r][mid] > target ) end = mid - 1;
                else return true;
            }
        }
        return false;        
    }
}
