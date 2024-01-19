package package3;

public class reverseInt {
	
	public static void main(String[] args) {
		int num =252,temp = num,sum=0;
		while(temp>0) {
			int rem = temp%10;
			sum=sum*10+rem;
			temp/=10;
		}
		if(sum == num){
			System.out.println("RVERSE");
		}else{
			System.out.println("NOYT a reverse");
		}
	}

}
