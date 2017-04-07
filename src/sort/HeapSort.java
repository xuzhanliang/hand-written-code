package sort;

/**
 * �����򣨴���ѣ�
 * ���裺�ȹ������ѣ�Ȼ��ѭ��ɾ���ѵĸ��ڵ�����ֵ���������Ƶ���β��
 * �����ѳ��ȼ�1���ٿ�ʼ��һ��ѭ����
 * @author lenovo
 *
 */

public class HeapSort {

	public static void HeapSort(int[] arr,int len){
		//���������
		for(int i=len/2;i>=0;i--){
			heapAdjust(arr,i,len);
		}
		//ÿ�ΰѸ��ڵ�ɾ�����ڵ�����
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
