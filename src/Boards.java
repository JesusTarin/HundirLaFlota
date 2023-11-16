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

    public static void generateBoardShoots(String[][] boardShots){
        String[] letters = {"A","B","C","D","E","F","G","H","I","J"};
        boardShots[0][0] = "/";
        for (int i = 1; i < boardShots.length; i++) {
            boardShots[i][0] = i-1+"";
            for (int j = 1; j < boardShots[i].length; j++) {
                boardShots[0][j] = letters[j-1];
                boardShots[i][j] = "~";
            }
        }
    }

    public static void showBoard(String[][] board, String[][] boardShots){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t +---------------------------------------------------------------------------------------------------------------------------*" +
                "\n\t    /\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/|" +
                "\n\t   /\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   / |" +
                "\n\t  /\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  /  |");
        System.out.println("\t |>-------------------------------------------------------------------------------------------------------------------------<|\t |");
        System.out.println("\t/|\\\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/|\\\t |");
        System.out.println("\t\\|/\t\t\t\t\t\t\tYOUR SHIPS\t\t\t\t\t\t\t\t\t\t\t\t\t\tYOUR SHOTS\t\t\t\t\t\t\\|/\t |");
        for (int i = 0; i < board.length; i++) {
            if (i%2==1){
                System.out.print("\t\\|/\t\t\t");
            } else {
                System.out.print("\t/|\\\t\t\t");
            }
            //----------

            for (int j = 0; j < boardShots[i].length; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.print("\t\t|\t\t\t");
            for (int j = 0; j < boardShots[i].length; j++) {
                System.out.print(boardShots[i][j]+"\t");
            }
            //----------
            if (i+1!=board.length){
                if (i%2==1){
                    System.out.print("\t\\|/\t |");
                } else {
                    System.out.print("\t/|\\\t |");
                }
            } else {
                System.out.print("\t\\|/\t/");
            }

            System.out.println();
        }
        System.out.println("\t\\|/\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\\|/");
        System.out.println("\t/|>-------------------------------------------------------------------------------------------------------------------------<|\n\n\n\n\n\n\n");
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
}
