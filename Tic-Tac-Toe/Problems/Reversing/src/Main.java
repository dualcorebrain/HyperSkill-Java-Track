/*
Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.

Sample Input 1:

320
Sample Output 1:

23
Sample Input 2:

976
Sample Output 2:

679


Solution- https://stackoverflow.com/questions/39949715/extracting-each-digit-in-an-int

The problem is the same as 'sum of digits' problem.

The "hint" is actually a nearly direct explanation of how to do what you need to do: dividing in integers by ten gets rid of the last digit, while obtaining modulo ten gives you the last digit:

int x = 12345;
int lastDigit = x % 10;       // This is 5
int remainingNumber = x / 10; // This is 1234

 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int userNum = scanner.nextInt();

        int lastDigit = userNum % 10;
        //System.out.println(lastDigit);
        userNum = userNum/10;

        int secondDigit = userNum % 10;
        //System.out.println(secondDigit);
        userNum = userNum/10;

        int firstDigit = userNum % 10;
        //System.out.println(firstDigit);
        userNum = userNum/10;

        if(lastDigit == 0){
            System.out.print(secondDigit);
            System.out.print(firstDigit);
        }else{
            System.out.print(lastDigit);
            System.out.print(secondDigit);
            System.out.print(firstDigit);
        }



    }
}