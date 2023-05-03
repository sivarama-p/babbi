package exceptionExamples;

public class Employee {
	String eName;
	private double sal;
	
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) throws SalaryIncorrectException   {
		if(sal>0) {
			this.sal = sal;
		}
		else {
			throw new SalaryIncorrectException("Please enter alid salary");
		}
	}
	
	public Employee(String eName, double sal) throws SalaryIncorrectException {
		this.eName = eName;
		if(sal>0) {
			this.sal =sal;
		}
		else {
			throw new SalaryIncorrectException("Please enter alid salary");
		}
	}
	
	
	
	
	
}
