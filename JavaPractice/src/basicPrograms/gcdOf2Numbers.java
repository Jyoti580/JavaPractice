package basicPrograms;

public class gcdOf2Numbers {

	/*GCD = Greatest common divisor. Logic:- gcd=1. iterate from 1 till 
	 * the numbers to find divisibles. Assign the divisible int to gcd.
	 * Largest one will be gcd. 
	 */
	public static void main(String[] args) {
		int a = 24, b = 46, gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD is: " + gcd);
		System.out.println("LCM IS: "+ (a*b)/gcd);
	}

}
