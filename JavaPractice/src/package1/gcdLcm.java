 package package1;

public class gcdLcm {
	
	public static void main(String[] args) {
		int a = 32; int b = 16;
		int gcd=0;
		for(int i=1;i<=a&&i<=b;i++) {
			if((a%i==0) && (b%i==0)) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		System.out.println("LCM = "+(a*b)/gcd);
	}

}
