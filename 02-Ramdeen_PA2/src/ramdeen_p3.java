import java.util.*;

/*
 * Name: Zahid Ramdeen
 * UCFID: 4171623
 * Assignment: Programming Assignment 2 Question 3 (Favorites)
 * 
 */

public class ramdeen_p3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Required Variables
		String [] topics = {"Reddit", "Food", "Games", "Movies", "Music"};
		final int MAX_ROWS = 5;
		final int MAX_COLS = 10;
		int [][] responses = new int[MAX_ROWS][MAX_COLS];
		double [] avg = new double[MAX_ROWS];
		int [] total_points = new int[MAX_ROWS];
		int max_points;
		int min_points;
		
		
		// Collect data from 10 people
		System.out.println("Please rate the following topics from 1 (least important) to 10 (most important)");
		for(int i = 0; i < MAX_COLS; i++) {
			System.out.printf("\nUser %d\n", i + 1);
			for(int j = 0; j < MAX_ROWS; j++) {
				System.out.printf("%s: ", topics[j]);
				responses[j][i] = s.nextInt();
				
				// sum up the values as the user enters them b/c another loop or class would have to be used.
				total_points[j] += responses[j][i]; 
			}
		}
		
		
		// Calculate Average for each Topic
		for(int i = 0; i < MAX_ROWS; i++) {
			avg[i] = (double) total_points[i] / MAX_COLS;
		}
		
		
		// Display Summary
		System.out.println(); // new line for clarity
		for(int i = 0; i < MAX_ROWS; i++) {
			
			// Print Column Titles if this is the first Execution
			if (i == 0) {
				System.out.print("\t\t");
				for (int k = 0; k < MAX_COLS; k++) {
					System.out.printf("User %d\t", k + 1);
				}
				System.out.print("Average\n");
			}
			
			// Print Topic titles for the Rows
			System.out.print(topics[i] + "\t");
			
			
			// Print the User Reactions for current topics
			for(int j = 0; j < MAX_COLS; j++) {
				System.out.print("\t" + responses[i][j]);
			}
			
			// Display the Average of the Topic
			System.out.println("\t" + avg[i]);
		}
		
		
		// Find Highest and Lowest point total
		// This calculation saves the index.
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
