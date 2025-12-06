package learningday5;
// A constructor is a special type of method used to initialize objects of a class. 
// It is invoked automatically when an object is created using the new keyword. 

public class PractiseConstructor {
	
	int a;
	String b;
	
	//Constructor
	PractiseConstructor(){
		System.out.println("Constructor here");
	}
	
	public static void main(String[] args) {
		
		PractiseConstructor obj = new PractiseConstructor();
		PractiseConstructor obj2 = new PractiseConstructor(); //Calling Constructor for second time
		
		System.out.println(obj.a); //Returns 0
		System.out.println(obj.b); // Returns null
	}

}
