// this is dfs solution 
class Solution {

    public static int [][] directions = {{1,0},{-1,0},
                                        {0,1},{0,-1}};

    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length, cols = grid[0].length ;
        int maxArea = 0;
        for(int row = 0; row < rows ; row++){
            for(int col = 0; col < cols; col++){
                if(grid[row][col] == 1){
                    maxArea = Math.max(maxArea,dfs(grid,row,col));
                }
            }
        }
        return maxArea ;
    }
    public int dfs(int[][] grid , int row, int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0)
            return 0 ;
        grid[row][col] = 0;
        int area = 1; 

        for(int [] dir : directions){
            area += dfs(grid, row+dir[0], col+dir[1]);
        }
        return area;
    }
}
