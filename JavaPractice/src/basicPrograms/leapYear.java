package basicPrograms;

public class leapYear {
	
	public static void main(String[] args) {
		/*Leap year: If century year should be divisible by 400 
		 *else divisible by 4
		 */
		
		int num = 2024;
		if(num%100==0) {
			if(num%400==0) {
				System.out.println("It's a leap year");
			}else {
				System.out.println("It's not a leap year");
			}
		}else {
			if(num%4==0) {
				System.out.println("It's a leap year");
			}else {
				System.out.println("It's not a leap year");
			}
		}
	}

}
