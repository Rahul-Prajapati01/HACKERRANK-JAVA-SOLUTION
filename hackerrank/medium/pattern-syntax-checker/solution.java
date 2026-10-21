import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
            try {
                // Attempt to compile the pattern to check if it's a valid regex
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // If compiling throws an exception, the syntax is invalid
                System.out.println("Invalid");
            }
            // Decrement the test cases counter to prevent an infinite loop
            testCases--;
		}
	}
}



