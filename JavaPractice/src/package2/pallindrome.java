package package2;

import java.util.Scanner;

public class pallindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER: ");
		int num = sc.nextInt();
		if(reverseInteger(num)==num) {
			System.out.println("It's a pallindrome");
		}else {
			System.out.println("It's NOT a pallindrome");
		}
	}

	private static int reverseInteger(int num) {
		int reverse =0;
		while(num>=1) {
			int rem = num %10;
			reverse = reverse*10+rem;
			num/=10;
		}
		System.out.println(reverse);
		return reverse;
	}

}
