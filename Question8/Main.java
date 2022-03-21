package Question8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PrimeNumber prime = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
        prime.printprime(number);
        scanner.close();
	}

}
