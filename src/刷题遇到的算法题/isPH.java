package ˢ���������㷨��;

/**
 * ţ����ģ����
 * �ж�һ�������Ƿ�Ϊƽ����
 * ��߳˻������ұ߳˻�
 * 1221 true
 * 1234 false
 */
import java.util.Scanner;
public class isPH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         while (in.hasNextInt()) {
            int a = in.nextInt();
            System.out.println(isPH( a));
         }
        }
    public static String isPH(int a){
    	String s=String.valueOf(a);
    	char[] chars = s.toCharArray();
    	int n=chars.length-1;
    	for(int i=0;i<chars.length-2;i++){
    		int p=1;
    		int q=1;
    		for(int j=0;j<=i;j++){
    			
    			p*=Integer.parseInt(String.valueOf(chars[j]));
    		}
    		for(int k=i+1;k<=n;k++){
    			
    			q*=Integer.parseInt(String.valueOf(chars[k]));
    		}
    		if(p==q){
    			return "YES";
    		}
    	}
    	return "NO";
    }
}