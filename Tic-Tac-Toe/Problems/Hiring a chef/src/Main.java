/*
Imagine that you are an HR manager at a restaurant and you need to hire a chef. To do that, you need to collect some preliminary data about the candidates.

You have a special form for the candidates that includes 5 fields: first name, age, stage of education, years of experience, cuisine preference.

Your program should read all the words (or numbers) from the five lines and output "The form for first name is completed. We will contact you if we need a chef that cooks cuisine preference dishes."

Sample Input 1:

Eugene
33
secondary
8
fusion
Sample Output 1:

The form for Eugene is completed. We will contact you if we need a chef that cooks fusion dishes.

* */

//put imports you need here

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scannerObject = new Scanner(System.in);
        String fName = scannerObject.next();
        int age = scannerObject.nextInt();
        scannerObject.next();
        String educationStage = scannerObject.nextLine();
        int experience = scannerObject.nextInt();
        scannerObject.nextLine();
        String cuisinePreference = scannerObject.nextLine();

        System.out.println("The form for " +fName + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}