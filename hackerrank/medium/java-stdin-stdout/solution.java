import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        // Write your code here.
        Double d= scan.nextDouble();
        //i = 42;
        //d = 3.1415;
        scan.nextLine();
        String s = scan.nextLine();
        //s = "Welcome to HackerRank's Java tutorials!";
       // i = 42;
       // d = 3.1415;
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
