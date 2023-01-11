package basicPrograms;

public class neonNumber {
	
	/*Neon number = Sum of digits of square of the number same as
	 * the actual number.
	 */
	
	public static void main(String[] args) {
		System.out.println("Neon numbers are:- ");
		for(int i=1;i<=100;i++) {
//			if(checkNeon(i)) {
//				System.out.println(i);
//			}
			int result =0,flag=i*i;
			while(flag>0) {
				int rem=flag%10;
				result+=rem;
				flag/=10;
			}
			if(result == i) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean checkNeon(int num) {
		int result =0,square = num*num;
		while(square>0) {
			int rem = square%10;
			result+=rem;
			square=square/10;
		}
		if(result == num) {
			return true;
		}else {
			return false;
		}
	}

}
