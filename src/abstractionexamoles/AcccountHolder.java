package abstractionexamoles;

public class AcccountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM a = new SBI();
		a.withDraw();
		
		ATM b = new AxixBank();
		b.withDraw();
		
		ATM c = new Icci();
		c.withDraw(); 

	}

}
