package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class countVowelsUsingMap {

	public static void main(String[] args) {
		String str2 = "Beauty lies in the eyes of beholder";
		String str = str2.toLowerCase();
		String vowels = "aeiou";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				if (map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				} else {
					map.put(str.charAt(i), 1);
				}
			}
		}

		Set<Character> keySet = map.keySet();
		for (Character key : keySet) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
