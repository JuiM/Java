import java.util.Arrays;


public class Sorting {


	public static void main(String[] args) {
		int[] a = randomArray(20000);
		long before = System.currentTimeMillis();
		bubbleSort(a);
		long after = System.currentTimeMillis();
		long difference = after - before;
		System.out.println("Took our BubbleSort " + difference + " milliseconds");

		before = System.currentTimeMillis();
		selectionSort(a);
		after = System.currentTimeMillis();
		difference = after - before;
		System.out.println("Took Selection sort " + difference + " milliseconds");
		
		before = System.currentTimeMillis();
		Arrays.sort(a);
		after = System.currentTimeMillis();
		difference = after - before;
		System.out.println("Took Arraysort " + difference + " milliseconds");
		//keep having to bubbleSort
		//you have to do it how many integers you have times
		//since i put it in for loop, don't need to repeat this, only once

		/*while loop method and for loop method for printing arrays

		int index = 0;
		while (index < a.length() ){
			System.out.println(a[index]);
			index++;
		}
     for(int index = 0; index< a.length;index++){
    	 System.out.println(a[index]);
     }
     Extra NOTES:
      once you make an its final, you can't add anything to it
     bubble sort:you check 2 numbers at a time and sort them in its place
     selection sort: find the smallest number and puts it in it's place
		 */
	} 

	public static int[] randomArray(int n){
		// Make an array of size n
		int[] array = new int[n];
		//Go to every space inside the array
		for (int i = 0; i< array.length; i++){
			//put a random value in the i'th space
			array[i] = (int)(Math.random() * Integer.MAX_VALUE);
		}
		//return the random array
		return array;
	}
	//new type of selection
	public static int[] selectionSort(int[] array){
		for(int round =0; round < array.length; round++){
			int saved = Integer.MAX_VALUE;
			int where = 0;
			for(int i=0;i <array.length ; i++){
				if (array[i] < saved){
					saved = array [i];
					where = i;
				}
			}
			swap(array,where,round);
		}
		return array;
	}
	//created a swap method
	//now using the bubbleSort
	public static int[] bubbleSort(int[]array){
		//Do swapping routine array.length number of times
		for(int j = 0;j<array.length;j++){
			//go through the array and swap as necessary
			for(int i=0; i < array.length - 1-j; i++ ){
				if (array[i] > array[i+1]){
					swap(array, i, i+1);
				}
			}
		}
		return array;
	}
	public static int [] swap(int[]array, int a, int b){
		//save the value of a before saving it
		//array[a]= number at index of a 
		int save = array[a];
		array[a] = array[b];
		array[b]= save;
		return array;
	}

}
