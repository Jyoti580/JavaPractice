package package3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class alpfreq {
	
	public static void main(String[] args) {
		String str = "Beauty lies in the eyes of beholder";
		String str2 = "aeiouAEIOU";
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		Set<Entry<Character,Integer>> set = map.entrySet();
		for(Entry entry:set) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str2.indexOf(str.charAt(i))!=-1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
