/*
Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.

The output should be true or false.

Sample Input 1:

5 5 9
Sample Output 1:

false
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();


        if((userInput1 != userInput2) && (userInput1 != userInput3) && (userInput2 != userInput3)){
            System.out.println("true");
        }else{
            System.out.println("false");

        }
    }
}