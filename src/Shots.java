public class Shots {
        public static int playerShot(String[][] board, String[][] boardPC, String[][] boardShots){
        System.out.println("»»» Select the position to shoot: «««");
        int[] position = Inputs.askPosition();
        int p1 = position[1];
        int p2 = position[0];
        if (boardPC[p1][p2].equals("S")){
            boardShots[p1][p2] = "X";
            System.out.println("»»» THAT'S A HIT, CAPTAIN «««");
            Boards.showBoard(board, boardShots);
            return 1;
        } else {
            boardShots[p1][p2] = "o";
            System.out.println("»»» We missed, try again. «««");
            Boards.showBoard(board, boardShots);
        }
        return 0;
    }

    public static int PCShot(String[][] board, String[][] boardShots) {
        int p1 = Inputs.randomPosition();
        int p2 = Inputs.randomPosition();
        if (board[p1][p2].equals("S")) {
            board[p1][p2] = "X";
            Boards.showBoard(board, boardShots);
            return 1;
        } else {
            board[p1][p2] = "o";
            Boards.showBoard(board, boardShots);
        }
        return 0;
    }


}
