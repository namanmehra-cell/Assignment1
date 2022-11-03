//Count all sub-arrays sum divided by k. Time complexity - O(n)
package demo;

//import java.util.*;
import java.util.HashMap;

public class Assignment1{

public static int subArray(int[] arr, int k) {


HashMap < Integer, Integer > remMap = new HashMap < > (); 
remMap.put(0, 1); 

int count = 0;
long summ = 0;
for (int i = 0; i < arr.length; i++) {
  summ += arr[i];
  int rem = (int)(((summ % k) + k) % k);


  if (remMap.containsKey(rem)) {
    count += remMap.get(rem);
    remMap.put(rem, remMap.get(rem) + 1);
  } else {
    remMap.put(rem, 1);
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
