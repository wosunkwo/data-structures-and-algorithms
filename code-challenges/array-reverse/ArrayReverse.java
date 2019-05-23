import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    // your code goes here!
    //variables to represent the upper and lower level of ur array
    int j = inputArray.length -1;
    int i = 0;
    //while loop to iterate through the array from both sides
   while(i < j){
    inputArray[i] += inputArray[j];
    inputArray[j] = inputArray[i] - inputArray[j];
    inputArray[i] -= inputArray[j];
    i++;
    j--;
   }
    // return the new modified array
    return inputArray;
  }
    
}