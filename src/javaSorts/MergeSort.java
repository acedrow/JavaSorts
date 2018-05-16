package javaSorts;


public class MergeSort {
	
	public MergeSort(){
		
	}
	
	public int[] start(int [] toSort){
		//log start time
		long startTime = System.currentTimeMillis();
		
		sort(toSort, 0, toSort.length-1);
		
		return toSort;
	}

	public void sort(int toSort[], int l, int r ){
		// find mid-point of the array
		if (l < r){
		int m = (l+r)/2;
		
		//sort() first and second halves
		sort(toSort, l, m);
		sort(toSort, m+1, r);
		
		
		
		}
	}
	
	public void merge (int toSort, int l, int m, int r){
		
	}
}
