package package1;

import java.util.Arrays;

public class sortAString {

	public static void main(String[] args) {
		sortAString obj = new sortAString();
		obj.sortWithoutSort("Geeksforgeeks");
		obj.sortWithSort("Geeksforgeeks");
	}

	public void sortWithoutSort(String str) {
		char[] stringArray = str.toCharArray();
		char temp;
		int i = 0;
		while (i < stringArray.length) {
			int j = i + 1;
			while (j < stringArray.length) {
				if (stringArray[j] < stringArray[i]) {
					temp = stringArray[j];
					stringArray[j] = stringArray[i];
					stringArray[i] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(stringArray);
	}
	
	public void sortWithSort(String str) {
		char[] stringArr = str.toCharArray();
		Arrays.sort(stringArr);
		System.out.println(stringArr);
	}

}
