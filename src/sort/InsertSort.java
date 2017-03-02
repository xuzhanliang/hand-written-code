package sort;

public class InsertSort {

	public static void insertSort(int[] arr){
		if(arr == null || arr.length ==0){
			return ;
		}
		//从第二个数开始循环
		for(int i=1;i<arr.length;i++){
			int j = i;//记录当前数的下标和数值
			int target = arr[j];
			while(j>0 && target<arr[j-1]){//把当前数跟前面比较，直到移动到适当的位置，得到j值
				arr[j] = arr[j-1];
				j--;
			}
			//把当前数值插入到这个位置前
			arr[j] = target;
		}
	}
}
