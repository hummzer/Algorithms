//Linear Search Algorithm
//	Algorithm iterates a collection one element at a time
//	Slow for large data sets, fast for small to medium data sets
//	Does not need to be sorted(Biggest advantage)
//	Useful for data structures without random access e.g, LinkedList
//	Runtime Complexity: O(n) : Linear Time [ Time increases with data increase ]

public class LSearch{
	public static void main( String args[]){
		//Initializing the array to be traversed
		int [] array = { 5, 3, 12, 8, 9, 1, 0,7, 22 };

		//Instantiating the Linear Search Algorithm, to look for index of "1" in the array
		int index = linearSearch( array, 1);

		//Condition to ensure the index of the value being found is error return value of Algorithm function
		if ( index != -1 ){
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found!!");
		}
	}
	
	//Linear Search Algorithm Logic
	private static int linearSearch(int[] array, int value ){
		for ( int i=0; i < array.length;  i++){
			if ( array[i] == value ){
				return i;
			}
		}
		return -1;
	}

}
