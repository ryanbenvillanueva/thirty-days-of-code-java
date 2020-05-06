// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;
// import java.util.Arrays; 
// import java.util.Collections; 

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        String binary = Integer.toBinaryString(n);
        
        String[] array = binary.split("0");
        int[] ones = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            ones[i] = array[i].length();

        }

        int max = ones[0];
        for (int i = 1; i < ones.length; i++) {
            if(ones[i] > max) {
                max = ones[i];
            }
        }

        System.out.println(max);

    }
}