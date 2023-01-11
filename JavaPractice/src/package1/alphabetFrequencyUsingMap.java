package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class alphabetFrequencyUsingMap {

	public static void main(String[] args) {
		String str = "Beauty lies in the eyes of beholder";
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < str.toLowerCase().length(); i++) {
			list.add(str.toLowerCase().charAt(i));
		}
//		for (int j = 0; j < list.size(); j++) {
//			System.out.println(list.get(j) + " " + 
//					Collections.frequency(list, list.get(j)));
//		}
		Map<Character,Integer> map = new HashMap<>();
		for(int x=0;x<list.size();x++) {
			if(map.containsKey(list.get(x))) {
				map.put(list.get(x), map.get(list.get(x))+1);
			}else {
				map.put(list.get(x), 1);
			}
		}
		
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}

}
