package 递归与回溯;

/**
 * creat by zhaochen on 2018/6/11 16:14
 */
public class Solution130 {
    private int d[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private int m, n;
    public void solve(char[][] board) {
        if (board.length == 0){
            return;
        }
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m;i++){
            for (int j = 0; j < n;j++){
            boolean isEdge = i == 0 || j == 0 || i == m - 1 || j == n - 1;
            if (board[i][j] == 'O' && isEdge){
                flip(board,i,j);
            }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
        }
    private boolean inArea( int x , int y ){
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public void flip(char[][]board,int startx,int starty){
        board[startx][starty] = '#';
        for (int i = 0; i < 4; i++){
            int newx = startx + d[i][0];
            int newy = starty + d[i][1];
            if (!inArea(newx,newy) || board[newx][newy] == 'X' || board[newx][newy] == '#' ){
                continue;
            }
            flip(board,newx,newy);
            }
            return;

        }

    public static void main(String[] args) {
        char[][] array = {{'O','O','O'},{'X','O','X'},{'O','O','O'}};
        new Solution130().solve(array);
    }

    }

