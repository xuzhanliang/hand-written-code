package ½£Ö¸Offer;

public class LeftRotateString_42 {

	public String LeftRotateString(String str,int n){
		if(str.length()<0 || n>str.length()){
			return "";
		}
		StringBuffer sb1 = new StringBuffer(str.substring(0, n));
		StringBuffer sb2 = new StringBuffer(str.substring(n, str.length()));
		sb2.append(sb1);
		return sb2.toString();
		
	}
    
}
