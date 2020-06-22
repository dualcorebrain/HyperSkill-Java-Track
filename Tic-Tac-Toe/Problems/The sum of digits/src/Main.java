/*
Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.

Sample Input 1:

476
Sample Output 1:

17

Solution = https://stackoverflow.com/questions/39949715/extracting-each-digit-in-an-int

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
        int userNumber = scanner.nextInt();

        int lastDigit = userNumber % 10; //gets last digit
        userNumber = userNumber /10;    //remove last digit
        //System.out.println(lastDigit);

        int secondDigit = userNumber % 10;
        userNumber = userNumber /10;
        //System.out.println(secondDigit);

        int firstDigit = userNumber % 10;
        userNumber = userNumber /10;
        //System.out.println(firstDigit);


        int sum = lastDigit + secondDigit + firstDigit;
        System.out.println(sum);
    }
}