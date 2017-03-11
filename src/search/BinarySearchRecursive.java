package search;

public class BinarySearchRecursive {

	public static int binarySearchRecursive(int[] array,int x,int low,int high){
		if(low > high) return -1;
		int mid = (low+high) /2;
		if(array[mid]<x){
			return binarySearchRecursive(array, x, mid+1, high);
		}else if(array[mid]>x){
			return binarySearchRecursive(array, x, low, mid - 1);
		}else{
			return mid;
		}
	}
}
