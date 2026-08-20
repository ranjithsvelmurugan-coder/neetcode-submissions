class Solution {
    public static int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public int numIslands(char[][] grid) {
        int row = grid.length, col = grid[0].length;
        int islands = 0; 
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col ; j++){
                if(grid[i][j] == '1'){
                    islands++ ;
                    dfs(grid,i,j);
                }
            }
        }
        return islands;
    }
    public void dfs(char[][] grid, int i , int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return ;
        grid[i][j] = '0';
        for(int [] dir : directions){
            dfs(grid,i+dir[0],j+dir[1]);
        }
    }
}
