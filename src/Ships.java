public class Ships {
    public static void ships(String[][] board){
        int[] ships = {4,3,3,2,2,1};
        for (int i = 0; i < ships.length; i++) {
            int[] position = Inputs.askPosition();
            int p1 = position[1];
            int p2 = position[0];
            int[] dir = Inputs.askDirection();
            for (int j = 0; j < ships[i]; j++) {
                while (!shipFits(board,ships[i],dir,p1,p2)) {
                    System.out.println("Ship does not fit here...");
                    position = Inputs.askPosition();
                    p1 = position[1];
                    p2 = position[0];
                    dir = Inputs.askDirection();
                }
                placeShip(board, ships[i], dir, p1, p2);
                Boards.showBoard(board);
            }
        }
    }

    public static boolean shipFits(String[][] board, int shipLength, int[] direction, int p1, int p2) {
        int fits = 0;
        if (board[p1][p2].equals("~")) {
            fits++;
            p1 += direction[0];
            p2 += direction[1];
            while (fits < shipLength) {
                if (p1 < 1 || p2 < 1) {
                    return false;
                }
                if (board[p1][p2].equals("~")) {
                    fits++;
                    p1 += direction[0];
                    p2 += direction[1];
                } else {
                    return false;
                }

            }
        }
        return true;
    }

    public static void placeShip(String[][] board, int shipLength, int[] direction, int p1, int p2){
        for (int i = 0; i < shipLength; i++) {
            board[p1][p2] = "B";
            p1 += direction[0];
            p2 += direction[1];
        }
    }
}
