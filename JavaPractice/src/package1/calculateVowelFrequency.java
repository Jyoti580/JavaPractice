package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class calculateVowelFrequency {

	public static void main(String[] args) {
		
		//Calculate frequency of alphabets
		String str = "This is an English sentence. English is a language";
		String str2 = str.toLowerCase();
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');

		List<Character> list2 = new ArrayList<Character>();
		for (int i = 0; i < str2.length(); i++) {
			list2.add(str2.charAt(i));
		}

		for (int j = 0; j < list.size(); j++) {
			if (list2.contains(list.get(j))) {
				System.out.println(list.get(j)+" "+Collections.frequency(list2, list.get(j)));
			}
		}
	}

}
