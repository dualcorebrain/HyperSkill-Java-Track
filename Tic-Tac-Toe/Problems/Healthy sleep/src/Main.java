/*
Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep. She decided to follow TV recommendations and keep track of how many hours she spends sleeping.

You are given three numbers: AA, BB and HH. According to TV, one should sleep at least AA hours per day, but no more than BB hours. HH is how many hours Ann sleeps.

Task: If Ann sleeps less then AA hours, print "Deficiency". If she sleeps more than BB hours, print "Excess". If her sleep fits the recommendations, print "Normal".

Input format: three numbers AA, BB, HH, where AA is always less than or equal to BB.

Hint

Sample Input 1:

6
10
8
Sample Output 1:

Normal
Sample Input 2:

7
9
10
Sample Output 2:

Excess
Sample Input 3:

7
9
2
Sample Output 3:

Deficiency
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if(H<A){
            System.out.println("Deficiency");
        }
        else if(H>B){
            System.out.println("Excess");

        }
        else{
            System.out.println("Normal");

        }

    }
}