package package5;

public class test {

	public static void main(String[] args) {
		String str = "sales percentage is 70%";
		String str2 = "0123456789";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (String.valueOf(str.charAt(i)).indexOf(str2.charAt(j)) != -1) {
					System.out.print(str.charAt(i));
				} else {
					continue;
				}
			}
		}
	}

}
