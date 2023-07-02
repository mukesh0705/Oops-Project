package encapsulation;

public class mainEncap {

	public static void main(String[] args) {
		Employee_Encapsulation emp=new Employee_Encapsulation();
		emp.setId(101);
		emp.setName("Mukesh");
		emp.setSalary(45000.00);
		
		int empid=emp.getId();
		String empName=emp.getName();
		double empSalary=emp.getSalary();
		
		System.out.println("Employee id = "+empid);
		System.out.println("Employee name = "+empName);
		System.out.println("Employee salary = "+empSalary);
		

	}

}
