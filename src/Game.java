import java.util.Scanner;

public class Game {
    public static void Play(){
        String[][] board = new String[11][11];
        String[][] boardPC = new String[11][11];
        String[][] boardShots = new String[11][11];
        int HP = 15, PCHP = 15;

        do {
            //Introduction
            introduction();
            //Generate boards
            Boards.generateBoard(board);
            Boards.generateBoardShoots(boardShots);
            Boards.generateBoardPC(boardPC);
            //Place PC ships
            Ships.shipsPC(boardPC);
            //Ask cheats to show enemy ships
            cheats(boardShots, boardPC);
            Boards.showBoard(board, boardShots);
            //Place user ships
            Ships.ships(board, boardShots);
            //Show boards
            Boards.showBoard(board, boardShots);
            //Shots
            do {
                PCHP -= Shots.playerShot(board, boardPC, boardShots);
                if (PCHP>0){
                    HP -= Shots.PCShot(board, boardShots);
                }
            } while (HP>0 && PCHP>0);
            //Winner
            System.out.println("------------\n"+winner(HP, PCHP)+" wins!\n------------");
        } while (playing());
    }

    public static boolean playing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play again? (y/n)");
        return sc.next().toLowerCase().charAt(0) != 'n';
    }

    public static void cheats(String[][] boardShots, String[][] boardPC){
        Scanner sc = new Scanner(System.in);
        String askCheats;
        do {
            System.out.println("Do you want to see the PC board? (y/n)");
            if (sc.hasNextLine()){
                askCheats = sc.nextLine();
                if (askCheats.toLowerCase().charAt(0)=='n'){
                    System.out.println("Now playing with no cheats.");
                    return;
                } else if (askCheats.toLowerCase().charAt(0)=='y'){
                    for (int i = 1; i < boardPC.length; i++) {
                        for (int j = 1; j < boardPC[i].length; j++) {
                            boardShots[i][j] = boardPC[i][j];
                        }
                    }
                    return;
                }
                System.out.println("Incorrect input, try again.");
            }
        } while (true);
    }

    public static String winner(int HP, int PCHP){
        if (HP<=0){
            return "The PC";
        }
        if (PCHP<=0){
            return "Player";
        }
        return "The PC";
    }

    public static void introduction(){
        System.out.println("\n\n\n\n" +
                "\t\t____    ___    ____  _______  __        ______   ______   .___  ___.  _______    .___________. ______      .______        ___   .___________.___________.__       _______     _______. __    __   __  .______   \n" +
                "\t\t\\   \\  /   \\  /   / |   ____||  |      /      | /  __  \\  |   \\/   | |   ____|   |           |/  __  \\     |   _  \\      /   \\  |           |           |  |     |   ____|   /       ||  |  |  | |  | |   _  \\  \n" +
                "\t\t \\   \\/     \\/   /  |  |__   |  |     |  ,----'|  |  |  | |  \\  /  | |  |__      `---|  |----|  |  |  |    |  |_)  |    /  ^  \\ `---|  |----`---|  |----|  |     |  |__     |   (----`|  |__|  | |  | |  |_)  | \n" +
                "\t\t  \\      _      /   |   __|  |  |     |  |     |  |  |  | |  |\\/|  | |   __|         |  |    |  |  |  |    |   _  <    /  /_\\  \\    |  |        |  |    |  |     |   __|     \\   \\    |   __   | |  | |   ___/  \n" +
                "\t\t   \\    / \\    /    |  |____ |  `----.|  `----.|  `--'  | |  |  |  | |  |____        |  |    |  `--'  |    |  |_)  |  /  _____  \\   |  |        |  |    |  `----.|  |____.----)   |   |  |  |  | |  | |  |      \n" +
                "\t\t    \\__/   \\__/     |_______||_______| \\______| \\______/  |__|  |__| |_______|       |__|     \\______/     |______/  /__/     \\__\\  |__|        |__|    |_______||_______|_______/    |__|  |__| |__| | _|      ");
                System.out.println("\n\n\n\n");
    }

}
