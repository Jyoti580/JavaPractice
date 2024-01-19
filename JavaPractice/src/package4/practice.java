package package4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
		String str = "Beauty123 lies123 in the eyes123 of beholder";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry entry : set) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		String vowels = "aeiouAEIOU";
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				count++;
			}
		}
		System.out.println("Number of vowels:"+count);
		
		String integers = "0123456789";
		for(int i=0;i<str.length();i++) {
//			if(integers.indexOf(str.charAt(i))==-1) {
//				System.out.print(str.charAt(i));
//			}else {
//				continue;
//			}
			
			if(integers.indexOf(str.charAt(i))!=-1) {
				System.out.print(str.charAt(i));
			}else {
				continue;
			}
		}

	}

}
