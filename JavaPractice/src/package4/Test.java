package package4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		String str1 = "listene";
		String str2 = "silenth";
		boolean flag = true;

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);


		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[i]) {
					continue;
				} else {
					flag = false;
				}
			}
		}

		if (flag == true) {
			System.out.println("It's an anagram");
		} else {
			System.out.println("It's not an anagram");
		}
	}
	
	/*public static void main(String[] args) {
		String str = "india is india";
//		String finalstr = "";
//		for (int i = 0; i < str.length(); i++) {
//			if (finalstr.contains(String.valueOf(str.charAt(i)))) {
//				continue;
//			} else {
//				finalstr=finalstr.concat(String.valueOf(str.charAt(i)));
//			}
//		}
//		System.out.println("String after removing duplicates:"+finalstr);
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		
		
		Set<Entry<Character,Integer>> set = map.entrySet();
		for(Entry entry:set) {
			
			//System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue().toString().equals("1")) {
				System.out.println(entry.getKey());
			}
		}
		
//		for(int i=finalstr.length()-1;i>0;i--) {
//			System.out.print(finalstr.charAt(i));
//		}
		
	}*/
}
