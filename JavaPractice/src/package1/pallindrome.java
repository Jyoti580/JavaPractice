package package1;

public class pallindrome {
	
	public static void main(String[] args) {
		pallindrome obj1 = new pallindrome();
		System.out.println(obj1.checkPallindrome(656));
	}
	
	public int reverseInt(int n) {
		int reverse =0;
		while(n!=0) {
			int rem = n%10;
			reverse = reverse*10+rem;
			n=n/10;
		}
		return reverse;
	}
	
	public boolean checkPallindrome(int n) {
		return (n==reverseInt(n));
	}
	

}
