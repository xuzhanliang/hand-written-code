package ½£Ö¸Offer;

public class FirstCharAppearingOnce_55 {

	int[] hash = new int[256];
	StringBuffer sb = new StringBuffer();
	
	public void Insert(char ch){
		sb.append(ch);
		if(hash[ch]==0){
			hash[ch]=1;
		}else{
			hash[ch] += 1;
		}
	}
	public char FirstApperingOnce(){
		char[] str = sb.toString().toCharArray();
		for(char c:str){
			if(hash[c]==1){
				return c;
			}
		}
		return '#';
	}
}
