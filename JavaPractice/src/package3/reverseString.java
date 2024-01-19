package package3;

public class reverseString {
	
	public static void main(String[] args) {
		String str = "I am a bad girl";
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
		
		
		StringBuffer sb = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}

}
