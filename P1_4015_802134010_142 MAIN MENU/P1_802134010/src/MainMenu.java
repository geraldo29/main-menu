/*
	 * Creates Numbers and Strings Menu.
	 * 
	*/
public class MainMenu {
	
		private String menuText;
		private int optionCount; 
		
		/*
		 * Constructs a new Menu.
		 * 
		 * 
		 */
		
			public MainMenu(){
				
				menuText = ""; 
				optionCount = 0; 
				
			}
			
			
			/*
			 * Write the option that you want on the menu.
			 * @param String you want to be shown in screen.
			 * 
			 */
			
			public void addOption(String option){
				
				optionCount++; 
				menuText = menuText + "    " +  optionCount +">"+ "  " +option + "\n";
				
				
			}
			
			/**
			 * Creates a header for the menu with the add header method.
			 * @param string to be shown on top of the menu
			 * 
			 */
			public void addHeader(String head){
				
				menuText = head + "\n";
			}
			
			
			/*
			 * Creates a new menu with the add option method.
			 * @param the three strings to be shown for the user to select.
			 * 
			 */
			
			public MainMenu (String e, String a, String b , String c, String d){
				menuText = "";
				addHeader(e);
				addOption(a);
				addOption(b);
				addOption(c);
				addOption(d);
			}
			/*
			 * Displays the menu created.
			 * 
			 */
			
			public void display()
			{
				System.out.println("\n" + menuText);
			}
			
			
			
			
	}


