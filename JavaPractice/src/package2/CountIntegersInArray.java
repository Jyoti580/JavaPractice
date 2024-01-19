package package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountIntegersInArray {

	public static int[] inputArray = { 1, 3, 4, 5, 6, 7, 8, 1, 3, 5, 6, 7, 9, 0, 0 };

	public static void main(String[] args) {
		Map<Integer, Integer> map = countIntegers(inputArray);
		printElements(map);
	}

	private static void printElements(Map<Integer, Integer> map) {
		Set<Integer> set = map.keySet();
		for (int i : set) {
			System.out.println(i + " " + map.get(i));
		}
	}

	private static Map<Integer, Integer> countIntegers(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		return map;

	}

}
