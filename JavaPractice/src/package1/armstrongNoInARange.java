package package1;

public class armstrongNoInARange {
	public static void main(String[] args) {
		int r1=100,r2=200;
		for(int i=r1;i<=r2;i++) {
			int result=0;
			int oriNum=i,count=0;
			while(oriNum>0) {
				oriNum/=10;
				count++;
			}
			oriNum=i;
			while(oriNum>0) {
				int rem =oriNum%10;
				result+=Math.pow(rem,count);
				oriNum/=10;
			}
			if(result==i) {
				System.out.println(i);
			}
		}
	}
}
