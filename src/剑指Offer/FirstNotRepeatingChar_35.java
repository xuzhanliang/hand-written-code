package ��ָOffer;


import java.util.LinkedHashMap;

public class FirstNotRepeatingChar_35 {

	public int FirstNotRepeatingChar(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		//��һ��ɨ�裬ûɨ�赽һ���ַ����ڹ�ϣ��Ķ�Ӧ���аѴ�����1
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				int time = map.get(str.charAt(i));
				map.put(str.charAt(i), ++time);
			}else{
				map.put(str.charAt(i),1);
			}
		}
		//�ڶ���ɨ�裬���ص�һ������Ϊ1���ַ���
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(map.get(c)==1){
				return i;
			}
		}
        return -1;
    }
}
