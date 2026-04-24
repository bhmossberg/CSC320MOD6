import java.util.Scanner; 

public class AlphaOnly {
   
   public static String removeNonAlpha(String userString) {
	   String cleanString = "";
	   for (int i= 0; i<userString.length(); ++i) {
		   if (Character.isLetter(userString.charAt(i))) {
			   cleanString = cleanString + userString.charAt(i);			   
		   } 
	   }
	   return cleanString;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String myString = sc.nextLine();
      String newString = removeNonAlpha(myString);
      System.out.println(newString);
   }
}
