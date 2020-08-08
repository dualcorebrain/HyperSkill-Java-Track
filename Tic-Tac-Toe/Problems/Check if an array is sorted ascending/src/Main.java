/*
Write a program that reads an array of int's and checks the array is sorted ascending (from smallest to largest number).

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

Only a single value: true or false.
Sample Input 1:

4
1 2 3 4
Sample Output 1:

true
Sample Input 2:

4
1 2 3 0
Sample Output 2:

false
 */

import java.util.*;
class Main {

    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int userArrayLength = scanner.nextInt();
        int[] numArray = new int[userArrayLength];
        int[] finalSequenceArray;
        int counter = 0;

        for(int i = 0; i<userArrayLength; i++){
            numArray[i] = scanner.nextInt();
        }

        for(int j = 0; j<numArray.length; j++){
            for(int k = j + 1; k<numArray.length; k++){
                if(numArray[k] < numArray[j]){
                    counter++;
                    //System.out.println(counter);
                }
            }
        }

        if(counter>0){
            System.out.println("false");
        }
        if(counter == 0){
            System.out.println("true");
        }
    }
}