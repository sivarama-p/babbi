package constructorexamoles;

public class Carpenter {
	public static void main(String[] args) {
		Box1 a = new Box1(2.5, 2.2);
		a.display();
		
		Box1 b = new Box1(4.5, 5.5, -1.3);
		b.display();
	}
}
