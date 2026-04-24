import java.util.Scanner;

public class DrivingCost {
	public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
		return drivenMiles / milesPerGallon * dollarsPerGallon;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double userMPG = sc.nextDouble();
		double userDPG = sc.nextDouble();
		System.out.printf("%.2f %.2f %.2f\n", drivingCost(10.0, userMPG, userDPG), drivingCost(50.0, userMPG, userDPG), drivingCost(400.0, userMPG, userDPG));

	}

}
