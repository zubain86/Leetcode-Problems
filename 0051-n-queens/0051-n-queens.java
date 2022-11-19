class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return placeQueens(board,0);
        
    }
static List<List<String>> placeQueens(boolean board[][], int row)
    {
        if(row== board.length)
            return (display(board));
        List<List<String>> outer = new ArrayList<>();
        for (int c = 0; c < board[0].length; c++) {
            if(isSafe(board,row,c)) {
                board[row][c] = true;
                List<List<String>> str = placeQueens(board, row + 1);
                board[row][c] = false;
                outer.addAll(str);
            }
        }
        return outer;
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        for (int i = 0; i < r ; i++) {
            if(board[i][c]==true)
                return false;
        }
        int left = Math.min(r,c);
        for (int i = 1; i <= left; i++) {
            if(board[r-i][c-i]==true)
                return false;
        }
        int right = Math.min(r, board[0].length-c-1);
        for (int i = 1; i <= right; i++) {
            if(board[r-i][c+i]==true)
                return false;

        }
        return true;
    }

    private static List<List<String>> display(boolean[][] board) {
        List<String> list = new ArrayList<>();
        String m = "";
        for (boolean[] row:board) {
            for (int i = 0; i < row.length; i++) {
                if(row[i]==true)
                    m = m+"Q";
                else
                    m = m+".";
            }
            list.add(m);
            m = "";
        }
        List<List<String>> res = new ArrayList<>();
        res.add(list);
        return res;
    }

}