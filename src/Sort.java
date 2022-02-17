import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void selectionSort(int[] elements)
  {
    int iterations = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        iterations++;
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println(iterations);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  {
    int iterations = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {     
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
        iterations++;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println(iterations);
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int iterations = 0;
    for (int i = 0; i < words.size() - 1; i++)
    {
      int index = i;
      for (int k = i + 1; k < words.size(); k++)
      {
        iterations++;
        if (words.get(k).compareTo(words.get(index)) < 0)
        {
          index = k;
        }
      }
      String temp = words.get(i);
      words.set(i, words.get(index));
      words.set(index, temp);
    }
    System.out.println("Selection Sort iterations: " + iterations);
  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {
    int iterations = 0;
    for (int i = 1; i < words.size(); i++)
    {
      int index = i;
      while (index > 0 && words.get(index).compareTo(words.get(index - 1)) < 0)
      {
        iterations++;
        words.add(index - 1, words.remove(index));
        index--;
      }
    }
    System.out.println("Selection Sort iterations: " + iterations);
  }
}