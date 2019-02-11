public class Accumul {
    
    public static String accum(String s) {
      String result = "";
      for(int i = 0; i < s.length(); i++) {
        result += String.valueOf(s.charAt(i)).toUpperCase();
        for(int j = 0; j != i; j++) {
          result += String.valueOf(s.charAt(i)).toLowerCase();
        }
        if( i + 1 != s.length()) {
          result += "-";
        }
      }
      return result;
    }
}
