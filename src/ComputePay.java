/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class ComputePay {
	public static void main(String[] args) {
		int hoursWorked = (4 + 5 + 8 + 4);
		System.out.println("My total hours worked: " + hoursWorked + " hours");
		
		double hourlySalary = 8.75;
		System.out.println("My hourly salary: " + "$" + hourlySalary + " per hour");
		
		System.out.println("My total pay: " + "$" + hoursWorked * hourlySalary);
		
	}
}