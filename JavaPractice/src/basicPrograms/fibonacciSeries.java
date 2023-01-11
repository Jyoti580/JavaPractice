package basicPrograms;

public class fibonacciSeries {
	//Also find the sum of even positioned numbers 
	public static void main(String[] args) {
		System.out.print(0+" "+1+" ");
		int n1=0,n2=1,sum,evenSum=1;
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum+" ");
			if(i%2!=0) {
				evenSum+=sum;
			}
		}
		System.out.println("\n"+evenSum);
	}

}
