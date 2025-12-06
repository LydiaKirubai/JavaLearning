
abstract class Animal{
	abstract void sound();
	public void food() {
		 System.out.println("Food");
	 }
}
 

class Cat extends Animal{
	void sound() {
		System.out.println("Meow");
	}
}


public class PractiseAbstraction {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.sound();
		cat.food();
		
	}

}
