using System;

public class Kata
{
  public static bool IsSquare(int n)
  {
    double result = Math.Sqrt(n);
    return result%1 == 0;
  }
}
