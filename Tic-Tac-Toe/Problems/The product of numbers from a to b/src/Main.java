/*
Write a program that prints the product of all integer numbers from a to b (a < b).
Include a and exclude b from the product.

Sample Input 1:

1 2
Sample Output 1:

1
Sample Input 2:

100 105
Sample Output 2:

11035502400
 */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextInt();
        long b = scanner.nextInt();

        long multiplication = a;
        for(long i = a ; i<b ; i++){
            if(i == a){

            }else {
                multiplication = multiplication * i;
            }
        }

        System.out.println(multiplication);
    }
}