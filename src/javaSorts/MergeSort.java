package javaSorts;


public class MergeSort {
	
	public MergeSort(){
		
	}
	
	public int[] start(int [] toSort){
		//log start time
		long startTime = System.currentTimeMillis();
		
		mergeSort(toSort, 0, toSort.length-1);
		
		long endTime = System.currentTimeMillis();
		endTime = endTime - startTime;
		System.out.println("Mergesort time: " + endTime);
		return toSort;
	}

	//recursive method to handle splitting up of the array and eventual calls to the merge method for sorting.
	public void mergeSort(int toSort[], int leftStart, int rightEnd ){
		// find mid-point of the array
		if (leftStart >= rightEnd){
			return;
		}
		int middle = (leftStart+rightEnd)/2;
		
		//sort() first and second halves
		mergeSort(toSort, leftStart, middle);
		mergeSort(toSort, middle+1, rightEnd);
		merge(toSort, leftStart, rightEnd);
		
		
		}
	
	
	public void merge (int[] arr, int leftStart, int rightEnd){
		int[] temp = new int[arr.length];
		int leftEnd = (leftStart + rightEnd)/2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		int l = leftStart;
		int r = rightStart;
		int index = leftStart;
		
		//Iterates through both sub arrays, putting their values into sorted order in the temp array.
		while (l <= leftEnd && r <= rightEnd){
			if (arr[l] <= arr[r]){
				temp[index] = arr[l];
				l++;
			} else {
				temp[index] = arr[r];
				r++;
			}
			index++;
		}
		//for loops copy remaining values into the temp array when l or r go out of bounds
		for (int i = l; i <= leftEnd; i++){
			temp[index] = arr[i];
			index++;
		}
		for (int i = r; i <= rightEnd; i++){
			temp[index] = arr[i];
			index++;
		}
		//copy temp array values over to sorting array
		for (int i = leftStart; i <= rightEnd; i++){
			arr[i] = temp[i];
		}
		
	}
}
