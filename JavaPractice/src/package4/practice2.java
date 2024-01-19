package package4;

import java.util.Arrays;
import java.util.Scanner;

public class practice2 {
	
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		boolean flag = true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i+" "+num/i);
				flag = false;
				break;
			}
		}
		if(flag ==true) {
			System.out.println("PRIME NUMBER");
		}else {
			System.out.println("NOT A PRIME NUMBER");
		}
		
		int temp = num,count =0,sum=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		
		 temp=num;
		 while(temp>0) {
			 int rem = temp%10;
			 sum+=Math.pow(rem, count);
			 temp/=10;
		 }
		 if(sum == num) {
			 System.out.println("ARMSTRONG");
		 }else {
			 System.out.println("NOT AN ARMSTRONG");
		 }
		 int reverse=0;
		 while(num>0) {
			 int rem = num%10;
			 reverse=reverse*10+rem;
			 num/=10;
		 }
		 System.out.println(reverse);
		 
		 int[] arr = {1,2,5,7,4,3,3,7,3,2};
		 Arrays.sort(arr);
		 int[] arr2=new int[arr.length];
		 int j=0;
		 for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]!=arr[i+1]) {
				 arr2[j++]=arr[i];
			 }
		 }
		 arr2[j++] =arr[arr.length-1];
		 int len = arr2.length;
		 while(arr2[len-1]==0) {
			 --len;
		 }
		 for(int i=0;i<len;i++) {
			 System.out.print(arr2[i]);
		 }
		 
	}

}
