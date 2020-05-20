import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);

        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();

        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();

        scanner.close();

        int daysLate = actualDay - expectedDay;
        int monthsLate = actualMonth - expectedMonth;
        int yearsLate = actualYear - expectedYear;

        if (yearsLate > 0) {
            System.out.println("10000");
        } else if (monthsLate > 0 && yearsLate == 0) {
            System.out.println(monthsLate * 500);
        } else if (daysLate > 0 && yearsLate == 0) {
            System.out.println(daysLate * 15);
        } else {
            System.out.println("0");
        }
    }
}