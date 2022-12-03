package package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class removeDuplicatesFromList {
	
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			if(newList.contains(list.get(i))) {
				continue;
			}else {
				newList.add(list.get(i));
			}
		}
		
		for(int j=0;j<newList.size();j++) {
			System.out.println(newList.get(j));
		}
		
	}

}
