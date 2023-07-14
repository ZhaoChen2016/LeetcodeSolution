package 递归与回溯;

/**
 * creat by zhaochen on 2018/6/11 14:25
 */
public class Solution79 {
    private int d[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private int m, n;
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        if (board == null || word == null){
            return false;
        }
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (searchWord(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;

    }
    private boolean inArea( int x , int y ){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
    public boolean searchWord(char[][] board,String word,int index,int startx,int starty){
        if (index == word.length()-1){
            return board[startx][starty]== word.charAt(index);
        }
        if (board[startx][starty] == word.charAt(index)){
            visited[startx][starty] = true;
            for (int i = 0; i < 4; i++){
                int newx = d[i][0] + startx;
                int newy = d[i][1] + starty;
                if (inArea(newx,newy) && !visited[newx][newy]){
                    if (searchWord(board,word,index+1,newx,newy)){
                        return true;
                    }
                }
            }
            visited[startx][starty] = false;
        }
        return false;

    }

}
