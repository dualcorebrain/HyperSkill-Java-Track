/*
Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).

Otherwise, it should print false.

Sample Input 1:

1 1 1
Sample Output 1:

false
Sample Input 2:

1 0 -1
Sample Output 2:

true
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();

        if((userInput1 > 0) && (userInput2 <= 0) && (userInput3 <= 0)){
            System.out.println("true");
        }
        else if((userInput1 <= 0) && (userInput2 > 0) && (userInput3 <= 0)){
            System.out.println("true");
        }
        else if((userInput1 <= 0) && (userInput2 <= 0) && (userInput3 > 0)){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
    }
}