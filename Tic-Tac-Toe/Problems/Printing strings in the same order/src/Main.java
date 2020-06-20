/*
Write a program that reads four words and outputs them in the same order, each in a new line.

Sample Input 1:

Hello
Java
Future programmer
Sample Output 1:

Hello
Java
Future
programmer
* */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        // put your code here
        Scanner scannerObject = new Scanner(System.in);

        String firstWord = scannerObject.next();
        String secondWord = scannerObject.next();
        String thirdWord = scannerObject.next();
        String fourthWord = scannerObject.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(fourthWord);



    }
}