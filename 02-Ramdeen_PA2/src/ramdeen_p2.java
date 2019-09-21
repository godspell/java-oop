import java.util.*;
import java.math.*;

public class ramdeen_p2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userOption;
		double userWeight;
		double userHeight;
		double bmi;
		
		System.out.println("Calculating BMI");
		System.out.println("\nFormulas");
		System.out.println("1\tBMI = 703 * weightInPounds / heightInInches ^ 2");
		System.out.println("2\tBMI = weightInKilograms / heightInMeters ^ 2");
		
		System.out.print("\nPlease select the formula to use (1 or 2): ");
		userOption = s.nextInt();
		
		if (userOption == 1) {
			// Pounds and Inches
			System.out.print("\nPlease enter the your weight in pounds: ");
			userWeight = s.nextDouble();
			System.out.print("Please enter the your height in inches: ");
			userHeight = s.nextDouble();
			
			// Calculate BMI
			bmi = (703.0 * userWeight) / Math.pow(userHeight, 2.0);
			System.out.printf("\nYour BMI is: %.2f\n", bmi);

			
		} else if (userOption == 2) {
			// Kilograms and Meters
			System.out.print("\nPlease enter the your weight in kilograms: ");
			userWeight = s.nextDouble();
			System.out.print("Please enter the your height in meters: ");
			userHeight = s.nextDouble();
			
			// Calculate BMI
			bmi = userWeight / Math.pow(userHeight, 2.0);
			System.out.printf("\nYour BMI is: %.2f\n", bmi);
			
		} else {
			// invalid selection
			System.out.println("Invalid selection. Run the program again.");
			System.exit(0);
		}
		
		
		// Display Categories
		System.out.println("\nBMI Categories");
		System.out.println("  Underweight = <18.5");
		System.out.println("  Normal weight = 18.5–24.9");
		System.out.println("  Overweight = 25–29.9");
		System.out.println("  Obesity = BMI of 30 or greater");
	}
}
