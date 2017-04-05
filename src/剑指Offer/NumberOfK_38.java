package 剑指Offer;

public class NumberOfK_38 {
	
	public static int getFirstK(int[] array,int k,int start,int end){
		while(start<=end){
			int mid = (start+end)/2;
			if(k<array[mid]){//如果中间的数字比k大， 只找前半段
				end=mid-1;
			}else if(k>array[mid]){//如果中间的数字比k小，只找后半段
				start=mid+1;
			}else{
				if((mid>0&&array[mid-1]!=k)||mid==0){//结束条件，中间的数字的前一个不是k
					return mid;
				}else{//如果前面数字也是k，说明第一个k在前半段。
					end=mid-1;
				}
			}
		}
		return -1;
	}
	public static int getLastK(int[] array,int k,int start,int end){
		while(start<=end){
			int mid = (start+end)/2;
			if(k<array[mid]){
				end=mid-1;
			}else if(k>array[mid]){
				start=mid+1;
			}else{
				if((mid<array.length-1&&array[mid+1]!=k)||mid==array.length-1){
					return mid;
				}else{
					start=mid+1;
				}
			}
		}
		return -1;
	}
	
	public int GetNumberOfK(int [] array , int k) {
		if(array==null||array.length==0){
			return 0;
		}
		int first=getFirstK(array, k, 0, array.length-1);
		int last = getLastK(array, k, 0, array.length-1);
		if(first==-1||last==-1){
			return 0;
		}else{
			return last-first+1;
		}
		
	}
}
