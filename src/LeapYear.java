import java.util.Scanner; 
public class LeapYear {
	public static boolean isLeapYear(int userYear) {  
		if ((userYear % 400) == 0) {
			return true;
		}
	    else if (((userYear % 4) == 0) && ((userYear % 100) != 0)) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputYear = sc.nextInt();
	    if (isLeapYear(inputYear) == true){
	    	System.out.printf("%d is a leap year.\n", inputYear);
	    }
	    else {
	    	System.out.printf("%d is not a leap year.\n", inputYear);
	    }
	}

}
