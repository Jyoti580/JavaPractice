package package1;

import java.util.Scanner;

public class readStandardInput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name "+sc.nextLine());//String
		System.out.println("next "+sc.next());//String
		System.out.println("next int "+sc.nextInt());//Int
	}

}
