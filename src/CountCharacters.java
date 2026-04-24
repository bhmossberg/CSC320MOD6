import java.util.Scanner;
public class CountCharacters {
		public static int countCharacters(char userChar, String userString) {
			int count = 0;
			for (int i = 0; i < userString.length(); ++i) {
				if (userString.charAt(i) == userChar) {
					++count;
				}
			}
		return count;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			String myString = sc.next();
			String myString2 = sc.nextLine();
			char myChar = myString.charAt(0);
			int numChars = countCharacters(myChar, myString2);
			System.out.println(numChars);
			
		}

	}
