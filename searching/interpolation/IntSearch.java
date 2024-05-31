// Interpolation Search Algorithm
// 	Best used for uniformly distributed guesses, where a value might be based on the calculated probe results, If probe is incorrect, search area is narrowed and a new probe is calculated
// 	Runtime Complexity
// 		Average Case: O(log (log (n))) 
// 		Worst Case: O(n) : Linear time

public class IntSearch{
	public static void main( String args[]){
		int [] array = { 2, 4, 5,  8, 10, 18, 40, 100, 123, 293, 343, 488, 599, 656, 700, 855 };
		int target = 343;
		int index = interpolationSearch(array, target);

		if ( index != -1) System.out.println("Element found at index :" + index);
		else System.out.println(" No target was found!! ");
	}

	private static int interpolationSearch( int[] array, int target){
		int high = array.length -1;
		int low  = 0;
		
		while ( target >= array[low] && target <= array[high] && low <= high){
			int probe = low + ( high - low ) * ( target - array[low]) / (array[high] - array[low]);

			System.out.println("Probe: " + probe );
			
			if (array[probe] == target){
				return probe;
			} else if ( array[probe] < target){
				low = probe + 1;
			} else {
				high = probe -1;
			}
		}
		return -1;
	}
}
