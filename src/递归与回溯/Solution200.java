package 递归与回溯;

/**
 * creat by zhaochen on 2018/6/11 15:10
 */
public class Solution200 {
    private int d[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private int m, n;
    private boolean[][] visited;
    public int numIslands(char[][] grid) {
        if (grid.length == 0){
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        int res = 0;
        for (int i = 0; i< m; i++){
            for (int j = 0; j < n; j++){
            if (!visited[i][j] && grid[i][j] == '1'){
                res++;
                dfs(grid,i,j);
            }
            }
        }
            return res;
    }
    private boolean inArea( int x , int y ){
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public void dfs(char[][]grid,int startx,int starty){
            visited[startx][starty] = true;
            for (int i = 0; i < 4; i++){
                int newx = startx + d[i][0];
                int newy = starty + d[i][1];
                if (inArea(newx,newy) && grid[newx][newy] == '1' && !visited[newx][newy]){
                    dfs(grid,newx,newy);
                }
            }
            return;
    }
}
