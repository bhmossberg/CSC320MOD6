import java.util.Scanner;
import java.lang.Math;

public class MaxMagnitude {
	
	public static int maxMagnitude(int userVal1, int userVal2){
		if (Math.abs(userVal2)>Math.abs(userVal1)) {
			return(userVal2);
		}
		if (Math.abs(userVal1)>Math.abs(userVal2)) {
			return(userVal1);
		}
		else {
			System.out.println("Values have equivalent magnatude.");
			return(userVal1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print(maxMagnitude(x, y));
	}

}
