package search;

public class BinarySearch {

	public static int binarySearch(int[] array,int searchKey){
		int low = 0;
		int high = array.length - 1;
		while(low <= high){
			//int middle = (low + high) / 2;
			int middle=low + ((high-low)>>1);//防止溢出，移位更高效
			if(array[middle] > searchKey){
				high = middle - 1;
			}else if(array[middle] < searchKey){
				low = middle + 1;
			}else{
				return middle;
			}
		}
		return -1;
	}
}
