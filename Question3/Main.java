package Question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Multiplication multiplication = new Multiplication();
        System.out.println("Enter the Positive number : ");
        int number =scanner.nextInt();
        System.out.println(" The Multiplication table of "+number+" ");
        multiplication.printMultiplicatio(number);
        scanner.close();
	}

}
