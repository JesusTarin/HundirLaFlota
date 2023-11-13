public class Shoots {

    public static void shoot(String[][] board, String[][] boardPC){
        int HP = 15, PCHP = 15;
        while (HP>0 && PCHP>0){
            System.out.println("Select the position to shoot:");
            int[] position = Inputs.askPosition();
            int p1 = position[1];
            int p2 = position[0];
            if (boardPC[p1][p2].equals("S")){
                --PCHP;
            }
            board[p1][p2] = "X";
            int[] positionPC = Inputs.askPosition();
            int p1PC = positionPC[1];
            int p2PC = positionPC[0];
            if (board[p1][p2].equals("S")){
                --HP;
            }
            board[p1][p2] = "X";
        }
    }

    public static String winner(int HP, int PCHP, String name){
        //no acabado
        if (HP<=0){
            return "the PC";
        }
        if (PCHP<=0){
            return name;
        }
    }
}
