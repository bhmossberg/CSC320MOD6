import java.util.Scanner;
import java.util.Arrays;

public class SwappingVariables {
	//public static void swapValues(int[] values) {
	//	System.out.println(values[1] + " " + values[0]);
	//}
	// below reassigns the values within the array vice just presenting the values in reverse order
	public static void swapValues(int[] values) { // pulls in array
		for (int i = 0; i <values.length; ++i) { //start at beginning of array, iterate to final index
			if (i < values.length/2) { //if index value is in first half
				int temp = values[i]; // save that index value to temp
				values[i] = values[values.length-i-1]; //pull mirror side index value to i
				values[values.length-i-1] = temp; //move original index val to mirrored side
			}
	    }

	    //System.out.println(Arrays.toString(values));
	    // print as directed in assignment
	    for (int i = 0; i < values.length; ++i) {
            System.out.print(values[i]);
            if (i < values.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = 4;
		int[] userArray = new int[arrayLength];
		for (int i = 0; i < userArray.length; ++i) {
			userArray[i] = sc.nextInt();
		}
		swapValues(userArray);

	}

}
