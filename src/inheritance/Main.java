package inheritance;

public class Main {
	public static void main(String[] args) {
		SubClass1 a = new SubClass1();
		
		SubClass2 b = new SubClass2();
		
		
		System.out.println(a.parentNum*a.childNum1);
		System.out.println(b.parentNum*b.childNum2);
	}
}
