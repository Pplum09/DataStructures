package Mergesort;

public class MergeSort {
	
	public MergeSort() {};
	
	public void Merge(int[] input, int first, int mid, int last) {
		int[] temp = new int[last - first];
		int i = first;
		int k = first;
		int j = mid + 1;
		while (i <= mid && j <= last) {
			if (input[i] <= input [j]) {
				temp[k++] = input[i++];
			}
			
			else  {
				temp[k++] = input[j++];
			}
			
		}
		
		while (i <= mid) {
			temp[k++] = input[i++];
		}
		
		while (j <= last) {
			temp[k++] = input[j++];
		}
		
		for (i = first; i < last; i++) {
			input[i] = temp[i];
		}
	}
	
	public void Mergesort(int[] input, int first, int last) {

		if (first < last) {
			
			// recursive split
			int mid = (first + last) / 2;
			Mergesort(input, first, mid);
			Mergesort(input, mid + 1, last);
			
			// merge back
			Merge(input, first, mid, last);
		}
		
	}
	
	public void PrintArray(int[] input) {
		
		for (int i = 0; i < input.length; i++) {
			
			if (i == input.length - 1) {
				System.out.println(input[i]);
			}
			
			else {
				System.out.print(input[i] + ", ");
			}
		}
	}
}
