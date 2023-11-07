import java.util.Arrays;

public class Ships {
    public static void placeShips(String[][] board){
        int[] ships = {4,3,3,2,2,1};
        for (int i = 0; i < ships.length; i++) {
            int[] position = Inputs.askPosition();
            int p1 = position[0];
            int p2 = position[1];
            int[] dir = Inputs.askDirection();
            for (int j = 0; j < ships[i]; j++) {
                if (shipFits(board,ships[i],dir,p1,p2)){
                    board[p1][p2] = "B";
                    p1 += dir[0];
                    p2 += dir[1];
                } else {
                    System.out.println("Ship does not fit here...");
                    position = Inputs.askPosition();
                    p1 = position[0];
                    p2 = position[1];
                    position = Inputs.askPosition();
                    dir = Inputs.askDirection();
                }
                Boards.showBoard(board);
            }
        }
    }

    public static boolean shipFits(String[][] board, int shipLength, int[] direction, int p1, int p2) {
        int fits = 0;
        int[] dir = Inputs.askDirection();
        if (board[p1][p2].equals("~")) {
            fits++;
            p1 += dir[1];
            p2 += dir[0];
            while (fits < shipLength) {
                if (board[p1][p2].equals("~")) {
                    fits++;
                    p1 += dir[1];
                    p2 += dir[0];
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
