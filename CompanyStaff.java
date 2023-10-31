

package iact.day8.example1;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyStaff {
	
	private ArrayList<Staff> s = new ArrayList<Staff>();
	
	public CompanyStaff(){
		
		s.add(new FullTimeStaff(1234, "Eoin", "Lynch", "Training", 50000));
		s.add(new FullTimeStaff(1235, "Amy", "Allan", "Training", 50000));
		s.add(new FullTimeStaff(1236, "Declan", "McNally", "Training", 50000));
		s.add(new FullTimeStaff(1237, "Fiona", "Coomey", "Training", 50000));
		s.add(new FullTimeStaff(1238, "Chris", "Graboski", "IT", 50000));
		s.add(new FullTimeStaff(1240, "Kate", "Quinn", "Accounts", 50000));
		s.add(new FullTimeStaff(1241, "Alex", "Broadberry", "Sales", 50000));
		s.add(new FullTimeStaff(1242, "Ian", "Moore", "Training", 50000));
		s.add(new PartTimeStaff(1243, "Adam", "Jones", "Reception", 15, 20));
		s.add(new PartTimeStaff(1244, "Sarah", "O'Brien", "Cleaning", 15, 10));
		s.add(new PartTimeStaff(1245, "Kevin", "Quinn", "Accounts", 16, 50));
		s.add(new PartTimeStaff(1246, "Joe", "Kelly", "Reception", 10, 20));
		
		
	}

	public void display(){
		
		for (int i=0; i<s.size(); i++){
			
			System.out.println(s.get(i));
		}
	}
	
	public void displayFullTimeStaff(){
		
		for (int i=0; i<s.size(); i++){
			if(s.get(i) instanceof FullTimeStaff){
				
				System.out.println(s.get(i));
			}
		}
	}
	
	public void displayPartTimeStaff(){
		
		for (int i=0; i<s.size(); i++){
			if(s.get(i) instanceof PartTimeStaff){
				
				System.out.println(s.get(i));
			}
		}
	}
	
	public Staff getStaffID(int id){
		Staff s1 = new Staff();
		for (int i=0; i<s.size(); i++){
			if(s.get(i).getStaffID() == id){
				
				s1 = s.get(i);
			}
		}
		return s1;
	}
	
	public void getStaffByID(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the staff ID: ");
		int id = input.nextInt();
		Staff s1 = getStaffID(id);
		if(s1.getStaffID()==0){
			System.out.println("Sorry staff with taht ID not found");
		}else{
			
			//found so print it out
			System.out.println(s1);
		}
		
		
	}
	
	public void addNewStaff(){
		
		Staff s1;
		int id;
		String fn, ln, d, ans;
		double hr, hw, sal;
		Scanner inputNumber = new Scanner(System.in);
		Scanner inputText = new Scanner(System.in);
		
		System.out.println("Please enter the staff ID: ");
		id = inputNumber.nextInt();
		System.out.println("Please enter the first name: ");
		fn = inputText.nextLine();
		System.out.println("Please enter the last name: ");
		ln = inputText.nextLine();
		System.out.println("Please enter the department: ");
		d = inputText.nextLine();
		System.out.println("Are they full time? y or n: ");
		ans = inputText.nextLine();
		if (ans.equalsIgnoreCase("y")){
			System.out.println("Please enter the salary: ");
			sal = inputNumber.nextDouble();
			s1 = new FullTimeStaff(id, fn, ln, d, sal);
		}else{
			System.out.println("Please enter the hours worked: ");
			hw = inputNumber.nextDouble();
			System.out.println("Please enter the hourly rate: ");
			hr = inputNumber.nextDouble();
			s1 = new PartTimeStaff(id, fn, ln, d, hr, hw);
		}
		s.add(s1);
		
	}
	
	public void updateStaff(){
		Scanner inputText = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		//ask for the staff id
		System.out.println("Please enter the staff id: ");
		int id = inputNumber.nextInt();
		Staff s1 = getStaffID(id);
		String ans;
		//find the staff object
		
		//if found
		if(s1.getStaffID() !=0){
		
		//display id
			
			System.out.println("Staff ID Currently : " + s1.getStaffID());
			//System.out.println("Would you like to change it? y or n");
			//ans = inputText.nextLine();
			
		//ask if they want to change it
			System.out.println("Would you like to change it? y or n");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				System.out.println("What is the new ID?");
				int newID = inputNumber.nextInt();
				s1.setStaffID(newID);
			}
		//display fn
			System.out.println("First name Currently : " + s1.getFirstname());
		//ask if they want to change it
			System.out.println("Would you like to change it? y or n");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				System.out.println("What is the new First name?");
				String newfn = inputText.nextLine();
				s1.setFirstname(newfn);
			}
			
		//display ln
			System.out.println("First name Currently : " + s1.getLastName());
		//ask if they want to change it
			System.out.println("Would you like to change it? y or n");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				System.out.println("What is the new last name?");
				String newln = inputText.nextLine();
				s1.setLastName(newln);
			}
		//display dep
			System.out.println("Department Currently : " + s1.getDepartment());
		//ask if they want to change it
			System.out.println("Would you like to change it? y or n");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				System.out.println("What is the new department?");
				String newdep = inputText.nextLine();
				s1.setDepartment(newdep);
			}
		//check if it is an instance of a FullTime staff
		if (s1 instanceof FullTimeStaff){
			//if it s cast it to a fullTimeStaff so we can use its methods
			FullTimeStaff f1 = (FullTimeStaff)s1;
			System.out.printf("Salary is currently: %.2f\n", f1.getSalary());
			System.out.println("Would you like to change this? y or n?");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				System.out.println("What is the new Salary?");
				double newSal = inputNumber.nextDouble();
				f1.setSalary(newSal);
			}
			
		}else {
			
			//if it s cast it to a fullTimeStaff so we can use its methods
			PartTimeStaff p1 = (PartTimeStaff)s1;
			System.out.printf("Hours worked is currently : %2f\n", p1.getHoursWorked());
			System.out.println("Would you like to change this? y or n?");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				System.out.println("What is the new hours worked?");
				double newhw = inputNumber.nextDouble();
				p1.setHoursWorked(newhw);
		}
			System.out.printf("Hourly rate is currently : %2f\n", p1.getHourlyRate());
			System.out.println("Would you like to change this? y or n?");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				System.out.println("What is the new hourly rate?");
				double newhr = inputNumber.nextDouble();
				p1.setHourlyRate(newhr);
		}
			
		}
		
	}else {
		System.out.println("ID not found");
	}
	
	/*public void addStaff(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the staff ID: ");
		int id = input.nextInt();
		System.out.println("Please enter the first name: ");
		String fn = input.nextLine();
		System.out.println("Please enter the last name: ");
		String ln = input.nextLine();
		System.out.println("Please enter the department: ");
		String d = input.nextLine();
		System.out.println("Are they full time? y or n: ");
		ft = inputText.nextLine();
		ft = (ft.equalsIgnoreCase("y")? true: false);
		Staff s1 = getStaffID(id);
		if(s1.getStaffID()==0){
			System.out.println("Sorry staff with taht ID not found");
		}else{
			
			//found so print it out
			System.out.println(s1);
		}
		
		
	}*/
}
}