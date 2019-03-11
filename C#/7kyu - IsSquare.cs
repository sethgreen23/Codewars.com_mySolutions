using System;

public class Kata
{
  public static bool IsSquare(int n)
  {
    //Your code goes here!
    double result = Math.Sqrt(n);
    return result%1 == 0;
  }
}
