package package3;

public class neon {
	
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(neonNumber(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean neonNumber(int num) {
		int square = num*num,sum=0;
		while(square>0) {
			int rem = square%10;
			sum+=rem;
			square/=10;
		}
		if(sum==num) {
			return true;
		}
		return false;
	}

}
