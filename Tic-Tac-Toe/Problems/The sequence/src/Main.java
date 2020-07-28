/*Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to). The input to the program is a positive integer n: the number of the elements of the sequence the program should print. Output the sequence of numbers, written in a single line, space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.

Sample Input 1:

7
Sample Output 1:

1 2 2 3 3 3 4

So it means it prints 7 digits of the sequence
*/

import java.util.*;
class Main {
    public static void main(String[] args) {

        // put your code here

        Scanner scanner = new Scanner(System.in);

        int UserNumber = scanner.nextInt(); //Gets user Number
        int counter = 1;        //This counter will be needed later

        /* "(i <= UserNumber)" that less than equal to is the most important part for this question's tests #2 */
        /* Only due to this part I gave up after horus and hours. */
        for (int i = 1; i <= UserNumber ; i++) {
            for (int j = 1; j <= i; j++) {
                if(counter <= UserNumber){
                    System.out.print(i + " ");
                    counter++;
                }
            }

        }
    }
}


