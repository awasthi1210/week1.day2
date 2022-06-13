package day2;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employee name is "+ empName+ " and employee ID is "+ empId);
	}
 
	public void getEmployeeAddress(String empAddress) {
		System.out.println("address is "+ empAddress);
	}
	
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Salary is "+ empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Number is "+ mobNum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName("Mona", 12345);
		obj.getEmployeeAddress("Noida");
		obj.printEmployeeSalary(35876.68);
		obj.printEmployeeMobileNumber(9667593766L);
	}

}
