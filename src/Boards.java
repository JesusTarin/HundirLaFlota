public class Boards {

    //Player board

    public static void generateBoard(String[][] board){
        String[] letters = {"A","B","C","D","E","F","G","H","I","J"};
        board[0][0] = "/";
        for (int i = 1; i < board.length; i++) {
            board[i][0] = i-1+"";
            for (int j = 1; j < board[i].length; j++) {
                board[0][j] = letters[j-1];
                board[i][j] = "~";
            }
        }
    }

    public static void showBoard(String[][] board){
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    //------------------------------------------------------------------------------------------------
    // PC board
    //------------------------------------------------------------------------------------------------

    public static void generateBoardPC(String[][] boardPC){
        String[] letters = {"A","B","C","D","E","F","G","H","I","J"};
        boardPC[0][0] = "/";
        for (int i = 1; i < boardPC.length; i++) {
            boardPC[i][0] = i-1+"";
            for (int j = 1; j < boardPC[i].length; j++) {
                boardPC[0][j] = letters[j-1];
                boardPC[i][j] = "~";
            }
        }
    }

    public static void showBoardPC(String[][] boardPC){
        for (int i = 0; i < boardPC.length; i++) {
            for (int j = 0; j < boardPC[i].length; j++) {
                System.out.print(boardPC[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void showBoardCheats(String[][] board, String[][] boardPC){
        System.out.println("\n\t\t\t  PLAYER BOARD\t\t\t\t\t\t\t\t\t\t\t\t\t\t PC BOARD");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < boardPC[i].length; j++) {
                System.out.print(board[i][j]+"\t");
            }

            System.out.print("\t\t|\t\t\t");
            for (int j = 0; j < boardPC[i].length; j++) {
                System.out.print(boardPC[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
