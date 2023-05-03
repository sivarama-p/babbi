package constructorexamoles;

public class Box1 {
	double length;
	double breadth;
	double height;

	Box1(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	Box1(double length, double breadth, double height){
		this(length, breadth);
		this.height = height;
	}

	public void display() {
		System.out.println(this.length);
		System.out.println(this.breadth);
		if(height != 0) {
			System.out.println(this.height);
		}
	}

}
