package iact.day8.example1;



import java.util.Scanner;

public class Menu {
	
	public static int display(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose an option from the menu: ");
		System.out.println("1. Display all Staff: ");
		System.out.println("2. Display staff in a department: ");
		System.out.println("3. Display full time staff: ");
		System.out.println("4. Display part time staff: ");
		System.out.println("5. Find staff by id: ");
		System.out.println("6. Add new staff: ");
		System.out.println("7. Update staff: ");
		
		int ans;
		try{
			ans = input.nextInt();
		}catch(Exception e){
			ans = 0;
			
		}
		
		return ans;
	}

}
