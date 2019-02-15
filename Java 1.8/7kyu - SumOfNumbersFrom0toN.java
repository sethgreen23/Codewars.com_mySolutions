 public static String showSequence(int value){
    if(value < 0)
      return String.valueOf(value) + "<0";
    if(value == 0)
      return "0=0";
    String str = "0";
    int sum = 0;
    for(int i = 1; i <= value; i++) {
      str += "+" + String.valueOf(i);
      sum += i;
    }
    return str + " = " + String.valueOf(sum);
  }
