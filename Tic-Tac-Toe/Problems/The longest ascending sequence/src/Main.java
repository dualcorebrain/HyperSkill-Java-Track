/*
Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Example

The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.

Sample Input 1:

10
1 2 4 1 2 3 5 7 4 3
Sample Output 1:

5
 */

/*
CREDIT - Github Username = Shurara
We want the longest sequence next to each other.
"1 2 4 5 7" is wrong because the numbers in array are not adjacent
"1 2 3 5 7" is correct because these elements are next to each other

 */
import java.util.*;
class Main {

    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int userArrayLength = scanner.nextInt();       //Array's length
        int[] numArray = new int[userArrayLength];  //Array


        int counter = 1;                    //2 counters are created
        int temporaryCounter = 1;

        for(int i = 0; i<userArrayLength; i++){
            numArray[i] = scanner.nextInt();
        }

        for(int j = 1; j<numArray.length; j++){
            if(numArray[j] > numArray[j-1]){
                temporaryCounter++;
                if(temporaryCounter > counter){
                    counter = temporaryCounter;
                }
            }else{
                temporaryCounter = 1;
            }
        }

        System.out.println(counter);
    }
}