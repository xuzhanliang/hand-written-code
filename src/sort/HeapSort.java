package sort;

/**
 * 堆排序（大根堆）
 * 步骤：先构造最大堆，然后循环删除堆的根节点的最大值，并将它移到堆尾，
 * 并将堆长度减1，再开始下一次循环。
 * @author lenovo
 *
 */

public class HeapSort {

	public static void HeapSort(int[] arr,int len){
		//构建大根堆
		for(int i=len/2;i>=0;i--){
			heapAdjust(arr,i,len);
		}
		//每次把根节点删掉，在调整堆
		for(int i=len-1;i>=1;i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapAdjust(arr, 0, i);
		}
	}

	private static void heapAdjust(int[] arr, int i, int len) {
		int left = 2*i+1;
		int right = 2*i+2;
		int max=i;
		if(left<len && arr[left] > arr[max]){
			max = left;
		}
		if(right < len && arr[right] > arr[max]){
			max = right;
		}
		if(max!=i){
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			heapAdjust(arr, max, len);
		}
		
	}
}
