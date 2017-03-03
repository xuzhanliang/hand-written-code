package 刷题遇到的算法题;

public class SiDengFen {

	public static void main(String[] args) {
		int[] a = new int[]{2,5,1,1,1,1,4,1,7,3,7};
		int[] b = new int[]{10,2,11,13,1,1,1,1,1};
		int[] c= new int[]{1,1,1,1};
		System.out.println(resolve(a));
		System.out.println(resolve(b));
		System.out.println(resolve(c));
	}
	public static boolean resolve(int[] a){
		boolean result = false;
		int i=0;
		int j=a.length-1;
		int left=a[i];
		int right=a[j];
		while(i<j){
			if(left<right){
				i++;
				left+=a[i];
			}else if(left>right){
				j--;
				right+=a[j];
			}else if(left == right){
				result=checkMiddle(i+1,j-1,left,a);
				if(result){
					return result;
				}else{
					i++;
					left+=a[i];
				}
			}
		}
		return result;
	}
		
	private static boolean checkMiddle(int start,int end,int sum,int[] a){
		int i = start+1;
		int j = end-1;
		int left=a[i];
		int right=a[j];
		while(i<j){
			if(left<right){
				i++;
				left+=a[i];
			}else if(left>right){
				j--;
				right+=a[j];
			}else if(left==right){
				if(j-i==2 && left==sum){
					return true;
				}else{
					return false;
				}
			}
		}
		return false;
	}
}
