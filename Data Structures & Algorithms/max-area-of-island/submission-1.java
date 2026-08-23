// this is bfs solution

class Solution {
    private static final int [][] directions =  {{0,1},{0,-1},
                                                {1,0},{-1,0}};

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length, cols = grid[0].length ;

        for(int row = 0; row < rows ; row++){
            for(int col = 0; col < cols ; col++ ){
                if(grid[row][col] == 1){
                    maxArea = Math.max(maxArea , bfs(grid,row,col));
                }
            }
        }
        return maxArea ; 
    }

    public int bfs(int[][] grid, int row , int col){
        Queue<int[] > q = new LinkedList<>();
        int area = 1;
        q.add(new int [] {row,col});
        grid[row][col] = 0;

        while(!q.isEmpty()){
            int [] node = q.poll();
            int r = node[0], c = node[1];
            for(int[] dir : directions){
                int nr = r+dir[0] , nc = c+dir[1];
                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == 1 ){
                    q.add(new int [] {nr,nc});
                    area++;
                    grid[nr][nc] = 0;
                }
            }
        }
        return area ;
    } 
}
