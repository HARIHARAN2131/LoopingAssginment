package Question6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = scanner.nextInt();
        palindrome.printpalindrome(n);
        scanner.close();
	}

}
