// import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        // int t = Integer.parseInt(scanner.nextLine());
        List<String> strings = new ArrayList<>();

        while (scanner.hasNextLine()) {
            strings.add(scanner.nextLine());
        }

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    even.append(s.charAt(i));
                } else {
                    odd.append(s.charAt(i));
                }
            }
            System.out.println(even.toString() + " " + odd.toString());
            even = new StringBuilder();
            odd = new StringBuilder();
        }

        scanner.close();
    }
}