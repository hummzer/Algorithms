// Binary Search Algorithm
// 	Finds position of a target value within a sorted array, where half of the array is eliminated during each step
// 	Efficient with large data sets
//	Runtime complexity : O(log n): Logarithmic time( More efficient with increase in data )
//

public class BSearch {
	public static void main( String [] args){
		//Initializing array to be traversed
		int [] array = new int[1000];
		int target = 603;

		//Indexing the entire array
		for ( int i = 0; i < array.length; i++){
			array[i] = i;
		}

		//Instantiating the Binary Search Function to search for index of target value
		int index = binarySearch(array, target);

		//Condition to catch errors and exception from algorithm function
		if ( index == -1) System.out.println("Target not found!!");
		else System.out.println("Target found at index: " + index);

	}

	//Binary Search Algorithm Logic
	private static int binarySearch(int [] array, int target){
		int low = 0;
		int high = array.length - 1;
		while ( low <= high  ){
			int middle = low + ( high - low ) / 2;
			int value = array[middle]; // Sets middle value of array to "value" variable

			System.out.println("Middle : " + middle );

			//Checks if value is less than target
			if ( value < target ) low = middle + 1;

			//Checks if value is greater than target
			else if( value > target ) high = middle - 1;

			//Only condition checking if value == target
			else return middle;
		}
		return -1;
	}
}
