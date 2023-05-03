package exceptionExamples;

public class Company {
	public static void main(String[] args)  {
		Employee e;
		try {
			e = new Employee("Abcd", 2000.00);
			e.setSal(-2000.00);
			System.out.println(e.getSal());
		} catch (SalaryIncorrectException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		
	}
}
