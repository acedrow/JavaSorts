package javaSorts;
public class JavaSortDriver {

	public static void main(String[] args){
		int n = 1000;
		int[] random = new int[n];
		setRandom(random, 100);
		
		//print out array values
		//for (int i = 0; i < toSort.length; i++){
		//	System.out.print(toSort[i] + ", ");
		//}
		//System.out.println();
		
		//Do bubblesort
		BubbleSort js = new BubbleSort();
		js.bubbleSort(random);
		
		//reset random values
		setRandom(random,100);
		
		//Do mergesort
		 MergeSort ms = new MergeSort();
		 ms.start(random);
		
	}
	
	//method that fills the given array with random integers ranging from 0 to the specified maximum value.
	public static int[] setRandom (int[] arr, int max){
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * max + 1);
		}
		return arr;
	}
}
