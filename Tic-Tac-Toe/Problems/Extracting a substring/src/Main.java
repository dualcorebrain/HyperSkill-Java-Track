/*
Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.

Sample Input 1:

Java
0 2
Sample Output 1:

Jav
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String userStr = scanner.nextLine();
        int numFrom = scanner.nextInt();
        int numTo = scanner.nextInt();

        String subString = userStr.substring(numFrom, numTo + 1);
        System.out.println(subString);
    }
}