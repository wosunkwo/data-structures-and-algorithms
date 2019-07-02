package code401.challenges.mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSortFunc(int[] arr){
        int n = arr.length;
        if(n<2){
            return;
        }
        int mid = n/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[n-mid];

        for (int i = 0; i < mid; i++){
            leftHalf[i] = arr[i];
        }

        for (int j = mid; j<n; j++){
            rightHalf[j-mid] = arr[j];
        }

        mergeSortFunc(leftHalf);

        mergeSortFunc(rightHalf);

        merge(leftHalf, rightHalf, arr);
    }

    public static void merge(int[] b, int[] c, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < b.length && j < c.length){
            if(b[i] <= c[j]){
                arr[k++] = b[i++];
            }
            else{
                arr[k++] = c[j++];
            }
        }

        while (i<b.length){
            arr[k++] = b[i++];
        }

        while (j<c.length){
            arr[k++] = c[j++];
        }
    }

    public  static  void main(String[] args){
        MergeSort test = new MergeSort();
        int[] arr = {5,3,6,8,2,3,5};
        test.mergeSortFunc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
