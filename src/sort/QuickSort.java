package sort;

public class QuickSort {

	public static int partition(int[] arr,int left,int right){
		int pivot = arr[left];//数组第一个数为中轴
		while(left < right){
			while(left < right && arr[right] >= pivot){
				right--;
			}
			arr[left] = arr[right];//比中轴小的记录移到左端
			while(left < right && arr[left] <= pivot){
				left++;
			}
			arr[right] = arr[left];//比中轴大的记录移动到右端
		}
		arr[left] = pivot;
		return left;
	}
	
	public static void quickSort(int[] arr){
		quick(arr,0,arr.length-1);
	}

	private static void quick(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left>=right) return ;
		int mid = partition(arr, left, right);
		quick(arr, left, mid);
		quick(arr, mid+1, right);
	}
}
