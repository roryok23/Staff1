package iact.day8.example1;


public class PartTimeStaff extends Staff{
	
	private double hoursWorked;
	private double hourlyRate;
	public PartTimeStaff(){
		
		super();
	}
	
	public PartTimeStaff(int id, String fn, String ln, String d, double hw, double hr){
		
		super(id, fn, ln, d);
		setHoursWorked(hw);
		setHourlyRate(hr);
		
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hw) {
		hoursWorked = hw;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hr) {
		hourlyRate = hr;
	}
	
	@Override
	public String toString(){
		
		return String.format("%sHours Worked: %.1f\nHourly Rate: %.1f\n", 
				super.toString(), getHoursWorked(), getHourlyRate());
	}
	

	
}