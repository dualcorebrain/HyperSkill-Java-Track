package tictactoe;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String UserInput = scannerobj.nextLine();

        System.out.println("---------");
        System.out.println("| " + UserInput.charAt(0) + " " + UserInput.charAt(1) + " " + UserInput.charAt(2) + " |" );
        System.out.println("| " + UserInput.charAt(3) + " " + UserInput.charAt(4) + " " + UserInput.charAt(5) + " |" );
        System.out.println("| " + UserInput.charAt(6) + " " + UserInput.charAt(7) + " " + UserInput.charAt(8) + " |" );
        System.out.println("---------\n");


    }
}
