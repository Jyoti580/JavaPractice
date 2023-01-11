package basicPrograms;

public class armStrongNumber {
	
	/*Armstrong number = A positive m-digit number which is same as 
	 * sum of mth power of all it's digits.
	 */
	
	public static void main(String[] args) {
		int num = 500;
		for(int i = 1;i<=num;i++) {
			int count =0,flag=i,result=0;
			while(flag>0) {
				 flag/=10;
				count++;
			}
			flag=i;
			while(flag>0) {
				int rem = flag%10;
				result +=Math.pow(rem, count);
				flag/=10;
			}
			if(result ==i) {
				System.out.println(i);
			}
		}
	}

}
