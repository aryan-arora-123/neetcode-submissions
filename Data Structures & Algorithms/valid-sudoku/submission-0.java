class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (Character.isDigit(board[i][j]) && set.contains(board[i][j])) {
                        return false;
                    }
                set.add(board[i][j]);
            }
        }

        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (Character.isDigit(board[j][i]) && set.contains(board[j][i])) {
                    return false;
                }
                set.add(board[j][i]);
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (Character.isDigit(board[i + row][j + col])
                            && set.contains(board[i + row][j + col])) {
                            return false;
                        }
                        set.add(board[i+row][j+col]);
                    }
                }
            }
        }
        return true;
    }
}
