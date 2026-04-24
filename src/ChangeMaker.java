import java.util.Scanner; 

public class ChangeMaker {
	public static void exactChange(int userTotal, int[] coinVals) {
		double totalCash = userTotal / 100.0;
	      int change = userTotal;
	      //System.out.printf("User input $%.2f.\n", totalCash);
	      //System.out.printf("%d cents\n", change);
	      coinVals[0] = change / 100;
	      change = change - (coinVals[0] * 100);
	      coinVals[1] = change / 25;
	      change = change - (coinVals[1] *25);
	      //System.out.printf("%d cents remaining\n", change);
	      coinVals[2] = change / 10;
	      change = change - (coinVals[2] * 10);
	      //System.out.printf("%d cents remaining\n", change);
	      coinVals[3] = change / 5;
	      change = change - (coinVals[3] * 5);
	      //System.out.printf("%d cents remaining\n", change);
	      coinVals[4] = change;
	      if (coinVals[0] > 1){
	          System.out.println(coinVals[0] + " dollars");
	       }
	       else if (coinVals[0] == 1) {
	          System.out.println(coinVals[0] + " dollar");   
	       }
	      if (coinVals[1] > 1){
	         System.out.println(coinVals[1] + " quarters");
	      }
	      else if (coinVals[1] == 1) {
	         System.out.println(coinVals[1] + " quarter");   
	      }
	      if (coinVals[2] > 1){
	        System.out.println(coinVals[2] + " dimes");
	      }
	      else if (coinVals[2] == 1) {
	         System.out.println(coinVals[2] + " dime");   
	      }
	      if (coinVals[3] > 1){
	         System.out.println(coinVals[3] + " nickels");
	      }
	      else if (coinVals[3] == 1) {
	         System.out.println(coinVals[3] + " nickel");   
	      }
	      if (coinVals[4] > 1){
	         System.out.println(coinVals[4] + " pennies");
	      }
	      else if (coinVals[4] == 1) {
	         System.out.println(coinVals[4] + " penny");   
	      }
	      if (userTotal == 0) {
	    	  System.out.println("no change");
	      }
	}
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //System.out.printf("Enter total value in cents to change:\n");
      int userInput = sc.nextInt();
      int[] coinVals = new int[5];
      exactChange(userInput, coinVals);
      
      sc.close();
      }
}
