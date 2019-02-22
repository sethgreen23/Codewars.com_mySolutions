public class Kata {

	public static int[] twoSum(int[] numbers, int target)
    {
        int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++ ) {
          for(int j = 0; j < numbers.length; j++) {
            if(numbers[i] == numbers[j]) {
              continue;
            }
            if(numbers[i] + numbers[j] == target) {
              result[0] = i;
              result[1] = j;
              break;
            }
          }
        }
        return result;
    }
	
	public static void main(String args[]) {
		int[] ergebnis = new int[2];
		ergebnis = twoSum(new int[] {2, 5, 6, 10, 1, 4}, 12);
		System.out.println(ergebnis[0] + " " + ergebnis[1]);
	}
	
}
