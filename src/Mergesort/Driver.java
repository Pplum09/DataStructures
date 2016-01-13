package Mergesort;

public class Driver {
	
	public static void main(String[] args) {
		int[] input = {3, 1, 4, 2, 5};
		
		// check for empty array
		if (input.length == 0) {
			System.out.println("input is empty");
		}
		
		else {
			
			MergeSort sort = new MergeSort();
			
			System.out.print("input: ");
			sort.PrintArray(input);
			sort.Mergesort(input, input[0], input.length - 1);
			System.out.print("output: ");
			sort.PrintArray(input);
		}
		
		
	}
}
