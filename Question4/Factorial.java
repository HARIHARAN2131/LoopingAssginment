package Question4;

public class Factorial {
	void printFactorial(int number) {
		int fact = 1;
		for(int i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
	}


