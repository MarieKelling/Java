public class Assignment09 
{

		 public static void main(String[] args) {
		 System.out.print("This program is written by Marie Kelling\n\n");

		 // Array of integers
		 int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

		 BubbleSort sort = new BubbleSort();

		 // Print the initial unsorted array
		 System.out.print("Initial Unsorted Array\n");
		 printNumbers(input);
		 
		 // Sort the array
		 int[] output = sort.bubble_srt(input);

		 // Print the final sorted array
		 System.out.print("Final Sorted Array\n");
		 printNumbers(output);

		 }

		 // Method to output an array of integers
		 public static void printNumbers(int[] input) {
		 for (int i = 0; i < input.length; i++) {
		 System.out.print(input[i] + ", ");
		 }
		 System.out.println("\n");
		 }
}