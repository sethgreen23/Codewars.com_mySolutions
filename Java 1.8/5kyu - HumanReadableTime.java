public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		int sec = 0;
		int min = 0;
		int hours = 0;
		while(seconds != 0) {
			sec++;
			if(sec > 59) {
				sec = 0;
				min++;
				if(min > 59) {
					min = 0;
					hours++;
				}
			}
			seconds--;
		}
		return intToTwoDigitStringWithLeadingZero(hours) + ":" + intToTwoDigitStringWithLeadingZero(min) + ":" + intToTwoDigitStringWithLeadingZero(sec);
	}
	
	public static String intToTwoDigitStringWithLeadingZero(int x) {
		if(x <= 9) return "0" + String.valueOf(x);
		else return String.valueOf(x);
	}
}
