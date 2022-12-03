package package1;

import java.util.ArrayList;
import java.util.List;

public class countVowels {
	
	public static String abc = staticMethod();
	public static void main(String[] args) {
		//string indexOf () is a built-in method that returns the 
		//index of a given character value or substring. 
		//If it is not found, then it returns -1.
		String vowel = "aeiouAEIOU";
		String str = "afErbhIou";
		int count =0;
		List<Character> list = new ArrayList<Character>();
		for(int i =0;i<str.length();i++) {
			if(vowel.indexOf(str.charAt(i))!=-1) {
				count++;
				list.add(str.charAt(i));
			}
		}
		System.out.println(count);
		System.out.println(list);
	}
	
	public static String staticMethod() {
		System.out.println("Static");
		return "abc";
	}

}
