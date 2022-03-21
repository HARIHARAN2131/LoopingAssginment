package Question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Factorial factorial = new Factorial();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number to find it's Factorial : ");
       int number = scanner.nextInt();
       factorial.printFactorial(number);
       scanner.close();
	}

}
