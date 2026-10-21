import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
			boolean matchFound = false;
            // Regex to find content between a matching pair of open and close tags
            Pattern r = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");
            Matcher m = r.matcher(line);
            
            // Find all matching instances within the current line
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            
            // If no valid tag blocks were extracted, print None
            if (!matchFound) {
                System.out.println("None");
            }
			testCases--;
		}
	}
}



