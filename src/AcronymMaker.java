import java.util.Scanner;
public class AcronymMaker {
	public static String createAcronym(String userPhrase) {
		String acronym = "";
		for (int i=0; i<userPhrase.length(); ++i) {
			if ((userPhrase.charAt(i) >='A') && (userPhrase.charAt(i) <='Z')) {
				acronym = acronym + userPhrase.charAt(i);
			}
		}
			
		return acronym;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myString = sc.nextLine();
		String acronym = createAcronym(myString);
		System.out.println(acronym);
	}

}
