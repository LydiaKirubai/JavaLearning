package learningday3;

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
