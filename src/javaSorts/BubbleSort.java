package javaSorts;

import java.math.*;
public class BubbleSort {

	public BubbleSort(){
		
	}
	
	public int[] bubbleSort(int[] toSort){
		//log start time
		long startTime = System.currentTimeMillis();
		boolean swap = false;
		do{
			swap = false;
			for (int i = 0; i < toSort.length-1; i++){
				if (toSort[i] > toSort[i+1]){
					int temp = toSort[i];
					toSort[i] = toSort[i+1];
					toSort[i+1] = temp;
					swap = true;
				}
			}
		} while (swap == true);
		
		
		
		long endTime = System.currentTimeMillis();
		endTime = endTime - startTime;
		
		System.out.println("Bubblesort time: " + endTime);
		
		return toSort;
	}
}
