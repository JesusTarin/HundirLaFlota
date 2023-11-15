public class Ships {
    public static void ships(String[][] board, String[][] boardShots){
        int[] ships = {4,3,3,2,2,1};
        for (int ship : ships) {
            int[] position = Inputs.askPosition();
            int p1 = position[1];
            int p2 = position[0];
            int[] dir = Inputs.askDirection();
            while (!shipFits(board, ship, dir, p1, p2)) {
                System.out.println("Ship does not fit here...");
                position = Inputs.askPosition();
                p1 = position[1];
                p2 = position[0];
                dir = Inputs.askDirection();
            }
            placeShip(board, ship, dir, p1, p2);
            Boards.showBoard(board, boardShots);
        }
    }

    public static boolean shipFits(String[][] board, int shipLength, int[] direction, int p1, int p2) {
        if (!board[p1][p2].equals("~")) {
            return false;
        }
        int fits = 1;
        if (shipLength==1){
            return true;
        }
        p1 += direction[0];
        p2 += direction[1];
        while (fits < shipLength) {
            if (p1 < 1 || p2 < 1 || p1>board[1].length-1 || p2>board.length-1) {
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
        return true;
    }

    public static void placeShip(String[][] board, int shipLength, int[] direction, int p1, int p2){
        for (int i = 0; i < shipLength; i++) {
            board[p1][p2] = "S";
            p1 += direction[0];
            p2 += direction[1];
        }
    }

    //------------------------------------------------------------------------------------------------
    //PC ships
    //------------------------------------------------------------------------------------------------

    public static void shipsPC(String[][] boardPC){
        int[] ships = {4,3,3,2,2,1};
        for (int ship : ships) {
            int p1 = Inputs.randomPosition();
            int p2 = Inputs.randomPosition();
            int[] dir = Inputs.randomDirection();
            while (!shipFitsPC(boardPC, ship, dir, p1, p2)) {
                p1 = Inputs.randomPosition();
                p2 = Inputs.randomPosition();
                dir = Inputs.randomDirection();
            }
            placeShipPC(boardPC, ship, dir, p1, p2);
        }
    }

    public static boolean shipFitsPC(String[][] boardPC, int shipLength, int[] direction, int p1, int p2) {
        if (!boardPC[p1][p2].equals("~")) {
            return false;
        }
        int fits = 1;
        if (shipLength==1){
            return true;
        }
        p1 += direction[0];
        p2 += direction[1];
        while (fits < shipLength) {
            if (p1 < 1 || p2 < 1 || p1>boardPC[1].length-1 || p2>boardPC.length-1) {
                return false;
            }
            if (boardPC[p1][p2].equals("~")) {
                fits++;
                p1 += direction[0];
                p2 += direction[1];
            } else {
                return false;
            }
        }
        return true;
    }

    public static void placeShipPC(String[][] boardPC, int shipLength, int[] direction, int p1, int p2){
        for (int i = 0; i < shipLength; i++) {
            boardPC[p1][p2] = "S";
            p1 += direction[0];
            p2 += direction[1];
        }
    }
}
