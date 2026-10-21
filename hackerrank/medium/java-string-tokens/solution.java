import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // Trim leading and trailing whitespace
        s = s.trim();
        
        // Handle the edge case of an empty string
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        // Split the string using any sequence of non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");
        
        // Print the total number of tokens
        System.out.println(tokens.length);
        
        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }
}

