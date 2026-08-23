// this is bfs solution 

class Solution {
    private static final int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public int numIslands(char[][] grid) {
        int rows = grid.length, cols = grid[0].length ;
        int islands = 0;
    
        for(int row = 0; row < rows ; row++){
            for(int col = 0; col < cols;col++){
                if(grid[row][col] == '1'){
                    bfs(grid,row,col);
                    islands++;
                }
            }
        }

        return islands;
    }

    public void bfs(char[][] grid, int row, int col){
        Queue<int[]> q = new LinkedList<>();
        grid[row][col] = '0';
        q.add(new int [] {row,col});

        while(!q.isEmpty()){
            int [] node = q.poll();
            int r = node[0], c = node[1];

            for(int [] dir : directions){
                int nr = r + dir[0], nc = c + dir[1];
                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == '1'){
                    q.add(new int[] {nr,nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}
