package sort;

public class QuickSort {

	
	
	public static void quickSort(int[] arr){
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] a,int left,int right){
		if(left < right){
			int pivot = a[left];
			int lo = left;
			int hi = right;
			while(lo < hi){
				while(lo<hi && a[hi] >= pivot){
					hi--;
				}
				a[lo]=a[hi];
				while(lo<hi && a[lo]<=pivot){
					lo++;
				}
				a[hi] = a[lo];
			}
			
			a[lo] = pivot;
			quickSort(a,left,lo-1);
			quickSort(a,lo+1,right);
		}
	}
	
	
}
