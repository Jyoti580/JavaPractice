package package1;

public class removeLeadingZeroes {
	
	public static void main(String[] args) {
		removeLeadingZeroes obj = new removeLeadingZeroes();
		obj.replaceZero("00001234");
		obj.replaceZero2("0001882");
	}
	
	public void replaceZero(String str) {
		String newStr = new String();
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				newStr = str.replace(String.valueOf(str.charAt(i)), "");
			}
		}
		System.out.println(newStr);
	}
	
	public void replaceZero2(String str) {
		StringBuffer sb = new StringBuffer(str);
		int i=0;
		while(i<sb.length()&&sb.charAt(i)=='0') {
			i++;
			sb.replace(0, i, "");
		}
		System.out.println(sb);
	}

}