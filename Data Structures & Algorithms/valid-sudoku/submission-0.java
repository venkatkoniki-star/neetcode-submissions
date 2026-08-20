class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        int n = board.length;
        // for row checking
        for(char[] row :board){
            for(char ele : row){
                if(ele == '.') continue;
                if(set.contains(ele)) return false;
                set.add(ele);
            }
            set.clear();
        }
        // for column
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                char ch = board[j][i];
                if(ch == '.') continue;
                if(set.contains(ch)) return false;
                set.add(ch);
            }
            set.clear();
        }
        // for 3x3 boxes
for (int rowStart = 0; rowStart < n; rowStart += 3) {
    for (int colStart = 0; colStart < n; colStart += 3) {

        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {

                char ch = board[i][j];

                if (ch == '.') continue;
                if (set.contains(ch)) return false;

                set.add(ch);
            }
        }

        set.clear();
    }
}

return true;
    }
}
