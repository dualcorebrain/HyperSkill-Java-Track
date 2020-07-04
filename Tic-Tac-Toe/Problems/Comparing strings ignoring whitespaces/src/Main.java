/*
Write a program that reads two lines and compares them without whitespaces. The program should prints true if both lines are equal, otherwise – false.

Sample Input 1:

  string
str ing
Sample Output 1:

true
Sample Input 2:

string
my string
Sample Output 2:

false
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str1Replaced = str1.replaceAll(" ", "");
        //System.out.println(str1Replaced);

        String str2 = scanner.nextLine();
        String str2Replaced = str2.replaceAll(" ", "");
        //System.out.println(str2Replaced);

        System.out.print(str1Replaced.equals(str2Replaced));


    }
}