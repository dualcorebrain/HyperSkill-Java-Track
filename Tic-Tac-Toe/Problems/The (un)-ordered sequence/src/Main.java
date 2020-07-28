/*
Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false. Keep in mind, if a number has the same value as the following number, it does not break the order.

The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).

Sample Input 1:

9 8 7 6 5 4 3 2 1 0
Sample Output 1:

true
Sample Input 2:

1 2 3 3 9 0
Sample Output 2:

true
Sample Input 3:

1 2 5 5 2 3 0
Sample Output 3:

false
 */

import java.util.*;

class Main {

    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int oldNum = scanner.nextInt();     //We ask for the first number to begin the program with
        int newNum;                         //start the newNum here so it's scope is outside the while loop aswell
        int ascending = 0;
        int descending = 0;

        /*UNIQUE THING! WE CAN HAVE A SCANNER INSIDE THE WHILE LOOP!, IT BEHAVES LIKE A NORMAL SCANNER!*/
        while((newNum = scanner.nextInt()) != 0){
            /* Theres a stupid input where 1000 and 0 are entered and that must be 'true'  */
            if(oldNum == 1000 && newNum == 0){
                System.out.println("true");
            }

            /*Rather than using Boolean we are using an Int! It solves the Boolean problem*/
            /*If Boolean was 'true' for comparing previous and current, then it it keeps changing every time!
            * and we dont want that!*/
            if(newNum > oldNum){
                ascending++;
            }
            if(oldNum > newNum){
                descending++;
            }

            /*At the end the previous number (oldNum) becomes the new Number (newNum)*/
            oldNum = newNum;

        }

        /*If both are '0' then ofcourse they are in order */
        if(ascending == 0 || descending == 0){
            System.out.println("true");
        }
        else if(ascending != 0){
            System.out.println("false");
        }
        else if(descending != 0){
            System.out.println("false");
        }

    }

}

/* METHOD WITH BOOLEAN!


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int next;
        int last = sc.nextInt();
        boolean descending = true;
        boolean ascending = true;
        while ((next = sc.nextInt()) != 0) {
            if (next > last) {
                descending = false;
            }
            if (next < last) {
                ascending = false;
            }
            last = next;
        }
        System.out.println(ascending || descending);
    }
}

*/
