import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int uInNo = in.nextInt();
    int a[] = new int[uInNo];
    for(int i=uInNo;i>0;i--)
    {
      int uIn = in.nextInt();
      a[i-1] = uIn;
    }

    int maxCount = 0;
    int mode = 0;
    for (int i = 0; i < a.length; i++) {
        int value = a[i];
        int count = 1;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == value) count++;
            if (count > maxCount) {
                mode = value;
                maxCount = count;
            }
        }
    }
    System.out.println(mode);
  }
}
