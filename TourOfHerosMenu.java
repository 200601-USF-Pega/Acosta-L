import java.util.Scanner; 
import java.util.ArrayList;
public class TourOfHerosMenu {

	
	public void Menu() {
	Scanner input = new Scanner(System.in);
	StringBuilder line = new StringBuilder();
		System.out.println("Welcome to the menu!");
		System.out.println("Enter in 0 for create a hero, and 1 to exit the menu.");
	
		line.append(input.nextInt());
	
	if(line.charAt(0)== '0')
	{
		System.out.println("What do you want to name your hero?");
		line.replace(0, line.length() - 1, input.nextLine());
		String name = line.toString();
		Boolean donez = false;
		System.out.println("Do you want to give "+ name + " superpowers? Enter yes or no.");
		
		line.replace(0, line.length() - 1, input.nextLine());
	    ArrayList<String> powers = new ArrayList<>();
	    
		if(line.toString().equals("yes")) {
			while(!donez)
		{
			System.out.println(" Type a another power or press ENTER to quit.");
			line.replace(0, line.length() - 1, input.nextLine());
			
			if(line.length() > 0) {
				powers.add(line.toString());
				
			}
			else {
				
				donez = true;
			}
		}
		}
		
		String [] powersArray= 
		
		
		
		
	
		
}
	else {
		System.out.print("Thank you, Bye.");
		
	}
	}
	}
