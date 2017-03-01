package sort;

public class test {
	public static void main(String[] args) {
		int a[] = new int[]{2,5,9,7,8,15,6};
		//BubbleSort.bubbleSort(a);
		SelectSort.selectSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
