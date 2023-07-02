package encapsulation;

public class Employee_ConstructorWithThis {
	//without using "this" keyword in constructor
	int empId;
	String empName;
	double empSalary;

	public Employee_ConstructorWithThis(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

}
