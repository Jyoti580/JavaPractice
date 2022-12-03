package package1;

public class reverseInteger {
	
	public static void main(String[] args) {
		reverseInteger obj1 = new reverseInteger();
		obj1.reverseInteger(569);
	}
	
	public void reverseInteger(int n) {
		int reverse = 0;
		while(n!=0) {
			int remainder = n%10;
			reverse = reverse*10+remainder;
			n/=10;
		}
		System.out.println(reverse);
	}

}
