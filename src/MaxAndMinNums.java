import java.util.Scanner; 
public class MaxAndMinNums {
	public static int largestNumber(int num1, int num2, int num3) throws Exception {
		int largest = num1;
		if ((num1 == num2) && (num2 == num3)) {
			throw new Exception("All numbers equal");
		}
		else if ((num1 >= num2) && (num1 >= num3)){
			largest = num1;
		}
		else if ((num2 >= num3) && (num2 >= num1)) {
			largest = num2;
		}
		else if ((num3 >= num1) && (num3 >= num2)) {
			largest = num3;
		}

		return largest;
	}
	public static int smallestNumber(int num1, int num2, int num3) throws Exception {
		int smallest = num1;
		if ((num1 == num2) && (num2 == num3)) {
			throw new Exception("All numbers equal");
		}
		else if ((num1 <= num2) && (num1 <= num3)){
			smallest = num1;
		}
		else if ((num2 <= num3) && (num2 <= num1)) {
			smallest = num2;
		}
		else if ((num3 <= num1) && (num3 <= num2)) {
			smallest = num3;
		}

		return smallest;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int theBig = x;
		int theSmall = x;
		try {
			theBig = largestNumber(x, y, z);
			theSmall = smallestNumber(x, y, z);
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage()); 
		}
		System.out.println("largest: " + theBig);
		System.out.println("smallest: " + theSmall);
		

	}

}
