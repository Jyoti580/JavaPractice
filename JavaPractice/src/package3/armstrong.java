package package3;

public class armstrong {
	
	public static void main(String[] args) {
		int num = 500,temp=num,count=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		temp=num; int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=Math.pow(rem, count);
			temp/=10;
		}
		if(sum==num) {
			System.out.println("ARMSTRONG");
		}else {
			System.out.println("NOT an armstrong");
		}
	}

}
