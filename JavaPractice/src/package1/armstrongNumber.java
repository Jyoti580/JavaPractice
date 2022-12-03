package package1;

import java.util.Scanner;

public class armstrongNumber {
	// An Armstrong number is a positive m-digit number
	// that is equal to the sum of the mth powers of their digits.
	public static void main(String[] args) {
		armstrongNumber obj = new armstrongNumber();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(obj.checkArmstrong(number)) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not an armstrong number");
		}
	}

	public boolean checkArmstrong(int num) {
		int oriNum = num;
		int count = 0;
		int result = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		num = oriNum;
		while (num > 0) {
			int rem = num % 10;
			result += Math.pow(rem, count);
			num /= 10;
		}
		if (oriNum == result) {
			return true;
		} else {
			return false;
		}
	}

}
