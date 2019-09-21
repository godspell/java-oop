import java.util.*;

public class ramdeen_p3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String [] topics = {"Reddit", "Food", "Games", "Movies", "Music"};
		final int MAX_ROWS = 5;
		final int MAX_COLS = 10;
		int [][] responses = new int[MAX_ROWS][MAX_COLS];
		double [] avg = new double[MAX_ROWS];
		int [] total_points = new int[MAX_ROWS];
		int max_points;
		int min_points;
		
		
		// Collect data from 10 people
		System.out.println("Please rate the following topics"
				+ " from 1(least important) to 10(most important)");

		for(int i = 0; i < MAX_COLS; i++) {
			System.out.printf("\nUser %d\n", i + 1);
			for(int j = 0; j < MAX_ROWS; j++) {
				System.out.printf("%s: ", topics[j]);
				responses[j][i] = s.nextInt();
				total_points[j] += responses[j][i]; // sum up the values as the user enters them
			}
		}
		
		
		// Calculate Average
		for(int i = 0; i < MAX_ROWS; i++) {
			avg[i] = (double) total_points[i] / MAX_COLS;
		}
		
		
		// Display Summary
		System.out.println(); // new line for clarity
		for(int i = 0; i < MAX_ROWS; i++) {
			
			// Print Column Information
			if (i == 0) {
				System.out.print("\t\t");
				for (int k = 0; k < MAX_COLS; k++) {
					System.out.printf("User %d\t", k + 1);
				}
				System.out.print("Average\n");
			}
			
			// topic for the current row
			System.out.print(topics[i] + "\t");
			
			// rations for current topic
			for(int j = 0; j < MAX_COLS; j++) {
				System.out.print("\t" + responses[i][j]);
			}
			System.out.println("\t" + avg[i]); // end the line for current topic
		}
		
		
		// Find Highest and Lowest point total
		max_points = 0;
		min_points = 0;
		for(int i = 1; i < MAX_ROWS; i++) {
			// Highest
			if(total_points[i] > total_points[max_points])
				max_points = i;
				
			// Lowest
			if(total_points[i] < total_points[min_points])
				min_points = i;
		}
		
		
		// Display Topic w/ Highest point total.
		System.out.printf("\nThe topic with the highest point "
				+ "total is %s with %d points.\n", topics[max_points], total_points[max_points]);
		
		// Display Topic w/ Lowest point total.
		System.out.printf("The topic with the lowest point "
				+ "total is %s with %d points.\n", topics[min_points], total_points[min_points]);
			
	}
}
