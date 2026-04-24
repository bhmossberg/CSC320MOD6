import java.util.Scanner; 
public class ConvertToBinary {
   
	public static String intToReverseBinary(int integerValue) {
		String myString = "";
		int x = integerValue;
		while (x > 0) {
			myString = myString + (x % 2);
			x = x / 2;
		}
		return myString;
	}
	public static String stringReverse(String inputString) {
		String myString = "";
		for (int i = inputString.length()-1; i >= 0 ; --i) {
			myString = myString + inputString.charAt(i);		
		}
		
		return myString;
	}
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int integerValue = sc.nextInt();
      String binary = stringReverse(intToReverseBinary(integerValue));
      System.out.println(binary);
         
         
   }
}
