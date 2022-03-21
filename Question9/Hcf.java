package Question9;

public class Hcf {
	int printHcf(int number1,int number2) {
		int hcf = 0;
	      int i = 1;

	      while(i<=number1 && i<=number2) {
	         if(number1%i==0 && number2%i==0)
	            hcf = i;
	            i++;
	      }
	      return hcf;
	}

}
