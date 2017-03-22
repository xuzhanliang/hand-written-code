package 剑指Offer;


import java.util.LinkedHashMap;

public class FirstNotRepeatingChar_35 {

	public int FirstNotRepeatingChar(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		//第一次扫描，没扫描到一个字符就在哈希表的对应项中把次数加1
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				int time = map.get(str.charAt(i));
				map.put(str.charAt(i), ++time);
			}else{
				map.put(str.charAt(i),1);
			}
		}
		//第二次扫描，返回第一个次数为1的字符。
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(map.get(c)==1){
				return i;
			}
		}
        return -1;
    }
}
