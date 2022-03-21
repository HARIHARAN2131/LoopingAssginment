package Question5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOfNumber powernumber = new PowerOfNumber();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number  and  Power : ");
		int number = scanner.nextInt();
		int power = scanner.nextInt();
		powernumber.printPower(number, power);
        scanner.close();
	}

}
