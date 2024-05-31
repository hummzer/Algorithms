//Insertion Sort Algorithm
//	After comparing elements to the left, shift elements to the right to make room to insert a value. Starts at index 1 instead of 0.
//	Runtime complexity : O(n^2) : Quadratic time
//	Decent for small data sets, bad for large data sets
//	Best Case is O(n) compared to selection sort O(n^2)
//	Uses less steps than Bubble Sort 

public class InsSort{
	public static void main( String[] args ){
		int [] array = { 9, 1, 8, 2, 7, 6, 3, 5, 4 };
		insertionSort(array);

		for ( int i: array){
			System.out.println( i + " ");
		}
	}

	private static void insertionSort( int[] array){
		for ( int i = 1; i < array.length; i++){
			int temp = array[i];
			int j = i - 1;

			while( j >= 0 && array[j] > temp ){
				array[j +1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
	}
}
