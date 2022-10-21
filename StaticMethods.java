import java.util.*;

public class StaticMethods {
	
	public static int[] toPower(int size, int power) {
		
		int[] myArray = new int[size];
		
		for (int i=0; i < size; i++) {
			myArray[i] = (int) (Math.pow(i, power));
		}
		return myArray;
	}

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Number for size: ");
		int size = number.nextInt();
		System.out.println("Number for power: ");
		int power = number.nextInt();
		int[] output = toPower(size,power);
		for(int i=0; i<size; i++) {
			System.out.print(output[i]+" ");
		}

	}

}
