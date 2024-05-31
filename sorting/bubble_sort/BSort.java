//Bubble Sort Algorithm
// 	Pairs of adjacent elements are compared and the elements swapped if they are not in order. Kind of like water, where the heavy objects sink( goto right) and lighter objects float( goto left). <- Ascending order
// 	Runtime complexity : O(n^2) : Quadratic time
// 	Bad with large data sets, okay-ish with small data sets
// 	Not really used widely

public class BSort{
	public static void main( String[] args ){
		int [] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		bubbleSort(array);

		for ( int i: array){
			System.out.println(i);
		}
	}

	private static void bubbleSort( int [] array){
		for ( int i=0; i < array.length - 1; i++){
			for ( int j = 0; j < array.length - i - 1; j++ ){
				if ( array[j] > array[j + 1] ){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j+1] = temp;
				}
			}
		}
	}
}
