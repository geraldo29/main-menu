import java.util.Scanner;

/**
 * Reverses any given string input by user.
 * 
 */

public class ReverseString {
	Scanner in = new Scanner(System.in);
	String input;
	int length;
	int i;
	String reverse = "";

	/**
	 *Reverses the string. 
	 *@return the reversed String.  
	 * 
	 */
	
public String reverse(){
	
	input = in.nextLine();
	length = input.length();
	for (i = length - 1; i >= 0; i--)
	{
		reverse = reverse + input.charAt(i);
	}
	return reverse;
	
}


}