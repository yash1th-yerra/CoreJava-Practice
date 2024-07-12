// Java program to demonstrate the working 
// of PatternSyntaxException class methods 

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
import java.util.regex.PatternSyntaxException; 

public class RegexException { 
	private static String REGEX = "?[^a-zA-Z0-9]"; 
	private static String MSG 
		= "Learn/ java? in GeeksforGeeks!!"; 
	private static String REPLACE = " "; 

	public static void main(String[] args) 
	{ 

		try { 
			// Get Pattern class object to compile the 
			// regular expression. 
			Pattern pattern = Pattern.compile(REGEX); 

			// Get a matcher object 
			Matcher matcher = pattern.matcher(MSG); 

			// Using matcher object, replace the string 
			MSG = matcher.replaceAll(REPLACE); 

			// catch block to handle PatternSyntaxException. 
		} 
		catch (PatternSyntaxException pse) { 
			System.out.println("PatternSyntaxException: "); 
			System.out.println("Description: "
							+ pse.getDescription()); 
			System.out.println("Index: " + pse.getIndex()); 
			System.out.println("Message: "
							+ pse.getMessage()); 
			System.out.println("Pattern: "
							+ pse.getPattern()); 
			System.exit(0); 
		} 

		System.out.println("Output: " + MSG); 
	} 
}
