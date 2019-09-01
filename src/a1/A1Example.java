package a1;

import java.util.Scanner;

public class A1Example {

	public static void main(String[] args) {
		// Print out the Java version number, just to let 
		// you know what Eclipse thinks it is using and
		// so that you can confirm that it is 10.0 or higher.
		
		// System.out.println("Your Java version: " + System.getProperty("java.version"));
		
		// Set up scanner object to read space-separated values
		// from console input
		
		Scanner scan = new Scanner(System.in);

		// Read in count of numbers to process
		
		int count = scan.nextInt();
		
		
		// Create an array to store numbers.
		
		double[] values = new int[count];
		
		
		// Read values into the array
		
		for (int i=0; i<values.length; i++) {
			values[i] = scan.nextInt();
		}
		
		// All input parsed, so close scanner
		scan.close();
		
		// Use helper functions to calculate sum, min, and max
		
		double sum = calculateValueSum(values);
		double min = findValueMin(values);
		double max = findValueMax(values);
		
		// Print results
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + String.format("%.2f", ((double) sum) / ((double) count)));
		
	}
	
	/* calculateValueSum 
	 * Calculates the sum on an array of integers
	 *
	 * Input: array of integers vals
	 * 
	 * Output: integer sum of values in vals
	 * 
	 * Preconditions:
	 * Input array must not be null.
	 */
	
	static double calculateValueSum(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	
	/* findValueMin
	 * Finds and returns the minimum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: minimum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}

	/* findValueMax
	 * Finds and returns the maximum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: maximum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}

}
