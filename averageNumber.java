package averageNumber;

import java.util.Scanner;

public class averageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int number;
		double average;
		
		int sumOfNumbers = 0;
		
		System.out.println("How many numbers would you like to enter:");
		number = scanner.nextInt();
		
		for (int i = 1; i <= number; i ++ ) {
			
			System.out.println("Enter any number:");
			sumOfNumbers += scanner.nextInt();
		}

		average = sumOfNumbers / number;
		String num = String.valueOf(average);
		System.out.println("Average of entered numbers is: "+ (num));
	
	
	}

}	
