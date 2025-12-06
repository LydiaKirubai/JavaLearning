package learningday3;
// Pass-by-value in Java is a mechanism where a copy of the actual argument’s value 
// is passed to the method, so changes made inside the method do not affect the original variable.

public class PassByValue {
	
	public static void changeValue(int a) {
		a = 10;
	}

	public static void main(String[] args) {
		int x = 5;
		changeValue(x);
		System.out.println(x);

	}

}
