/*
You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.

Input data format

Four integer numbers x_1, y_1, x_2, y_2x
1
​
 ,y
1
​
 ,x
2
​
 ,y
2
​
 .

Output data format

Type "YES" (uppercase) if they hit each other or "NO" if they don't.

You may need a method that calculates the absolute value of the number, so here it is:

Math.abs(n)
Hint

Queen is the most powerful and valuable attacking piece in the game of chess. It combines the powers of the bishop and the rook. It is able to move any number of unoccupied squares in a straight line: vertically, horizontally or diagonally.


Here's all legal moves of the queen.

Sample Input 1:

1 1 3 3
Sample Output 1:

YES
Sample Input 2:

1 1 4 3
Sample Output 2:

NO
Sample Input 3:

2 2 5 2
Sample Output 3:

YES
 */

import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int horizontal = Math.abs(x2-x1);
        int vertical = Math.abs(y2-y1);

        if(horizontal == 0 || vertical == 0){
            System.out.println("YES");
        }
        else if(horizontal == vertical){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }



}