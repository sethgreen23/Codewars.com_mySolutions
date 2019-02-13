public class Kata {

	public static String pigIt(String str) {
		String[] splitArray = new String[] {};
		splitArray = str.split(" ");
		
		for (int i = 0; i < splitArray.length; i++) {
			if(splitArray[i].matches("\\p{Punct}")) {
				continue;
			}
			String firstLetter = Character.toString(splitArray[i].charAt(0));
			splitArray[i] = splitArray[i].substring(1);
			splitArray[i] = splitArray[i] + firstLetter + "ay";
		}
		
		String result = "";
		for (int i = 0; i < splitArray.length; i++) {
			if (result.equals(""))
				result = splitArray[i];
			else
				result = result + " " + splitArray[i];
		}
		return result;
	}

	public static void main(String args[]) {
		System.out.println("Result: " + pigIt("Pig latin is cool !"));
		System.out.println("Result: " + pigIt("dxKhvVuuuDL"));
	}
}
