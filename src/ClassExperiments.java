import java.util.Scanner;
import java.lang.Math;

public class ClassExperiments {
	public static void print(String myString) {
		System.out.print(myString);
	}
	public static void println(String myString) {
		System.out.println(myString);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		print("Enter an integer:\n");
		myInteger = sc.nextInt();
		print("You entered " + myInteger + "\n");
		print("This number to the power of 3 is " + (Math.pow(myInteger, 3)) + "\n");
		
		println("The total area of a square with a side length of " + myInteger + " is " + (Math.pow(myInteger, 2)));
		println("Write a string:");
		sc.nextLine();
		String thisString = sc.nextLine();
		println(thisString);

	}

}
