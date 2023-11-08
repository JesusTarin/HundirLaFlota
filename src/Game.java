public class Game {
    public static void Play(){
        String[][] board = new String[11][11];

        while (playing()) {
            Boards.generateBoard(board);
            Boards.showBoard(board);
            Ships.ships(board);

        }
    }

    public static boolean playing(){
        boolean playing = true;
        return true;
    }
}
