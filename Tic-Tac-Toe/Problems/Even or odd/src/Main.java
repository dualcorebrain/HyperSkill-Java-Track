/*
Given a sequence of natural numbers. For each number of the sequence output "even" if the number is even, otherwise, "odd". If the number is equal to 0, the program must stop reading and processing numbers.

Input data

A sequence of natural numbers, each number in a new line.

Output data

The sequence of words "even" and "odd". Each word in a new line.

Output the result right after the number is entered. Then input the next one. There's no need to store the sequence.

Sample Input 1:

1
2
3
4
0
Sample Output 1:

odd
even
odd
even*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int userNum;

        Boolean isEven = null;
        Boolean isOdd = null;

        while((userNum = scanner.nextInt()) != 0) {
            if (userNum % 2 == 0) {
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}