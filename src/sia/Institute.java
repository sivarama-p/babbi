package sia;

public class Institute {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="Babbi";
		s1.sID="123@123";
		s1.phNo=5455454545454545l;
		System.out.println(s1);
		
		System.out.println("Student Name is :"+s1.name+" StudentID is :"+s1.sID+" Student phNo is :"+s1.phNo);

		Student s2 = new Student();
		s2.name="babbi";
		s2.sID="143@143";
		s2.phNo=12233445556667l;
		System.out.println(s2);

		System.out.println("Student Name is :"+s2.name+" StudentID is :"+s2.sID+" Student phNo is :"+s2.phNo);

		s1.eat();
		s1.learn();
		s2.eat();
		s2.learn();
	}
}
