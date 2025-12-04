package learningday5;

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
