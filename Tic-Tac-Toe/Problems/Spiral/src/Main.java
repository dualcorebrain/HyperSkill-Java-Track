/*Tricky not hard*/

/*
Output the matrix of size n \times nn×n, filled by the integers from 11 to n^2n
2
  in a spiral, coming from the top left corner and twisted clockwise, as shown in the example (here n=5n=5).

 Report a typo
Sample Input 1:

5
Sample Output 1:

1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
 */

/*
Best resources - https://www.educative.io/edpresso/spiral-matrix-algorithm
                - https://www.youtube.com/watch?v=1ZGJzvkcLsA

                NOT THE SECOND ONE IS SLIGHTLY DIFFERENT BUT WATCH IT FOR EXPLANATION HOW TO MOVE AROUND THE MATRIX
 */


import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner  = new Scanner(System.in);

        int userArrayDimension = scanner.nextInt();

        int[][] array= new int[userArrayDimension][userArrayDimension];

        int top = 0;    //top row
        int bottom = userArrayDimension -1; //bottom row

        int left = 0;   //left column
        int right = userArrayDimension -1;  //right column

        int number = 1;     //NUmber to be iterated and stored in each matrix element
        while((top<=bottom) && (left <= right)){    //Top to bottom and left to right
            //However this 'gap' closes overtime thats why we have top++, bottom--, left++, right-- so the spiral goes inwards

            for(int i = left; i<=right; i++){   //Top row left to right
                array[top][i] = number; //Row stays same, column changes
                number++;
            }
            top++;  //Next time this will make it start from the second-top row

            for(int i = top; i<=bottom; i++){    //Top is now in Row 2 due to "top++" previously. This is what prints '6' in the second row, not the first!
                array[i][right] = number;       //Right hand side of the square matrix. Row changes, column is the 'right' most one
                number++;
            }
            right--;    //Now next it will start and end from the second-right column

            for(int i = right; i>=left; i--){   //Notice the 'i--'. We are in the bottom left hand side now, to go leftwards in the bottom row we need the 'i--'
                array[bottom][i] = number;  //bottom row stays the same but column changes
                number++;
            }
            bottom--;   //This will now start the next thing from the second-bottom row

            for(int i = bottom; i>=top; i--){   //Now we are in the first column but need to move up. Bottom-- made us move one up already so we dont re-write cornermost element, just like previous
                array[i][left] = number;    //left-most column stays the same but the row changes
                number++;
            }
            left++; //Now for the next loop we will start from the 'second-left' column.
        }


            //Normal way to print square matrix
        for(int i = 0; i<(userArrayDimension); i++){
            for(int j = 0; j<(userArrayDimension); j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}