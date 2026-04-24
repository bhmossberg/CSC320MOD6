import java.util.Scanner;

public class Jiffy {
	public static double secondsToJiffies(double userSeconds) {
		return userSeconds * 100.0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double yourValue = secondsToJiffies(sc.nextInt());
		System.out.printf("%.2f", yourValue);
	}

}
