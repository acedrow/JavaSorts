package javaSorts;
public class JavaSortDriver {

	public static void main(String[] args){
		int n = 100000;
		int[] random = new int[n];
		setRandom(random, 100);
		
		//Do bubblesort
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(random);
		
		//reset random values
		setRandom(random,100);
		
		//Do mergesort
		 MergeSort ms = new MergeSort();
		 ms.start(random);
		 
		//reset random values
		setRandom(random,100);
		
		//Do Quicksort
		QuickSort qs = new QuickSort();
		qs.start(random);
		
	}
	
	//method that fills the given array with random integers ranging from 0 to the specified maximum value.
	public static int[] setRandom (int[] arr, int max){
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * max + 1);
		}
		return arr;
	}
	
	public static void printArray(int[] toPrint){
		for (int i = 0; i <toPrint.length; i++){
			System.out.print(toPrint[i] + ", ");
		}
		System.out.println();
	}
}
