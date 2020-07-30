/*
Write a program that read an array of ints and an integer number n.

The program must check how many times n occurs in the array.

Input data format

The first line contains the size of the input array.
The second line contains elements of the array separated by spaces.
The third line contains n.

Output data format

The result is only a single non-negative integer number.
Sample Input 1:

6
1 2 3 4 2 1
2
Sample Output 1:

2
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int occurrences = 0;

        int[] array = new int[arraySize];

        for(int i = 0; i<arraySize; i++){
            array[i] = scanner.nextInt();
        }

        int userMatchingNumber = scanner.nextInt();


        for(int digit : array){
            if(digit == userMatchingNumber){
                occurrences++;
            }
        }

        System.out.println(occurrences);

    }
}