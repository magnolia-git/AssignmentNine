import java.util.Scanner;

public class AssignmentNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExpandableArray myList = new ExpandableArray(); 
		System.out.println("This is an application to demonstrate an expandable array.");
		
		// User selection
		while(true) {
			System.out.println("\nWhat would you like to do?");
			System.out.print("1) Set a value.\n2) Get a value.\n3) Quit. (Any other number will quit, too)\n> ");
			int userIn = input.nextInt();
			
			// Selection 1
			if (userIn == 1) {
				System.out.print("Which index will you add to? ");
				int userIndex = input.nextInt();
				System.out.println("What string would you like to add as a value?");
				input.nextLine();
				String userValue = input.nextLine();
				myList.set(userIndex, userValue);
				
			// Selection 2	
			} else if (userIn == 2) {
				System.out.print("Which index should be accessed? ");
				int userIndex = input.nextInt();
				String value = (String) myList.get(userIndex);
				System.out.println("Got value: " + value);
				
			// Selection 3
			} else break;
		}
		System.out.print("Quitting...");
		input.close();
	}
}