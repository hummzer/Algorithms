//Selection Sort Algorithm
//	Searches through an array and keeps track of the minimum value during each iteration. Swap variables at the end of each iteration.
//	Okay with small data sets
//	Bad with large data sets
//	Run time complexity: O(n^2) : Quadratic time

public class SSort{
	public static void main( String [] args ){
		int array [] = { 8, 7, 9, 2, 3, 1, 5, 4, 6 };
		selectionSort(array);

		for ( int i: array ){
			System.out.println(i);
		}
	}

	//Selection Sort Algorithm logic
	private static void selectionSort(int [] array){
		for( int i = 0; i < array.length - 1; i++ ){
			int min = i;
			for( int j = i + 1; j < array.length; j++){
				if( array[min] > array[j] ){
					min = j;
				}
			}

			//Variable switching
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
}
