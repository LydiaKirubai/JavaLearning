//Question:
//Create a Java class named Car with the following:
// Instance variables:
//   String brand
//   String color
//   int year
// Methods:
//   - A method displayInfo() that prints all the details of the car.
//   - A method getCarAge() that returns how old the car is (currentYear – year).
// Main Method Task:
//   - Create two objects of the Car class.
//   - Assign values to each car.
//   - Call the methods to display each car’s information and age.
package learningday5;
import java.time.*;

class Car{
		String brand;
		String color;
		int year;
		
		void displayInfo() {
			System.out.println("Brand: "+ brand);
			System.out.println("Color: "+ color);
			System.out.println("Year: "+ year);
		}
		
		int getCarAge() {

			int currentYear = Year.now().getValue();
			int carAge = currentYear - year;
			return carAge;
		}
}


public class PractiseClass {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.brand = "Toyota";
		obj.color = "Red";
		obj.year = 2015;
		obj.displayInfo();
		
		System.out.println("Car Age: " + obj.getCarAge() + " years");
		
		
	}

}
