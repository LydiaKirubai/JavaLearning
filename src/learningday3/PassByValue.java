package learningday3;

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
