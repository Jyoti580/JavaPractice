package basicPrograms;

public class lcmOf2Numbers {
	
	/*LCM = least common multiple. Logic:- Take the largest of two numbers.
	 * keep on iterating over it's multiples(should be less than the multiplication
	 * of both numbers). One that is divisible by both,that's the LCM.
	 */
	
	public static void main(String[] args) {
		int a = 24,b=46;
		int largest = a>b?a:b;
		for(int i=largest;i<a*b;i=i+largest) {
			if(i%a==0 && i%b ==0) {
				System.out.println("Least common multiple is: "+i);
				break;
			}
		}
		
		
	}

}
