import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int T = Integer.parseInt(scanner.nextLine());
        while (scanner.hasNextLine()) {
            list.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int n : list) {
            System.out.println(isPrime(n));
        }

    }

    public static String isPrime(int n) {
        if (n <= 1) {
            return "Not prime";
        }
        if (n == 2) {
            return "Prime";
        }
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }

}
