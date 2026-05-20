class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length , COL = matrix[0].length ;

        int left = 0;
        int right = (ROW*COL) - 1;
        while(left<=right){
            int mid = left + (right-left)/2;
            int l = mid/COL , r = mid%COL ;
            if(matrix[l][r]<target){
                left = mid+1;
            }
            else if(matrix[l][r]>target){
                right = mid-1;
            }
            else{
                return true;
            }
        }
    return false; 
    }
}
