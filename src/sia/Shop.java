package sia;

public class Shop {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.dogName="puppy";
		d1.breed="gratdain";
		d1.cost=25000;
		d1.bark(d1.dogName);
		
		System.out.println("Dog name is :"+d1.dogName+" breed is :"+d1.breed+" cost is :"+d1.cost);
		
		Dog d2 = new Dog() ;
		d2.dogName="Browny";
		d2.breed="Husky";
		d2.cost=30000;
		d2.bark(d2.dogName);
		System.out.println("Dog name is :"+d2.dogName+" breed is :"+d2.breed+" cost is :"+d2.cost);

	}
}
