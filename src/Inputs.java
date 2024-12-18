import java.util.Scanner;

public class Inputs {

    public static int[] askPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("»»» Introduce the position to place the ship (ex.: e4, j1, b8): «««");
        String position = sc.next();
        while (position.length()!=2  || (position.charAt(0)<'a' || position.charAt(0)>'j') || (position.charAt(1)<'1' || position.charAt(1)>'9')){
            System.out.println("»»» Introduce a correct position (example: e4): «««");
            position = sc.next();
        }
        return letterToInteger(position);
    }


    public static int[] letterToInteger(String input){
        int[] finalPosition = new int[2];
        if (input.toLowerCase().charAt(0)=='a'){
            finalPosition[0] = 1;
        } else if (input.toLowerCase().charAt(0)=='b'){
            finalPosition[0] = 2;
        } else if (input.toLowerCase().charAt(0)=='c'){
            finalPosition[0] = 3;
        } else if (input.toLowerCase().charAt(0)=='d'){
            finalPosition[0] = 4;
        } else if (input.toLowerCase().charAt(0)=='e'){
            finalPosition[0] = 5;
        } else if (input.toLowerCase().charAt(0)=='f'){
            finalPosition[0] = 6;
        } else if (input.toLowerCase().charAt(0)=='g'){
            finalPosition[0] = 7;
        } else if (input.toLowerCase().charAt(0)=='h'){
            finalPosition[0] = 8;
        } else if (input.toLowerCase().charAt(0)=='i'){
            finalPosition[0] = 9;
        } else if (input.toLowerCase().charAt(0)=='j'){
            finalPosition[0] = 10;
        }
        finalPosition[1] = Integer.parseInt(String.valueOf(input.charAt(1)))+1;
        return finalPosition;
    }

    public static int[] askDirection(){
        Scanner sc = new Scanner(System.in);
        System.out.println("»»» Introduce the direction to place the rest of the ship (right/left/up/down): «««");
        while (!sc.hasNextLine()){
            System.out.println("Introduce a correct direction:");
        }
        String direction = sc.next().charAt(0)+"".toLowerCase();
        while (!direction.equals("r") && !direction.equals("l") && !direction.equals("u") && !direction.equals("d")) {
            System.out.println("»»» Incorrect direction «««");
            direction = sc.next().charAt(0)+"".toLowerCase();
        }
        return directionToInteger(direction);
    }

    public static int[] directionToInteger(String direction){
        int[] finalDirection = {0,0};
        switch (direction) {
            case "r":
                finalDirection[1] = 1;
                break;
            case "l":
                finalDirection[1] = -1;
                break;
            case "u":
                finalDirection[0] = -1;
                break;
            case "d":
                finalDirection[0] = 1;
                break;
        }
        return finalDirection;
    }

    public static int randomPosition(){
        return ((int)(Math.random()*10)+1);
    }

    public static int[] randomDirection(){
        String[] dirs = {"r", "l", "u", "d"};
        return directionToInteger(dirs[(int)(Math.random()*4)]);
    }
}
