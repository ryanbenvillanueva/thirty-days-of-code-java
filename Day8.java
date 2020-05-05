import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        Map<String, String> phonebook = new HashMap<>();
        List<String> queries = new ArrayList<>();
        
        while(scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            if (input.contains(" ")) {
                String[] entry = input.split(" ");
                phonebook.put(entry[0], entry[1]);
            } else {
                queries.add(input);
            }
        }
        
        scanner.close();

        for (String q : queries) {
            if (phonebook.containsKey(q)) {
                System.out.println(q + '=' + phonebook.get(q));
            } else {
                System.out.println("Not found");
            }
        }
        
    }
}