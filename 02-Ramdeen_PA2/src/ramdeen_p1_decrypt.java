import java.util.Scanner;

/* 
 * Rules for Encryption
 * 
 * Part A
 * 1. Add 7
 * 2. Divide by 10
 * 3. Obtain the Remainder of the step 2.
 * 4. Replace the digit with the Remainder.
 * 5. Swap the 1st and 3rd digit. Swap the 2nd and 4th digit.
 * 6. Print the encrypted integer.
 * 
 * Part B
 * Decrypt the integer from Part A.
*/

public class ramdeen_p1_decrypt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int user_int;
		int thousands_digit;
		int hundredths_digit;
		int tens_digit;
		int ones_digit;
		int temp;
		
		
		// Obtain 4-digit int from the User
		System.out.print("Enter a 4-digit integer: ");
		user_int = s.nextInt();
		
		
		// Split digit up;
		ones_digit 			= user_int % 10;			// Digit 1
		tens_digit 			= (user_int / 10) % 10;		// Digit 2
		hundredths_digit 	= (user_int / 100) % 10;	// Digit 3
		thousands_digit 	= (user_int / 1000) % 10;	// Digit 4
			
		
		// Swap Digits (1st and 3rd)
		temp = ones_digit;
		ones_digit = hundredths_digit;
		hundredths_digit = temp;
		
		// Swap Digits (2nd and 4th)
		temp = tens_digit;
		tens_digit = thousands_digit;
		thousands_digit = temp;

	
		/* Apply Decryption
		 * 
		 * Suppose number = 1234
		 * let x = 4 (ones digit)
		 * 
		 * encryption
		 * (x + 7) % 10
		 * (4 + 7) % 10 = 1
		 * 
		 * Thus to reverse
		 * x + 10 - 7
		 * 1 + 10 - 7 = 4
		 * 
		 * Which simply reduces to
		 * x + 3
		 * 1 + 3 = 4
		 * 
		 * Modulo needs to be applied again.
		 * The modulo operation cannot be reversed.
		 * By applying this operator again we can take care of values that exceed 9.
		 */
	
		ones_digit 			= (ones_digit + 3) % 10;	// Digit 1
		tens_digit 			= (tens_digit + 3) % 10;	// Digit 2
		hundredths_digit 	= (hundredths_digit + 3) % 10;	// Digit 3
		thousands_digit 	= (thousands_digit + 3) % 10;	// Digit 4
		
		
		// Display Decrypted Number
		System.out.printf("Encrypted Number = %d%d%d%d\n", 
				thousands_digit, hundredths_digit, tens_digit, ones_digit);
		
	}
}
