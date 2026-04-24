import java.util.Scanner;
import java.util.Random;

public class FlipACoin {
	   
	public static String headsOrTails(Random rand) {
		int coinFlip = rand.nextInt(2);   
        if (coinFlip == 0) {
            return "heads";
        } else {
            return "tails";
        }
	}
	   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Unique seed
      int numFlips = scnr.nextInt();
      for (int i=0; i < numFlips; ++i) {
    	  String result = headsOrTails(rand);
    	  System.out.println(result);
      }
   }
}
