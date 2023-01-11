package basicPrograms;

public class primeNumbers {

	public static void main(String[] args) {
		
		/*A prime number is a number which has no factors between 2 and 
		 * (number/2) Why number/2 -> Because after that it's divisible
		 *  only by itself  
		 */
		int x, y, num = 25, flag;
		System.out.println("The prime numbers are: ");
		for (x = 2; x <= num; x++) {
			flag=1;
			for (y = 2; y <= x / 2; y++) {
				if (x % y == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.print(x+" ");
			}
		}
	}

}
