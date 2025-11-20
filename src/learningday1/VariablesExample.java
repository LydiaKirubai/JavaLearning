package learningday1;

public class VariablesExample {
	public static void main(String[] args) {
    String name = "Lydia";
    int age = 20;
    char initial = 'S';
    final float CGPA = 75.5f; //By using final keyword, the value of this variable cannot be changed
    System.out.println("Hello " + name + " " + initial);
    System.out.println("I am "+ age +" years old.");
    System.out.println("My CGPA is "+CGPA);
    
	}
}
