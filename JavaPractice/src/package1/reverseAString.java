package package1;

public class reverseAString {

	public static void main(String[] args) {
		reverseAString obj = new reverseAString();
		System.out.println("StringBuffer Method used "+obj.reverseString("Hello World"));
		obj.reverseWithoutStringBuffer("Hello world 2x");
	}
	
	public String reverseString(String str) {
		StringBuffer sb = new StringBuffer();
		for(int i =str.length()-1;i>=0;i--) {
			sb.append(str.toLowerCase().charAt(i));
		}
		return sb.toString();
	}
	
	public void reverseWithoutStringBuffer(String str) {
		for(int i= str.length()-1;i>=0;i--) {
			System.out.print(str.toUpperCase().charAt(i));
		}
	}

}
