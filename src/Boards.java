public class Boards {
    public static void generateBoard(String[][] board){
        String[] letters = {"A","B","C","D","E","F","G","H","I","J"};
        board[10][0] = "/";
        for (int i = 0; i < board.length-1; i++) {
            board[i][0] = i+"";
            for (int j = 1; j < board[i].length; j++) {
                board[10][j] = letters[j-1];
                board[i][j] = "~";
            }
        }
    }

    public static void showBoard(String[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
