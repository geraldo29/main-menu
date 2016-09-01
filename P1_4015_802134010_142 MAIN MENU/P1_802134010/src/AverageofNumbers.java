import java.util.Scanner;

/**
 * A class that gives reads numbers and gives you the average of numbers.
 * 
 */

public class AverageofNumbers {
	
	
	Scanner in = new Scanner(System.in);

	/**
	 * Gives average a numbers given by user. 
	 * @return average
	 * 
	 */
	
	public double average(){
		int count=0;
		double sum=0, value = 0, average; 
		
		while ((value =	in.nextDouble()) >=0 ){
		sum = value + sum;
		count = count + 1;
		}
	
		
		if (count > 0)
		{	average = sum /count; 
		return average; }
		else 
			return 0;
			
	
	}
}

