package package3;

public class gcd {
	
	public static void main(String[] args) {
		int a=24,b=48,gcd=1;
		for(int i=2;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		System.out.println((a*b)/gcd);
	}

}
