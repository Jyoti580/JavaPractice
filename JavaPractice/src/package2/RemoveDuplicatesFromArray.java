package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
	public static int[] inputArray = {1,1,1,3,3,4,4,2,4,5,8,0,9};

	public static void main(String[] args) {
		
		sortAnArray(inputArray);
		printArray(inputArray);
//		remveDuplicatesUntilTwice(inputArray);
//		System.out.println();
//		printArray(inputArray);
		removeDuplicates(inputArray);
		System.out.println();
		printArray(inputArray);
		
	}

	private static void removeDuplicates(int[] nums) {
		int index = 0;
		int count =0;
		for(int i =1;i<nums.length;i++) {
			if(nums[i]!=nums[index]) {
				index++;
				nums[index] = nums[i];
				count++;
			}
		}
	}

	private static void remveDuplicatesUntilTwice(int[] nums) {
		
		int index = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index] || (nums[i] == nums[index] && nums[i] != nums[index - 1])) {
                index++;
                System.out.println();
                System.out.println(index);
                System.out.println(i);
                nums[index] = nums[i];
            }
        }
	}

	private static void printArray(int[] inputArray2) {
		for(int i=0;i<inputArray2.length;i++) {
			System.out.print(inputArray2[i]+" ");
		}
		
	}

	private static void sortAnArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}	
	}
	
	

	
	
}




/*private static void printArray() {
		for(int i=0;i<inputArray.length;i++) {
			System.out.println(inputArray[i]);
		}
		
	}

	private static void enterAnArray() {
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter integer:");
			inputArray[i] = sc.nextInt();
		}
	}
*/
