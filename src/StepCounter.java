import java.util.Scanner;
public class StepCounter {

	public static double stepsToMiles(int userSteps) {
		return ((float)userSteps) / 2000.0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double yourValue = stepsToMiles(sc.nextInt());
		System.out.printf("%.2f", yourValue);
	}

}
