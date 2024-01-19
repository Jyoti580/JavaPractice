package package3;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		String str = "12Test34Automation56";
		List<String> list = new ArrayList<>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		int sum =0;
		for(int i=0;i<list.size();i++) {
			if(str.indexOf(list.get(i))!=-1){
				sum+=Integer.parseInt(list.get(i));
			}
		}
		System.out.println(sum);
	}

}
