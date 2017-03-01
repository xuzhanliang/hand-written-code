package sort;


public class BubbleSort {
    
    public static void bubbleSort(int[] arr) {//将要排序的数字放入一个数组中
    	  //判断需要排序的数组是否为空，为空则不进行排序
        if(arr == null || arr.length == 0)
            return ;
        //i控制外循环即总共需要将多少个数字进行排序，j控制内循环即每次循环都会将最大的数排到右边
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i; j<arr.length-i-1; j++) {
            		//如果前面的数字大于后面的数字就将前面的数字和后面的数字进行交换，直接最大的数字被排到最右侧
                if(arr[j] > arr[j+1]) {
                    swap(arr, j+1, j);
                }
            }
        }
    }
    
    //交换两个数字的位置
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}