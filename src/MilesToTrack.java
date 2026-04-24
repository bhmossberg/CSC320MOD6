import java.util.Scanner;

public class MilesToTrack {
	   
	   public static double milesToLaps(double userMiles){
		    return userMiles *4.0;
	   }
	   
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      double userInput = sc.nextDouble();
	      System.out.printf("%.2f", milesToLaps(userInput));
	   }
	}
