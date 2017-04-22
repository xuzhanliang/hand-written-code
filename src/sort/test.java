package sort;

public class test {
	public static void main(String[] args) {
		int a[] = new int[]{5,3,8,6,4};
		//BubbleSort.bubbleSort(a);
		//SelectSort.selectSort(a);
		//InsertSort.insertSort(a);
		QuickSort.quickSort(a);
		//HeapSort.HeapSort(a, a.length);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
