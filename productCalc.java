package recursionCT;

import java.util.Scanner;

public class productCalc {
	 public static double getProduct(int index) {
	        Scanner scanner = new Scanner(System.in);

	        if (index == 0) {
	            return 1;  // Base case, return 1 for multiplication
	        } else {
	            try {
	                System.out.print("Enter number " + index + ": ");
	                double number = scanner.nextDouble();
	                return number * getProduct(index - 1);
	            } catch (java.util.InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a valid number.");
	                scanner.nextLine();  // Clear the invalid input
	                return getProduct(index);
	            }
	        }
	 }


public static void main(String[] args) {
    System.out.println("Enter five numbers to calculate their product.");
    double product = getProduct(5);
    System.out.println("The product of the five numbers is: " + product);
}
}