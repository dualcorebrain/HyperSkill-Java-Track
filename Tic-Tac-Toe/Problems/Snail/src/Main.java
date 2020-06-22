/*
[HARD]
Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down. In which day the snail will reach the top of the pole?

Input data format

On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.

Sample Input 1:

10
3
2
Sample Output 1:

8
Sample Input 2:

20
7
3
Sample Output 2:

5

REAL SOLUTION WITHOUT USING 'WHILE' LOOP OR 'IF' STATEMENT

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();

        int result = (height - night - 1) / (day - night) + 1;

        System.out.println(result);
    }
}
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scannerObj = new Scanner(System.in);

        int heightH = scannerObj.nextInt();
        int dayGoesUpA = scannerObj.nextInt();
        int nightGoesDownB = scannerObj.nextInt();

        int heightAtTheEndOfTheDay = dayGoesUpA - nightGoesDownB;

        int totalClimbed = 0;

        int daysCounter = 0;
        while(totalClimbed <= heightH){
            if((totalClimbed + dayGoesUpA) >= heightH){
                daysCounter++;
                break;
            }

            totalClimbed = totalClimbed + heightAtTheEndOfTheDay;
            daysCounter++;
        }

        System.out.println(daysCounter);

    }
}