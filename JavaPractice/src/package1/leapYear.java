package package1;

import java.util.Scanner;

public class leapYear {
	// A year is a leap year if it's divisible by 4
	// But if it's a century year it should be divisible by 4 as well as 100
	// So a century year is leap year if it's divisible by 400
	// e.g 1900 even if divisible by 4 , it's not a leap year
	public static void main(String[] args) {
		boolean is_LeapYear = false;
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0) {
			is_LeapYear = true;
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					is_LeapYear = true;
				} else {
					is_LeapYear = false;
				}
			}
		}
		if (is_LeapYear == true) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}

}
