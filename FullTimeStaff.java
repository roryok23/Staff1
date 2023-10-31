package iact.day8.example1;

public class FullTimeStaff extends Staff{
	
	private double salary;
	public FullTimeStaff(){
		
		super();
	}
	public FullTimeStaff(int id, String fn, String ln, String d, double s){
		
		super(id, fn, ln, d);
		setSalary(s);
	}
	
	


	public double getSalary() {
		return salary;
	}
	public void setSalary(double s) {
		salary = s;
	}
	
	@Override
	public String toString(){
		
		return String.format("%sSalary: %.2f\n", super.toString(), getSalary());
	}
	
	}
