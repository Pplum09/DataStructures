package NumberFill;

public class Driver {

	public static String numberFill(int[] input, int size) {
		
		
		// 0, 1, 3, 6, 7, 10
		String output = "";
		
		
		if (size == 0) {
			return "0-99";
		}
		
		else {
			
			int j = 0;
			int end = 0;
			int element = -1;
			
			for (int i = 0;  i < size; i++) {
				element = input[i];
				if (element != j) {
					
					if ((element - j == 1)) {
						output += Integer.toString(j) + ", ";
						//j++;
					}
					
					else {
						output += (Integer.toString(j + 1) + "-" + Integer.toString(element - 1) + ", ");
						while (j < element - 1) {
							System.out.println("j: " + j);
							j++;
						}
					}
				}
				
				j++;
			}
			
			if (element <= 96) {
				output += Integer.toString(element) + "-99";
			}
			
			else if (element == 97) {
				output += "98, 99";
				
			}
			
			else  if (element == 98){
				output += "99";
			}
		}
		
		return output;
	}
	
	
	public static void main(String[] args) {
		
		int[] input = {0, 1, 3, 22, 25, 26, 28, 67};
		int[] empty = {};
		
		System.out.print("input: ");
		for(int i = 0; i < input.length; i++) {
			
			if (i == input.length - 1) {
				System.out.println(input[i]);
			}
			
			else {
				System.out.print(input[i] + ", ");
			}
		}
		
		System.out.print("output: ");
		System.out.println(numberFill(input, input.length));
		
	}
}
