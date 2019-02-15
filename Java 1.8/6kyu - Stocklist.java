import java.util.HashMap;

public class Kata {

	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		String output = "";
		HashMap<String, Integer> catMap = new HashMap<String, Integer>();
				
		if (lstOfArt.length == 0) {
			return output;
		}

		for (String stock : lstOfArt) {
			String[] stockArray = stock.split(" ");
			String category = stockArray[0].substring(0, 1);
			Integer quantity = Integer.valueOf(stockArray[1]);

			if (catMap.get(category) == null) {
				catMap.put(category, quantity);
			} else {
				catMap.put(category, catMap.get(category) + quantity);
			}
		}

		for (int i = 0; i < lstOf1stLetter.length; i++) {
			Integer quantity = 0;
			if (catMap.get(lstOf1stLetter[i]) != null) {
				quantity = catMap.get(lstOf1stLetter[i]);
			}

			output += "(" + lstOf1stLetter[i] + " : " + quantity + ")";

			if (i != lstOf1stLetter.length - 1) {
				output += " - ";
			}
		}
		return output;
	}
}
