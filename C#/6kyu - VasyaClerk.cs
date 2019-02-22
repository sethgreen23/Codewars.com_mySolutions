using System;

public class Line
    {
        public static String Tickets(int[] peopleInLine)
        {
            int count25 = 0;
            int count50 = 0;
            int count100 = 0;

            foreach(int x in peopleInLine)
            {
                if (x == 25)
                {
                    count25++;
                }
                else if (x == 50)               
                {
                    if (count25 >= 1)
                    {
                        count25--;
                        count50++;
                    } else
                    {
                        return "NO";
                    }
                }
                else if (x == 100)
                {
                    if(count25 >= 3 && count50 == 0)
                    {
                        count25 -= 3;
                        count100++;
                    } else if(count25 >= 1 && count50 >= 1)
                    {
                        count25--;
                        count50--;
                        count100++;
                    } else
                    {
                        return "NO";
                    }
                }
            }
            return "YES";
        }
    }
