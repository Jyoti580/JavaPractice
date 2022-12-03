package package1;

public class swapPairOfChar {
	public static void main(String[] args) {
		swapPairOfChar obj = new swapPairOfChar();
		obj.swapPair("geeksforgeeks");
	}
	
	public void swapPair(String str) {
		char[] stringArr = str.toCharArray();
		char temp;
		for(int i=0;i<stringArr.length-1;i+=2) {
			temp = stringArr[i+1];
			stringArr[i+1]= stringArr[i];
			stringArr[i]=temp;
		}
		System.out.println(stringArr);
	}

}
