package code401.challenges.insertionSort;

import java.util.Arrays;

public class InsertionSort {
    public int[] InsertionSort(int[] arr){
        int j;
        for(int i = 1; i< arr.length; i++){
            j = i-1;
            int temp = arr[i];

            while(j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        InsertionSort test = new InsertionSort();
        int[] happyArr = new int[] {7,2,4,1,3,9};
        System.out.println(Arrays.toString(test.InsertionSort(happyArr)));
    }
}
