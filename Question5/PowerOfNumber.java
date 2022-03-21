package Question5;

public class PowerOfNumber {
      void printPower(int number, int power) {
    	  int answer=1;
    	  for(int i=1;i<=power;i++) {
    		  answer =number * answer;
    	  }
    	  System.out.println(" Number :"+number+" Power :"+power+" = "+answer);
      }
}
