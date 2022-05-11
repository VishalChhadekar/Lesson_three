package lessionThree.EceptionalHandling;

class EmpSalaryException extends Exception {
	EmpSalaryException(String message) {
		super(message);
	}
}

class Employee3 {
	private String empName;
	private int empAge;
	private double empSalary;

	Employee3(String empName, int empAge, int empSalary) {
		this.empAge = empAge;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}

public class EmployeeService {
	//check employees salary 

	public static void checkEmployeeSalary(Employee3 emp) throws EmpSalaryException {
		if (emp.getEmpSalary() < 1000)

			throw new EmpSalaryException("Salary is less than 1000");

	}

	public static void main(String agrs[]) throws EmpSalaryException {

		Employee3 e1 = new Employee3("Joe", 20, 5455);
		Employee3 e2 = new Employee3("Lewis", 21, 1499);
		Employee3 e3 = new Employee3("Larry", 22, 345);
		Employee3 e4 = new Employee3("Smith", 23, 2343);
		Employee3 e5 = new Employee3("Elvis", 24, 234);

		Employee3[] empArray = { e1, e2, e3, e4, e5 };

		for (Employee3 em : empArray) {
			try {
				checkEmployeeSalary(em);// for first iteration em=e1, and so one

			} catch (EmpSalaryException ex) {
				System.out.println(em.getEmpName() + ": " + ex.getMessage());

			}

		}
		

	}
}
