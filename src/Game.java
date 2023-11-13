import java.util.Scanner;

public class Game {
    public static void Play(){
        String[][] board = new String[11][11];
        String[][] boardPC = new String[11][11];

        boolean cheats = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the PC board? (y/n)");
        if (sc.next().toLowerCase().charAt(0)=='n'){
            cheats = false;
        }
        do {
            Boards.generateBoard(board);
            Boards.generateBoardPC(boardPC);
            if (cheats) { Boards.showBoardCheats(board, boardPC); } else { Boards.showBoard(board); }
            Ships.ships(board);
            Ships.shipsPC(boardPC);
            if (cheats) { Boards.showBoardCheats(board, boardPC); } else { Boards.showBoard(board); }
        } while (playing());

    }

    public static boolean playing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play again? (y/n)");
        return sc.next().toLowerCase().charAt(0) != 'n';
    }
}
