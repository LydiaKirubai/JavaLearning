package learningday3;

// Method overloading is a feature in object-oriented programming 
// where multiple methods share the same name but differ in parameters 
// such as type, number, or order.
public class MethodOverLoading {
	
	int sum(int a, int b) {
		return a + b;
	}
	
	int sum(int a, int b, int c) {
		return a + b+ c;
		
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		System.out.println(obj.sum(2, 5));
		System.out.println(obj.sum(2, 5, 1));
		
	}

}
