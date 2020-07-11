package tictactoe;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String UserInput = scannerobj.nextLine();

        char[] UserInputArray = UserInput.toCharArray();

        System.out.println("---------");

        System.out.println("| " + UserInputArray[0] + " " +  UserInputArray[1] + " " + UserInputArray[2] + " |");
        System.out.println("| " + UserInputArray[3] + " " +  UserInputArray[4] + " " + UserInputArray[5]  + " |");
        System.out.println("| " + UserInputArray[6] + " " +  UserInputArray[7] + " " + UserInputArray[8]  + " |");

        System.out.println("---------\n");


    }
}
