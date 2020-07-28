/*
Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.

Note: it is possible to write this program more efficiently without any loops.

Sample Input 1:

10 20 10
Sample Output 1:

2
Sample Input 2:

15 25 5
Sample Output 2:

3
 */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int count = 0;
        for(int i = a; i<=b; i++){
            if(i % n == 0){
                count = count + 1;
            }
        }

        System.out.println(count);
    }
}