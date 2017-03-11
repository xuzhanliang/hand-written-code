package search;

public class test {
	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,4,5,6,7,8};
		int key = BinarySearch.binarySearch(a, 7);	
		int key1 = BinarySearchRecursive.binarySearchRecursive(a, 7, 0, 7);
		System.out.println(key);
		System.out.println(key1);
	}

	
}
