package package3;

public class fibonacci {
	
	public static void main(String[] args) {
		int s1=0,s2=1,sum=0;
		System.out.print(s1+" "+s2+" ");
		for(int i=2;i<10;i++) {
			sum=s1+s2;
			s1=s2;
			s2=sum;
			System.out.print(sum+" ");
		}
	}

}
