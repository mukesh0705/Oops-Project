package encapsulation;

public class Employee_Constructor {
	//without using "this" keyword in constructor
	int empId;
	String empName;
	double empSalary;
	
	public Employee_Constructor (int id, String name, double salary) {
		empId=id;
		empName=name;
		empSalary=salary;
	}

}
