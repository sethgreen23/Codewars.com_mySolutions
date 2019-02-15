public class Solution {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        //parameters into list
        int[] list = new int[8];
        
        //Multiplay each number by itself
        list[0] = age1 * age1;
        list[1] = age2 * age2;
        list[2] = age3 * age3;
        list[3] = age4 * age4;
        list[4] = age5 * age5;
        list[5] = age6 * age6;
        list[6] = age7 * age7;
        list[7] = age8 * age8;
        
        //Add them all together
        int result = 0;        
        for(int i = 0; i < list.length; i++) {
          result += list[i];
        }
        
        //square-root
        result = (int) Math.sqrt(result);
        //divide by 2
        result /= 2;
        //return
        return result;
    }
}
