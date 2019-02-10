public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      if(input == null)
        return new int[]{};
      if(input.length == 0)
        return new int[]{};
      int[] result = new int[]{0, 0};
      for(int i = 0; i < input.length; i++) {
        if(input[i] > 0)
          result[0] = result[0] + 1;
        if(input[i] < 0)
          result[1] = result[1] + input[i];
      }
      return result;
    }
}
