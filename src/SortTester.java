import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {4, 18, 32, 62, 14, 63, 55, 8, 13, 67, 88, 98, 66, 45, 12, 15, 30, 21, 22, 43, 15, 123, 99, 0, 1, 46, 72, 80, 33, 71};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {4, 18, 32, 62, 14, 63, 55, 8, 13, 67, 88, 98, 66, 45, 12, 15, 30, 21, 22, 43, 15, 123, 99, 0, 1, 46, 72, 80, 33, 71};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));

  }
}
