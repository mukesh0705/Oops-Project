package encapsulation;

public class MainCons {

	public static void main(String[] args) {
		System.out.println("First Employee Details");
		Employee_Constructor emp01=new Employee_Constructor(101, "Mukesh", 45000.00);
		System.out.println("Employee id = "+emp01.empId);
		System.out.println("Employee Name = "+emp01.empName);
		System.out.println("Employee Salary = "+emp01.empSalary);
		
		System.out.println("\n");
		
		System.out.println("Second Employee Details");
		Employee_ConstructorWithThis emp02=new Employee_ConstructorWithThis(102, "Chandan", 70000.00);
		System.out.println("Employee id = "+emp02.empId);
		System.out.println("Employee Name = "+emp02.empName);
		System.out.println("Employee Salary = "+emp02.empSalary);

	}

}
