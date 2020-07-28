/*
Find the sum of all elements of a sequence, ending with the number 0.

The number 0 itself is not included into the sequence and serves as a sign of cessation.

Sample Input 1:

3
6
8
0
Sample Output 1:

17
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num = 0;

        do{
            num = scanner.nextInt();
            sum = num + sum;
        }while (num != 0);

        System.out.println(sum);
    }
}