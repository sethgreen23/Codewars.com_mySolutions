public class Kata {
  public static int[] sortArray(int[] array) {
        int length = array.length;
        if (length <= 0) return array;
        for(int i = 0; i < length; i++) {
            while (i < length && array[i] % 2 == 0) i++; //skip even numbers
            for(int j = i + 1; j < length; j++) {
                while (j < length && array[j] % 2 == 0) j++; //skip even number
                if (j < length && array[i] % 2 != 0 && array[j] % 2 != 0 && array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
