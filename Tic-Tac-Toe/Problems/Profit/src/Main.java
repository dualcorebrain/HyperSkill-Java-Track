/*
Ann put MM money in the bank. The bank increases Ann's deposit by PP percent every year. Ann wants to know how many years should pass until her deposit in the bank reaches KK money. Can you help her to answer this question?

The input contains three integers M, P, KM,P,K. It is guaranteed that all numbers are positive and K \geq MK≥M.
Output the answer to Ann's question.

Sample Input 1:

1 100 8
Sample Output 1:

3
Sample Input 2:

100 15 120
Sample Output 2:

2
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextInt();  //money in bank
        double P = scanner.nextInt();  //Percent increase per year
        double K = scanner.nextInt();  //final amount of money that money in bank needs to reach

        double percentageIncrease = 1 + P/100;
        double moneyNextYear = 0;
        int yearCounter = 0;



        while(moneyNextYear <= K){
            if(M >= K){
                break;
            }
            yearCounter++;
            moneyNextYear = M * Math.pow(percentageIncrease, yearCounter);
            if(moneyNextYear >= K){
                break;
            }
        }

        System.out.println(yearCounter);
    }
}