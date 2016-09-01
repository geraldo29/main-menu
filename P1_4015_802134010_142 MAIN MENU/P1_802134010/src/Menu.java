
import java.util.Scanner;


/** @author Geraldo Lopez Rosa
 * 
 * Runs the program that displays three menus and gives out a couple of options to perform mathematical or string operations. 
 * It also gives out the statistics of the program.
 * 
 */

public class Menu {
	/**
	 * Main method. Runs program.
	 */
	public static void main(String[] args) {
		
		//creates  main menu string and number menu
		MainMenu mainMenu = new MainMenu ("Main Menu :","Perform Opertaions on Numbers", "Perform Operations on String", "Show Statistics", "Exit");
		NumbersMenu numberMenu = new NumbersMenu("Operations on Numbers Menu: ", "Process Quadratic Equation", "Compute Average List of Numbers", "Exit");
		NumbersMenu stringMenu = new NumbersMenu("Operations on String Menu: ","Show Reverse of a Given String","Format Strings","Exit");
		
		FormatStrings format;
		ReverseString reverse;
		AverageofNumbers numbers;
		QuadraticEquation equation; 
		
		
		
		Integer quadraticcounter=0;
		Integer computecounter = 0;
		Integer reversecounter=0;
		Integer formatcounter=0;
		Integer statisticscounter = 0;
		boolean flag=false;
		String choosenumber; 
		String selectnumber;
		int countertries = 0; 
		int numbercounter = 0;
		int chooseNumber = 0;
		int selectNumber = 0;
		float a,b,c;
		
		
		//Do  Loop is to go back to main menu when you exit the number or string menu.
		do {
		
		mainMenu.display();
		
		
			
		// do loop is to make sure they pick a number from 1 and 4
		do {		
			
		Scanner in = new Scanner(System.in); 
		System.out.println("Please choose a number between 1 and 4 and hit ENTER. Three Tries Only");
		
		do {
			
			choosenumber = in.nextLine();
			
			if (!isInteger(choosenumber))
			{
				countertries++;
				System.out.println("enter a valid number. PLEASE Remember three tries only!!!");
			}
			
		if (countertries >= 3)
			{
			System.out.println("Three Tries Only Run Program Again to try Again.");
			System.exit(0);
			}

		}

		while (!isInteger(choosenumber));
		
		//changes the string to integer
		
		chooseNumber = Integer.parseInt(choosenumber);
		
		if (chooseNumber > 3 || chooseNumber <= 0 && chooseNumber !=4 )
			{
			System.out.println("Try again. ");
			countertries++;
			if (countertries > 3)
			{System.out.println("Run Again. Remember Three Strikes and you're OUT!");
			System.exit(0); }}
			else {
			switch (chooseNumber)
			{
			case 1: 
				flag =false;
				countertries =0;
				
				// do loop is to return to number menu after doing a math operation.
				do{
					if (flag)
						break;
				numberMenu.display(); 
				
				
				System.out.println("Please Choose a number between 1 and 3 and hit Enter");
				 
				 
				 // do loop is to make sure User picks a number between 1 and 3
				do { 
					numbercounter=0;
					
					do {
							selectnumber = in.nextLine();
							
							
							if (!isInteger(selectnumber))
							{
								numbercounter++;

								System.out.println("enter a valid number. PLEASE Remember three tries only!!!");
							}
							
						if (numbercounter >= 3)
							{
							System.out.println("Back to main menu");
							flag=true;
							break;
							}
							
							
							
					}
					while (!isInteger(selectnumber));
					
					if (flag)
						break;
					
					selectNumber = Integer.parseInt(selectnumber);
					

					if (selectNumber <= 0 || selectNumber >3 )
						{
							System.out.println("Try again. Three tries only. ");
							numbercounter++;
							if (numbercounter >= 3)
								{
									System.out.println("Back to Main Menu");
									flag=true;
									break;
									
								}
						}
					else {
					switch(selectNumber)
					{ 
					case 1: 
					numbercounter = 0;
					System.out.println("Enter three digits. Hit Enter after every number.");
					quadraticcounter++;
					a= in.nextFloat();
					b =in.nextFloat();
					c=in.nextFloat(); 
					equation = new QuadraticEquation(a,b,c); 
					int counter = equation.realSolutionsCount();
					FloatPair results = equation.getRealSolutions(); 
					System.out.println("The results of this quadratics equation are:" + results);
					System.out.printf("The number of solutions are: %d\n",  counter);
					break; 
					case 2: 
						numbercounter=0;
						computecounter++;
						System.out.println("Enter as many numbers a you want to get the average of those numbers. After every number hit Enter. Numbers must be bigger or equal to 0.");
						System.out.println("When you are done please enter a negative number.");
						numbers = new AverageofNumbers(); 
						double averageofnumbers = numbers.average();
						System.out.println("the average of the numbers you entered is" + averageofnumbers);
						break;
				
					}
					}
								
					
				}while (Integer.parseInt(selectnumber) > 3 || Integer.parseInt(selectnumber) <= 0 );
				if (flag)
					break;
				 }while(Integer.parseInt(selectnumber)!=3);
			
			
				
				break;
			case 2: 
				flag = false;
				countertries = 0;
				//do loop return to string menu after doing a string operation.
				do{
					if (flag)
					{
						numbercounter = 0;
						break;
						
					}
						
					stringMenu.display(); 
					
					
					System.out.println("Please Choose a number between 1 and 3 and Hit Enter");
					 
					 // do loop is to make sure they choose a number between 1 and 3
					 
					do { 	numbercounter=0;

						do {
							selectnumber = in.nextLine();
							
							if (!isInteger(selectnumber))
							{
								numbercounter++;

								System.out.println("enter a valid number. PLEASE Remember three tries only!!!");
							}
							
						if (numbercounter >= 3)
							{
							System.out.println("Back to main menu");
							flag=true;
							break;
							}
						

					}
					while (!isInteger(selectnumber));
						
						if (flag)
							break;
						
					//changes the string to integer
					
					selectNumber = Integer.parseInt(selectnumber);
						

						if (selectNumber <= 0 || selectNumber >3 )
						{
							System.out.println("Try again. Three tries only. ");
						numbercounter++;
							if (numbercounter >= 3)
								{System.out.println("Back to Main Menu");
								flag=true;
								break;
								}
						}
						else {
						switch(selectNumber)
						{ 
						case 1: 
							numbercounter = 0;
							System.out.println("Enter String to Reverse");
							reversecounter++;
							reverse = new ReverseString();
							String input = reverse.reverse();
							System.out.println("The string reversed is : " + input);
						
						break; 
						case 2: 
							numbercounter=0;
							format = new FormatStrings();
							format.formatString();
							formatcounter++;
							break;
					
						}
						}
									
						
					}while (Integer.parseInt(selectnumber) > 3 || Integer.parseInt(selectnumber) <= 0 );
					if (flag)
					{
						
						break;
						
					}
					 }while(Integer.parseInt(selectnumber)!=3);
				
				break;
			case 3 : 
				statisticscounter++;
				final Object[][] table = new String[7][];
			table[0] = new String[] { "Operation in the Program", "            Number of Times Executed"};
			table[1] = new String[] { "========================", "            ========================" };
			table[2] = new String[] { "Process a Quadratic Equation",         quadraticcounter.toString() };
			table[3] = new String[] { "Compute Average of Numbers",      "                " +       computecounter.toString() };
			table[4] = new String[] { "Reverse a String", "                          " +   reversecounter.toString() };
			table[5] = new String[] { "Format a String",  "                           " +   formatcounter.toString()           };
			table[6] = new String[] { "Show Statistics","                           " +      statisticscounter.toString()          };

			for (final Object[] row : table) {
			    System.out.format("%15s%15s\n", row);
			}
				
				break;
			}
			}
			
			
		} while (Integer.parseInt(choosenumber) > 4 ||Integer.parseInt(choosenumber) <= 0);
		
		}while (Integer.parseInt(choosenumber) !=4);
			System.out.println("Hope To see You Soon");
		}
	
	/**
	 * This method is to validate the integer and check what you put. 
	 * @param the string you entered 
	 * @return returns true if the string is an integer, else returns false
	 */

	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    return true;
	}
}
		
		
	
	
