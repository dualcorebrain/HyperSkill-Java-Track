/*
Read an integer number N from the input and print all the squares of natural numbers:

less than or equal to N,
in ascending order.
Sample Input 1:

50
Sample Output 1:

1
4
9
16
25
36
49
Sample Input 2:

1
Sample Output 2:

1
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        int counter = 1;
        int squared = 0;


        while (squared <= userNum){
            squared = counter * counter;
            if(squared <= userNum){
                System.out.println(squared);
            }else{
                break;
            }
            counter++;
        }


    }
}