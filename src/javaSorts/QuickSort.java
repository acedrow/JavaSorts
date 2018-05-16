package javaSorts;

public class QuickSort {
	
	public void QuickSort(){
		
	}
	
	public void start(int[] arr){
		long startTime = System.currentTimeMillis();
		quickSort(arr, 0, arr.length-1);
		long endTime = System.currentTimeMillis();
		endTime = endTime - startTime;
		System.out.println("QuickSort time: " + endTime);
	}
	
	public void quickSort (int[] arr, int left, int right){
		if (left >= right){
			return;
		}
		
		int pivot = arr[(right + left) / 2];
		int middle = partition(arr, left, right, pivot);
		quickSort (arr, left, middle - 1);
		quickSort (arr, middle, right);
	}
	
	public int partition(int[] arr, int left, int right, int pivot){
		while (left <= right){
			while (arr[left] < pivot){
				left++;
			}
			while (arr[right] > pivot){
				right--;
			}
			if (left <= right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return left;
		
	}

}
