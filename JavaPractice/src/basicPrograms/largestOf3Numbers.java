package basicPrograms;

public class largestOf3Numbers {

	public static void main(String[] args) {
		int x = 11, y = 7, z = 15;
		largestOf3Numbers obj = new largestOf3Numbers();
		System.out.println("Largest: " + obj.largest(x, y, z));
	}

	public int largest(int a, int b, int c) {
		return (a > b ? a : b) > c ? (a > b ? a : b) : c;

	}

}
