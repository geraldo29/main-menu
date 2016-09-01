import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 * A class that can format string given a certain pattern.
 * 
 */
public class FormatStrings {
	
	Scanner in = new Scanner(System.in);
	String input1, results, pattern1;
	int counter=0;
	int i=0;
	boolean redo = false;
	
	/**
	 * Formats any given string to the an X and - pattern. 
	 * @return the formated string
	 * 
	 */

	public void formatString(){
		System.out.println("Enter input to format");
		String input = in.nextLine();
		input1 = input;
		int sizeinput = input1.length();

		do {
		System.out.println("Enter a patter you want containing only \"x\" and \"-\" ");
		String pattern = in.nextLine();
		
		
		char[] formatString = pattern.toCharArray(); 
		
		int sizeformat = pattern.length();
		
		for (i = 0; i < sizeformat; i++)
			if (formatString[i] == 'x' && counter < sizeinput)
				formatString[i] = input1.charAt(counter++); 
			else if (i>= sizeinput)
				formatString[i] =' ';
		
		System.out.println(formatString);
		
		System.out.println("Would you like a new pattern for the same String? Enter 'yes'. If not enter anything to go back to String Menu ");
		i =0; 
		counter=0;
		String repeat = in.nextLine();
		if (repeat.equals("yes"))
		{	redo = true; }
		else 
		{	
			redo = false; }
		}
		while (redo == true);	
		
		
		
		
	}
	
}
