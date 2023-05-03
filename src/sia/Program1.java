package sia;

public class Program1 {
	public static void main(String[] args) {
		String str = add("jaa", "Deeloper");
		System.out.println(str);
		
		int s = add(10,20);
		System.out.println(s);
	}
	
	public static String add(String s1, String s2) {
		String str= s1+s2;
		return str;
	}
	
	public static int add(int i, int j) {
		int b=i+j;
		return b;
	}
}
