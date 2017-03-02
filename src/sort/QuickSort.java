package sort;

public class QuickSort {

	public static int partition(int[] arr,int left,int right){
		int pivot = arr[left];//�����һ����Ϊ����
		while(left < right){
			while(left < right && arr[right] >= pivot){
				right--;
			}
			arr[left] = arr[right];//������С�ļ�¼�Ƶ����
			while(left < right && arr[left] <= pivot){
				left++;
			}
			arr[right] = arr[left];//�������ļ�¼�ƶ����Ҷ�
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
