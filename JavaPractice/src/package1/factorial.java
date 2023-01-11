package package1;

public class factorial {
	
	public static void main(String[] args) {
		factorial obj = new factorial();
		System.out.println(obj.factorial(5));
	}
	
	public int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return(num*factorial(num-1));
		}
	}

}
