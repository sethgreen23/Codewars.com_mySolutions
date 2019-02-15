public class Kata {
	
	public static String expandedForm(int num) {
		String s = Integer.toString(num);
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0') {
				result += s.charAt(i);
				for (int j = 0; j < s.length() - 1 - i; j++) {
					result += "0";
				}
				if(i != s.length()-1 && !s.substring(i+1).matches("[0]+"))
					result += " + ";
			}
		}
		return result;
	}

	public static void main(String args[]) {
		System.out.println(expandedForm(42));
		System.out.println("----------");
		System.out.println(expandedForm(70304));
		System.out.println("----------");
		System.out.println(expandedForm(11050600));
		System.out.println("----------");
		System.out.println(expandedForm(210123010));
	}
}
