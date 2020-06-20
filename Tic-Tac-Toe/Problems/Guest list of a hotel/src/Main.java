/* HARD
You have a guest list of the people who registered their stay at the hotel. There are 4 rooms in the hotel: 1 single room, 2 double rooms and 1 family room for three guests. The guest list consists of 4 lines. Each line contains the name or the names of the guests registered together in one room.

Read the names of the registered guests from the list and output each name in a separate line and in reverse order starting with the last registered guest. Note that the order of the guests registered in each room is undefined.

Sample Input 1:

Jane Kate
John
Mary Susan Paul
Boris Ann
Sample Output 1:

Ann
Boris
Paul
Susan
Mary
John
Kate
Jane
*/


//put imports you need here
import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scannerobj = new Scanner(System.in);

        String name1 = scannerobj.next();
        String name2 = scannerobj.next();
        String name3 = scannerobj.next();
        String name4 = scannerobj.next();
        String name5 = scannerobj.next();
        String name6 = scannerobj.next();
        String name7 = scannerobj.next();
        String name8 = scannerobj.next();

        System.out.println(name8);
        System.out.println(name7);
        System.out.println(name6);
        System.out.println(name5);
        System.out.println(name4);
        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name1);



    }
}