import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> firstNames = new ArrayList<>();
        String regex = ".+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);

        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            String email = scanner.next();
            Matcher m = p.matcher(email);

            if (m.find()) {
                firstNames.add(name);
            }
        }

        scanner.close();

        Collections.sort(firstNames);

        for (String name : firstNames) {
            System.out.println(name);
        }
    }
}
