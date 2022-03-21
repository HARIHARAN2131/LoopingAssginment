package Question9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hcf hcf = new Hcf();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter tow Numbers : ");
		int number1 =scanner.nextInt();
		int number2 =scanner.nextInt();
		int gcd=hcf.printHcf(number1, number2);
		System.out.println("HCF : "+gcd);
		scanner.close();

	}

}
