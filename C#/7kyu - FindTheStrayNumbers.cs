using System;
class Solution 
{
  public static int Stray(int[] numbers)
        {
            Array.Sort(numbers);
            return numbers[0] == numbers[1] ? numbers[numbers.Length - 1] : numbers[0];
        }
}
