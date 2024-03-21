package recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n=10;
		System.out.println(toBinary(10));

	}

	private static int toBinary(int i) {
		if(i==0) {
			return 0;
		}
		return (i%2)+10*(toBinary(i/2));
	}

}
