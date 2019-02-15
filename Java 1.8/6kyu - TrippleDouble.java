public class Kata {

	public static int TripleDouble(long num1, long num2) {
		String sNum1 = String.valueOf(num1);
		String sNum2 = String.valueOf(num2);
		for (int i = 0; i < 10; i++) {
			String n = String.valueOf(i);
			if (sNum1.contains(n + n + n) && sNum2.contains(n + n))
				return 1;
		}
		return 0;
	}

	public static void main(String args[]) {
		
	}
}
