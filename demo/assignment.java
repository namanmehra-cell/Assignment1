//Count all sub-arrays sum divided by k. Time complexity - O(n^2)

package demo;

//import java.util.ArrayList;

public class assignment {

  public static int subArray(int[] arr, int k) {

    int count = 0; 

    for (int i = 0; i < arr.length; i++) {
    	
      int curSum = 0; 

      for (int j = i; j < arr.length; j++) {
        curSum = curSum + arr[j];
        if (curSum % k == 0) {
          count += 1;
        }
      }
    }

    return count;
  }
  
  public static void main(String[] args)
  {

     int[] arr = { 5, 10, 11, 9, 5 };

	  int k = 5;
      System.out.println(subArray(arr,k));

  }
}
