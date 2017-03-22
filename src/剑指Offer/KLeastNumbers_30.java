package ½£Ö¸Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KLeastNumbers_30 {
	public static void main(String[] args) {
		int[] a= new int[]{4,5,1,6,2,7,3,8,9,5,6,4,1,56,45,64,65,0,2,1};
		System.out.println(GetLeastNumbers_Solution(a, 4));
	}

	
	    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] arr, int k) {
	       
	        ArrayList<Integer> res = new ArrayList<Integer>();
			if(k > arr.length || k == 0){
	           return res;
	       }
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, comparator);
			for(int i=0;i<arr.length;i++){
				if(maxHeap.size()<k){
					maxHeap.offer(arr[i]);
				}else{
					int maxInQueue = maxHeap.peek();
					if(maxInQueue>arr[i]){
						maxHeap.poll();
						maxHeap.offer(arr[i]);
					}
				}
			}
	        
			for(Integer integer:maxHeap){
				res.add(integer);
			}
			return res;
	    }
	    public static Comparator<Integer> comparator =new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		};
	}
