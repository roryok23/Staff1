package iact.day8.example1;

import java.util.Scanner;

public class StaffMain {

	public static void main(String[] args) {
		
		CompanyStaff cs = new CompanyStaff();
		int ans;
		String keepgoing;
		Scanner input = new Scanner(System.in);
		
		do {
			
		ans = Menu.display();
		switch (ans){
		case 1:
			cs.display();
			break;
		case 3:
			cs.displayFullTimeStaff();
			break;
		case 4:
			cs.displayPartTimeStaff();
			break;
		case 5:
			cs.getStaffByID();
			break;
		case 6:
			cs.addNewStaff();
			break;
		case 7:
			cs.updateStaff();
			break;
			default:
				System.out.println("Sorry that is not a valid option.");
		}
		System.out.println("Would you like to see the menu again?");
		keepgoing = input.nextLine();
		} while (keepgoing.equalsIgnoreCase("y"));
		System.out.println("Thank you Goodbye!");
		
	}
	
	

}
