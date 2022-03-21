package Question6;

public class Palindrome {	
	void printpalindrome(int n) {
		int r, sum = 0;
	  while (n > 0) {
	   r = n % 10; // getting remainder
	   sum = (sum * 10) + r;
	   n = n / 10;
	  }
	   System.out.println(sum);
}
}

