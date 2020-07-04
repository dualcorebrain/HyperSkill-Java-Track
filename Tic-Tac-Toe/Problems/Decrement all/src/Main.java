/*Write a program that reads four numbers and decrements each of them.
The program must output the results in the same order separated by spaces.
Sample Input 1:

10 11 -2 -3
Sample Output 1:

9 10 -3 -4*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.print(--num1 + " ");
        System.out.print(--num2 + " ");
        System.out.print(--num3 + " ");
        System.out.print(--num4);



    }
}